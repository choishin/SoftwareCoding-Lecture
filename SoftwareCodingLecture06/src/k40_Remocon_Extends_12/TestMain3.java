package k40_Remocon_Extends_12;
/*
 * 12.Inheritance ������� Ŭ���� ����� (������ Ŭ����)
 */
public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl3 k40_remocon3; 
		k40_remocon3 = new RemoteControl3();  //<-Remocon2�� ��ӹ��� Remocon3 class�� ����
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_remocon3.channelup();  //<-��ӹ��� �޼ҵ� �����۵�
			System.out.printf("[ %s ]\n", k40_remocon3.k40_message); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) {
			k40_remocon3.channeldown(); //<-��ӹ��� �޼ҵ� �����۵�
			System.out.printf("[%s]\n", k40_remocon3.k40_message); 
		}
		for (int k40_i=0; k40_i <5; k40_i++) {
			k40_remocon3.volumeup();//<-��ӹ��� �޼ҵ� �����۵�
			System.out.printf("[%s]\n", k40_remocon3.k40_message); 
		}
		for (int k40_i=0; k40_i <6; k40_i++) { 
			k40_remocon3.volumedown();//<-��ӹ��� �޼ҵ� �����۵�
			System.out.printf("[%s]\n", k40_remocon3.k40_message);
		}
		k40_remocon3.checkBattery();//<-���� �ۼ��� �޼ҵ� �����۵�
		System.out.printf("[%s]\n",k40_remocon3.k40_message);
	}
}
