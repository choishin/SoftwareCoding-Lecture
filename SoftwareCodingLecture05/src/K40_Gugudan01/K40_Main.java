package K40_Gugudan01;
/*1. ������ �μ�
 *   ���� => �ٴܱ���� ���� ������, ���ο� 1,2,3���� �� �����ְ� 3���� �ݺ��ؼ� ����ϵ��� ��ȹ
 *   *�߿�* �ݺ��� => �ʱⰪ: 'K40_i = 1'�� ����, ���� : 'K40_i < 9'�϶� ����, �������� : 1,4,7�� �����ϱ⶧���� i =i+3
 */

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int K40_i = 1; K40_i <9; K40_i=K40_i+3) { //(1) �켱 ������ ����ϰ�
			System.out.printf("************\t************\t************\n");
			System.out.printf(" ������ %d�� \t ������ %d�� \t ������ %d��\n",K40_i,K40_i+1,K40_i+2); //1�� 2�� 3�� -> 4�� 5�� 6�� -> 7�� 8�� 9�� 
			System.out.printf("************\t************\t************\n");
				for(int j = 1; j <9; j++) { //(2) 9���� �̺κ��� ��� �ݺ� ��� ��) 1*1=1 2*1=2 3*1=3 (1���� 9���� �ݺ� ��) 
					System.out.printf(" %d * %d = %2d\t",K40_i,j,K40_i*j);     //  4*1=4 5*1=5 6*1=6 (�ٽ� 1���� 9���� �ݺ�) ...
					System.out.printf(" %d * %d = %2d\t",K40_i+1,j,j+1*j); 
					System.out.printf(" %d * %d = %2d\n",K40_i+2,j,K40_i+2*j);
				}
				System.out.println(); //(3)<-(2)�� ��� ������
			}
			System.out.println(); //�ٰ� �� ���̸� �����

		}
	}









