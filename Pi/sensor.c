#include <stdio.h>
#include <wiringPi.h>
#include <string.h>

#include "packet.h"
#include "extern.h"

#define LED 1
#define LED2 3
#define TOUCH_SENSOR 4
#define SENCE_SENSOR 5

int sensor(){
	TYPE_PACKET p;
	if(wiringPiSetup() == -1){
 		return 1;
	}
	pinMode(LED, OUTPUT);
	pinMode(LED2 , OUTPUT);
	pinMode(TOUCH_SENSOR, INPUT);
	pinMode(SENCE_SENSOR, INPUT);

	int touchIsOn = 0;
	int senceIsOn = 0;

	for(;;){

		if(innerPacket.flag == 2){
			if(innerPacket.sen_id == 4){
				if(strcmp(innerPacket.data,"ON") == 0){
					touchIsOn = 1;
					memset(&innerPacket, 0x00, sizeof(TYPE_PACKET));
				}
				else if (strcmp(innerPacket.data,"OFF") == 0){
					touchIsOn = 0;
					memset(&innerPacket, 0x00, sizeof(TYPE_PACKET));
				}

			}else if(innerPacket.sen_id == 5){
				if(strcmp(innerPacket.data,"ON") == 0){
					senceIsOn = 1;
					memset(&innerPacket, 0x00, sizeof(TYPE_PACKET));
				}
				else if(strcmp(innerPacket.data,"OFF") == 0){
					senceIsOn = 0;
					memset(&innerPacket, 0x00, sizeof(TYPE_PACKET));
				}
				
			}

		}
			

		int res = !digitalRead(TOUCH_SENSOR);
		int res2 = digitalRead(SENCE_SENSOR);

		if(touchIsOn == 1){
			digitalWrite(LED, res);
			if(res == 1){
				makeCmdInfo(&p ,TOUCH_SENSOR, res? "YES":"NO" );
				flagdd = 1;
				onlyPacket = p;
				printf("touch_touch, %d \n", flagdd);
				//printInfo(&p);
			}
	
		}
	
		if(senceIsOn == 1){
			digitalWrite(LED2, res2);
			if(res2 == 1){
				makeCmdInfo(&p ,SENCE_SENSOR, res2? "YES":"NO" );
				flagdd =1;
				onlyPacket = p;
				printf("sence_sence, %d \n", flagdd);
				//printInfo(&p);
			}
	
		}
		
		//printf("SENSOR : %d\n", flagdd);		
		delay(1000);


		
	}

	return 0;
}


