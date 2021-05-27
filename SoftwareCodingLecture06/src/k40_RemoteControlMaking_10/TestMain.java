package k40_RemoteControlMaking_10;
/*
 * 10.생성자, 소멸자, 이벤트 (
 */
public class TestMain { //<-새로운 클래스 생성 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl2 k40_remocon; 
		k40_remocon = new RemoteControl2(); //<-생성자(1) 호출 : 값을 초기화하고, 현재 채널 수와 볼륨 출력  
		for (int k40_i=0; k40_i <10; k40_i++){ 
			k40_remocon.channelup();  
			System.out.printf("[ %s ]\n", k40_remocon.k40_message); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) { 
			k40_remocon.channeldown(); 
			System.out.printf("[%s]\n", k40_remocon.k40_message); 
		}
		for (int k40_i=0; k40_i <5; k40_i++) {
			k40_remocon.volumeup(); 
			System.out.printf("[%s]\n", k40_remocon.k40_message); 
		}
		for (int k40_i=0; k40_i <6; k40_i++) { 
			k40_remocon.volumedown(); 
			System.out.printf("[%s]\n", k40_remocon.k40_message); 
		}
		
		RemoteControl2  k40_remocon2 = new RemoteControl2(2,4); //<-생성자(2)호출 : 채널 2만큼 올리고 볼륨 4만큼 올리기
	}
}
