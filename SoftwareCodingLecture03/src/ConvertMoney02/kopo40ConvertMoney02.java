package ConvertMoney02;
//2. ������ ���� ȯ�� ���(1)
public class kopo40ConvertMoney02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo40MyWon = 1000000; //ȯ���Ϸ��� ���� ��
		double kopo40Ex_rate = 1238.21; //ȯ��
		double kopo40commission = 0.003;//ȯ�������� = 3%�� ������
		
		//kopo40usd  = 100����/1238.21��(=1�޷�) : 100������ 1�޷��� �� �� �����
		int kopo40usd = (int)(kopo40MyWon/kopo40Ex_rate);
		//kopo40remain = 100���� - usd���� * ȯ�� : �Ž�����
		int kopo40remain = (int)(kopo40MyWon -kopo40usd*kopo40Ex_rate);
		//kopo40ComPerOne : usd 1�� �� �ٴ� Ŀ�̼�
		double kopo40ComPerOne = kopo40Ex_rate * kopo40commission;
		//kopo40total_ComPerOne : usd �� ���� * 1�� �� �ٴ� ������
		double kopo40total_Commission = kopo40usd * kopo40ComPerOne;
		
		System.out.printf("*****************************************************************\n");
		System.out.printf("                          ������ ���                            \n");
		System.out.printf("�� ������ : %f => ��ȭ : %d usd, �޷��� ������ : %f��\n", kopo40total_Commission,kopo40usd,kopo40ComPerOne);
		System.out.printf("******************************************************************\n");
	}

}
