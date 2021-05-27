package k40_Star01;
//1.while로 별찍기
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(1)데이터 흐름의 시작 k40_iA,k40_iB 변수 선언 //(12) 다시시작 k40_iA = 1, k40_iB = 1
		int k40_iA, k40_iB;  
		//(2)iA = 0이 됨
		k40_iA = 0;
		while(true) { //(3)while 조건 체크 : 무조건 참
			k40_iB = 0; //(4)k40_iB = 0이 됨
			while (true) { //(5)두번째 조건 체크 : 무조건 참
				System.out.print("*"); //(6)무한정 별을 찍지만 밑에 단서가 있음
				if (k40_iA == k40_iB) break; //(7) if 조건체크 : 만일 k40_iA == k40_iB 인 경우 탈출
				k40_iB++; //(8) k40_iB 숫자를 올림 == 1이 됨
			}
			System.out.println(); //(9)줄갈이
			k40_iA++; //(10) k40_iA 숫자를 올림 == 1이 됨
			if (k40_iA == 30) break; // (11) 첫번째 while문을 탈출하는 조건은 k40_iA == 30이고 
		}                     //=>이것은 행의 갯수가 됨
		
	
		/*int k40_iA = 0, k40_iB = 0; //<= 이게 안되는 이유 : 값이 0으로 초기화가 되버림
		
		while(true) {
			while (true) {
				System.out.print("*");
				if (k40_iA == k40_iB) break;
				k40_iB++;
			}
			System.out.println();
			k40_iA++;
			if (k40_iA == 30) break;
		}*/
		

	}

}
