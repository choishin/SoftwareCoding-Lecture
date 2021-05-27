package k40_Parsing_01;
/*
 * 1. Parsing (매우중요)
 * 문자로 선언한 걸 연산처리로 하려면 숫자형태로 바꿔서 하고, 
 * 숫자로 처리한 것에 문자열을 붙이려면 문자로 고친후 해라 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k40_s = "12345"; //(리터럴 : 문자그대로) String k40_s = 12345 
		int k40_i = Integer.parseInt(k40_s); //String k40_s(12345)는 문자이고 ->정수로 변환(12345) 
		System.out.printf("문자를 숫자로 %d (%d) \n", k40_i, k40_i+10); //숫자로 변환된 12345에 10을 더해줌
		
		String k40_a; //k40_a 라는 String 타입의 데이터를 생성 (선언)
		k40_a = String.format("%d", k40_i); //정수로 되어있는 12345를 String으로 변환
		System.out.printf("숫자를 문자로 %s (%s)\n", k40_a, k40_a+"abcde"); // 문자열로 변환된 12345에 abcde를 덧붙임

	}

}
