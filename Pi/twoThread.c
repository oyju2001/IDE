#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include <stdlib.h>

#include "function.h"

int main(){
	pthread_t p_thread[3];
	int status;

	//int port1 = 5253;
	//int port2 = 5256;

	pthread_create(&p_thread[0], NULL, (void *)&tcp_server, NULL);	
	pthread_create(&p_thread[1], NULL, (void *)&udp_client, NULL);	
	pthread_create(&p_thread[2], NULL, (void *)&sensor, NULL);	
	
	pthread_join(p_thread[0], (void **)&status);
	pthread_join(p_thread[1], (void **)&status);
	pthread_join(p_thread[2], (void **)&status);

	return 0;
}
