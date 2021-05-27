package k40_RemoteControlMaking01_06;
/*
 * 6.Ŭ����,��ü,�ν��Ͻ�(������ Ŭ���� �����)
 */
public class RemoteControl { //<- ������ Ŭ���� ����
	int k40_max_channel=10;  //��������(1) ������ ä��
	int k40_min_channel=1;  //��������(2) ù��° ä��
	int k40_max_volume =5;  //��������(3)�ִ뺼��
	int k40_min_volume =0;  //��������(4)�ּҺ���
	int k40_current_channel =1 ; //��������(5)����ä��
	int k40_current_volume =1 ; //��������(6)���纼��
	String k40_message; 
	
	void channelup() { //<-�޼ҵ�(1) ä�� �ø���
		if (k40_current_channel == k40_max_channel) { //���� ���� ä���� ������ ä���̶��
			k40_message ="������ ä���Դϴ�."; // ->������ ä���Դϴ�. 
		}else{ 
			k40_current_channel++; //���� ������ ä���� �ƴ϶�� ä�� �ø���
			k40_message= String.format("%2d�� ä�� �Դϴ�.",k40_current_channel); //����ä�� ���
		}
	}
	void channeldown() { //<-�޼ҵ�(2) ä�� ������
		if (k40_current_channel == k40_min_channel) { //���� ���� ä���� ù��° ä���̶��
			k40_message ="ù��° ä�� �Դϴ�."; // -> ù��° ä���Դϴ�.
		}else{ 
			k40_current_channel--; //���� ����ä���� ù��° ä���� �ƴ϶�� ä�� ������
			k40_message= String.format("%2d�� ä�� �Դϴ�.",k40_current_channel); //���� ä�� ���
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

