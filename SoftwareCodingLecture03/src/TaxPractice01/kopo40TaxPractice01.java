package TaxPractice01;
//1.단순세금계산
public class kopo40TaxPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int kopo40value = 1000000; //가격
		int kopo40rate = 3; //세율
		int kopo40tax = taxCalcurator(kopo40value,kopo40rate);//세금
		//영수증에 적힐 세전가격 = kopo40value (가격)
		//영수증에 적힐 세금 = kopo40tax (세금)
		//영수증에 적힐 세금포함 가격 = kopo40value+kopo40tax(가격+세금)
	
	//영수증에 인쇄될 폼
	System.out.printf("***********************************************\n");
	System.out.printf("                 단순 세금 계산                    \n");
	System.out.printf("실제 세금 계산 : %f\n",kopo40value*kopo40rate/100.0);
	System.out.printf("세전가격 : %d 세금 : %d 세금포함 가격 %d\n",kopo40value,kopo40tax,kopo40value+kopo40tax);
	System.out.printf("************************************************\n");

	}//main

static int taxCalcurator (int value, int rate) {
	
	//return할 결과값을 우선 선언 하고
	int result;
	//if문으로 체크할 것임
	//double로 강제 형변환 한 'value' 와 'rate/100.0'을 곱한 값이
	//Int로 표현한 'value' * 'rate/100' 과 같다면
	//=> 즉, 소수점 이하 값이 없다면
	if(((double)value *(double)rate/100.0) == value*rate/100) 
		result = value * rate/100;
	else 
		//만일 소수점이 있다면 그냥 1을 올려라(손해보지 않기 위해!)
		result = value * rate/100 +1;
	
	
	return result;
	
}//calcurator

}//class



