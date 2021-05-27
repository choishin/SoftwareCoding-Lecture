package k40_RemoteControlMaking01_06;
/*
 * 6.클래스,객체,인스턴스(리모콘 클래스 만들기)
 */
public class RemoteControl { //<- 리모콘 클래스 생성
	int k40_max_channel=10;  //전역변수(1) 마지막 채널
	int k40_min_channel=1;  //전역변수(2) 첫번째 채널
	int k40_max_volume =5;  //전역변수(3)최대볼륨
	int k40_min_volume =0;  //전역변수(4)최소볼륨
	int k40_current_channel =1 ; //전역변수(5)현재채널
	int k40_current_volume =1 ; //전역변수(6)현재볼륨
	String k40_message; 
	
	void channelup() { //<-메소드(1) 채널 올리기
		if (k40_current_channel == k40_max_channel) { //만일 현재 채널이 마지막 채널이라면
			k40_message ="마지막 채널입니다."; // ->마지막 채널입니다. 
		}else{ 
			k40_current_channel++; //만일 마지막 채널이 아니라면 채널 올리기
			k40_message= String.format("%2d번 채널 입니다.",k40_current_channel); //현재채널 출력
		}
	}
	void channeldown() { //<-메소드(2) 채널 내리기
		if (k40_current_channel == k40_min_channel) { //만일 현재 채널이 첫번째 채널이라면
			k40_message ="첫번째 채널 입니다."; // -> 첫번째 채널입니다.
		}else{ 
			k40_current_channel--; //만일 현재채널이 첫번째 채널이 아니라면 채널 내리기
			k40_message= String.format("%2d번 채널 입니다.",k40_current_channel); //현재 채널 출력
		}
	}
	void volumeup() { //<-메소드(3) 볼륨 올리기
		if (k40_current_volume == k40_max_volume) { //만일 현재 볼륨이 최대볼륨이라면
			k40_message ="최대볼륨입니다."; // -> 최대볼륨입니다.
		}else{ 
			k40_current_volume++; //만일 최대볼륨이 아니라면 볼륨 올리기
			k40_message= String.format("현재볼륨 : %2d ",k40_current_volume); //현재 볼륨 출력
		}
	}
	void volumedown() { //<-메소드(4) 볼륨 내리기
		if (k40_current_volume == k40_min_volume) { //만일 현재 볼륨이 최소볼륨이라면
			k40_message ="최소볼륨입니다."; // -> 최소볼륨입니다.
		}else{ 
			k40_current_volume--; //만일 최소볼륨이 아니라면 볼륨 내리기
			k40_message= String.format("현재볼륨 : %2d ",k40_current_volume); //현재 볼륨 출력
		}
	}
}

