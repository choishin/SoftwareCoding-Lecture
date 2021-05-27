package k40_SpecialCharEx_06;
/*
 * 6. 백슬래쉬를 이용해서 기호 출력하기 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println('\'');// 따옴표를 출력하고 싶다면, ' + \(백슬래쉬) + 따옴표 + '  (->앞에 백슬래쉬를 붙이면 됨)
		System.out.println("abc\t123\b456"); // \t : tab \b : back delete (이클립스 콘솔창에는 버그로 깨진 문자가 출력됨)
		System.out.println('\n'); // \n : 개행
		System.out.println("\"Hello\"");   //쌍따옴표를 출력하고 싶다면, \백슬래쉬를 앞에 두면 "을 출력할 수 있음
		System.out.println("c:\\"); // 경로를 적어줄때 c:\의 경우 인식이 안됨, \을 한번 더 붙이면 출력이 가능  

	}

}
