package k40_RulesforPractice_02;
/*
 * 2. 실습규칙 
 * 기본 : ★
 * (1)주석달기. 다른 사람들이 내 소스를 잘 이해할 수 있도록 하는 최소한의 예의 (제목, 날짜, 저자, 코멘트) 
 * (2)모든 변수에는 앞에 학번을 붙일 것 (k40_)
 * (3)이클립스의 해당 소스와 결과를 캡쳐
 * 중요한 소스 : ★★
 * (1)매 줄 마다 설명을 달 것 
 * (2) 하나하나 타자를 칠 것 
 * 더 중요한 소스 : ★★★
 * (1) 더 중요한 소스 수준의 프로그램을 실습 후 해당 소스를 자필로 스스로 적을 것 (프로그램을 이해하며 느끼며 작성)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_year = 0; //(리터럴)
		int k40_age = 14;  //(리터럴)
		System.out.println("결과1 :" + k40_year); //리터럴로 쓰여진 변수 int K40_year를 출력
		System.out.println("결과2:" +k40_age); //리터럴로 쓰여진 변수 int K40_year를 출력

		k40_year = k40_age + 2000; //int K40_year은 K40_age+2000이라고 새롭게 정의
		k40_age = k40_age +1; //K40_age는 K40_age에 1을 더한것이라고 새롭게 정의
		System.out.println("결과3 :" +k40_year); //새롭게 정의된 K40_year을 출력
		System.out.println("결과4 :" +k40_age);  //새롭게 정의된 K40_age를 출력

	}
}
