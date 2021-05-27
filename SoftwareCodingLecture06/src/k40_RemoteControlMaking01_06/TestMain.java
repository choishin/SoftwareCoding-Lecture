package k40_RemoteControlMaking01_06;
/*
 * 6.클래스,객체,인스턴스(2) 
 */
public class TestMain { //<-새로운 클래스 생성 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl k40_remocon;  //RemoteControl 클라스 호출
		k40_remocon = new RemoteControl(); 
		for (int k40_i=0; k40_i <10; k40_i++){  //for 반복문 : 10번 반복
			k40_remocon.channelup();  //리모콘 클라스의 채널 올리기 메소드를 호출
			System.out.printf("[ %s ]\n", k40_remocon.k40_message); //반복되는 동안 변화되는 채널를 출력
		}
		for (int k40_i=0; k40_i <10; k40_i++) { //for 반복문 : 10번 반복
			k40_remocon.channeldown(); //리모콘 클라스의 채널 내리기 메소드를 호출 
			System.out.printf("[%s]\n", k40_remocon.k40_message); //반복되는 동안 변화되는 채널수를 출력
		}
		for (int k40_i=0; k40_i <5; k40_i++) { //for 반복문 : 10번 반복
			k40_remocon.volumeup(); //리모콘 클라스의 볼륨 올리기 메소드 호출 
			System.out.printf("[%s]\n", k40_remocon.k40_message); //반복되는 동안 변화되는 볼륨수를 출력
		}
		for (int k40_i=0; k40_i <6; k40_i++) { //for 반복문 : 10번 반복
			k40_remocon.volumedown(); //리모콘 클라스의 볼륨 내리기 메소드 호출 
			System.out.printf("[%s]\n", k40_remocon.k40_message); //반복되는 동안 변화되는 볼륨수를 출력
		}
	}
}
