package ConvertMoney032;
//2. ������ ���� ȯ�� ���(3)
public class kopo40ConvertMoney032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo40MyWon = 1000000;//ȯ���Ϸ��� ��� �� ��
		double kopo40Ex_rate = 1238.21; //ȯ��
		double kopo40commission = 0.003;//ȯ�������� 3%
	
		///kopo40ComPerOne : usd 1�� �� �ٴ� Ŀ�̼�
		double kopo40ComPerOne = kopo40Ex_rate * kopo40commission;
		
		//***����� usd �׼��� �ٲ�! �����δ� ���� ���� ȯ��+ȯ�������Ḧ ������ ������ ������ ����
		//=> 100���� / (1238.21��(=1�޷�) + ������(ComPerOne))***
		int kopo40usd = (int)(kopo40MyWon/(kopo40Ex_rate +kopo40ComPerOne));
		//kopo40remain = 100���� - usd���� * ȯ�� : �Ž�����
		int kopo40remain = (int)(kopo40MyWon -kopo40usd*kopo40Ex_rate);
		//kopo40total_ComPerOne : usd �� ���� * 1�� �� �ٴ� ������
		double kopo40total_Commission = kopo40usd * kopo40ComPerOne;
		
		//���⼭���� �����Ḧ double�� �޴� ���� int�� ó���� ����(�ø�)
		int kopo40i_totalcom;
		//if������ üũ '���� ��ŻĿ�̼��� int�� ����ȯ �� ���� ��ŻĿ�̼��� ���� ���� �ʴٸ�'
		if (kopo40total_Commission != (double)((int)(kopo40total_Commission))) {
			//'������ ��ȯ�� Ŀ�̼ǿ��� 1�� ���ϰڴ�'
			kopo40i_totalcom = (int)(kopo40total_Commission)+1;
		} else { 
			//�ƴ϶��, ���� (���� �� �������� ���)
			kopo40i_totalcom = (int)(kopo40total_Commission);
		}
		//�����Ḧ �� ���� �ܵ��� �ٽ� ����ؾ� ��!		
		kopo40remain = (int) (kopo40MyWon - kopo40usd*kopo40Ex_rate - (kopo40i_totalcom));
		
		System.out.printf("*******************************************************************\n");
		System.out.printf("                          ������ ���� ȯ��                           \n");
		System.out.printf("�� ������ : %d �� => ��ȭ : %d �޷�, �޷��� ������ : %f ��\n",kopo40i_totalcom, kopo40usd, kopo40ComPerOne);
		System.out.printf("�� ��ȭȯ���ݾ�: %d ��=> ��ȭ : %d �޷�, ������û�� : %d ��, �ܵ� : %d ��\n", kopo40MyWon, kopo40usd, kopo40i_totalcom, kopo40remain);
		System.out.printf("********************************************************************\n");
	}

}
