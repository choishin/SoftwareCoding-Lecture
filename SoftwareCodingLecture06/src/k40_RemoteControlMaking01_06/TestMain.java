package k40_RemoteControlMaking01_06;
/*
 * 6.Ŭ����,��ü,�ν��Ͻ�(2) 
 */
public class TestMain { //<-���ο� Ŭ���� ���� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl k40_remocon;  //RemoteControl Ŭ�� ȣ��
		k40_remocon = new RemoteControl(); 
		for (int k40_i=0; k40_i <10; k40_i++){  //for �ݺ��� : 10�� �ݺ�
			k40_remocon.channelup();  //������ Ŭ���� ä�� �ø��� �޼ҵ带 ȣ��
			System.out.printf("[ %s ]\n", k40_remocon.k40_message); //�ݺ��Ǵ� ���� ��ȭ�Ǵ� ä�θ� ���
		}
		for (int k40_i=0; k40_i <10; k40_i++) { //for �ݺ��� : 10�� �ݺ�
			k40_remocon.channeldown(); //������ Ŭ���� ä�� ������ �޼ҵ带 ȣ�� 
			System.out.printf("[%s]\n", k40_remocon.k40_message); //�ݺ��Ǵ� ���� ��ȭ�Ǵ� ä�μ��� ���
		}
		for (int k40_i=0; k40_i <5; k40_i++) { //for �ݺ��� : 10�� �ݺ�
			k40_remocon.volumeup(); //������ Ŭ���� ���� �ø��� �޼ҵ� ȣ�� 
			System.out.printf("[%s]\n", k40_remocon.k40_message); //�ݺ��Ǵ� ���� ��ȭ�Ǵ� �������� ���
		}
		for (int k40_i=0; k40_i <6; k40_i++) { //for �ݺ��� : 10�� �ݺ�
			k40_remocon.volumedown(); //������ Ŭ���� ���� ������ �޼ҵ� ȣ�� 
			System.out.printf("[%s]\n", k40_remocon.k40_message); //�ݺ��Ǵ� ���� ��ȭ�Ǵ� �������� ���
		}
	}
}
