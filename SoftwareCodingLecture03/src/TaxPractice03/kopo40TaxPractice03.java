package TaxPractice03;
//3.소비자가 세금 계산 (영수증 만들기)
public class kopo40TaxPractice03 {

	public static void main (String[] args) {
		String[] kopo40item = {"맛동산","웨하스","롯데샌드","오땅","사브레"};//항목
		int[] kopo40price = {1000,2000,3000,2500,1450}; //단가
		int[] kopo40amount = {10,2,1,3,5}; //수량
		double kopo40tax_rate = 0.1;//세율
		int kopo40total_sum = 0; //앞으로 구할 총가격
		
		//영수증 폼
		System.out.printf("************************************\n");
		System.out.printf("           와!!! 과자다                \n");
		System.out.printf(" 항목	단가	수량	합계\n");
		//for문 : 아이템의 개수만큼 반복할 것이다
		//시행될 것 : 항목의 개수 만큼 단가와 수량과 합계를 반복해서 출력
		for (int i = 0; i<kopo40item.length; i++) {
			kopo40total_sum += kopo40total_sum + kopo40price[i]*kopo40amount[i];
	        System.out.printf("%.5s	%4d	%3d	%9d\n",kopo40item[i],kopo40price[i],kopo40amount[i],kopo40total_sum);
		}
		System.out.printf("************************************\n");
		System.out.printf("지불금액 :	%20d\n",kopo40total_sum); //지불금액 (가격*갯수 총합)
		int kopo40total_netprice = (int)(kopo40total_sum/(1+kopo40tax_rate));
		//세전금액 = 총 합계에서 세금+1을 나눠준 것 (앞에서 구한 식)
		System.out.printf("과세금액 :	%20d\n",kopo40total_netprice);//과세할 금액
		//세금 = 총 합계(소비자판매가격) - 총 세전가격
		int tax = (kopo40total_sum) - (kopo40total_netprice);
		System.out.printf("세  금 :	%20d\n",tax);


	}//main
}//class



