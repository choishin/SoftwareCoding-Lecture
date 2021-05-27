package k40_Elevator_Extends_11;
/*
 * 11.Inheritance (상속으로 클래스 만들기)
 */
public class TestMain3 { //
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevator3 k40_elev3;  //**상속받은 Elevator3 클래스 호출**/
		k40_elev3= new Elevator3(); 
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_elev3.up();  //**<-상속받은 메소드 정상 작동**/
			System.out.printf("MSG[ %s ]\n", k40_elev3.k40_help); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) {
			k40_elev3.down();  //**<-상속받은 메소드 정상 작동**/
			System.out.printf("MSG[%s]\n", k40_elev3.k40_help); 
		}
		
		k40_elev3.Repair(); // //**<-새로작성한 메소드 정상 작동**/
		System.out.printf("MSG elevs[%s]\n",k40_elev3.k40_help);
	}
}
