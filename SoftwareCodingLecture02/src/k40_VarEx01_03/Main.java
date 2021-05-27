package k40_VarEx01_03;
/*
 * 3. int Value 연산 연습 (VarEx01)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_year = 0; 
		int k40_age = 14; 
		System.out.println("결과1 :" + k40_year); //리터럴로 쓰여진 변수 int K40_year를 출력
		System.out.println("결과2:" +k40_age); //리터럴로 쓰여진 변수 int K40_year를 출력

		k40_year = k40_age + 2000; //int K40_year은 K40_age+2000이라고 새롭게 정의
		k40_age = k40_age +1; //K40_age는 K40_age에 1을 더한것이라고 새롭게 정의
		System.out.println("결과3 :" +k40_year); //새롭게 정의된 K40_year을 출력
		System.out.println("결과4 :" +k40_age);  //새롭게 정의된 K40_age를 출력

	}
}

