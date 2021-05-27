package k40_CastingEx2_12;
/*
 * 12. int ->byte (CastingEx2) 
 * 숫자를 byte로 바꾸는 것은 특수한 경우 (unix<->PC 등)
 * byte : 모든 문자는 컴퓨터에서 이해할 수 있는 byte로 변환이 되는데, 문자 각각이 가지고 있는 고유한 byte 번호 (아스키코드)를 표현하는 단위
 * 예) char tmp = (byte) 74; <-주로 이렇게 많이 쓰임
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_i = 10; 
		byte k40_b = (byte)k40_i; //byte k40_b = (byte)10;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k40_i, k40_b);
		
		k40_i = 300; 
		k40_b = (byte)k40_i; //k40_b = (byte)300
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k40_i, k40_b);
		
		k40_b = 10; 
		k40_i = (int)k40_b; 
		System.out.printf("[byte -> int] b=%d -> i=%d%n", k40_b, k40_i);
		
		k40_b = -2; 
		k40_i = (int)k40_b; 
		System.out.printf("[byte -> int] b=%d -> i=%d %n", k40_b, k40_i);
		System.out.println("i="+Integer.toBinaryString(k40_i)); //-2를 2진법으로 표현

	}

}
