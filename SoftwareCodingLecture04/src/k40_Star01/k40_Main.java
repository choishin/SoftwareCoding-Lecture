package k40_Star01;
//1.while�� �����
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(1)������ �帧�� ���� k40_iA,k40_iB ���� ���� //(12) �ٽý��� k40_iA = 1, k40_iB = 1
		int k40_iA, k40_iB;  
		//(2)iA = 0�� ��
		k40_iA = 0;
		while(true) { //(3)while ���� üũ : ������ ��
			k40_iB = 0; //(4)k40_iB = 0�� ��
			while (true) { //(5)�ι�° ���� üũ : ������ ��
				System.out.print("*"); //(6)������ ���� ������ �ؿ� �ܼ��� ����
				if (k40_iA == k40_iB) break; //(7) if ����üũ : ���� k40_iA == k40_iB �� ��� Ż��
				k40_iB++; //(8) k40_iB ���ڸ� �ø� == 1�� ��
			}
			System.out.println(); //(9)�ٰ���
			k40_iA++; //(10) k40_iA ���ڸ� �ø� == 1�� ��
			if (k40_iA == 30) break; // (11) ù��° while���� Ż���ϴ� ������ k40_iA == 30�̰� 
		}                     //=>�̰��� ���� ������ ��
		
	
		/*int k40_iA = 0, k40_iB = 0; //<= �̰� �ȵǴ� ���� : ���� 0���� �ʱ�ȭ�� �ǹ���
		
		while(true) {
			while (true) {
				System.out.print("*");
				if (k40_iA == k40_iB) break;
				k40_iB++;
			}
			System.out.println();
			k40_iA++;
			if (k40_iA == 30) break;
		}*/
		

	}

}
