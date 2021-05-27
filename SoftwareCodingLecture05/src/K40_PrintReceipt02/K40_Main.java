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

		String[] K40_items = {"퓨어에어 비말차단용마스크(","슬라이드식명찰(가로형)(10개입)","매직흡착 인테리어후크(알루미늄)"};
		String[] convertItemNames = convertNames(K40_items);
		String[] K40_itemCode = {"1031615","1008152","1020800"};
		int[] K40_prices = {20000,3000,2000};
		int[] K40_amount = {1,1,1};
		int K40_total = 0;
		double K40_tax = 0.1;

		System.out.println();
		System.out.printf("%24s\n","\"국민가게, 다이소\"");
		System.out.printf("%s %s\n","(주)아성다이소","_분당서현점");
		System.out.printf("%.3s %12.12s\n","전화:","031-702-6016");
		System.out.printf("%.3s %12s\n","본사:","서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("%.3s %7s %8s\n","대표:","박정부,신호섭","213-81-52053");
		System.out.printf("%.3s %28s\n","매장:","경기도 성남시 분당구 분당로53번길 11\n(서현동)");
		System.out.printf("==========================================\n");
		System.out.printf("%24s\n","소비자중심경영(CCM) 인증기업");
		System.out.printf("%25s\n","ISO 9001 품질경영시스템 인증기업");
		System.out.printf("==========================================\n");
		System.out.printf("%28.22s\n","교환/환불 14일 (03월 12일) 이내,");
		System.out.printf("%24.18s\n","(전자)영수증, 결제카드 지참 후");
		System.out.printf("%22.9s\n","구입매장에서 가능");
		System.out.printf("%24.21s\n","포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%24.18s\n","체크카드 취소 시 최대 7일 소요");
		System.out.printf("==========================================\n");
		System.out.printf("[%.3s %7d]\t%26.26s\n","POS",1058231,K40_format.format(K40_calendar.getTime()));
		System.out.printf("==========================================\n");
		double K40_netpriceTotal = 0;
		double K40_taxTotal = 0;
		for(int i = 0; i <K40_items.length; i++) {
		
			double K40_netprice =  K40_prices[i]/(K40_tax+1);
			double K40_taxAmount = K40_prices[i]- K40_netprice;
			//과세합계
			K40_netpriceTotal = K40_netpriceTotal + K40_netprice;
			//부가세
			K40_taxTotal = K40_taxTotal + K40_taxAmount;
			//판매합계
			K40_total+= K40_prices[i]* K40_amount[i];
			System.out.printf("%11s %8s %2s %9s\n",convertItemNames[i],K40_df.format(K40_prices[i]),K40_df.format(K40_amount[i]),
					K40_df.format((K40_netprice+K40_taxAmount)*K40_amount[i]));
			System.out.printf("[%s]\n",K40_itemCode[i]); 

		}
		System.out.printf("%18s %19s\n","과세합계",K40_df.format(K40_netpriceTotal));
		System.out.printf("%19s %19s\n","부가세",(K40_df.format(K40_taxTotal)));		
		System.out.printf("------------------------------------------\n");
		System.out.printf("%4.4s %33s\n","판매합계",K40_df.format(K40_total));
		System.out.printf("==========================================\n");
		System.out.printf("%4.4s %33s\n","신용카드",K40_df.format(K40_total));
		System.out.printf("------------------------------------------\n");
		System.out.printf("%4.4s %33.16s\n","우리카드","538720**********");
		System.out.printf("%s %17.17s\n","승인번호 "+"77982843(0)","승인금액 "+K40_df.format(K40_total));
		System.out.printf("==========================================\n");
		System.out.printf("%26.19s %5s\n",K40_format2.format(K40_calendar.getTime()),"분당서현점");
		System.out.printf("%s %9s\n","상품 및 기타 문의 : ","1522-4400");
		System.out.printf("%s %9s\n","멤버십 및 샵다이소 관련 문의 :","1599-2211");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%30.16s\n","2112820610158231");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%24.24s\n","◈다이소 멤버십 앱 또는 홈페이지에");
		System.out.printf("%24.24s\n","접속하셔서 회원가입 후 다양한 혜택을");
		System.out.printf("%24.24s\n","누려보세요!◈");
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



