package K40_PrintReceipt03.develop;
/*3.이마트 영수증 출력
 * 
 * 애먹었던 점 1. Printf(%#.#s)의 원리를 파악하는데 오래걸렸음 
 * => 알게된 내용:'# 이만큼 자리를 예약하고, .#개수만큼 출력할 것이다'라는 뜻이고 
 *                 만일 출력할 문자수가 뒤에 붙는 숫자보다 적다면 공백으로 채우게 된다. 
 *                 (그래서 딱 맞게 출력하고자 한다면 글자 개수를 일일히 세주어야 하고, 
 *                 계속해서 변할 부분은 자리 수를 최대값으로 맞춰줘야 함)
 * => 예1) %-1.3s이라면 : 왼쪽 첫번째자리부터 3개를 출력할 것이라는 뜻 	
 * => 예2) %40.24이라면 : 40번째 칸부터 오른쪽으로 40개의 자리를 예약하고 24개만큼을 출력할것 이라는 뜻	
 * => 예3) %10.10d 이런 표현은 없음. 정수표현은 %10d : 10자리만큼 입력할 것이다. 이렇게 입력해야함
 * 
 * 애먹었던 점 2. 글꼴에 따라 간격이 다르거나 바깥으로 튀어나가는 등 오류가 발생해서, 알맞는 폰트를 찾아 해결해야했음
 * => 문제의 원인 : 굴림과 굴림체, 바탕과 바탕체는 차이점이 있는데, 바로 '체'가 붙지 않는 폰트는 '가변폭 글꼴'이고
 *                  '체'가 붙는 폰트는 고정폭 글꼴형이라는 점이다. 즉, 가변폭 글꼴인 굴림은 글자에 따라 폭이 조정되는 반면
 *                  고정폭 글꼴은 모든 글자의 폭이 일정하다. (한글만 썼을때는 큰 차이가 없지만 고정폭 글꼴은 알파벳
 *                  하나하나도 모두 같은 폭을 가지있다. 그래서 영문자나 특수기호를 썼을 때 확연한 차이가 있다.
 *                  
 * 애먹었던 점 3. 아이템 이름의 최대 출력길이보다 적거나, 많아도 영수증의 모양이 흐트러지지 않도록 잡아주어야했음
 * => 해결한 방법 : 한글은 1글자당 2bytes로 계산이 됨, 그게 '닭'과 같은 단어라도 총 2bytes 이다.
 * 					영문, 특수기호,스페이스,는 1byte로 계산이 되기 때문에 substring으로 자르게 되면 엉망으로 나열이 됨. (1차 시도)
 * 					그래서 자를만큼의 크기를 정하고, 최대 9글자의 아이템 항목을 보여줄 것이기 때문에 18bytes로 자를 계획을 세움.
 * 					우선 '아이템의 이름이 한글이라면 :'한글의 아스키코드 수는 음수이고, 영문,특수문자 등은 양수이기 때문에 
 * 					items[i]의 byte가 음수라면 18개 byte안에 몇 개가 음수인지 계산을 함. -> 그 갯수가 짝수(%2 == 0) 이라면 그대로 출력 가능 
 * 					(하지만, 여기서는 띄어쓰기를 위해 17에서 자르고" "공백을 넣어줬음!)
 * 					그리고 그 갯수가 홀수이고 한글이라면 -> 16개에서 자르고 공백 두번 넣어 출력
 * 					마지막으로 그 갯수가 홀수이고, 영문이나 특수문자에서 끝났더라도 -> 17에서 자르고, 공백을 추가해서 출력 (2차 시도)
 * 
 * 애먹었던 점 4. 영수증 종이크기와 폰트크기에 따라 최대 몇글자가 출력되는지 알아보고 했다면 수정이 줄어들었을 것임
 * 
 * 애먹었던 점 5. 세금계산에 대한 이해 
 * => 항목별로 단가와 금액에는 세전가격+세금이 이미 보여진다 (면세라면 그냥 가격)
 * => 면세물품의 총액 = 가격 * 수량, 과세물품의 총액 = 세전가격 * 수량 (기업입장에서의 수익)
 * => '부가세'에는 세금값만 더해진 것이 보인다.
 * => 합계와 결제대상금액에는 총액이 보여진다 (가격*수량의 총액)
 * 
 * 애먹었던 점 5. 세전가격을 (int)prices[i]/1.1로 출력을 하는 경우 어떤 가격(2300원)에서는 2원씩 오차가 발생
 * => 숫자를 키워서 (int) (prices[i]/11)*10, (int) prices[i]*10/11 모두 정확하지 않음
 * => 해결한 방법 : 어차피 decimalFormat으로 소수점 단위는 출력이 안 됨. 그래서 double로 수정해서 정확하게 계산되게끔 함.
 */
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class K40_Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Calendar K40_calendar = Calendar.getInstance();
		K40_calendar.add(Calendar.HOUR_OF_DAY, -2);
		Date K40_date = new Date();
		SimpleDateFormat K40_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat K40_format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat K40_format3 = new SimpleDateFormat("yyyyMMdd");
		DecimalFormat K40_df = new DecimalFormat("###,###,###,###,###,###,###");

		
		//1.상품목록
		String[] K40_items = {"[서울우유] 체다 슬라이스 치즈(300g2개입)",
				"(G)LH원형유리화병10","상투과자E","사양벌꿀 1.5kg","해피홈 SAFE 핸드워시"
				,"[찹쌀치킨스틱","[20년산] 이맛쌀 10kg","CJ 비비고 도톰한 삼치구이 60g","100년 역사의 시원한 맛 김치"
				,"[튀김공방]찹쌀치킨스틱","훈제오리 500g*2","순살닭강정(g)","CJ백설매실청310ml","DZ주니어양말3족C_WH"
				,"[파티셰리 마담정] 쌀큐브 세트","[피코크] 송탄식 부대찌개 738g","[서울우유] 서울우유 1000ml 나100% "
				,"[빙그레] 바나나맛 우유(240ml4개) 960ml","진라면소컵(매)65g*6"
				,"케라시스 앰플 트리트","[활][국산] 완도 활 전복 (대, 70g내외/1미)","[냉장][노르웨이] 연어회 (150g)"
				,"CJ비비고왕교자만두","[서울우유] 커피 삼각 포리 (200ml*3개)","흑원당 말차 밀크티꺄~~~~~~~~~~"
				,"1+ 등급란 10개입 특별하다특별해","[프리미엄] 미국산 고당도 퓨어스펙 오렌지 1.5kg (봉)"
				,"양면 틈새 청소 브러","흡착 발 브러쉬","집게형 헤어롤 3p","코털가위"
				,"[이마트 특별기획] 부드럽고촉촉한꿀우유식빵 ","롯데 ABC초콜릿 600g"};

		String[] K40_convertItemNames = convertNames(K40_items);


		//2.상품가격
		int[] K40_prices = {99000
				,1000,1000,1000,1000,
				1000,1000,1000,1000,1000,
				1000,1000,1000,1000,1000,
				1000,1000,1000,1000,1000,
				1000,1000,1000,1000,1000,
				1000,1000,1000,1000,1000,
				1000,1000,1000};

		//3.상품개수
		int[] K40_num = {1,1,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,
				1,1,1};

		//4.면세여부 (상품이 농수산품인 경우 면세)
		boolean[] K40_taxfree = {false,false,false,false,false,
				false,false,false,false,false,
				false,false,false,false,false,
				false,false,false,false,false,
				false,false,false,false,false,
				false,false,false,false,false,
				false,false,false};


		int K40_count = 0;
		int K40_taxfreeTotal = 0;
		int K40_nontaxfreeTotal = 0;
		double K40_tax = 0.1;
		double K40_netpriceTotal = 0;
		double K40_taxTotal = 0;
		int K40_total = 0;
		
		int point ;
		int oldPoint = 5637;
		int totalAmount = K40_items.length;


		//5.영수증 인쇄 폼 (최대 문자 38개)
		System.out.printf("%34s\n","이마트 죽전점 (031)888-1234");
		System.out.printf("%9.5s %19s\n","emart","206-86-50913 강희석");
		System.out.printf("%28s\n","용인 수지구 포은대로 552");
		System.out.println();
		System.out.printf("%s\n","영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n","정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n","※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n","교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
		System.out.printf("%21.21s %17.17s\n","[구 매]"+K40_format2.format(K40_calendar.getTime()),"POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%6.5s %15.15s %3.3s %5.5s\n","상 품 명","단 가","수량","금 액");
		System.out.printf("-----------------------------------------\n");
		for(int i = 0; i <K40_items.length; i++) {
			
			double K40_netpriceOriginal = K40_prices[i]/(K40_tax+1);
			double K40_taxAmount = K40_prices[i]- K40_netpriceOriginal;
			K40_total = K40_total + K40_prices[i]* K40_num[i];
			//면세물품 가격 계산
			if(K40_taxfree[i]== true) {
				K40_taxfreeTotal = K40_taxfreeTotal + K40_prices[i]* K40_num[i];
				System.out.printf("%s%s%9s%3s%10s\n","*",K40_convertItemNames[i],K40_df.format(K40_prices[i]),K40_num[i],K40_df.format(K40_prices[i]*K40_num[i]));
			}
			//과세물품 가격 계산
			else {
				K40_netpriceTotal = K40_netpriceTotal+ K40_netpriceOriginal * K40_num[i] ;
				K40_taxTotal= K40_taxTotal + K40_taxAmount * K40_num[i];
				System.out.printf("%s%s%9s%3s%10s\n"," ",K40_convertItemNames[i],K40_df.format(K40_prices[i]),K40_num[i],K40_df.format(K40_prices[i]*K40_num[i]));
			}
			
			K40_count++;
			if(K40_count%5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
		}
	
		System.out.println();
		System.out.printf("%16s %s %s %13.13s\n","총","품목","수량",K40_df.format(totalAmount));
		System.out.printf("%14s %s  %s %13.13s\n","(*)","면 세","물 품",K40_df.format(K40_taxfreeTotal));
		System.out.printf("%18s  %s %13.13s\n","과 세","물 품",K40_df.format(K40_netpriceTotal));
		System.out.printf("%16s %3.3s %3.3s%14.14s\n","부","가","세",K40_df.format(K40_taxTotal));
		System.out.printf("%16s %8.1s%14s\n","합","계",K40_df.format(K40_total));
		System.out.printf("%11.11s %23.23s\n","결 제 대 상 금 액",K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s %6.6s %18s/%8s\n","0012","KEB하나","541707**0484","35860658");
		System.out.printf("%s %25.25s\n","카드결제(IC)","일시불/ "+K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n","[신세계포인트 적립]");
		System.out.printf("%.4s %15s\n","홍*두","고객님의 포인트 현황입니다.");
		System.out.printf("%s\t%16.16s %8.8s\n","금화발생포인트","9350**9995",K40_df.format(point = (K40_total)/1000));
		System.out.printf("%s\t %7.7s(%7.7s)\n","누계(가용)포인트",K40_df.format(point+oldPoint),K40_df.format(oldPoint));
		System.out.printf("%s\n","*신세계포인트 유효기간은 2년입니다.");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s\n","구매금액기준 무료주차시간 자동부여");
		System.out.printf("%.6s\t%24.24s\n","차량번호 :","34저****");
		System.out.printf("%.6s\t%25.25s\n","입차시간 :",K40_format.format(K40_calendar.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%.3s %10.10s %23s\n","캐셔:","084599"+" 양00","1150");
		System.out.printf("%36.29s\n","||||||||||||||||||||||||||||||||");
		System.out.printf("%36.29s\n","||||||||||||||||||||||||||||||||");
		System.out.printf("%36.29s\n",K40_format3.format(K40_date)+"/00119861/00164980/31");

	}


	public static String[] convertNames (String[] items) {

		String[] K40_convertItemNames = new String[items.length];
		int cutBytes = 17; 
		for (int i = 0; i < items.length; i++) {
			String temp = items[i] + "                   ";
			byte[] itemNamebytes = temp.getBytes(); 
			int cnt = 0;
			for(int j = 0; j < cutBytes; j++) {
				if(itemNamebytes[j] < 0)
					cnt++;
			}
			if (cnt % 2 == 0) {
				K40_convertItemNames[i] = new String(itemNamebytes, 0, cutBytes) + " ";

			} else if (itemNamebytes[17] < 0){
				K40_convertItemNames[i] = new String(itemNamebytes, 0, cutBytes-1) + "  ";

			} else {
				K40_convertItemNames[i] = new String(itemNamebytes, 0, cutBytes) + " ";
			}

		}
		return K40_convertItemNames;

	}
}



