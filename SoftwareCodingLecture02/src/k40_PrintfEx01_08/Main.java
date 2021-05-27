package k40_PrintfEx01_08;

public class Main {
/*
 * 8. 16진수, 8진수 표현 연습 (PrintEx1)
 * 16진수 상수는 바로 앞에 0x를 붙여야 함. 그렇지 않으면 FF를 숫자가 아닌 변수명으로 오인하게 됨 예) 0xFF , 0x10
 * Integer 클라스의 toBinarySring() -> 2진수를 문자열 형태로 출력
 * Integer 클라스의 toOctalString() -> 8진수를 문자열 형태로 출력
 * Integer 클라스의 toHexString() -> 16진수를 문자열 형태로 출력
 * Integer 클라스의 valueOf(문자열,2) -> 문자열 숫자를 2진수 숫자로 변환
 * Integer 클라스의 valueOf(문자열,8) -> 문자열 숫자를 8진수 숫자로 변환
 * Integer 클라스의 valueOf(문자열,16) -> 문자열 숫자를 16진수 숫자로 변환
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte k40_b = 1; 
		short k40_s = 2; 
		char k40_c = 'A';
		
		int K40_finger = 10;  // int :  10진수 표현 
		long k40_big = 1000000000000000000L; //long : 최대 19자리수 표현 가능  
		long k40_hex = 0xFFFFFFFFFFFFFFFFL;  // long hex : 16진수
		int k40_octNum = 010; //
		int k40_hexNum = 0x10; 
		int k40_binNum = 0b10;

		System.out.printf("b=%d%n", k40_b); // byte k40_b = 1
		System.out.printf("s=%d%n", k40_s); // short k40_s = 2
		System.out.printf("c=%c, %d  %n", k40_c, (int) k40_c); //%c : 자리에 char을 출력//A라는 글자의 아스키코드를 출력 
		System.out.printf("finger=[%5d] %n", K40_finger); //int 10을 오른쪽부터 5자리로 표현 (그래서 공백이 3)
		System.out.printf("finger=[%-5d]%n", K40_finger); //int 10을 왼쪽부터 5자리로 표현 (그래서 오른쪽으로 공백이 3)
		System.out.printf("finger=[%05d] %n", K40_finger); //오른쪽부터 5자리를 출력하는데 공백을 0으로 표현 
		System.out.printf("big=%d%n", k40_big);//long big = 1000000000000000000L
		System.out.printf("hex=%#x%n", k40_hex); // %#x : 16진수 표현 
		System.out.printf("octNum=%o, %d%n", k40_octNum, k40_octNum); //%o : 8진수로 표현// %d : 2진수로 표현
		System.out.printf("hexNum=%x, %d%n", k40_hexNum, k40_hexNum); //%x :  16진수로 표현//%d : 2진수로 표현 
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(k40_binNum), k40_binNum); //2진수를 문자열 형태로 출력//숫자로 출력

	}
}
