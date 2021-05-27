package ArithmeticOperator05;
//5.소수점 이하에서는 어떻게 할까?
public class kopo40Atrithmetic05 {
	
	public static void main(String[] args) {
		
		//5-1.int에서 소수점이하는
		int kopo40MyVal = 14/5; //14/5 = 2 (2.8이지만 int 값이니 소수점 이하는 버려짐)
		System.out.printf("#5 -1 : %d\n",kopo40MyVal);
		
		//5-2.double형에서 소수점이하는
		double kopo40MyValF;
		/*(실수형으로 표현 되지만, 나머지는 버려짐 : 숫자표현이 정수이기 때문)*/
		kopo40MyValF = 14/5;  //= 2.000000
		System.out.printf("#5 -2: %f\n",kopo40MyValF);
		
		//5-3. 인수를 실수로 바꿔준다면
		kopo40MyValF = 14.0/5; //= 2.80000 (나머지가 돌아옴)
		System.out.printf("#5 -3: %f\n",kopo40MyValF);
		
		//5-3. 바꿔준 인수에 5를 나누고 0.5를 더한다면 
		kopo40MyValF = (14.0)/5+0.5; //= 3.300000 
		System.out.printf("#5 -4: %f\n",kopo40MyValF);
		
		//5-3. 그 수를 integer로 형변환 (double의 형태이지만 Integer처럼 나머지는 버려짐)
		kopo40MyValF = (int) ((14.0)/5+0.5); 
		System.out.printf("#5 -5: %f\n",kopo40MyValF);

		
	
	}//main

}//class