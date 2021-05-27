package k40_Remocon_Extends_12;
/*
 * 12.Inheritance 상속으로 클래스 만들기 (리모콘 클래스)
 */
public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl3 k40_remocon3; 
		k40_remocon3 = new RemoteControl3();  //<-Remocon2를 상속받은 Remocon3 class를 생성
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_remocon3.channelup();  //<-상속받은 메소드 정상작동
			System.out.printf("[ %s ]\n", k40_remocon3.k40_message); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) {
			k40_remocon3.channeldown(); //<-상속받은 메소드 정상작동
			System.out.printf("[%s]\n", k40_remocon3.k40_message); 
		}
		for (int k40_i=0; k40_i <5; k40_i++) {
			k40_remocon3.volumeup();//<-상속받은 메소드 정상작동
			System.out.printf("[%s]\n", k40_remocon3.k40_message); 
		}
		for (int k40_i=0; k40_i <6; k40_i++) { 
			k40_remocon3.volumedown();//<-상속받은 메소드 정상작동
			System.out.printf("[%s]\n", k40_remocon3.k40_message);
		}
		k40_remocon3.checkBattery();//<-새로 작성한 메소드 정상작동
		System.out.printf("[%s]\n",k40_remocon3.k40_message);
	}
}
