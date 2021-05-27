package K40_Gugudan01;
/*1. 구구단 인쇄
 *   접근 => 다단기능이 없기 때문에, 가로에 1,2,3단을 쭉 적어주고 3번을 반복해서 출력하도록 계획
 *   *중요* 반복문 => 초기값: 'K40_i = 1'로 설정, 조건 : 'K40_i < 9'일때 까지, 증감정도 : 1,4,7로 증가하기때문에 i =i+3
 */

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int K40_i = 1; K40_i <9; K40_i=K40_i+3) { //(1) 우선 제목을 출력하고
			System.out.printf("************\t************\t************\n");
			System.out.printf(" 구구단 %d단 \t 구구단 %d단 \t 구구단 %d단\n",K40_i,K40_i+1,K40_i+2); //1단 2단 3단 -> 4단 5단 6단 -> 7단 8단 9단 
			System.out.printf("************\t************\t************\n");
				for(int j = 1; j <9; j++) { //(2) 9번씩 이부분을 출력 반복 출력 예) 1*1=1 2*1=2 3*1=3 (1부터 9까지 반복 후) 
					System.out.printf(" %d * %d = %2d\t",K40_i,j,K40_i*j);     //  4*1=4 5*1=5 6*1=6 (다시 1부터 9까지 반복) ...
					System.out.printf(" %d * %d = %2d\t",K40_i+1,j,j+1*j); 
					System.out.printf(" %d * %d = %2d\n",K40_i+2,j,K40_i+2*j);
				}
				System.out.println(); //(3)<-(2)번 출력 끝나고
			}
			System.out.println(); //줄과 줄 사이를 띄어줌

		}
	}









