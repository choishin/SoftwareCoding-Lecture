package ArithmeticOperator05;
//5.�Ҽ��� ���Ͽ����� ��� �ұ�?
public class kopo40Atrithmetic05 {
	
	public static void main(String[] args) {
		
		//5-1.int���� �Ҽ������ϴ�
		int kopo40MyVal = 14/5; //14/5 = 2 (2.8������ int ���̴� �Ҽ��� ���ϴ� ������)
		System.out.printf("#5 -1 : %d\n",kopo40MyVal);
		
		//5-2.double������ �Ҽ������ϴ�
		double kopo40MyValF;
		/*(�Ǽ������� ǥ�� ������, �������� ������ : ����ǥ���� �����̱� ����)*/
		kopo40MyValF = 14/5;  //= 2.000000
		System.out.printf("#5 -2: %f\n",kopo40MyValF);
		
		//5-3. �μ��� �Ǽ��� �ٲ��شٸ�
		kopo40MyValF = 14.0/5; //= 2.80000 (�������� ���ƿ�)
		System.out.printf("#5 -3: %f\n",kopo40MyValF);
		
		//5-3. �ٲ��� �μ��� 5�� ������ 0.5�� ���Ѵٸ� 
		kopo40MyValF = (14.0)/5+0.5; //= 3.300000 
		System.out.printf("#5 -4: %f\n",kopo40MyValF);
		
		//5-3. �� ���� integer�� ����ȯ (double�� ���������� Integeró�� �������� ������)
		kopo40MyValF = (int) ((14.0)/5+0.5); 
		System.out.printf("#5 -5: %f\n",kopo40MyValF);

		
	
	}//main

}//class