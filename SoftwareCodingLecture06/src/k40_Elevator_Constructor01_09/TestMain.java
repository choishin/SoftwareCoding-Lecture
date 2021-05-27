package k40_Elevator_Constructor01_09;
/*
 * 9.생성자,소멸자,이벤트
 */
public class TestMain { //<-새로운 클래스 생성 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevator2 k40_elev;  //Elevator 클라스 호출, 호출되면서 이미 생성자(1)도 호출 됨
		k40_elev= new Elevator2(); 
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_elev.up(); 
			System.out.printf("MSG[ %s ]\n", k40_elev.k40_help); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) { 
			k40_elev.down(); 
			System.out.printf("MSG[%s]\n", k40_elev.k40_help); 
		}
		
		Elevator2 k40_elevUP = new Elevator2(5); //<-생성자 (2) 호출 : 5층 올라가기
		System.out.printf("MSG elevUP[%s]\n",k40_elevUP.k40_help);
		
		Elevator2 k40_elevDN = new Elevator2(-5); //<- 생성자 (2) 호출 : 5층 내려가기
		System.out.printf("MSG elevUP[%s]\n",k40_elevDN.k40_help);
	}
}
