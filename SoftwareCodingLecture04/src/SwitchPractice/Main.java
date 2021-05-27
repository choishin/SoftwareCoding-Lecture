package SwitchPractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "123456-1234567";
		
		switch (jumin.charAt(7)) {
		case '1' : //조건의 데이터 타입이 char이기 때문에 
			System.out.println("20세기 전 태어난 남자 사람\n");
			break;
		case '2' :
			System.out.println("20세기 전 태어난 여자 사람\n");
			break;
		case '3' : 
			System.out.println("20세기 후 태어난 남자 사람\n");
			break;
		case '4' :
			System.out.println("20세기 후 태어난 여자 사람\n");
			break;
		default :
			System.out.println("사람\n");
			break;
		}
		
	}
}
