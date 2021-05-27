package k40_RemoteControlMaking_10;
/*
 * 10.생성자, 소멸자, 이벤트 (리모콘 클래스 develop)
 */
public class RemoteControl2 { // 리모콘 클래스 생성
	int k40_max_channel;  //전역변수(1) 마지막 채널
	int k40_min_channel;  //전역변수(2) 첫번째 채널
	int k40_max_volume;  //전역변수(3)최대볼륨
	int k40_min_volume;  //전역변수(4)최소볼륨
	int k40_current_channel ; //전역변수(5)현재채널
	int k40_current_volume ; //전역변수(6)현재볼륨
	String k40_message; 
	
	 RemoteControl2() {  //**<-생성자(1):  값을 초기화 해주고, 값을 출력**/
		k40_max_channel = 10;
		k40_min_channel = 1;
		k40_max_volume = 5;
		k40_min_volume = 0;
		k40_current_channel = 1;
		k40_current_volume = 1;
		System.out.printf("현재 채널 : [%d]\t",k40_current_channel);
		System.out.printf("현재 볼륨 : [%d]\n",k40_current_volume);
	}
	 RemoteControl2(int k40_channel, int k40_volume) {//**<-생성자(2):  값을 초기화 해주고, 입력된 채널과 볼륨만큼 메소드를 호출**/
		k40_max_channel = 10;
		k40_min_channel = 1;
		k40_max_volume = 5;
		k40_min_volume = 0;
		k40_current_channel = 1;
		k40_current_volume = 1;
		
		if (k40_channel > 0) {
			for (int k40_i = 0; k40_i <k40_channel; k40_i++) {
				this.channelup();
				System.out.println(k40_message);
			}
		}
		else if (k40_channel <0) {
			for (int k40_i = 0; k40_i <(k40_channel*-1); k40_i++) {
				this.channeldown();
				System.out.println(k40_message);
			}
		}
		
		if (k40_volume > 0) {
			for (int k40_i = 0; k40_i <k40_volume; k40_i++) {
				this.volumeup();
				System.out.println(k40_message);
			}
		}
		else if (k40_volume <0) {
			for (int k40_i = 0; k40_i <(k40_volume*-1); k40_i++) {
				this.volumedown();
				System.out.println(k40_message);
			}
		}
		
	}	 
	void channelup() { //<-메소드(1) 채널 올리기
		if (k40_current_channel == k40_max_channel) { //만일 현재 채널이 마지막 채널이라면
			k40_message ="마지막 채널입니다."; // ->마지막 채널입니다. 
		}else{ 
			k40_current_channel++; //만일 마지막 채널이 아니라면 채널 올리기
			k40_message= String.format("%d번 채널 입니다.",k40_current_channel); //현재채널 출력
		}
	}
	void channeldown() { //<-메소드(2) 채널 내리기
		if (k40_current_channel == k40_min_channel) { //만일 현재 채널이 첫번째 채널이라면
			k40_message ="첫번째 채널 입니다."; // -> 첫번째 채널입니다.
		}else{ 
			k40_current_channel--; //만일 현재채널이 첫번째 채널이 아니라면 채널 내리기
			k40_message= String.format("%d번 채널 입니다.",k40_current_channel); //현재 채널 출력
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

