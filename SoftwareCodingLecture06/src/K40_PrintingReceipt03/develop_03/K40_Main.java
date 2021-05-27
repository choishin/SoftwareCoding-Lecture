package K40_PrintingReceipt03.develop_03;
/*
 * 3. ������ �޼ҵ� (�̸�Ʈ ������ ��� �ǽ��� ���� �� method�� ����, main �����ϱ�)
 */
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class K40_Main {

	public static Calendar K40_calendar = Calendar.getInstance();
	public static Calendar K40_calendar2 = Calendar.getInstance();
	public static Date K40_date = new Date();
	public static SimpleDateFormat K40_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	public static SimpleDateFormat K40_format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	public static SimpleDateFormat K40_format3 = new SimpleDateFormat("yyyyMMdd");  
	public static DecimalFormat K40_df = new DecimalFormat("###,###,###,###,###,###,###"); 

	/**Ŭ���� ���ο��� ���� ������� ���������� ��ġ�� �Ű���**/
	//1.��ǰ���
	private static String[] K40_items = {"[�������] ü�� �����̽� ġ��(300g2����)"
			,"(G)LH��������ȭ��10","��������E","������ 1.5kg","����Ȩ SAFE �ڵ����"
			,"[����ġŲ��ƽ","[20���] �̸��� 10kg","CJ ���� ������ ��ġ���� 60g","100�� ������ �ÿ��� �� ��ġ"
			,"[Ƣ�����]����ġŲ��ƽ","�������� 500g*2","����߰���(g)","CJ�鼳�Ž�û310ml","DZ�ִϾ�縻3��C_WH"
			,"[��Ƽ�θ� ������] ��ť�� ��Ʈ","[����ũ] ��ź�� �δ�� 738g","[�������] ������� 1000ml ��100% "
			,"[���׷�] �ٳ����� ����(240ml4��) 960ml","��������(��)65g*6"
			,"�ɶ�ý� ���� Ʈ��Ʈ","[Ȱ][����] �ϵ� Ȱ ���� (��, 70g����/1��)","[����][�븣����] ����ȸ (150g)"
			,"CJ����ձ��ڸ���","[�������] Ŀ�� �ﰢ ���� (200ml*3��)","����� ���� ��ũƼ��~~~~~~~~~~"
			,"1+ ��޶� 10���� Ư���ϴ�Ư����","[�����̾�] �̱��� ��絵 ǻ��� ������ 1.5kg (��)"
			,"��� ƴ�� û�� �귯","���� �� �귯��","������ ���� 3p","���а���"
			,"[�̸�Ʈ Ư����ȹ] �ε巴�������Ѳܿ����Ļ� ","�Ե� ABC���ݸ� 600g"};
	//2.��ǰ����
	private static int[] K40_prices = {99000
			,2300,120,1,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000};

	//3.��ǰ����
	private static int[] K40_num = {9,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1};

	//4.�鼼���� (true �� ��� �����ǰ�̰ų� �׿� �鼼��ǰ)
	private static boolean[] K40_taxfree = {true,false,true,true,false,
			false,false,false,true,false,
			true,false,false,false,false,
			false,true,false,false,false,
			true,false,false,false,false,
			true,false,false,false,false,
			false,false,false};

	private static  int K40_count ; //�� �׸��� ���� (5�ٸ��� ---�� �׾��ֱ� ����)
	private static int K40_taxfreeTotal ; //�鼼��ǰ�� ����
	private static int K40_nontaxfreeTotal ; //������ǰ�� ����
	private static int K40_netprice ; //�������� 
	private static int K40_taxTotal ; //��������
	public static int K40_total ; //���հ� �ݾ�
	public static double K40_tax = 0.1; //����
	public static int totalAmount = K40_items.length; 
	public static int point ; //point
	public static int oldPoint = 5637; //���� ����Ʈ

	public static void main(String[] args) throws ParseException { /**�Լ��� �� ���� ���� ȣ�� **/
		// TODO Auto-generated method stub

		int k40_itemCount = K40_items.length;
		TitlePrint();   //(1)���⼭���� ������� ȣ��
		TimeStemp();  //(2)
		HeaderPrint(); //(3)
		for(int i = 0; i <k40_itemCount; i++) { //(4)
			ItemPrint(i); 
		}
		TotalPrint(); //(5)
	}

	public static void TitlePrint() { /**<-��ܺ� �ۼ�**/

		System.out.printf("%34s\n","�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%9.5s %19s\n","emart","206-86-50913 ����");
		System.out.printf("%28s\n","���� ������ ������� 552");
		System.out.println();
		System.out.printf("%s\n","������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n","�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n","���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n","��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println();
	}   
	
	public static void TimeStemp() { /**<-�ð� ��º� **/
		System.out.printf("%21.21s %17.17s\n","[�� ��]"+K40_format2.format(K40_calendar2.getTime()),"POS:0011-9861"); 
	}  
	public static void HeaderPrint() {

		System.out.printf("-----------------------------------------\n");
		System.out.printf("%6.5s %15.15s %3.3s %5.5s\n","�� ǰ ��","�� ��","����","�� ��");
		System.out.printf("-----------------------------------------\n");
	}  

	public static void ItemPrint (int i) { /**<-������ ��ǰ�� ��ǰ ������ŭ �̸�,�ܰ�, �ݾ��� ��µǴ� �κ�**/


		String[] K40_convertItemNames = convertNames(); 

		//�鼼��ǰ ���� ���
		if(K40_taxfree[i]== true) {
			K40_taxfreeTotal = K40_taxfreeTotal + K40_prices[i]* K40_num[i];
			System.out.printf("%s%s%9s%2s%11s\n","*",K40_convertItemNames[i],K40_df.format(K40_prices[i]),
					K40_num[i],K40_df.format(K40_prices[i]*K40_num[i]));
		}
		//������ǰ ���� ���
		else {
			K40_nontaxfreeTotal = K40_nontaxfreeTotal+ K40_prices[i]* K40_num[i] ;
			System.out.printf("%s%s%9s%2s%11s\n"," ",K40_convertItemNames[i],K40_df.format(K40_prices[i]),
					K40_num[i],K40_df.format(K40_prices[i]*K40_num[i]));
		}
		//���հ��� ���
		K40_total = K40_total + K40_prices[i]* K40_num[i];
		//�� ���� ��µɶ����� 1�� �÷��ְ�, 5���� �Ǹ� ���м�----�� �׾���
		K40_count++;
		if(K40_count%5 == 0) {
			System.out.printf("-----------------------------------------\n");
		}
		//������ǰ �Ѿ� 
		K40_netprice = (int) (K40_nontaxfreeTotal/(K40_tax+1));
		//���� �Ѿ�
		K40_taxTotal= K40_nontaxfreeTotal - K40_netprice;

	}   
	
	public static String[] convertNames () { /**<-���� �� ���ڸ�ŭ ������ �̸��� byte���� �߶��ִ� �κ� **/

		String[] K40_convertItemNames = new String[K40_items.length];
		int k40_cutBytes = 17; 
		for (int i = 0; i < K40_items.length; i++) {
			String k40_temp = K40_items[i] + "                   ";
			byte[] itemNamebytes = k40_temp.getBytes(); 
			int k40_cnt = 0;
			for(int j = 0; j < k40_cutBytes; j++) {
				if(itemNamebytes[j] < 0)
					k40_cnt++;
			}
			if (k40_cnt % 2 == 0) {
				K40_convertItemNames[i] = new String(itemNamebytes, 0, k40_cutBytes) + " ";

			} else if (itemNamebytes[17] < 0){
				K40_convertItemNames[i] = new String(itemNamebytes, 0, k40_cutBytes-1) + "  ";

			} else {
				K40_convertItemNames[i] = new String(itemNamebytes, 0, k40_cutBytes) + " ";
			}

		}
		return K40_convertItemNames;

	}
	public static void TotalPrint() { /**<- ������ �κ� ���� ��� **/

		K40_calendar.add(Calendar.HOUR_OF_DAY, -2);
		System.out.println();
		System.out.printf("%16s %s %s %13.13s\n","��","ǰ��","����",K40_df.format(totalAmount));
		System.out.printf("%14s %s  %s %13.13s\n","(*)","�� ��","�� ǰ",K40_df.format(K40_taxfreeTotal));
		System.out.printf("%18s  %s %13.13s\n","�� ��","�� ǰ",K40_df.format(K40_netprice));
		System.out.printf("%16s %3.3s %3.3s%14.14s\n","��","��","��",K40_df.format(K40_taxTotal));
		System.out.printf("%16s %8.1s%14s\n","��","��",K40_df.format(K40_total));
		System.out.printf("%11.11s %23.23s\n","�� �� �� �� �� ��",K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s %6.6s %18s/%8s\n","0012","KEB�ϳ�","541707**0484","35860658");
		System.out.printf("%s %25.25s\n","ī�����(IC)","�Ͻú�/ "+K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n","[�ż�������Ʈ ����]");
		System.out.printf("%.4s %15s\n","ȫ*��","������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%s\t%16.16s %8.8s\n","��ȸ�߻�����Ʈ","9350**9995",K40_df.format(point = (K40_total)/1000)); //����Ʈ�� 1000���� �������� ���
		System.out.printf("%s\t %7.7s(%7.7s)\n","����(����)����Ʈ",K40_df.format(point+oldPoint),K40_df.format(oldPoint));
		System.out.printf("%s\n","*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s\n","���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%.6s\t%24.24s\n","������ȣ :","34��****");
		System.out.printf("%.6s\t%25.25s\n","�����ð� :",K40_format.format(K40_calendar.getTime())); //(������� -�� �����ϰ� �ú��� ��� ǥ��)yyyy-MM-dd HH:mm:ss 
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%.3s %10.10s %23s\n","ĳ��:","084599"+" ��00","1150");
		System.out.printf("%36.29s\n","||||||||||||||||||||||||||||||||");
		System.out.printf("%36.29s\n","||||||||||||||||||||||||||||||||");
		System.out.printf("%36.29s\n",K40_format3.format(K40_date)+"/00119861/00164980/31");

	}

}//class



