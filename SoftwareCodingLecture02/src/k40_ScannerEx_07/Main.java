package k40_ScannerEx_07;

import java.util.Scanner;
/*
 * 7. Scanner 클래스 이용하기 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k40_scanner = new Scanner (System.in); //Scanner 클래스에서 오브젝트 불러오기 
		System.out.print("두자리 정수를 하나 입력해주세요.>"); 
		String k40_input = k40_scanner.nextLine(); //문자열 입력받기
		int k40_num = Integer.parseInt(k40_input); //숫자 입력받기
		System.out.println("입력내용 :"+k40_input); //입력받은 문자열 출력하기
		System.out.printf("num = %d%n", k40_num); //입력받은 숫자 출력하기

	}

}