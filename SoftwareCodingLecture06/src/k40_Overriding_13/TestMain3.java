package k40_Overriding_13;
/*
 * 13.Overriding 
 * ->Overriding :  클래스를 상속받아 재정의 할때, 메소드를 새롭게 정의 하는 것
 * -> 특징 (1) : 부모 클래스의 것을 지칭할 때는 'super', 자기 클래스의 것을 지칭할 때는 'this'로 구분
 * -> 특징(2) :super class의 메소드와 동일한 이름과 매개변수로 자식클래스에서 메소드를 정의하면 자식클래스의 것이 호출 됨.
 */
public class TestMain3 { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevator3 k40_elev3;  
		k40_elev3= new Elevator3(); 
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_elev3.up();  //**overriding한 메소드 호출
			System.out.printf("MSG[ %s ]\n", k40_elev3.k40_help); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) {
			k40_elev3.down(); //**overriding한 메소드 호출
			System.out.printf("MSG[%s]\n", k40_elev3.k40_help); 
		}
		
		k40_elev3.Repair(); /**새로작성한 메소드 호출**/
		System.out.printf("MSG elevs[%s]\n",k40_elev3.k40_help);
	}
}
