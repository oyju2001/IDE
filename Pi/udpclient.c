#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include "packet.h"
#include "extern.h"


int udp_client(){	

	while(1){
		
		if(flagdd == 1){
			int sock;
			struct sockaddr_in target_addr;
			char recv_buffer[1024];
			int recv_len, addr_len;
			//const char *msg = "hello world";
			int port = 5258;
		
			if(port < 2){
				printf("HELP : server portno ");
				return 1;
			}
		
			if((sock = socket(AF_INET, SOCK_DGRAM, 0)) < 0){
				perror("socket : ");
				return 1;
			}
			memset(&target_addr, 0x00, sizeof(target_addr));
			target_addr.sin_family = AF_INET;
			target_addr.sin_addr.s_addr= inet_addr("192.168.137.1"); /*htonl(INADDR_ANY);*/
			target_addr.sin_port = htons(port);  //in PORT;
		
			addr_len = sizeof(target_addr);
			
			char buf4[4] = {'\0'};
			char buf8[12] = {'\0'};
			
			sprintf(buf4,"%d" ,onlyPacket.flag);
			sendto(sock, (char *)buf4, sizeof(buf4), 0, (struct sockaddr*)&target_addr, addr_len);
			sprintf(buf4,"%d", onlyPacket.sys_id);
			sendto(sock, (char *)buf4, sizeof(buf4), 0, (struct sockaddr*)&target_addr, addr_len);
			sprintf(buf4,"%d", onlyPacket.sen_id);
			sendto(sock, (char *)buf4, sizeof(buf4), 0, (struct sockaddr*)&target_addr, addr_len);
			sprintf(buf8,"%u", onlyPacket.timestamp);
			sendto(sock, (char *)buf8, sizeof(buf8), 0, (struct sockaddr*)&target_addr, addr_len);
			sprintf(buf4, onlyPacket.data);
			sendto(sock, (char *)buf4, sizeof(buf4), 0, (struct sockaddr*)&target_addr, addr_len);
				
			flagdd = 0;
			}
		



		/*
		if((recv_len = recvfrom(sock, recv_buffer, 1024, 0, (struct sockaddr *)&target_addr, &addr_len)) < 0){
			perror("recvfrom ");
			return 1;
		}
		recv_buffer[recv_len] = '\0';
	
		printf("ip : %s\n", inet_ntoa(target_addr.sin_addr));
		printf("received data : %s\n\n", recv_buffer);
		*/
	}
	//close(sock);

	return 0;
}

