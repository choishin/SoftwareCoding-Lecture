package ConvertMoney032;
//2. 수수료 포함 환전 계산(3)
public class kopo40ConvertMoney032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo40MyWon = 1000000;//환전하려고 들고 온 돈
		double kopo40Ex_rate = 1238.21; //환율
		double kopo40commission = 0.003;//환전수수료 3%
	
		///kopo40ComPerOne : usd 1장 당 붙는 커미션
		double kopo40ComPerOne = kopo40Ex_rate * kopo40commission;
		
		//***줘야할 usd 액수가 바뀜! 앞으로는 들고온 돈을 환율+환전수수료를 포함한 값으로 나눠줄 것임
		//=> 100만원 / (1238.21원(=1달러) + 수수료(ComPerOne))***
		int kopo40usd = (int)(kopo40MyWon/(kopo40Ex_rate +kopo40ComPerOne));
		//kopo40remain = 100만원 - usd개수 * 환율 : 거스름돈
		int kopo40remain = (int)(kopo40MyWon -kopo40usd*kopo40Ex_rate);
		//kopo40total_ComPerOne : usd 총 갯수 * 1장 당 붙는 수수료
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
		//수수료를 뗀 후의 잔돈도 다시 계산해야 함!		
		kopo40remain = (int) (kopo40MyWon - kopo40usd*kopo40Ex_rate - (kopo40i_totalcom));
		
		System.out.printf("*******************************************************************\n");
		System.out.printf("                          수수료 적용 환전                           \n");
		System.out.printf("총 수수료 : %d 원 => 미화 : %d 달러, 달러당 수수료 : %f 원\n",kopo40i_totalcom, kopo40usd, kopo40ComPerOne);
		System.out.printf("총 한화환전금액: %d 원=> 미화 : %d 달러, 수수료청구 : %d 원, 잔돈 : %d 원\n", kopo40MyWon, kopo40usd, kopo40i_totalcom, kopo40remain);
		System.out.printf("********************************************************************\n");
	}

}
