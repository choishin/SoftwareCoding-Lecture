package ConvertMoney02;
//2. 수수료 포함 환전 계산(1)
public class kopo40ConvertMoney02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo40MyWon = 1000000; //환전하려고 들고온 돈
		double kopo40Ex_rate = 1238.21; //환율
		double kopo40commission = 0.003;//환전수수료 = 3%를 뗄것임
		
		//kopo40usd  = 100만원/1238.21원(=1달러) : 100만원에 1달러가 몇 개 들었나
		int kopo40usd = (int)(kopo40MyWon/kopo40Ex_rate);
		//kopo40remain = 100만원 - usd개수 * 환율 : 거스름돈
		int kopo40remain = (int)(kopo40MyWon -kopo40usd*kopo40Ex_rate);
		//kopo40ComPerOne : usd 1장 당 붙는 커미션
		double kopo40ComPerOne = kopo40Ex_rate * kopo40commission;
		//kopo40total_ComPerOne : usd 총 갯수 * 1장 당 붙는 수수료
		double kopo40total_Commission = kopo40usd * kopo40ComPerOne;
		
		System.out.printf("*****************************************************************\n");
		System.out.printf("                          수수료 계산                            \n");
		System.out.printf("총 수수료 : %f => 미화 : %d usd, 달러당 수수료 : %f원\n", kopo40total_Commission,kopo40usd,kopo40ComPerOne);
		System.out.printf("******************************************************************\n");
	}

}
