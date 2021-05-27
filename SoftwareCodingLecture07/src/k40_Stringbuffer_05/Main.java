package k40_Stringbuffer_05;
/*
 * 5. StringBuffer 클래스 사용하기 
 * String 클래스와의 차이점 : String 클래스는 한번 생성되면 그 값을 읽기만 할 수 있고
 *								변경은 할 수 없음. 하지만 StringBuffer클래스의 인스턴스는 
 *								그 값을 변경할 수도 있고, 추가 할 수도 있음. 
 *(1) StringBuffer클래스에서 오브젝트를 불러오고 
 *(2) sb.append(" ") : 내용 추가하기
 *(3) sb.toString() : String으로 변환한 값
 *(4) sb.concat(String) : 문자열을 합침
 *(5) sb.length() : 문자열의 길이
 *
 * String 클래스에만 있는 것 :
 * (1) String replace(char old, char new) : 특정 문자를 모두새로운 문자로 치환
 * (2) String substring(int begin , int end) : String 일부를 뽑아냄
 * (3) char[] toCharArray() : char 배열로 변환
 * (4) String toLowerCase() : 모두 소문자로 변환
 * (5) String toUpperCase() : 모두 대문자로 변환
 * (6) String trim() : 끝에 붙어있는 공백문자 제거
 * (7) String valueOf(char []) : char배열로부터 문자열을 만들어냄
 * (8) String valueOf(int i) : integer로부터 문자열을 만들어냄

 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k40_str="abcdef";
		StringBuffer sb= new StringBuffer(k40_str);   //String을StringBuffer로변경했다. 
		System.out.println(sb.append("abcd"));  //stringbuffer형식에서문자열붙여나감
		System.out.println(k40_str.charAt(4));
		k40_str= sb.toString();  				   // 다시StringBuffer형을String형으로변경함
		
	}

}

