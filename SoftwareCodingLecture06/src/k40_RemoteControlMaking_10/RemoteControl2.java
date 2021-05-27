package k40_RemoteControlMaking_10;
/*
 * 10.������, �Ҹ���, �̺�Ʈ (������ Ŭ���� develop)
 */
public class RemoteControl2 { // ������ Ŭ���� ����
	int k40_max_channel;  //��������(1) ������ ä��
	int k40_min_channel;  //��������(2) ù��° ä��
	int k40_max_volume;  //��������(3)�ִ뺼��
	int k40_min_volume;  //��������(4)�ּҺ���
	int k40_current_channel ; //��������(5)����ä��
	int k40_current_volume ; //��������(6)���纼��
	String k40_message; 
	
	 RemoteControl2() {  //**<-������(1):  ���� �ʱ�ȭ ���ְ�, ���� ���**/
		k40_max_channel = 10;
		k40_min_channel = 1;
		k40_max_volume = 5;
		k40_min_volume = 0;
		k40_current_channel = 1;
		k40_current_volume = 1;
		System.out.printf("���� ä�� : [%d]\t",k40_current_channel);
		System.out.printf("���� ���� : [%d]\n",k40_current_volume);
	}
	 RemoteControl2(int k40_channel, int k40_volume) {//**<-������(2):  ���� �ʱ�ȭ ���ְ�, �Էµ� ä�ΰ� ������ŭ �޼ҵ带 ȣ��**/
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
	void channelup() { //<-�޼ҵ�(1) ä�� �ø���
		if (k40_current_channel == k40_max_channel) { //���� ���� ä���� ������ ä���̶��
			k40_message ="������ ä���Դϴ�."; // ->������ ä���Դϴ�. 
		}else{ 
			k40_current_channel++; //���� ������ ä���� �ƴ϶�� ä�� �ø���
			k40_message= String.format("%d�� ä�� �Դϴ�.",k40_current_channel); //����ä�� ���
		}
	}
	void channeldown() { //<-�޼ҵ�(2) ä�� ������
		if (k40_current_channel == k40_min_channel) { //���� ���� ä���� ù��° ä���̶��
			k40_message ="ù��° ä�� �Դϴ�."; // -> ù��° ä���Դϴ�.
		}else{ 
			k40_current_channel--; //���� ����ä���� ù��° ä���� �ƴ϶�� ä�� ������
			k40_message= String.format("%d�� ä�� �Դϴ�.",k40_current_channel); //���� ä�� ���
		}
	}
	void volumeup() { //<-�޼ҵ�(3) ���� �ø���
		if (k40_current_volume == k40_max_volume) { //���� ���� ������ �ִ뺼���̶��
			k40_message ="�ִ뺼���Դϴ�."; // -> �ִ뺼���Դϴ�.
		}else{ 
			k40_current_volume++; //���� �ִ뺼���� �ƴ϶�� ���� �ø���
			k40_message= String.format("���纼�� : %2d ",k40_current_volume); //���� ���� ���
		}
	}
	void volumedown() { //<-�޼ҵ�(4) ���� ������
		if (k40_current_volume == k40_min_volume) { //���� ���� ������ �ּҺ����̶��
			k40_message ="�ּҺ����Դϴ�."; // -> �ּҺ����Դϴ�.
		}else{ 
			k40_current_volume--; //���� �ּҺ����� �ƴ϶�� ���� ������
			k40_message= String.format("���纼�� : %2d ",k40_current_volume); //���� ���� ���
		}
	}
}

