package k40_Elevator_Extends_11;
/*
 * 11.Inheritance (������� Ŭ���� �����)
 */
public class TestMain3 { //
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevator3 k40_elev3;  //**��ӹ��� Elevator3 Ŭ���� ȣ��**/
		k40_elev3= new Elevator3(); 
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_elev3.up();  //**<-��ӹ��� �޼ҵ� ���� �۵�**/
			System.out.printf("MSG[ %s ]\n", k40_elev3.k40_help); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) {
			k40_elev3.down();  //**<-��ӹ��� �޼ҵ� ���� �۵�**/
			System.out.printf("MSG[%s]\n", k40_elev3.k40_help); 
		}
		
		k40_elev3.Repair(); // //**<-�����ۼ��� �޼ҵ� ���� �۵�**/
		System.out.printf("MSG elevs[%s]\n",k40_elev3.k40_help);
	}
}
