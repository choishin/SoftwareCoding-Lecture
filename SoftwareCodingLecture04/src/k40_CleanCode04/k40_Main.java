package k40_CleanCode04;
//4.��������1(����ڵ�)
/**������ �˾ƺ� �� �ֵ��� �ڵ� �ض�, ª�� ���ٰ� ���� �ڵ��� �ƴϴ�!**/
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ݺ��� : 12�� �ݺ��� ����
		for (int k40_i = 1; k40_i < 13; k40_i++){
			//�ٲ��'k40_i' => �� ��� �ϰ�
			System.out.printf("%d �� =>", k40_i);
			//�ݺ� : 1���� 31���� �ݺ�
			for (int k40_j = 1; k40_j <32; k40_j++){
				//k40_j�� ����ϴµ� (�׷� ������� k40_i => k40_j)
			System.out.printf("%d,", k40_j);
			//���ǹ� : �� ���ǿ� �ش��ϸ� break;
			if(k40_i == 1 && k40_j == 31) break; //��) ���� k40_i�� 1�̰� k40_j�� 31�̸� �ݺ��� Ż��!
			if(k40_i == 2 && k40_j == 28) break; 
			if(k40_i == 3 && k40_j == 31) break; 
			if(k40_i == 4 && k40_j == 30) break; 
			if(k40_i == 5 && k40_j == 31) break; 
			if(k40_i == 6 && k40_j == 30) break; 
			if(k40_i == 7 && k40_j == 31) break; 
			if(k40_i == 8 && k40_j == 31) break; 
			if(k40_i == 9 && k40_j == 30) break; 
			if(k40_i == 10 && k40_j == 31) break; 
			if(k40_i == 11 && k40_j == 30) break; 
			if(k40_i == 12 && k40_j == 31) break;
		}
			System.out.printf("\n"); //�׸��� �������� ����
		}

	}

}
