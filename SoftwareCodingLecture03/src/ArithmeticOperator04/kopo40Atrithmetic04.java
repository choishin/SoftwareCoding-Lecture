package ArithmeticOperator04;
//4.���ϴ� �ڸ��� �ݿø�, ����
public class kopo40Atrithmetic04 {
	
	public static void main(String[] args) {
		
		int kopo40ii1 = 12345;
		//4-1. 12345/10 = 1234�� ���ؼ� *10�� ���ϱ� : ������ ����
		int kopo40j1 = (kopo40ii1/10) *10; 
		System.out.printf("#4 -1  : %d\n", kopo40j1);
			
		int kopo40ii2 = 12345;
		//4-2. 12345/10 = 1234�� ���ؼ� *10�� ���ϱ� : 10�� �ڸ����� ����
		int kopo40j2 = (kopo40ii2/10)*10;
		System.out.printf("#4 -2  : %d\n", kopo40j2);
		
		//4-2. 12344�� 5�� ���� ���� 10�� ���� = 1234�� 10�� ���� �� :10�� �ڸ����� �ݿø�
		//�ڸ����� �ٲ��� �ʾ����� ������ ��
		int kopo40ii3 = 12344;
		int kopo40j3 = ((kopo40ii3+5)/10)*10;
		System.out.printf("#4 -2  : %d\n", kopo40j3);
		
		//#4-3. 100������ ���� (12345���� 100�� ������ 123�� ���ϰ� 100�� ����)
		int kopo40ii4 = 12345; 
		int kopo40j4 = ((kopo40ii4)/100)*100;
		System.out.printf("#4 -3  : %d\n", kopo40j4);
		
		//#4-3. 100������ �ø� (12345���� 100�� ������ 123�� ���ϰ� �ű⿡ 1�� ���� ��
															   //100�� ����)
		kopo40j4 = (((kopo40ii4)/100)+1)*100;
		System.out.printf("#4 -3  : %d\n", kopo40j4);
		
		//#4-3. 100������ �ݿø� (12345���� 50�� ���ϸ� = 12395 ���⼭ 100�� ����� 
														//123�� ���ϰ� 100�� ����)
		kopo40j4 = ((kopo40ii4+50)/100)*100;
		System.out.printf("#4 -3  : %d\n", kopo40j4);
		
		//#4-4. 1000�� ���� ����
		int kopo40j51 = 12345;
		int kopo40j52 = (kopo40j51/1000)*1000;
		System.out.printf("#4 -4  : %d \n",kopo40j52);
		
		//#4-4. 1000�� ���� �ݿø�
		int kopo40j53 = ((kopo40j51+500)/1000)*1000;
		System.out.printf("#4 -4  : %d \n",kopo40j53);
		
		//#4-4. 1000�� ���� �ø�
		int kopo40j54 = ((kopo40j51/1000)+1)*1000;
		System.out.printf("#4 -4  : %d \n",kopo40j54);
	
	}//main

}//class