package ConvertMoney01;
//1. 단순환전 계산
public class kopo40ConvertMoney01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo40MyWon = 1000000; //환전하려고 들고온 돈
		double kopo40Ex_rate = 1238.21; //환율
		double kopo40commision = 0.003; //환전수수료
		
		//kopo40usd  = 100만원/1238.21원(=1달러) : 100만원에 1달러가 몇 개 들었나
		int kopo40usd = (int) (kopo40MyWon/kopo40Ex_rate);
		//kopo40remain = 100만원 - usd개수 * 환율 : 거스름돈
		int kopo40remain = (int) (kopo40MyWon -kopo40usd*kopo40Ex_rate);
		
		System.out.printf("****************************************************\n");
		System.out.printf("                      수수료 없이 계산                   \n");
		System.out.printf("총 한화 환전 금액 : %d => 미화 : %d usd, 잔돈 : %d원\n", kopo40MyWon,kopo40usd,kopo40remain);
		System.out.printf("****************************************************\n");
	}

}
