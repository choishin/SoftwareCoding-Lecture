package SwitchPractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "123456-1234567";
		
		switch (jumin.charAt(7)) {
		case '1' : //������ ������ Ÿ���� char�̱� ������ 
			System.out.println("20���� �� �¾ ���� ���\n");
			break;
		case '2' :
			System.out.println("20���� �� �¾ ���� ���\n");
			break;
		case '3' : 
			System.out.println("20���� �� �¾ ���� ���\n");
			break;
		case '4' :
			System.out.println("20���� �� �¾ ���� ���\n");
			break;
		default :
			System.out.println("���\n");
			break;
		}
		
	}
}
