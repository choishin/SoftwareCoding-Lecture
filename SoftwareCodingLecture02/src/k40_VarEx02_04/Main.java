package k40_VarEx02_04;
/*
 * 4.����ȯ�ϱ�(VarEx02)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k40_x = 10;  //���ͷ� : int k40_x =10
		int k40_y = 20; // ���ͷ� : int  k40_y =20
		int k40_tmp = 0; //����ȯ�� ���� ���� ����
		System.out.println("x : "+ k40_x + " y : " + k40_y); // k40_x��  k40_y�� ���� ���
		k40_tmp = k40_x;  // k40_tmp��  k40_x��(10)�� �ű��
		k40_x = k40_y; //����ִ�  k40_x��  k40_y��(20)�� �ű��
		k40_y = k40_tmp; //����ִ�  k40_y��  k40_tmp��(10)�� �ű��
		System.out.println("x : "+ k40_x + " y : " + k40_y); //����  k40_x = 20, k40_y = 10
		System.out.println("temp : "+k40_tmp); //<-������  k40_tmp���� ���

	}

}
