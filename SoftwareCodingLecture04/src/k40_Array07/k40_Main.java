package k40_Array07;
//7.Array 이용 비교
//교수님 코멘트 : 배열을 사용하는 경우도 좋은 사례이다. 하지만 복잡해 보이긴 하다.
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k40_iLMD ={31,28,31,30,31,30,31,31,30,31,30,31};
		// k40_iLMD는 LastMonthDate를 모아 놓은 배열 
		//※단 배열은 0부터 시작하는 것에 유의, k40_iLMD[0] ~ k40_iLMD[11]이다. 
		//(1월은 인덱스 0번, 12월은 인덱스 11번)
		
		//반복 : 12번 반복
		for (int k40_i = 1; k40_i < 13; k40_i++){
			//k40_i=> 출력 후
			System.out.printf("%d월 =>", k40_i); 
			//반복 : 1부터 31번 반복
			for (int k40_j = 1; k40_j < 32; k40_j++){
				//k40_i=>j1,j2,j3... 출력
				System.out.printf("%d", k40_j);
				//배열에 넣어둔 마지막 날이면 반복문 탈출!
				//예) 1월이라면 k40_iLMD[0] 그래서 [k40_i-1]
				if(k40_iLMD[k40_i-1] == k40_j) break;
				System.out.printf(",");
			}
			System.out.printf("\n");
		}


	}

}
