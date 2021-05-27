package k40_WrongCase06;
//6.Case문 비교 
//밑의 코드는 Switch, case가 적합하지 않은 사례 
//내가 생각하는 이유 : 우선 switch는 여기에 적절하지 않은 반복문이고 
//for를 두번쓰고, switch에 if를 여러번 쓰는 것보다 더 효율적인 방법이 충분히 있기 때문.
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복 : 12번 반복할 것
		for (int k40_i = 1; k40_i < 13; k40_i++){
			//우선 "k40_i =>"를 출력하고
			System.out.printf("%d월 =>", k40_i); 
			//***처음보는 코드 LOOP
			//반복 : 1부터 31까지 반복할 것임
			LOOP: for(int k40_j = 1; k40_j < 32; k40_j++){
				//k40_j를 출력하고
				System.out.printf("%d,",k40_j); 
				//첫번째 조건 : k40_i가
				switch(k40_i) 
				//4,6,9,7,11 일때
				{ case 4: case 6: case 9: case 7: case 11:
					//두번째 조건 : k40_j를 30까지 출력하고 LOOP 탈출
					if(k40_j == 30) break LOOP; 
					//교수님 말씀 : 거의 이런 표현은 안함. // LOOP라는 표시자가 없으면 엉뚱한 결과
					break; 
				//다시 첫번째 조건 : k40_i 가 2일때
					case 2:
					// k40_j는 28까지 출력하고 탈출
					if(k40_j == 28) break LOOP;
					break;

				}
			}
			System.out.printf("\n");
		}

	}

}
