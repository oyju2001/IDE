#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

#include <sys/socket.h>
#include <sys/stat.h>
#include <arpa/inet.h>
#include <sys/types.h>
#include <netinet/in.h>

#include "packet.h"
#include "extern.h"

#define MAXBUF 1024
#define FD_MAX_SIZE 4

// 1:n server 

int tcp_server(){
	int server_sockfd, client_sockfd;
	int client_len, n, i;
	char buf[MAXBUF];
	struct sockaddr_in clientaddr, serveraddr;
	client_len = sizeof(clientaddr);
	int clientsocket[FD_MAX_SIZE];
	fd_set readfds, allfds;
	int result, maxfd;
	int max_client = -1;
	int port = 2559;

	char recv_data[MAXBUF];

	if(port < 2){
		printf("HELP : server portno ");
		return 1;
	}

	if((server_sockfd = socket( AF_INET, SOCK_STREAM, 0)) == -1){
		perror("socket error : ");
		exit(0);
	}

	memset(&serveraddr, 0, sizeof(serveraddr));
	serveraddr.sin_family = AF_INET;
	serveraddr.sin_addr.s_addr = inet_addr("192.168.137.129");
	serveraddr.sin_port = htons(port);

	result = bind(server_sockfd, (struct sockaddr *) &serveraddr, sizeof(serveraddr));
	if(result == -1){
		perror("socket error : " );
		exit(0);
	}

	result = listen(server_sockfd, 5);
	if(result == -1){
		perror("listen error : ");
		exit (0);
	}

	maxfd = server_sockfd;
	FD_ZERO(&readfds);
	FD_SET(server_sockfd, &readfds);
	printf("setting end! \n");

	for(i=0; i<FD_MAX_SIZE; i++){
		clientsocket[i] = 0;
	}

	while(1){
		struct timeval tval;
		tval.tv_sec = 0;
		tval.tv_usec = 500;

		FD_ZERO(&readfds);
		FD_SET(server_sockfd,&readfds);
		for(i =0; i<FD_MAX_SIZE; i++){
			if(clientsocket[i] > 0){
				FD_SET(clientsocket[i], &readfds );
			}
		}
		allfds = readfds;
		memset(buf, 0x00, MAXBUF);

		result = select (maxfd+1 , &allfds, 0, 0, &tval);
		if(result == -1){
			perror("select error2 : ");
			exit(1);
		}else if(result == 0){
			continue;
		}else{
			if(FD_ISSET(server_sockfd, &allfds )){
				client_sockfd = accept(server_sockfd, (struct sockaddr *)&clientaddr, &client_len);
				printf("New Client Connect : %s", inet_ntoa(clientaddr.sin_addr));
				for(i = 0; i<FD_MAX_SIZE; i++){
					if(clientsocket[i] <= 0){
						clientsocket[i] = client_sockfd;
						printf("\nClientNum : %d",clientsocket[i]);
						break;
					}
				}
				FD_SET(client_sockfd, &readfds);
				if(client_sockfd > maxfd){
					maxfd = client_sockfd;
				}
				if(i < max_client){
					max_client = i;
				}
				continue;
			}

			for(i=0; i<FD_MAX_SIZE; i++){
				if(FD_ISSET(clientsocket[i], &allfds)){
					while(1){
						if((n = recv(client_sockfd, recv_data, sizeof(recv_data), 0)) > 0){
							printf("\n[recv data] %s \n",recv_data);
				
							char *ptr = strtok(recv_data, "/");
							int j = 0;
							while(ptr!=NULL){
								//printf("%s\n",ptr);
								
								switch(j){
									case 0 : innerPacket.flag = atoi(ptr); break;
									case 1 : innerPacket.sys_id = atoi(ptr); break;
									case 2 : innerPacket.sen_id = atoi(ptr); break;
									case 3 : innerPacket.timestamp = atoi(ptr); break;
									case 4 : strcpy(innerPacket.data, ptr);
										 printf("%s \n",innerPacket.data); break;
								}	
								j++;
								ptr = strtok(NULL, "/");
							}
				
							memset(recv_data, 0x00, MAXBUF);
						}
						break;
					}
				
				}
			}
			
		
			
		}

		/*while(1){
			if((n=recv(client_sockfd, buf, MAXBUF, 0)) <= 0){
				close(client_sockfd);
				break;}
		}*/

	}

	close(server_sockfd);
	return 0;
}

