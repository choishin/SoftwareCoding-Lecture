package k40_Elevator_Constructor01_09;
/*
 * 9.������,�Ҹ���,�̺�Ʈ
 */
public class TestMain { //<-���ο� Ŭ���� ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevator2 k40_elev;  //Elevator Ŭ�� ȣ��, ȣ��Ǹ鼭 �̹� ������(1)�� ȣ�� ��
		k40_elev= new Elevator2(); 
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_elev.up(); 
			System.out.printf("MSG[ %s ]\n", k40_elev.k40_help); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) { 
			k40_elev.down(); 
			System.out.printf("MSG[%s]\n", k40_elev.k40_help); 
		}
		
		Elevator2 k40_elevUP = new Elevator2(5); //<-������ (2) ȣ�� : 5�� �ö󰡱�
		System.out.printf("MSG elevUP[%s]\n",k40_elevUP.k40_help);
		
		Elevator2 k40_elevDN = new Elevator2(-5); //<- ������ (2) ȣ�� : 5�� ��������
		System.out.printf("MSG elevUP[%s]\n",k40_elevDN.k40_help);
	}
}
