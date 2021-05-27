package K40_PrintingReceipt03.develop_03;
/*
 * 3. 변수와 메소드 (이마트 영수증 출력 실습한 내용 각 method로 빼서, main 정리하기)
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

	/**클래스 전부에서 쓰일 내용들을 전역변수로 위치를 옮겨줌**/
	//1.상품목록
	private static String[] K40_items = {"[서울우유] 체다 슬라이스 치즈(300g2개입)"
			,"(G)LH원형유리화병10","상투과자E","사양벌꿀 1.5kg","해피홈 SAFE 핸드워시"
			,"[찹쌀치킨스틱","[20년산] 이맛쌀 10kg","CJ 비비고 도톰한 삼치구이 60g","100년 역사의 시원한 맛 김치"
			,"[튀김공방]찹쌀치킨스틱","훈제오리 500g*2","순살닭강정(g)","CJ백설매실청310ml","DZ주니어양말3족C_WH"
			,"[파티셰리 마담정] 쌀큐브 세트","[피코크] 송탄식 부대찌개 738g","[서울우유] 서울우유 1000ml 나100% "
			,"[빙그레] 바나나맛 우유(240ml4개) 960ml","진라면소컵(매)65g*6"
			,"케라시스 앰플 트리트","[활][국산] 완도 활 전복 (대, 70g내외/1미)","[냉장][노르웨이] 연어회 (150g)"
			,"CJ비비고왕교자만두","[서울우유] 커피 삼각 포리 (200ml*3개)","흑원당 말차 밀크티꺄~~~~~~~~~~"
			,"1+ 등급란 10개입 특별하다특별해","[프리미엄] 미국산 고당도 퓨어스펙 오렌지 1.5kg (봉)"
			,"양면 틈새 청소 브러","흡착 발 브러쉬","집게형 헤어롤 3p","코털가위"
			,"[이마트 특별기획] 부드럽고촉촉한꿀우유식빵 ","롯데 ABC초콜릿 600g"};
	//2.상품가격
	private static int[] K40_prices = {99000
			,2300,120,1,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000,1000,1000,
			1000,1000,1000};

	//3.상품개수
	private static int[] K40_num = {9,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1};

	//4.면세여부 (true 인 경우 농수산품이거나 그외 면세상품)
	private static boolean[] K40_taxfree = {true,false,true,true,false,
			false,false,false,true,false,
			true,false,false,false,false,
			false,true,false,false,false,
			true,false,false,false,false,
			true,false,false,false,false,
			false,false,false};

	private static  int K40_count ; //총 항목의 갯수 (5줄마다 ---을 그어주기 위함)
	private static int K40_taxfreeTotal ; //면세물품의 총합
	private static int K40_nontaxfreeTotal ; //과세물품의 총합
	private static int K40_netprice ; //세전가격 
	private static int K40_taxTotal ; //세금총합
	public static int K40_total ; //총합계 금액
	public static double K40_tax = 0.1; //세율
	public static int totalAmount = K40_items.length; 
	public static int point ; //point
	public static int oldPoint = 5637; //이전 포인트

	public static void main(String[] args) throws ParseException { /**함수등 중 가장 먼저 호출 **/
		// TODO Auto-generated method stub

		int k40_itemCount = K40_items.length;
		TitlePrint();   //(1)여기서부터 순서대로 호출
		TimeStemp();  //(2)
		HeaderPrint(); //(3)
		for(int i = 0; i <k40_itemCount; i++) { //(4)
			ItemPrint(i); 
		}
		TotalPrint(); //(5)
	}

	public static void TitlePrint() { /**<-상단부 작성**/

		System.out.printf("%34s\n","이마트 죽전점 (031)888-1234");
		System.out.printf("%9.5s %19s\n","emart","206-86-50913 강희석");
		System.out.printf("%28s\n","용인 수지구 포은대로 552");
		System.out.println();
		System.out.printf("%s\n","영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n","정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n","※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n","교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
	}   
	
	public static void TimeStemp() { /**<-시간 출력부 **/
		System.out.printf("%21.21s %17.17s\n","[구 매]"+K40_format2.format(K40_calendar2.getTime()),"POS:0011-9861"); 
	}  
	public static void HeaderPrint() {

		System.out.printf("-----------------------------------------\n");
		System.out.printf("%6.5s %15.15s %3.3s %5.5s\n","상 품 명","단 가","수량","금 액");
		System.out.printf("-----------------------------------------\n");
	}  

	public static void ItemPrint (int i) { /**<-구매한 상품의 물품 개수만큼 이름,단가, 금액이 출력되는 부분**/


		String[] K40_convertItemNames = convertNames(); 

		//면세물품 가격 계산
		if(K40_taxfree[i]== true) {
			K40_taxfreeTotal = K40_taxfreeTotal + K40_prices[i]* K40_num[i];
			System.out.printf("%s%s%9s%2s%11s\n","*",K40_convertItemNames[i],K40_df.format(K40_prices[i]),
					K40_num[i],K40_df.format(K40_prices[i]*K40_num[i]));
		}
		//과세물품 가격 계산
		else {
			K40_nontaxfreeTotal = K40_nontaxfreeTotal+ K40_prices[i]* K40_num[i] ;
			System.out.printf("%s%s%9s%2s%11s\n"," ",K40_convertItemNames[i],K40_df.format(K40_prices[i]),
					K40_num[i],K40_df.format(K40_prices[i]*K40_num[i]));
		}
		//총합계의 계산
		K40_total = K40_total + K40_prices[i]* K40_num[i];
		//한 줄이 출력될때마다 1씩 올려주고, 5개가 되면 구분선----을 그어줌
		K40_count++;
		if(K40_count%5 == 0) {
			System.out.printf("-----------------------------------------\n");
		}
		//과세물품 총액 
		K40_netprice = (int) (K40_nontaxfreeTotal/(K40_tax+1));
		//세금 총액
		K40_taxTotal= K40_nontaxfreeTotal - K40_netprice;

	}   
	
	public static String[] convertNames () { /**<-지정 된 숫자만큼 아이템 이름의 byte수를 잘라주는 부분 **/

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
	public static void TotalPrint() { /**<- 마지막 부분 정보 출력 **/

		K40_calendar.add(Calendar.HOUR_OF_DAY, -2);
		System.out.println();
		System.out.printf("%16s %s %s %13.13s\n","총","품목","수량",K40_df.format(totalAmount));
		System.out.printf("%14s %s  %s %13.13s\n","(*)","면 세","물 품",K40_df.format(K40_taxfreeTotal));
		System.out.printf("%18s  %s %13.13s\n","과 세","물 품",K40_df.format(K40_netprice));
		System.out.printf("%16s %3.3s %3.3s%14.14s\n","부","가","세",K40_df.format(K40_taxTotal));
		System.out.printf("%16s %8.1s%14s\n","합","계",K40_df.format(K40_total));
		System.out.printf("%11.11s %23.23s\n","결 제 대 상 금 액",K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4.4s %6.6s %18s/%8s\n","0012","KEB하나","541707**0484","35860658");
		System.out.printf("%s %25.25s\n","카드결제(IC)","일시불/ "+K40_df.format(K40_total));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n","[신세계포인트 적립]");
		System.out.printf("%.4s %15s\n","홍*두","고객님의 포인트 현황입니다.");
		System.out.printf("%s\t%16.16s %8.8s\n","금회발생포인트","9350**9995",K40_df.format(point = (K40_total)/1000)); //포인트는 1000단위 버림으로 계산
		System.out.printf("%s\t %7.7s(%7.7s)\n","누계(가용)포인트",K40_df.format(point+oldPoint),K40_df.format(oldPoint));
		System.out.printf("%s\n","*신세계포인트 유효기간은 2년입니다.");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s\n","구매금액기준 무료주차시간 자동부여");
		System.out.printf("%.6s\t%24.24s\n","차량번호 :","34저****");
		System.out.printf("%.6s\t%25.25s\n","입차시간 :",K40_format.format(K40_calendar.getTime())); //(년월일을 -로 구분하고 시분초 모두 표기)yyyy-MM-dd HH:mm:ss 
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%.3s %10.10s %23s\n","캐셔:","084599"+" 양00","1150");
		System.out.printf("%36.29s\n","||||||||||||||||||||||||||||||||");
		System.out.printf("%36.29s\n","||||||||||||||||||||||||||||||||");
		System.out.printf("%36.29s\n",K40_format3.format(K40_date)+"/00119861/00164980/31");

	}

}//class



