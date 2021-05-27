package K40_PrintingReceipt02;
/*
 * 2. 다이소 영수증 출력 연습
 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar K40_calendar = Calendar.getInstance(); //Calendar 클래스에서 시스템에서 날짜정보를 받아오기 위해 오브젝트 생성
		SimpleDateFormat K40_format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //SimpleDataFormat 클래스에서 받아온 날짜정보를 출력할 포맷 생성 (카드결제내역 밑에 하단부)
		SimpleDateFormat K40_format2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //SimpleDataFormat 클래스에서 받아온 날짜정보를 출력할 포맷 생성 (영수증 결제내역 상단부 오른쪽)
		DecimalFormat K40_df = new DecimalFormat("###,###,###,###,###,###,###"); //DecimalFormat 클래스에서 천단위 숫자에 쉼표를 넣어주기 위해 생성 
																				//** SimpleDataFormat과 DecimalFormat은 %s에 담아줘야함. (숫자가 아님)
		
		String[] K40_items = {"퓨어에어 비말차단용마스크(","슬라이드식명찰(가로형)(10개입)","매직흡착 인테리어후크(알루미늄)"}; //1.상품목록
		String[] convertItemNames = convertNames(K40_items); //1-(1). 상품이름을 'convertname'이라는 메소드로 보내 19byte+" "으로 만들어 main으로 돌아와 새로운 배열에 넣어줌.
		String[] K40_itemCode = {"1031615","1008152","1020800"}; //2. 아이템코드
		int[] K40_prices = {99000,2300,1}; //3.가격목록
		int[] K40_amount = {99,1,1}; //4.수량목록
		int K40_total = 0; // 총합계 : 가격 * 수량
		double K40_tax = 0.1; //세율
		int K40_taxTotal = 0; //세금합계 : 총합계 - 세전가격총합
		int K40_nontaxfreeTotal = 0; // 과세물품 가격 총합 : 가격*수량 (여기서 우선 면세와 과세를 구분 함)
		int K40_netprice = 0; //세전가격총합 : 과세물품 가격* 수량 /1.1 이 가격에서 (int)를 통해 소수점이하는 버림
		
		/*영수증 출력 포맷 (영수증의 최대길이는 41bytes)
		 * Printf(%#.#s)의 뜻 => '# 이만큼 자리를 예약하고, .#개수만큼 출력할 것이다'라는 뜻.
		 *                 만일 출력할 문자수가 뒤에 붙는 숫자보다 적다면 공백으로 채우게 된다. 
		 *                 (그래서 딱 맞게 출력하고자 한다면 글자 개수를 일일히 세주어야 하고, 
		 *                 계속해서 변할 부분은 자리 수를 최대값으로 맞춰줘야 함)
		 * => 예1) %-1.3s이라면 : 왼쪽 첫번째자리부터 3개를 출력할 것이라는 뜻 	
		 * => 예2) %40.24이라면 : 40번째 칸부터 오른쪽으로 40개의 자리를 예약하고 24개만큼을 출력할것 이라는 뜻	
		 * => 예3) %10.10d 이런 표현은 없음. 정수표현은 %10d : 10자리만큼 입력할 것이다. 이렇게 입력해야함
		 */
		System.out.println();
		System.out.printf("%24s\n","\"국민가게, 다이소\""); //
		System.out.printf("%s %s\n","(주)아성다이소","_분당서현점");
		System.out.printf("%.3s %12.12s\n","전화:","031-702-6016");
		System.out.printf("%.3s %12s\n","본사:","서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("%.3s %7s %8s\n","대표:","박정부,신호섭","213-81-52053");
		System.out.printf("%.3s %28s\n","매장:","경기도 성남시 분당구 분당로53번길 11\n(서현동)");
		System.out.printf("=========================================\n");
		System.out.printf("%24s\n","소비자중심경영(CCM) 인증기업");
		System.out.printf("%25s\n","ISO 9001 품질경영시스템 인증기업");
		System.out.printf("=========================================\n");
		System.out.printf("%28.22s\n","교환/환불 14일 (03월 12일) 이내,");
		System.out.printf("%24.18s\n","(전자)영수증, 결제카드 지참 후");
		System.out.printf("%22.9s\n","구입매장에서 가능");
		System.out.printf("%24.21s\n","포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%24.18s\n","체크카드 취소 시 최대 7일 소요");
		System.out.printf("=========================================\n");
		System.out.printf("[%.3s %7d]\t%25.25s\n","POS",1058231,K40_format.format(K40_calendar.getTime())); //(년월일을 '/'로 구분) yyyy/dd/MM HH:mm:ss 형식을 사용
		System.out.printf("=========================================\n");

		for(int i = 0; i <K40_items.length; i++) { //**배열에 넣어줬던 품목명과 가격, 수량을 여기서 반복해서 출력해줄 것임.**
			//과세합계
			K40_nontaxfreeTotal = K40_nontaxfreeTotal + K40_prices[i]*K40_amount[i];
			//판매합계
			K40_total= K40_total + K40_prices[i]* K40_amount[i];

			System.out.printf("%9s %8s %2s %10s\n",convertItemNames[i],K40_df.format(K40_prices[i]),K40_df.format(K40_amount[i]), 
			//(1)품목명(10글자에 공백1자리), (2)가격(최대 8자리), (3)수량(최대 2자리) (4)금액 (최대 9자리)
					K40_df.format(K40_prices[i]*K40_amount[i]));
			System.out.printf("[%s]\n",K40_itemCode[i]); //(4)아이템코드

		}
		K40_netprice = (int) (K40_nontaxfreeTotal/(K40_tax+1)); //(int) 과세금액 총액/1.1 
		K40_taxTotal = K40_total - K40_netprice; //세금 총액 : 총합계 - 세전가격총액
		System.out.printf("%18s %18s\n","과세합계",K40_df.format(K40_netprice));
		System.out.printf("%19s %18s\n","부가세",(K40_df.format(K40_taxTotal)));		
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s %32s\n","판매합계",K40_df.format(K40_total));
		System.out.printf("=========================================\n");
		System.out.printf("%4.4s %32s\n","신용카드",K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s %32.16s\n","우리카드","538720**********");
		System.out.printf("%s %16.16s\n","승인번호 "+"77982843(0)","승인금액 "+K40_df.format(K40_total));
		System.out.printf("=========================================\n");
		System.out.printf("%26.19s %5s\n",K40_format2.format(K40_calendar.getTime()),"분당서현점"); //(년월일을 '.'으로 구분) yyyy.dd.MM HH:mm:ss
		System.out.printf("%s %9s\n","상품 및 기타 문의 : ","1522-4400");
		System.out.printf("%s %9s\n","멤버십 및 샵다이소 관련 문의 :","1599-2211");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%32.29s\n","|||||||||||||||||||||||");
		System.out.printf("%30.16s\n","2112820610158231");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%24.24s\n","◈다이소 멤버십 앱 또는 홈페이지에");
		System.out.printf("%24.24s\n","접속하셔서 회원가입 후 다양한 혜택을");
		System.out.printf("%24.24s\n","누려보세요!◈");
	}
	
	/*
	 * getbyte method 목표 : 아이템 이름의 최대 출력길이보다 적거나, 많아도 영수증의 모양이 흐트러지지 않도록 잡아주어야함.
	 * => 해결한 방법 : 한글은 1글자당 2bytes로 계산이 됨, 그게 '닭'과 같은 단어라도 총 2bytes 이다.
	 * 					영문, 특수기호,스페이스,는 1byte로 계산이 되기 때문에 substring으로 자르게 되면 엉망으로 나열이 됨. (1차 시도)
	 * 					그래서 자를만큼의 크기를 정하고, 최대 10글자의 아이템 항목을 보여줄 것이기 때문에 19bytes+" "으로 자를 계획을 세움.
	 * 					우선 '아이템의 이름이 한글이라면 :'한글의 아스키코드 수는 음수이고, 영문,특수문자 등은 양수이기 때문에 
	 * 					items[i]의 byte가 음수라면 18개 byte안에 몇 개가 음수인지 계산을 함. -> 그 갯수가 짝수(%2 == 0) 이라면 그대로 출력 가능 
	 * 					(하지만, 여기서는 띄어쓰기를 위해 19에서 자르고" "공백을 넣어줬음!)
	 * 					그리고 그 갯수가 홀수이고 끝 글자가 한글이라면 글자가 잘릴 가능성이 있고 '?'표시가 나옴 -> 18개에서 자르고 공백을 두번 넣어 출력
	 * 					마지막으로 그 갯수가 홀수이고, 영문이나 특수문자에서 끝났더라도 -> 17에서 자르고, 공백을 추가해서 출력 (2차 시도)
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



