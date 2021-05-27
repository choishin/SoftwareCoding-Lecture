package K40_Calendar03;
/*
 * 3.2022년 달력인쇄
 */
public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		int K40_iweekday = 6; // (1) K40_iweekday, 달력이 시작하는 1월에 시작하는 공백의 크기를 알려주는 변수를 지정
		int[] endDate = {0,31,28,31,30,31,30,31,31,30,31,30,31,0}; //(2)1월부터 12월까지의 마지막 날짜를 뜻하는 수를 배열에 넣음 (0번째는 0을 넣어줬음)

		for (int i = 1; i <13; i++) { //(3)반복문 => 앞으로 12번을 반복
			System.out.println(); //(3)-1. 한줄 개행 후
			System.out.printf("%10d월\n",i); // (3)-2.월을 적어주고
			System.out.println(); //(3)-3. 한줄을 개행
			System.out.printf("====================\n"); //(3)-4. 선을 그어준 다음
			System.out.printf("%s %s %s %s %s %s %s \n","일","월","화","수","목","금","토"); //(3)-5.요일 이름을 넣어줌(한글이기 때문에 2byte+" "=3bytes)
														//(3)-6.공백, 처음 시작 날짜 위치 정하기
														//예) 1월이라면, 이미 6으로 지정이 되어있음(초기값)
														//    2월의 시작은 1월 31의 다음날인 화요일이 되는데, 
														//	  1월의 공백+날짜수를 7로 나눴을 때의 나머지 값이 바로 그 시작 요일이 됨. (2라서 화요일)
														//    3월, 4월, 5월.... 12월 까지 모두 같음 
			K40_iweekday = (K40_iweekday + endDate[i-1])%7; 
			for (int k = 0; k < K40_iweekday; k++) //복합반복문(3)-7 => 위에서 계산한 공백수만큼 공백을 출력하고 
				System.out.print("   ");
			for (int j = 1; j <= endDate[i];j++) { //복합반복문(3)-8 => 배열에서 마지막 날짜숫자를 꺼내와서 1부터 그 수만큼 출력을 하는데
													//숫자는1byte이기 때문에 2자리+" "공백을 한칸 =3bytes 넣어준다.
				System.out.printf("%2d ",j);	   

				if ((j+K40_iweekday)%7 == 0  ) { //공백을 포함한 날짜수가 7개가 될때마다 개행을 해준다.
					System.out.printf("\n");
				}
			}

			System.out.println();
		}
		
	
		
	}
	

}
