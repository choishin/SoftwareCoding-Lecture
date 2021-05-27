package K40_PrintingReceipt01;
/*
 * 1.�Ѿ��ġ� ������ ��� ����
 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar K40_calendar = Calendar.getInstance(); //Calendar Ŭ�������� �ý��ۿ��� ��¥������ �޾ƿ��� ���� ������Ʈ ����
		SimpleDateFormat K40_format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //SimpleDataFormat Ŭ�������� �޾ƿ� ��¥������ ����� ���� ���� 
		DecimalFormat K40_df = new DecimalFormat("###,###,###,###,###,###,###");//DecimalFormat Ŭ�������� õ���� ���ڿ� ��ǥ�� �־��ֱ� ���� ���� 
																				//** SimpleDataFormat�� DecimalFormat�� %s�� ��������. (���ڰ� �ƴ�)


		double K40_tax = 0.1; //����
		int K40_iPrice = 33000; //����
		int K40_netprice = (int) (K40_iPrice*10/((K40_tax+1)*10)); //�������� : �������� ������10���� ���ϰ� 11�� ���������� (int)�� �Ҽ������ϴ� ����ó��
		int K40_taxAmount = K40_iPrice - K40_netprice; // ���� : ���� - �������� (�������ݿ��� ������ �Ҽ����� ���⼭ �ø�ó���� ��)
		
		System.out.printf("%1.4s\n","�ſ����"); 
		System.out.printf("%1.5s %7.8s %12.12s %6.6s\n","�ܸ��� :","2N68665859","��ǥ��ȣ :","041218");
		System.out.printf("%5s %6s\n","������ :","�Ѿ��ġ�");
		System.out.printf("%5s %25s\n","��  �� :","��� ������ �д籸 Ȳ�����351��\n��10 1��");
		System.out.printf("%5s %3s\n","��ǥ�� :","��â��");
		System.out.printf("%5s %12s %11s%8s\n","����� :","752-53-00558","TEL :","7055695");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s\t%30s ��\n","��  ��",K40_df.format(K40_netprice));
		System.out.printf("%3.3s\t%30s ��\n","�ΰ���",K40_df.format(K40_taxAmount));
		System.out.printf("%4.4s\t%30s ��\n","��  ��",K40_df.format(K40_iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4s\n","�츮ī��");
		System.out.printf("%6.6s %22.22s %4.4s\n","ī���ȣ :","5397-20**-****-4613(S)","�Ͻú�");
		System.out.printf("%6.6s %19.19s\n","�ŷ��Ͻ� :",K40_format.format(K40_calendar.getTime()));
		System.out.printf("%6.6s %10.10s\n","�ŷ���ȣ :","357734873739");
		System.out.printf("%4.4s %5.5s %21.15s\n","���� :","��ī���","���� : 720068568");
		System.out.printf("%4.4s %6.6s\n","�˸� :","EDC����ǥ");
		System.out.printf("%4.4s %12.16s\n","���� :","TEL)1544-4700");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%25s","* �����մϴ� *\n");
		System.out.printf("%39s","ǥ��v2.08_20200212");

	}

}