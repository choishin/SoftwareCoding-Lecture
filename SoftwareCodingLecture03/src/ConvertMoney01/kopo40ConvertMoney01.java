package ConvertMoney01;
//1. �ܼ�ȯ�� ���
public class kopo40ConvertMoney01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo40MyWon = 1000000; //ȯ���Ϸ��� ���� ��
		double kopo40Ex_rate = 1238.21; //ȯ��
		double kopo40commision = 0.003; //ȯ��������
		
		//kopo40usd  = 100����/1238.21��(=1�޷�) : 100������ 1�޷��� �� �� �����
		int kopo40usd = (int) (kopo40MyWon/kopo40Ex_rate);
		//kopo40remain = 100���� - usd���� * ȯ�� : �Ž�����
		int kopo40remain = (int) (kopo40MyWon -kopo40usd*kopo40Ex_rate);
		
		System.out.printf("****************************************************\n");
		System.out.printf("                      ������ ���� ���                   \n");
		System.out.printf("�� ��ȭ ȯ�� �ݾ� : %d => ��ȭ : %d usd, �ܵ� : %d��\n", kopo40MyWon,kopo40usd,kopo40remain);
		System.out.printf("****************************************************\n");
	}

}
