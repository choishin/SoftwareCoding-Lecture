package TaxPractice02;
//2.�Һ��ڰ� ���ݰ��
public class kopo40TaxPractice02 {
	//netprice : ���� = ��������(�Ǹ��� ���忡���� ����)
	//������? ��ǰ�� ���� ���Ͻ� ������ �Һ��� �ǸŰ����� ���Ѵ�.
	//�Һ��� ���ݰ� �򰥸��� ��� �� ������ �����̶�� �濡�� ������.
	public static int netprice(int price, double rate) {
		//�Һ��� ���� : ����, ���� ���� �߰��� ����. �Ǹ��ڰ� �Һ��ڿ��� �ŵ��ϴ� ����
		//�Һ��� ���� = �������� + ����(��������*����)  //x+x*y
		//�Һ��� ���� = ��������( 1+ ����) //x(1+y)
		//�������� = �Һ��� ����/(1+����) //x = z/(1+y)
		return (int) (price/(1+rate));
	
}//netprice
	
	public static void main (String[] args) {
		
		int kopo40price = 1234; //����
		double kopo40tax_rate = 0.1; //����
		int kopo40netprice = netprice(kopo40price,kopo40tax_rate); //��������
		int kopo40tax = kopo40price - kopo40netprice; //���� = ���� - ��������
		
		System.out.printf("***********************************************\n");
		System.out.printf("           �Һ��ڰ�, ��������, ���� ���         \n");
		System.out.printf("�Һ��ڰ��� : %d ��, �������� : %d ��, ���� %d ��\n",kopo40price,kopo40netprice,kopo40tax);
		System.out.printf("***********************************************\n");
		
	}//main
}//class



