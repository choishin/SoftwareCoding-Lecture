package k40_Overriding_13;
/*
 * 13.Overriding
 *  ->Overriding :  Ŭ������ ��ӹ޾� ������ �Ҷ�, �޼ҵ带 ���Ӱ� ���� �ϴ� ��
 * -> Ư¡ (1) : �θ� Ŭ������ ���� ��Ī�� ���� 'super', �ڱ� Ŭ������ ���� ��Ī�� ���� 'this'�� ����
 * -> Ư¡(2) :super class�� �޼ҵ�� ������ �̸��� �Ű������� �ڽ�Ŭ�������� �޼ҵ带 �����ϸ� �ڽ�Ŭ������ ���� ȣ�� ��.
 */
public class Elevator3 extends Elevator2 {  //**Elevator2Ŭ�������� ��ӹ���**/
	
	void Repair() {
		k40_help = String.format("�������Դϴ�.");
	}
	
	void up() { //**up()�̶�� �θ�Ŭ������ �޼ҵ�� �̸��� �Ȱ��� �޼ҵ带 ���Ӱ� ���� **/
		if (k40_floor>= k40_limit_up_floor) { 
			k40_help="���������Դϴ�."; 
		}else{ 
			k40_floor = k40_floor+2; //**�޶��� �� : �ѹ��� 2���� �ö�
			k40_help= String.format("%2d���Դϴ�.",k40_floor);  
		}
		this.down(); //**�ڽ�Ŭ�������� �ۼ��� down() �޼ҵ带 ȣ�� (<-�ڱ��ڽ��� ����ؼ� �θ��� ��)
	}

	void down() {
		
		super.down(); //�θ�Ŭ������  down()�޼ҵ带 ȣ��  
		System.out.printf("Ŭ���� �ȿ��� ��� �ִ� MSG [%s]\n",this.k40_help); 
}
}

