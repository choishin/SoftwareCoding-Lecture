package k40_Elevator_ClassObjectInstance01_04;
/*
 * 4.Ŭ����,��ü,�ν��Ͻ� (���������� Ŭ�� �����)
 */
public class Elevator { //<-���������� Ŭ�� ����
	int k40_limit_up_floor =10;  //��������(1) �ֻ�����
	int k40_limit_down_floor=0;  //��������(2) ��������
	int k40_floor =1 ; //��������(3) ������
	String k40_help; //�� help�� ����� String�� ������ ��������
	
	void up() { //<-�޼ҵ�(1) �ö󰡱�
		if (k40_floor== k40_limit_up_floor) { //���ǹ� if : ���� �������� �ֻ������̶��
			k40_help="���������Դϴ�."; // -> ���������Դϴ�.
		}else{ 
			k40_floor++; //���� �ֻ������� �ƴ϶�� 1����  �����ϰ�
			k40_help= String.format("%2d���Դϴ�.",k40_floor); //�������� ���
		}
	}

	void down() {//<-�޼ҵ�(2) ��������
		if (k40_floor == k40_limit_down_floor){ //���ǹ�if : ���� �������� ���������̶��
			k40_help="ó�����Դϴ�.";  //->ó�����Դϴ�.
		}else{ //���� ���������� �ƴ϶��
			k40_floor--; //������ �����ϰ�
			k40_help= String.format("%2d���Դϴ�.", k40_floor); //���� ���� ���
		}
	}
}

