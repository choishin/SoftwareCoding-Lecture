package k40_RemoteControlMaking_10;
/*
 * 10.������, �Ҹ���, �̺�Ʈ (
 */
public class TestMain { //<-���ο� Ŭ���� ���� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl2 k40_remocon; 
		k40_remocon = new RemoteControl2(); //<-������(1) ȣ�� : ���� �ʱ�ȭ�ϰ�, ���� ä�� ���� ���� ���  
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
		
		RemoteControl2  k40_remocon2 = new RemoteControl2(2,4); //<-������(2)ȣ�� : ä�� 2��ŭ �ø��� ���� 4��ŭ �ø���
	}
}
