package TaxPractice02;
//2.소비자가 세금계산
public class kopo40TaxPractice02 {
	//netprice : 정가 = 세전가격(판매자 입장에서는 수익)
	//정가란? 제품의 최초 출하시 정해진 소비자 판매가격을 말한다.
	//소비자 가격과 헷갈리기 쉬운데 딱 정해진 가격이라는 뜻에서 정가임.
	public static int netprice(int price, double rate) {
		//소비자 가격 : 이윤, 운임 등을 추가한 가격. 판매자가 소비자에게 매도하는 가격
		//소비자 가격 = 세전가격 + 세금(세전가격*세율)  //x+x*y
		//소비자 가격 = 세전가격( 1+ 세율) //x(1+y)
		//세전가격 = 소비자 가격/(1+세율) //x = z/(1+y)
		return (int) (price/(1+rate));
	
}//netprice
	
	public static void main (String[] args) {
		
		int kopo40price = 1234; //가격
		double kopo40tax_rate = 0.1; //세율
		int kopo40netprice = netprice(kopo40price,kopo40tax_rate); //세전가격
		int kopo40tax = kopo40price - kopo40netprice; //세금 = 가격 - 세전가격
		
		System.out.printf("***********************************************\n");
		System.out.printf("           소비자가, 세전가격, 세금 계산         \n");
		System.out.printf("소비자가격 : %d 원, 세전가격 : %d 원, 세금 %d 원\n",kopo40price,kopo40netprice,kopo40tax);
		System.out.printf("***********************************************\n");
		
	}//main
}//class



