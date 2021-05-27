package K40_Gugudan02;
/* 2. 구구단 인쇄
 * 접근 => 마찬가지로 한번에 3단씩 3줄을 출력할 계획을 함.
 * 1번과 달라진 점 => 1줄에 1,4,7로 증가하기 때문에 K40_i,K40_i+3, K40_i+6으로 설정
 * 1번과 달라진 반복문 => 초기값 : K40_i =1 (1부터 시작), K40_i < 9(9까지), 1,2,3으로 증가하기때문에 i++
 *  
 */

public class K40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//123단
		for (int k40_i = 1; k40_i <4; k40_i++) { //(1) 우선 이부분을 출력하고 출력예) 1*1=1 4*1=4 7*1=7 (9까지 반복)
			System.out.printf("************\t************\t************\n");
			System.out.printf(" 구구단 %d단 \t 구구단 %d단 \t 구구단 %d단\n",k40_i,k40_i+3,k40_i+6); 
			System.out.printf("************\t************\t************\n");
				for(int j = 1; j <9; j++) { //(2) 9번씩 이부분을 출력 ->(3)
					System.out.printf(" %d * %d = %d\t",k40_i,j,k40_i*j);
					System.out.printf(" %d * %d = %d\t",k40_i+3,j,j+3*j);
					System.out.printf(" %d * %d = %d\n",k40_i+6,j,k40_i+6*j);
				}
				System.out.println(); //(3) <-(2)
			}
			System.out.println(); //줄과 줄간의 띄어쓰기

		}
	}









