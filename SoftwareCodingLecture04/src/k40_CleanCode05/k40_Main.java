 package k40_CleanCode05;
//2,3. 비정형 비교 (앞의 월별 날짜찍기의 다른 방법들)
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. 반복: 1부터 12까지 반복할 것임
		//1번 코드와 다른 점 : if로 12달 각 조건을 맞춰주었던 것을 k40_j가 30에 마치는 
		//공통조건을 가지고 있는 애들과 28에 끝나는 애를 따로 모아주었음.
		for (int k40_i = 1; k40_i < 13; k40_i++) {
			//우선 'k40_i =>'를 출력하고
			System.out.printf("%d월 =>", k40_i); 
			//반복 : 1부터 31번 반복해서
			for (int k40_j = 1; k40_j < 32; k40_j++){
				//k40_j를 출력해줄 것인데
				System.out.printf("%d,",k40_j); 
				//조건 : k40_i = 4이거나 6이거나 9이거나 7이거나 11이라면
				if(k40_i == 4|| k40_i == 6 || k40_i == 9 || k40_i == 11){
					//k40_j는 30번만 출력하고 반복문 탈출!
					if(k40_j == 30) break;
				}
				//또는 k40_i가 2라면
				if(k40_i == 2){
					//k40_j출력을 28까지만 하고 반복문 탈출!
					if(k40_j == 28) break;
				}
			}
			
			System.out.printf("\n");//엔터
		}//for
			
		//3. 반복 (위와 같음) 
		//2번 코드와 다른 점 : 밑에 if 조건에 k40_i와 k40_j의 조건을 한번에 넣어주었음
//			for (int k40_i = 1; k40_i < 13; k40_i++){
//				System.out.printf("%d월 =>", k40_i); 
//				for (int k40_j = 1; k40_j < 32; k40_j++){
//				System.out.printf("%d,",k40_j); 
//				//위의 코드와 다른 부분 : 여기에 &&로 출력할 조건까지 넣어주었음
//				if((k40_i == 4 || k40_i == 6 || k40_i == 9 || k40_i == 7 || k40_i == 11)
//						&& (k40_j == 30)) break; 
//				if(k40_i == 2 && k40_j == 28) break;
//				}
//				System.out.printf("\n");
//				
//				}

		
	}

}
