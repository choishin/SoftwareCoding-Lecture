package k40_PrintfEx02_09;
/*
 * 9.float, double 연습
 * %f : double,float 값을 소수로 표현
 * %e : double, float 값을 지수로 표현
 * %g : 숫자값의 크기에 따라 f나 e로 출력 (숫자값의 절대값이 0.0001보다 작은 경우 e형식이 사용되어짐)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k40_url = "www.codechobo.com";
		float k40_f1 = .10f; //0.1을 f(소수)로 표현
		float k40_f2 = 1e1f; //1개의 e가 있고, 1을 f(소수)로 표현
		float k40_f3 = 3.14e3f; //3개의 e가 있고, 3.14를 f(소수)로 표현
		double k40_d = 1.23456789; 
		System.out.printf("f1=%f, %e, %g%n", k40_f1, k40_f1, k40_f1); // %f :소수로표현  %e : 지수로 표현  %g :  (숫자값의 절대값이 0.0001보다 작은 경우 e형식이 사용되어짐)
		System.out.printf("f2=%f, %e, %g%n", k40_f2, k40_f2, k40_f2); //%f :  %e : %g :
		System.out.printf("f3=%f, %e, %g%n", k40_f3, k40_f3, k40_f3); //%f :  %e : %g :
		
		System.out.printf("d=%f%n", k40_d); //%f : double을 출력하겠다
		System.out.printf("d=%14.10f%n", k40_d); //14자리를 예약하고 10자리 만큼 출력하겠다(나머지는 공백)
		System.out.printf("[12345678901234567890]%n");  //[12345678901234567890]출력후  %n : 개행
		System.out.printf("[%s] %n", k40_url);  //%s : 문자열을 출력하겠다
		System.out.printf("%20s ] %n", k40_url); //%20s : 오른쪽부터 시작해 문자열을 20자리 만큼 출력하겠다
		System.out.printf("[%-20s] %n", k40_url); // %-20s : 왼쪽부터 시작해 문자열을 20자리 만큼 출력하겠다
		System.out.printf("[%.8s] %n", k40_url); //%.s : 문자열을 8자리 만큼 출력하겠다.
	}

}
