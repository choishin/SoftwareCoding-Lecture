package CalendarPractice;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//calendar 불러올때 클라스이름 Calendar이름 쓰면 안됨
public class kopo40CalendarPractice2 {

	public static void main(String[] args) {

		/**날짜 찍는 법 : Simpledateformat(날짜를 담을 형식)과 Date(날짜정보) 클래스에서 오브젝트 불러오기
		 *Calendar class는 시스템에서 불러오는 것이기 때문에 new가 아니라 get*/
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		DecimalFormat df = new DecimalFormat("###,###,###,###,###,###,###,###");
		
		int kopo40MyWon = 1000000;
		double kopo40Ex_rate = 1238.21;
		double kopo40commission = 0.003;//3%
		//kopo40ComPerOne : usd 1장 당 붙는 커미션
		double kopo40ComPerOne = kopo40Ex_rate * kopo40commission;
		
		//줘야할 usd 액수가 바뀜! 앞으로는 들고온 돈을 환율+환전수수료를 포함한 값으로 나눠줄 것임
		//=> 100만원 / (1238.21원(=1달러) + 수수료(ComPerOne))
		int kopo40usd = (int)(kopo40MyWon/(kopo40Ex_rate +kopo40ComPerOne));
		//kopo40remain = 100만원 - usd개수 * 환율 : 거스름돈
		int kopo40remain = (int)(kopo40MyWon -kopo40usd*kopo40Ex_rate);
		//kopo40total_Commition = 총 수수료
		double kopo40total_Commission = kopo40usd * kopo40ComPerOne;
		
		//여기서부터 수수료를 double로 받던 것을 int로 처리할 것임(올림)
		int kopo40i_totalcom;
		//if문으로 체크 '만일 토탈커미션을 int로 형변환 한 값이 토탈커미션의 값이 같지 않다면'
		if (kopo40total_Commission != (double)((int)(kopo40total_Commission))) {
			//'정수로 변환할 커미션에는 1을 더하겠다'
			kopo40i_totalcom = (int)(kopo40total_Commission)+1;
		} else { 
			//아니라면, 냅둬 (값이 딱 떨어지는 경우)
			kopo40i_totalcom = (int)(kopo40total_Commission);
		}
		//수수료를 떼준 후의 잔돈도 고려해야 함!		
		kopo40remain = (int) (kopo40MyWon - kopo40usd*kopo40Ex_rate - (kopo40i_totalcom));
		
		System.out.printf("**************************************************************************\n");
		System.out.printf("         		   콤마찍기, 날짜 적용   	    			   \n");
		                //decimalformat은 %s로 받음
		System.out.printf("총 수수료: %s 원 => 미화 : %s 달러, 달러당 수수료 : %f 원\n",
						df.format(kopo40i_totalcom),
						df.format(kopo40usd),
						kopo40ComPerOne); //ComPerOne은 double이라 쓸 수 없음
		System.out.printf("총 한화환전금액: %s 원=> 미화 : %s 달러, 수수료청구 : %s 원, 잔돈 : %s 원\n", 
						df.format(kopo40MyWon), 
						df.format(kopo40usd),
						df.format(kopo40i_totalcom), 
						df.format(kopo40remain));
											/***추가된 날짜는 여기에 위치시켜줄 것임***/
		System.out.printf("최종 실행 시간 : %s\n",simple.format(calendar.getTime()));
		
		System.out.printf("**************************************************************************\n");


	}//main





}//class
