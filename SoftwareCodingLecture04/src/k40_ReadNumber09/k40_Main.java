package k40_ReadNumber09;
//9.숫자읽기고급  
//옛날 주택복권 추첨하는 것처럼 숫자 읽기
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 몇자리 숫자인지 출력
		int k40_iNumVal = 1001034567; // int k40_iNumVal = 1001034567 정수형 변수 선언 
		String k40_sNumVal = String.valueOf(k40_iNumVal); //이 정수를 String타입으로 변환후 (String.valueOf())
		String k40_sNumVoice=""; // sNumVoice = 아무런 정보도 담고 있지 않은 String 변수 선언
		System.out.printf("==> %s [%d 자리]\n", k40_sNumVal ,k40_sNumVal.length()); 
		//k40_sNumVal = String으로 변환한 값 k40_sNumVal.length = k40_sNumVal의 길이 
		//출력 예) 1001034567 [10 자리] 

		//2.각 자리수의 숫자를 출력하고 []<-이 안에 한글로 숫자 호명하기
		//3.자릿수와 숫자호명 같이 출력
		int k40_i,k40_j; //앞으로 숫자들을 순서를 인덱스 매길 정수형 변수선언
		String[] k40_units = {"영","일","이","삼","사","오","육","칠","팔","구"};//호명를 배열에 넣고
		String[] k40_unitx = {"","십","백","천","만","십","백","천","억","십"}; //자리수를 배열에 넣음
		k40_i = 0;                  //i = 처음부터 시작 
		k40_j = k40_sNumVal.length()-1; //j = 숫자의 끝에서부터 시작
		
		//반복 (무한반복)
		while (true) { 
			//반복탈출조건 선언 : i가 sNumVal의 길이와 같거나 크다면 반복 탈출
			if(k40_i >= k40_sNumVal.length()) break;
			//k40_sNumVal에서 i번째부터 i+1번째까지 출력하고 (즉, i번째자리가 출력되는 것이고 0자리부터 시작됨)
			//i번째 자리수를 Integer로 변환하고, 그것을 인덱스로하는 k40_units을 []에 출력 하는데 (예) 3이라면 '삼')
			System.out.printf("%s[%s]", k40_sNumVal.substring(k40_i, k40_i+1), 
					k40_units[Integer.parseInt(k40_sNumVal.substring(k40_i, k40_i+1))]); 
			//조건(1) : sNumVal i번째 값이 "0"이고
			if(k40_sNumVal.substring(k40_i, k40_i+1).equals("0")) {
				// k40_unitx[j]가 만이거나 억이라면 (즉, 다른 단위에는 붙지 않음)
				//교수님 코멘트 : 해당 자리가 0일 땐 단위값을 안붙이는데 억, 만 자리는 붙인다. 이백 사만 이십.. 이백만 원억, 만 자리가 아니면 아무짓도 안함
				if(k40_unitx[k40_j].equals("만") || k40_unitx[k40_j].equals("억")) {
					//k40_sNumVoice자리에 unitx[j]값으로 대체 예)
					k40_sNumVoice = k40_sNumVoice +""+ k40_unitx[k40_j];
					// 교수님 코멘트 : 해당자리가 0이면 단위만 붙여줌 
				}else{ // 교수님코멘트 : 아무짓도 안함
				}
				//조건(2) : k40_sNumVal k40_i값이 "0"이 아니라면 
			}else { //k40_sNumVoice에 k40_i을 Integer 변환한 값을 인덱스로하는 k40_units값을 구하고
				//k40_unitx[j]값 출력 예) 7이면 칠, 십의자리가 6이면 육십
				k40_sNumVoice = k40_sNumVoice
						+ k40_units[Integer.parseInt(k40_sNumVal.substring(k40_i,k40_i+1))]
								+ k40_unitx[k40_j]; 
			}
			k40_i++; k40_j--; //k40_i의 숫자는 올려주고, k40_j의 숫자는 내려주기
		}
		System.out.printf("\n%s[%s]\n", k40_sNumVal, k40_sNumVoice);

	}

}



