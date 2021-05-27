package K40_PrintReceipt01;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar K40_calendar = Calendar.getInstance();
		SimpleDateFormat K40_format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		DecimalFormat K40_df = new DecimalFormat("###,###,###,###,###,###,###");


		double K40_tax = 0.1;
		int K40_iPrice = 33000;
		double K40_netprice = K40_iPrice/(K40_tax+1);
		double K40_taxAmount = K40_iPrice - K40_netprice;
		
		System.out.printf("%1.4s\n","신용승인");
		System.out.printf("%1.5s %7.8s\t%6.6s%6.6s\n","단말기 :","2N68665859","전표번호 :","041218");
		System.out.printf("%5s %6s\n","가맹점 :","한양김치찌개");
		System.out.printf("%5s %25s\n","주  소 :","경기 성남시 분당구 황새울로351번\n길10 1층");
		System.out.printf("%5s %3s\n","대표자 :","유창신");
		System.out.printf("%5s %12s %11s%8s\n","사업자 :","752-53-00558","TEL :","7055695");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s\t%30s 원\n","금  액",K40_df.format(K40_netprice));
		System.out.printf("%3.3s\t%30s 원\n","부가세",K40_df.format(K40_taxAmount));
		System.out.printf("%4.4s\t%30s 원\n","합  계",K40_df.format(K40_iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4s\n","우리카드");
		System.out.printf("%6.6s %22.22s %4.4s\n","카드번호 :","5397-20**-****-4613(S)","일시불");
		System.out.printf("%6.6s %19.19s\n","거래일시 :",K40_format.format(K40_calendar.getTime()));
		System.out.printf("%6.6s %10.10s\n","거래번호 :","357734873739");
		System.out.printf("%4.4s %5.5s %21.15s\n","매입 :","비씨카드사","가맹 : 720068568");
		System.out.printf("%4.4s %6.6s\n","알림 :","EDC매출표");
		System.out.printf("%4.4s %12.16s\n","문의 :","TEL)1544-4700");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%25s","* 감사합니다 *\n");
		System.out.printf("%39s","표준v2.08_20200212");

	}

}

