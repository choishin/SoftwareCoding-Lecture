package k40_WrongCase06;
//6.Case�� �� 
//���� �ڵ�� Switch, case�� �������� ���� ��� 
//���� �����ϴ� ���� : �켱 switch�� ���⿡ �������� ���� �ݺ����̰� 
//for�� �ι�����, switch�� if�� ������ ���� �ͺ��� �� ȿ������ ����� ����� �ֱ� ����.
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ� : 12�� �ݺ��� ��
		for (int k40_i = 1; k40_i < 13; k40_i++){
			//�켱 "k40_i =>"�� ����ϰ�
			System.out.printf("%d�� =>", k40_i); 
			//***ó������ �ڵ� LOOP
			//�ݺ� : 1���� 31���� �ݺ��� ����
			LOOP: for(int k40_j = 1; k40_j < 32; k40_j++){
				//k40_j�� ����ϰ�
				System.out.printf("%d,",k40_j); 
				//ù��° ���� : k40_i��
				switch(k40_i) 
				//4,6,9,7,11 �϶�
				{ case 4: case 6: case 9: case 7: case 11:
					//�ι�° ���� : k40_j�� 30���� ����ϰ� LOOP Ż��
					if(k40_j == 30) break LOOP; 
					//������ ���� : ���� �̷� ǥ���� ����. // LOOP��� ǥ���ڰ� ������ ������ ���
					break; 
				//�ٽ� ù��° ���� : k40_i �� 2�϶�
					case 2:
					// k40_j�� 28���� ����ϰ� Ż��
					if(k40_j == 28) break LOOP;
					break;

				}
			}
			System.out.printf("\n");
		}

	}

}
