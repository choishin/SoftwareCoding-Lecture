package k40_Overriding_13;
/*
 * 13.Overriding
 *  ->Overriding :  Ŭ������ ��ӹ޾� ������ �Ҷ�, �޼ҵ带 ���Ӱ� ���� �ϴ� ��
 * -> Ư¡ (1) : �θ� Ŭ������ ���� ��Ī�� ���� 'super', �ڱ� Ŭ������ ���� ��Ī�� ���� 'this'�� ����
 * -> Ư¡(2) :super class�� �޼ҵ�� ������ �̸��� �Ű������� �ڽ�Ŭ�������� �޼ҵ带 �����ϸ� �ڽ�Ŭ������ ���� ȣ�� ��.
 */
public class Elevator2 { 
	int k40_limit_up_floor;  
	int k40_limit_down_floor; 
	int k40_floor;
	String k40_help;
	
	Elevator2() { 
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("���������� �ذ��Ϸ�\n");
	}
	Elevator2(int k40_a) { 
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("���������� �ذ��Ϸ�[%d]\n",k40_a);
		
		if(k40_a>0) {
			for(int i =0; i<k40_a; i++) this.up();
		}
		else if (k40_a <0) { //<- ���� �������
			for (int i =0; i<(k40_a*-1); i++) this.down();
		}
	}

	void up() {
		if (k40_floor== k40_limit_up_floor) {
			k40_help="���������Դϴ�.";
		}else{ 
			k40_floor++;
			k40_help= String.format("%2d���Դϴ�.",k40_floor);
		}
	}

	void down() {
		if (k40_floor == k40_limit_down_floor){ 
			k40_help="ó�����Դϴ�.";
		}else{ 
			k40_floor--;
			k40_help= String.format("%2d���Դϴ�.", k40_floor);
		}
	}
}

