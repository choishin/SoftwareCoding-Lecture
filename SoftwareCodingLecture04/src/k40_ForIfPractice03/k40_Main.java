package k40_ForIfPractice03;
//3.범위를 주어 비교(찾기)
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_iVal; //int형 변수 k40_iVal 선언
		for(int k40_i = 0; k40_i < 300; k40_i++){ //반복문 : 300번 시행
			k40_iVal= 5 * k40_i; // k40_iVal을 5의 배수로 만들기
		if(k40_iVal >= 0 && k40_iVal < 10) System.out.printf("일 %d\n",k40_iVal); 
		//if문 체크 : 조건(1) 단, k40_iVal이 0보다 크고 10보다 작을 때는 "일 해당숫자" 출력
		else if (k40_iVal >= 10 && k40_iVal<100) System.out.printf("십 %d\n",k40_iVal); 
		//if문 체크 : 조건(2) 단, k40_iVal이 10보다 크고 100보다 작을 때는 "백 해당숫자" 출력
		else if (k40_iVal >= 100 && k40_iVal<1000) System.out.printf("백 %d\n",k40_iVal); 
		//if문 체크 : 조건(3) 단, k40_iVal이 100보다 크고 1000보다 작을 때는 "일 해당숫자" 출력
		else System.out.printf("천 %d\n",k40_iVal);
		}

	}

}
