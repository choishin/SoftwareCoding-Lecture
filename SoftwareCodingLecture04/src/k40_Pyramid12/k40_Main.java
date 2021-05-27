package k40_Pyramid12;
//12.파라미드 별찍기
public class k40_Main {

	public static void main(String[] args) {

		int k40_n,k40_m;
		k40_m = 20; //
		k40_n = 1; 
		//반복 : (무한반복)
		while(true) {
			//반복1 : m번만큼 반복 수행할 것 : 공백만들기
			for (int k40_i = 0; k40_i < k40_m; k40_i++) System.out.printf(" "); 
			//반복2 : n번만큼 반복 수행할 것 : "+"찍기
			for (int k40_i = 0; k40_i < k40_n; k40_i++) System.out.printf("+"); 
			//엔터
			System.out.printf("\n");
			k40_m = k40_m-1; //m은 숫자가 1씩 줄어들고 (공백은 20,19,18,17...로 줄어듬)
			k40_n = k40_n+2; //n은 2씩 늘어남 (+은 1,3,5,7,9로 늘어남)
			if (k40_m < 0) break; // m이 0과 같거나 작다면 반복문 탈출
		}//while

	}
}


