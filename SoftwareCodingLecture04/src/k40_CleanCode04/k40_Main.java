package k40_CleanCode04;
//4.비정형비교1(깔끔코딩)
/**누구나 알아볼 수 있도록 코딩 해라, 짧게 쓴다고 좋은 코딩이 아니다!**/
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문 : 12번 반복할 것임
		for (int k40_i = 1; k40_i < 13; k40_i++){
			//바뀌는'k40_i' => 을 출력 하고
			System.out.printf("%d 월 =>", k40_i);
			//반복 : 1부터 31까지 반복
			for (int k40_j = 1; k40_j <32; k40_j++){
				//k40_j를 출력하는데 (그럼 여기까지 k40_i => k40_j)
			System.out.printf("%d,", k40_j);
			//조건문 : 각 조건에 해당하면 break;
			if(k40_i == 1 && k40_j == 31) break; //예) 만일 k40_i가 1이고 k40_j가 31이면 반복문 탈출!
			if(k40_i == 2 && k40_j == 28) break; 
			if(k40_i == 3 && k40_j == 31) break; 
			if(k40_i == 4 && k40_j == 30) break; 
			if(k40_i == 5 && k40_j == 31) break; 
			if(k40_i == 6 && k40_j == 30) break; 
			if(k40_i == 7 && k40_j == 31) break; 
			if(k40_i == 8 && k40_j == 31) break; 
			if(k40_i == 9 && k40_j == 30) break; 
			if(k40_i == 10 && k40_j == 31) break; 
			if(k40_i == 11 && k40_j == 30) break; 
			if(k40_i == 12 && k40_j == 31) break;
		}
			System.out.printf("\n"); //그리고 마지막에 엔터
		}

	}

}
