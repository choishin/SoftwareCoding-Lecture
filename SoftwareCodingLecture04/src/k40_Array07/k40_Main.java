package k40_Array07;
//7.Array �̿� ��
//������ �ڸ�Ʈ : �迭�� ����ϴ� ��쵵 ���� ����̴�. ������ ������ ���̱� �ϴ�.
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k40_iLMD ={31,28,31,30,31,30,31,31,30,31,30,31};
		// k40_iLMD�� LastMonthDate�� ��� ���� �迭 
		//�ش� �迭�� 0���� �����ϴ� �Ϳ� ����, k40_iLMD[0] ~ k40_iLMD[11]�̴�. 
		//(1���� �ε��� 0��, 12���� �ε��� 11��)
		
		//�ݺ� : 12�� �ݺ�
		for (int k40_i = 1; k40_i < 13; k40_i++){
			//k40_i=> ��� ��
			System.out.printf("%d�� =>", k40_i); 
			//�ݺ� : 1���� 31�� �ݺ�
			for (int k40_j = 1; k40_j < 32; k40_j++){
				//k40_i=>j1,j2,j3... ���
				System.out.printf("%d", k40_j);
				//�迭�� �־�� ������ ���̸� �ݺ��� Ż��!
				//��) 1���̶�� k40_iLMD[0] �׷��� [k40_i-1]
				if(k40_iLMD[k40_i-1] == k40_j) break;
				System.out.printf(",");
			}
			System.out.printf("\n");
		}


	}

}
