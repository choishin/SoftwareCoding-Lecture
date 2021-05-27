package k40_Elevator_Extends_11;
/*
 * 11.Inheritance ���Ŭ���� ����� (���������� Ŭ�� develop)
 */
public class Elevator2 { //<-���������� Ŭ�� ����
	int k40_limit_up_floor;  //��������(1) �ֻ����� 
	int k40_limit_down_floor;  //��������(2) ��������
	int k40_floor; //��������(3) ������
	String k40_help; //�� help�� ����� String�� ������ ��������
	
	Elevator2() { //<- ������(1) ���� (ElevatorŬ�󽺰� ȣ��Ǹ� ���� ���� ����)
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("���������� �ذ��Ϸ�\n");
	}
	Elevator2(int k40_a) { //<- ������(2) ���� (ElevatorŬ�󽺰� ȣ��Ǹ� ���� ���� ����)
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("���������� �ذ��Ϸ�[%d]\n",k40_a); //<-�ö󰡰���� ����
		
		if(k40_a>0) { //<- ���� �Է��� ���� ������ �ƴ϶��
			for(int i =0; i<k40_a; i++) this.up(); //�ö󰡱� �޼ҵ带 �ݺ��ؼ� ���� 
		}
		else if (k40_a <0) { //<- ���� �������
			for (int i =0; i<(k40_a*-1); i++) this.down(); //�������� �޼ҵ带 �ݺ��ؼ� ����
		}
	}

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

