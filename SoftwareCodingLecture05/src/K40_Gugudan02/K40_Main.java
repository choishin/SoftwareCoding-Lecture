package K40_Gugudan02;
/* 2. ������ �μ�
 * ���� => ���������� �ѹ��� 3�ܾ� 3���� ����� ��ȹ�� ��.
 * 1���� �޶��� �� => 1�ٿ� 1,4,7�� �����ϱ� ������ K40_i,K40_i+3, K40_i+6���� ����
 * 1���� �޶��� �ݺ��� => �ʱⰪ : K40_i =1 (1���� ����), K40_i < 9(9����), 1,2,3���� �����ϱ⶧���� i++
 *  
 */

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//123��
		for (int k40_i = 1; k40_i <4; k40_i++) { //(1) �켱 �̺κ��� ����ϰ� ��¿�) 1*1=1 4*1=4 7*1=7 (9���� �ݺ�)
			System.out.printf("************\t************\t************\n");
			System.out.printf(" ������ %d�� \t ������ %d�� \t ������ %d��\n",k40_i,k40_i+3,k40_i+6); 
			System.out.printf("************\t************\t************\n");
				for(int j = 1; j <9; j++) { //(2) 9���� �̺κ��� ��� ->(3)
					System.out.printf(" %d * %d = %d\t",k40_i,j,k40_i*j);
					System.out.printf(" %d * %d = %d\t",k40_i+3,j,j+3*j);
					System.out.printf(" %d * %d = %d\n",k40_i+6,j,k40_i+6*j);
				}
				System.out.println(); //(3) <-(2)
			}
			System.out.println(); //�ٰ� �ٰ��� ����

		}
	}









