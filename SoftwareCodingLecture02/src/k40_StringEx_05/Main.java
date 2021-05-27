package k40_StringEx_05;
/*
 * 5.String 데이터 타입 다루기 연습 (StringEx)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k40_name = "Ja" + "va";  // K40_name = "Java" 
		String k40_str = k40_name + "8.0"; //K40_str = Java+8.0
		System.out.println(k40_name);  //Java
		System.out.println(k40_str);  //Java+8.0
		System.out.println (7 + ""); //integer 7 + " "
		System.out.println(" " + 7);  //" "(공백)+ String 7
		System.out.println (7 + ""); //Integer 7 +""
		System.out.println("" + 7); //""+String 7
		System.out.println("" + ""); //""+""
		System.out.println (7 + 7 + ""); //*** Integer 7+Integer 7+""(내용없음)
		System.out.println("" + 7 + 7);//*** ""(String)+String 7+String 7 

		/*
		 * 알게된 사실 : 자바는 데이터 타입이 중요한 프로그래밍 언어, 
		 * 만일 시작하는 단어가 Integer라면 뒤에도 Integer로 인식하고, 시작하는 단어가 String이라면 뒤도 String으로 인식
		 * 결론 : 원하는 결과를 얻고 싶다면 정확한 데이터 타입을 입력해서 변수 선언을  해두자.
		 */
	}

}
