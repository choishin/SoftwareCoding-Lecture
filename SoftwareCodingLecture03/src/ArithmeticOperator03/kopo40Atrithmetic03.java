package ArithmeticOperator03;
//3.������ ������ �������� ���� �������� ����ó��
public class kopo40Atrithmetic03 {
	
	public static void main(String[] args) {
		
		//3-1.int
		/*int Ÿ���� �����ʹ� 333.33333�� ������� ���� -> 1000/3�� ������ �ƴ� �Ǽ��̱� ����*/
		int kopo40ii = 1000/3; //kopo40ii = 1000/3 = 333
		System.out.printf("#3 -1.int : %d\n", kopo40ii);
		//3-1.double (�Ҽ��� �Ʒ� 18�ڸ����� ǥ��)
		/*���� �־��ִ� �ڸ����� 0.0�� ���� ������ ������� ��*/
		double kopo40ii1 = 1000.0/3; //kopo40ii1 = 1000.0/3 = 333.333 
		System.out.printf("#3 -1. double : %g\n", kopo40ii1);
		//3-1.float (�Ҽ��� �Ʒ� 9�ڸ����� ǥ��)
		/*double���� ������ ���� ���ڳ��� f�� �ٿ���� ��*/
		float kopo40ii2 = 1000.0f/3; //kopo40ii2 = 1000.0f/3 = 333.333344 
		System.out.printf("#3 -1. float : %f\n", kopo40ii2);
		
		
		//3-2.������ ���ϱ� % = 1
		int kopo40ii3= 1000%3;
		System.out.printf("#3 -2 : %d\n", kopo40ii3);
		
		//3-3.������ �������� ����
		//for�� : 0���� 19����(20��) �ݺ�
		for (int i = 0; i < 20; i++) {
			System.out.printf("#3 -3 : %d ", i);
			//���� i+1�� 5�� ���� �������� 0�ΰ�� �� ���� (��; 4,9...)
			//�� 1�� ���ߴ°�? 0���� �����̱� ����
			if (((i+1)%5)==0) {
				System.out.printf("\n");
			}
		}
	}

}
