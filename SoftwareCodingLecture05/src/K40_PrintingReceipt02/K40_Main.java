package K40_PrintingReceipt02;
/*
 * 2. ���̼� ������ ��� ����
 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar K40_calendar = Calendar.getInstance(); //Calendar Ŭ�������� �ý��ۿ��� ��¥������ �޾ƿ��� ���� ������Ʈ ����
		SimpleDateFormat K40_format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //SimpleDataFormat Ŭ�������� �޾ƿ� ��¥������ ����� ���� ���� (ī��������� �ؿ� �ϴܺ�)
		SimpleDateFormat K40_format2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //SimpleDataFormat Ŭ�������� �޾ƿ� ��¥������ ����� ���� ���� (������ �������� ��ܺ� ������)
		DecimalFormat K40_df = new DecimalFormat("###,###,###,###,###,###,###"); //DecimalFormat Ŭ�������� õ���� ���ڿ� ��ǥ�� �־��ֱ� ���� ���� 
																				//** SimpleDataFormat�� DecimalFormat�� %s�� ��������. (���ڰ� �ƴ�)
		
		String[] K40_items = {"ǻ��� �����ܿ븶��ũ(","�����̵�ĸ���(������)(10����)","�������� ���׸�����ũ(�˷�̴�)"}; //1.��ǰ���
		String[] convertItemNames = convertNames(K40_items); //1-(1). ��ǰ�̸��� 'convertname'�̶�� �޼ҵ�� ���� 19byte+" "���� ����� main���� ���ƿ� ���ο� �迭�� �־���.
		String[] K40_itemCode = {"1031615","1008152","1020800"}; //2. �������ڵ�
		int[] K40_prices = {99000,2300,1}; //3.���ݸ��
		int[] K40_amount = {99,1,1}; //4.�������
		int K40_total = 0; // ���հ� : ���� * ����
		double K40_tax = 0.1; //����
		int K40_taxTotal = 0; //�����հ� : ���հ� - ������������
		int K40_nontaxfreeTotal = 0; // ������ǰ ���� ���� : ����*���� (���⼭ �켱 �鼼�� ������ ���� ��)
		int K40_netprice = 0; //������������ : ������ǰ ����* ���� /1.1 �� ���ݿ��� (int)�� ���� �Ҽ������ϴ� ����
		
		/*������ ��� ���� (�������� �ִ���̴� 41bytes)
		 * Printf(%#.#s)�� �� => '# �̸�ŭ �ڸ��� �����ϰ�, .#������ŭ ����� ���̴�'��� ��.
		 *                 ���� ����� ���ڼ��� �ڿ� �ٴ� ���ں��� ���ٸ� �������� ä��� �ȴ�. 
		 *                 (�׷��� �� �°� ����ϰ��� �Ѵٸ� ���� ������ ������ ���־�� �ϰ�, 
		 *                 ����ؼ� ���� �κ��� �ڸ� ���� �ִ밪���� ������� ��)
		 * => ��1) %-1.3s�̶�� : ���� ù��°�ڸ����� 3���� ����� ���̶�� �� 	
		 * => ��2) %40.24�̶�� : 40��° ĭ���� ���������� 40���� �ڸ��� �����ϰ� 24����ŭ�� ����Ұ� �̶�� ��	
		 * => ��3) %10.10d �̷� ǥ���� ����. ����ǥ���� %10d : 10�ڸ���ŭ �Է��� ���̴�. �̷��� �Է��ؾ���
		 */
		System.out.println();
		System.out.printf("%24s\n","\"���ΰ���, ���̼�\""); //
		System.out.printf("%s %s\n","(��)�Ƽ����̼�","_�д缭����");
		System.out.printf("%.3s %12.12s\n","��ȭ:","031-702-6016");
		System.out.printf("%.3s %12s\n","����:","���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.printf("%.3s %7s %8s\n","��ǥ:","������,��ȣ��","213-81-52053");
		System.out.printf("%.3s %28s\n","����:","��⵵ ������ �д籸 �д��53���� 11\n(������)");
		System.out.printf("=========================================\n");
		System.out.printf("%24s\n","�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%25s\n","ISO 9001 ǰ���濵�ý��� �������");
		System.out.printf("=========================================\n");
		System.out.printf("%28.22s\n","��ȯ/ȯ�� 14�� (03�� 12��) �̳�,");
		System.out.printf("%24.18s\n","(����)������, ����ī�� ���� ��");
		System.out.printf("%22.9s\n","���Ը��忡�� ����");
		System.out.printf("%24.21s\n","����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%24.18s\n","üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.printf("=========================================\n");
		System.out.printf("[%.3s %7d]\t%25.25s\n","POS",1058231,K40_format.format(K40_calendar.getTime())); //(������� '/'�� ����) yyyy/dd/MM HH:mm:ss ������ ���
		System.out.printf("=========================================\n");

		for(int i = 0; i <K40_items.length; i++) { //**�迭�� �־���� ǰ���� ����, ������ ���⼭ �ݺ��ؼ� ������� ����.**
			//�����հ�
			K40_nontaxfreeTotal = K40_nontaxfreeTotal + K40_prices[i]*K40_amount[i];
			//�Ǹ��հ�
			K40_total= K40_total + K40_prices[i]* K40_amount[i];

			System.out.printf("%9s %8s %2s %10s\n",convertItemNames[i],K40_df.format(K40_prices[i]),K40_df.format(K40_amount[i]), 
			//(1)ǰ���(10���ڿ� ����1�ڸ�), (2)����(�ִ� 8�ڸ�), (3)����(�ִ� 2�ڸ�) (4)�ݾ� (�ִ� 9�ڸ�)
					K40_df.format(K40_prices[i]*K40_amount[i]));
			System.out.printf("[%s]\n",K40_itemCode[i]); //(4)�������ڵ�

		}
		K40_netprice = (int) (K40_nontaxfreeTotal/(K40_tax+1)); //(int) �����ݾ� �Ѿ�/1.1 
		K40_taxTotal = K40_total - K40_netprice; //���� �Ѿ� : ���հ� - ���������Ѿ�
		System.out.printf("%18s %18s\n","�����հ�",K40_df.format(K40_netprice));
		System.out.printf("%19s %18s\n","�ΰ���",(K40_df.format(K40_taxTotal)));		
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s %32s\n","�Ǹ��հ�",K40_df.format(K40_total));
		System.out.printf("=========================================\n");
		System.out.printf("%4.4s %32s\n","�ſ�ī��",K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s %32.16s\n","�츮ī��","538720**********");
		System.out.printf("%s %16.16s\n","���ι�ȣ "+"77982843(0)","���αݾ� "+K40_df.format(K40_total));
		System.out.printf("=========================================\n");
		System.out.printf("%26.19s %5s\n",K40_format2.format(K40_calendar.getTime()),"�д缭����"); //(������� '.'���� ����) yyyy.dd.MM HH:mm:ss
		System.out.printf("%s %9s\n","��ǰ �� ��Ÿ ���� : ","1522-4400");
		System.out.printf("%s %9s\n","����� �� �����̼� ���� ���� :","1599-2211");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%30.16s\n","2112820610158231");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%24.24s\n","�´��̼� ����� �� �Ǵ� Ȩ��������");
		System.out.printf("%24.24s\n","�����ϼż� ȸ������ �� �پ��� ������");
		System.out.printf("%24.24s\n","����������!��");
	}
	
	/*
	 * getbyte method ��ǥ : ������ �̸��� �ִ� ��±��̺��� ���ų�, ���Ƶ� �������� ����� ��Ʈ������ �ʵ��� ����־����.
	 * => �ذ��� ��� : �ѱ��� 1���ڴ� 2bytes�� ����� ��, �װ� '��'�� ���� �ܾ�� �� 2bytes �̴�.
	 * 					����, Ư����ȣ,�����̽�,�� 1byte�� ����� �Ǳ� ������ substring���� �ڸ��� �Ǹ� �������� ������ ��. (1�� �õ�)
	 * 					�׷��� �ڸ���ŭ�� ũ�⸦ ���ϰ�, �ִ� 10������ ������ �׸��� ������ ���̱� ������ 19bytes+" "���� �ڸ� ��ȹ�� ����.
	 * 					�켱 '�������� �̸��� �ѱ��̶�� :'�ѱ��� �ƽ�Ű�ڵ� ���� �����̰�, ����,Ư������ ���� ����̱� ������ 
	 * 					items[i]�� byte�� ������� 18�� byte�ȿ� �� ���� �������� ����� ��. -> �� ������ ¦��(%2 == 0) �̶�� �״�� ��� ���� 
	 * 					(������, ���⼭�� ���⸦ ���� 19���� �ڸ���" "������ �־�����!)
	 * 					�׸��� �� ������ Ȧ���̰� �� ���ڰ� �ѱ��̶�� ���ڰ� �߸� ���ɼ��� �ְ� '?'ǥ�ð� ���� -> 18������ �ڸ��� ������ �ι� �־� ���
	 * 					���������� �� ������ Ȧ���̰�, �����̳� Ư�����ڿ��� �������� -> 17���� �ڸ���, ������ �߰��ؼ� ��� (2�� �õ�)
	 */
	public static String[] convertNames (String[] K40_items) {
		
		String[] K40_convertItemNames = new String[K40_items.length]; 
		int K40_cutBytes = 17; 
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
		        
	        } else if (K40_itemNamebytes[16] < 0){
	        	K40_convertItemNames[i] = new String(K40_itemNamebytes, 0, K40_cutBytes-1) + "  ";
	        	
	        } else {
	        	K40_convertItemNames[i] = new String(K40_itemNamebytes, 0, K40_cutBytes) + " ";
	        }

	}
		return K40_convertItemNames;

}
}



