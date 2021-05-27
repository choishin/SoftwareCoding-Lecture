package K40_PrintReceipt02;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar K40_calendar = Calendar.getInstance();
		SimpleDateFormat K40_format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat K40_format2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		DecimalFormat K40_df = new DecimalFormat("###,###,###,###,###,###,###");

		String[] K40_items = {"ǻ��� �����ܿ븶��ũ(","�����̵�ĸ���(������)(10����)","�������� ���׸�����ũ(�˷�̴�)"};
		String[] convertItemNames = convertNames(K40_items);
		String[] K40_itemCode = {"1031615","1008152","1020800"};
		int[] K40_prices = {20000,3000,2000};
		int[] K40_amount = {1,1,1};
		int K40_total = 0;
		double K40_tax = 0.1;

		System.out.println();
		System.out.printf("%24s\n","\"���ΰ���, ���̼�\"");
		System.out.printf("%s %s\n","(��)�Ƽ����̼�","_�д缭����");
		System.out.printf("%.3s %12.12s\n","��ȭ:","031-702-6016");
		System.out.printf("%.3s %12s\n","����:","���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.printf("%.3s %7s %8s\n","��ǥ:","������,��ȣ��","213-81-52053");
		System.out.printf("%.3s %28s\n","����:","��⵵ ������ �д籸 �д��53���� 11\n(������)");
		System.out.printf("==========================================\n");
		System.out.printf("%24s\n","�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%25s\n","ISO 9001 ǰ���濵�ý��� �������");
		System.out.printf("==========================================\n");
		System.out.printf("%28.22s\n","��ȯ/ȯ�� 14�� (03�� 12��) �̳�,");
		System.out.printf("%24.18s\n","(����)������, ����ī�� ���� ��");
		System.out.printf("%22.9s\n","���Ը��忡�� ����");
		System.out.printf("%24.21s\n","����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%24.18s\n","üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.printf("==========================================\n");
		System.out.printf("[%.3s %7d]\t%26.26s\n","POS",1058231,K40_format.format(K40_calendar.getTime()));
		System.out.printf("==========================================\n");
		double K40_netpriceTotal = 0;
		double K40_taxTotal = 0;
		for(int i = 0; i <K40_items.length; i++) {
		
			double K40_netprice =  K40_prices[i]/(K40_tax+1);
			double K40_taxAmount = K40_prices[i]- K40_netprice;
			//�����հ�
			K40_netpriceTotal = K40_netpriceTotal + K40_netprice;
			//�ΰ���
			K40_taxTotal = K40_taxTotal + K40_taxAmount;
			//�Ǹ��հ�
			K40_total+= K40_prices[i]* K40_amount[i];
			System.out.printf("%11s %8s %2s %9s\n",convertItemNames[i],K40_df.format(K40_prices[i]),K40_df.format(K40_amount[i]),
					K40_df.format((K40_netprice+K40_taxAmount)*K40_amount[i]));
			System.out.printf("[%s]\n",K40_itemCode[i]); 

		}
		System.out.printf("%18s %19s\n","�����հ�",K40_df.format(K40_netpriceTotal));
		System.out.printf("%19s %19s\n","�ΰ���",(K40_df.format(K40_taxTotal)));		
		System.out.printf("------------------------------------------\n");
		System.out.printf("%4.4s %33s\n","�Ǹ��հ�",K40_df.format(K40_total));
		System.out.printf("==========================================\n");
		System.out.printf("%4.4s %33s\n","�ſ�ī��",K40_df.format(K40_total));
		System.out.printf("------------------------------------------\n");
		System.out.printf("%4.4s %33.16s\n","�츮ī��","538720**********");
		System.out.printf("%s %17.17s\n","���ι�ȣ "+"77982843(0)","���αݾ� "+K40_df.format(K40_total));
		System.out.printf("==========================================\n");
		System.out.printf("%26.19s %5s\n",K40_format2.format(K40_calendar.getTime()),"�д缭����");
		System.out.printf("%s %9s\n","��ǰ �� ��Ÿ ���� : ","1522-4400");
		System.out.printf("%s %9s\n","����� �� �����̼� ���� ���� :","1599-2211");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%30.16s\n","2112820610158231");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%24.24s\n","�´��̼� ����� �� �Ǵ� Ȩ��������");
		System.out.printf("%24.24s\n","�����ϼż� ȸ������ �� �پ��� ������");
		System.out.printf("%24.24s\n","����������!��");
	}
	
	public static String[] convertNames (String[] K40_items) {
		
		String[] K40_convertItemNames = new String[K40_items.length];
		int K40_cutBytes = 19; 
		for (int i = 0; i < K40_items.length; i++) {
			String K40_temp = K40_items[i] + "                   ";
	        byte[] K40_itemNamebytes = K40_temp.getBytes();
	        int cnt = 0;
	        for(int j = 0; j < K40_cutBytes; j++) {
	        	if(K40_itemNamebytes[j] < 0)
	        		cnt++;
	        }
	        if (cnt % 2 == 0) {
		        K40_convertItemNames[i] = new String(K40_itemNamebytes, 0, K40_cutBytes) + " ";
		        
	        } else if (K40_itemNamebytes[17] < 0){
	        	K40_convertItemNames[i] = new String(K40_itemNamebytes, 0, K40_cutBytes-1) + "  ";
	        	
	        } else {
	        	K40_convertItemNames[i] = new String(K40_itemNamebytes, 0, K40_cutBytes) + " ";
	        }

	}
		return K40_convertItemNames;

}
}



