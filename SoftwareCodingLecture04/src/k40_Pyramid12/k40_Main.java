package k40_Pyramid12;
//12.�Ķ�̵� �����
public class k40_Main {

	public static void main(String[] args) {

		int k40_n,k40_m;
		k40_m = 20; //
		k40_n = 1; 
		//�ݺ� : (���ѹݺ�)
		while(true) {
			//�ݺ�1 : m����ŭ �ݺ� ������ �� : ���鸸���
			for (int k40_i = 0; k40_i < k40_m; k40_i++) System.out.printf(" "); 
			//�ݺ�2 : n����ŭ �ݺ� ������ �� : "+"���
			for (int k40_i = 0; k40_i < k40_n; k40_i++) System.out.printf("+"); 
			//����
			System.out.printf("\n");
			k40_m = k40_m-1; //m�� ���ڰ� 1�� �پ��� (������ 20,19,18,17...�� �پ��)
			k40_n = k40_n+2; //n�� 2�� �þ (+�� 1,3,5,7,9�� �þ)
			if (k40_m < 0) break; // m�� 0�� ���ų� �۴ٸ� �ݺ��� Ż��
		}//while

	}
}


