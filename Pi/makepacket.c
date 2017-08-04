#include <stdio.h>
#include <time.h>
#include "packet.h"

int SYSID = 4;

void makeCmdInfo(TYPE_PACKET *p, int sensorID, char *data2){
	int i;
	p->flag = CMD_INFO;
	p->sys_id = SYSID;
	p->sen_id = sensorID;
	p->timestamp  = time(NULL);
	for(i=0;i<4;i++){
		p->data[i] = data2[i];
	}
}

void printInfo(TYPE_PACKET *p){
	printf("flag : %d, sys_id : %d, sen_id : %d, timestamp : %d , data : ",
		p->flag, p->sys_id, p->sen_id, p->timestamp);
	int i;
	for(i=0; i<4; i++){ printf("%c", p->data[i]); }
	printf("\n");


}
/*
int main(){
	TYPE_PACKET packet;
	int sensorID = 1;

	makeCmdInfo(&packet, sensorID , "ds");
	printInfo(&packet);

	return 0;

}
*/