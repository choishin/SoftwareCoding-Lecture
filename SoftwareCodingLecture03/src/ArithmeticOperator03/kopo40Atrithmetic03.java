package ArithmeticOperator03;
//3.정수형 변수의 나눗셈은 정수 범위에서 버림처리
public class kopo40Atrithmetic03 {
	
	public static void main(String[] args) {
		
		//3-1.int
		/*int 타입의 데이터는 333.33333을 출력하지 않음 -> 1000/3은 정수가 아닌 실수이기 때문*/
		int kopo40ii = 1000/3; //kopo40ii = 1000/3 = 333
		System.out.printf("#3 -1.int : %d\n", kopo40ii);
		//3-1.double (소수점 아래 18자리까지 표현)
		/*값을 넣어주는 자리에도 0.0과 같이 형식을 맞춰줘야 함*/
		double kopo40ii1 = 1000.0/3; //kopo40ii1 = 1000.0/3 = 333.333 
		System.out.printf("#3 -1. double : %g\n", kopo40ii1);
		//3-1.float (소수점 아래 9자리까지 표현)
		/*double과의 구분을 위해 숫자끝에 f를 붙여줘야 함*/
		float kopo40ii2 = 1000.0f/3; //kopo40ii2 = 1000.0f/3 = 333.333344 
		System.out.printf("#3 -1. float : %f\n", kopo40ii2);
		
		
		//3-2.나머지 구하기 % = 1
		int kopo40ii3= 1000%3;
		System.out.printf("#3 -2 : %d\n", kopo40ii3);
		
		//3-3.나머지 연산자의 응용
		//for문 : 0부터 19까지(20번) 반복
		for (int i = 0; i < 20; i++) {
			System.out.printf("#3 -3 : %d ", i);
			//만일 i+1을 5로 나눈 나머지가 0인경우 줄 갈이 (예; 4,9...)
			//왜 1일 더했는가? 0부터 시작이기 때문
			if (((i+1)%5)==0) {
				System.out.printf("\n");
			}
		}
	}

}
