package k40_Remocon_ClassObjectInstance02_05;
/*
 * 5.Ŭ����,��ü,�ν��Ͻ�(2) (���������� Ŭ��)
 */
public class TestMain { //<-���ο� Ŭ���� ���� 
	private static int k40_inval;  //�������� ���� inval
	public static void up() { //<- �޼ҵ�(1) �ö󰡱�
		k40_inval++; //iinval ����
		System.out.printf("�� �׳� �޼ҵ� [%d]\n", k40_inval); //<-������ inval ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k40_inval=0;  //inval �� �ʱ�ȭ 
		Elevator k40_elev;  //Elevator Ŭ�� ȣ��
		k40_elev= new Elevator(); 
		up(); //�ö󰡱� �޼ҵ� ȣ��
		for (int k40_i=0; k40_i <10; k40_i++){  //for �ݺ��� : 10�� �ݺ�
			k40_elev.up();  //������������ �ö󰡱� �޼ҵ带 ȣ��
			System.out.printf("MSG[ %s ]\n", k40_elev.k40_help); //�ݺ��Ǵ� ���� ��ȭ�Ǵ� ������ ���
		}
		for (int k40_i=0; k40_i <10; k40_i++) { //for �ݺ��� : 10�� �ݺ�
			k40_elev.down(); //���������� Ŭ���� �������� �޼ҵ� ȣ�� 
			System.out.printf("MSG[%s]\n", k40_elev.k40_help); //�ݺ��Ǵ� ���� ��ȭ�Ǵ� ������ ���

		}
	}
}
