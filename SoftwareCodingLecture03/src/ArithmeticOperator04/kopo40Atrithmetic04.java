package ArithmeticOperator04;
//4.원하는 자릿수 반올림, 버림
public class kopo40Atrithmetic04 {
	
	public static void main(String[] args) {
		
		int kopo40ii1 = 12345;
		//4-1. 12345/10 = 1234만 취해서 *10을 곱하기 : 버림의 원리
		int kopo40j1 = (kopo40ii1/10) *10; 
		System.out.printf("#4 -1  : %d\n", kopo40j1);
			
		int kopo40ii2 = 12345;
		//4-2. 12345/10 = 1234를 취해서 *10을 곱하기 : 10의 자리에서 버림
		int kopo40j2 = (kopo40ii2/10)*10;
		System.out.printf("#4 -2  : %d\n", kopo40j2);
		
		//4-2. 12344에 5를 더한 값에 10을 나눔 = 1234에 10을 곱한 것 :10의 자리에서 반올림
		//자리수가 바뀌지 않았으니 버려진 것
		int kopo40ii3 = 12344;
		int kopo40j3 = ((kopo40ii3+5)/10)*10;
		System.out.printf("#4 -2  : %d\n", kopo40j3);
		
		//#4-3. 100원이하 버림 (12345에서 100을 나누어 123을 취하고 100을 곱함)
		int kopo40ii4 = 12345; 
		int kopo40j4 = ((kopo40ii4)/100)*100;
		System.out.printf("#4 -3  : %d\n", kopo40j4);
		
		//#4-3. 100원이하 올림 (12345에서 100을 나누어 123을 취하고 거기에 1을 더한 후
															   //100을 곱함)
		kopo40j4 = (((kopo40ii4)/100)+1)*100;
		System.out.printf("#4 -3  : %d\n", kopo40j4);
		
		//#4-3. 100원이하 반올림 (12345에서 50을 더하면 = 12395 여기서 100을 나누어서 
														//123을 취하고 100을 곱함)
		kopo40j4 = ((kopo40ii4+50)/100)*100;
		System.out.printf("#4 -3  : %d\n", kopo40j4);
		
		//#4-4. 1000원 이하 버림
		int kopo40j51 = 12345;
		int kopo40j52 = (kopo40j51/1000)*1000;
		System.out.printf("#4 -4  : %d \n",kopo40j52);
		
		//#4-4. 1000원 이하 반올림
		int kopo40j53 = ((kopo40j51+500)/1000)*1000;
		System.out.printf("#4 -4  : %d \n",kopo40j53);
		
		//#4-4. 1000원 이하 올림
		int kopo40j54 = ((kopo40j51/1000)+1)*1000;
		System.out.printf("#4 -4  : %d \n",kopo40j54);
	
	}//main

}//class