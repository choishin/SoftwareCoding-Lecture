package k40_Remocon_ClassObjectInstance02_05;
/*
 * 5.클래스,객체,인스턴스(2) (엘레베이터 클라스)
 */
public class TestMain { //<-새로운 클래스 생성 
	private static int k40_inval;  //전역변수 선언 inval
	public static void up() { //<- 메소드(1) 올라가기
		k40_inval++; //iinval 증가
		System.out.printf("난 그냥 메소드 [%d]\n", k40_inval); //<-증가된 inval 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k40_inval=0;  //inval 값 초기화 
		Elevator k40_elev;  //Elevator 클라스 호출
		k40_elev= new Elevator(); 
		up(); //올라가기 메소드 호출
		for (int k40_i=0; k40_i <10; k40_i++){  //for 반복문 : 10번 반복
			k40_elev.up();  //엘레베이터의 올라가기 메소드를 호출
			System.out.printf("MSG[ %s ]\n", k40_elev.k40_help); //반복되는 동안 변화되는 층수를 출력
		}
		for (int k40_i=0; k40_i <10; k40_i++) { //for 반복문 : 10번 반복
			k40_elev.down(); //엘레베이터 클라스의 내려가기 메소드 호출 
			System.out.printf("MSG[%s]\n", k40_elev.k40_help); //반복되는 동안 변화되는 층수를 출력

		}
	}
}
