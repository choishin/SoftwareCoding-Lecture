package k40_Overriding_13;
/*
 * 13.Overriding 
 * ->Overriding :  Ŭ������ ��ӹ޾� ������ �Ҷ�, �޼ҵ带 ���Ӱ� ���� �ϴ� ��
 * -> Ư¡ (1) : �θ� Ŭ������ ���� ��Ī�� ���� 'super', �ڱ� Ŭ������ ���� ��Ī�� ���� 'this'�� ����
 * -> Ư¡(2) :super class�� �޼ҵ�� ������ �̸��� �Ű������� �ڽ�Ŭ�������� �޼ҵ带 �����ϸ� �ڽ�Ŭ������ ���� ȣ�� ��.
 */
public class TestMain3 { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevator3 k40_elev3;  
		k40_elev3= new Elevator3(); 
		for (int k40_i=0; k40_i <10; k40_i++){  
			k40_elev3.up();  //**overriding�� �޼ҵ� ȣ��
			System.out.printf("MSG[ %s ]\n", k40_elev3.k40_help); 
		}
		for (int k40_i=0; k40_i <10; k40_i++) {
			k40_elev3.down(); //**overriding�� �޼ҵ� ȣ��
			System.out.printf("MSG[%s]\n", k40_elev3.k40_help); 
		}
		
		k40_elev3.Repair(); /**�����ۼ��� �޼ҵ� ȣ��**/
		System.out.printf("MSG elevs[%s]\n",k40_elev3.k40_help);
	}
}
