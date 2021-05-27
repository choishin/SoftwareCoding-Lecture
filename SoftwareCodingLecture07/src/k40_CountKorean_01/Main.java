package k40_CountKorean_01;
/*
 * 1.한글계산 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 : 메인에 정의된 이 메소드들을 구현하시오.
		System.out.printf("HanBalckForeword[%s]\n",HanBlankForeword("한글abcd",15));
		System.out.printf("HanBalckForeword[%s]\n",HanBlankForeword("한글한글aa",15));
		System.out.printf("HanBalckBackword[%s]\n",HanBlankBackword("한글aa",15));
		System.out.printf("HanBalckBackword[%s]\n",HanBlankBackword("한글한글aa",15));
		System.out.printf("한글은[%d]개\n",HanCount("한글한글aa"));

	}
	
	//1. 입력된 한글에 앞에 공백을 포함한 15글자 만들기
	static String HanBlankForeword(String k40_txt, int k40_textsize) {
		byte[] k40_tmp = k40_txt.getBytes();//String인 텍스트를 byte로 변환한 수를 배열에 넣고
		int k40_countKor =0; //한국어를 셀 변수 선언
		int k40_countElse =0; //그외 영어, 기호 등을 셀 변수 선언
		for (int k40_i=0; k40_i<k40_tmp.length; k40_i++) { 
			if(k40_tmp[k40_i] <0) { //만일 바이트 수가 음수라면 한국어 (정확하게는 -95부터 -30)
				k40_countKor++;
			}else {
				k40_countElse++; //아니라면 기호 또는 영어
			}
		}
		int k40_blanksize = k40_textsize -k40_countKor -k40_countElse;//15글자 안에 채워질 공백 개수 만들어 주기
		String k40_blank="";
		for (int k40_i =0; k40_i<k40_blanksize; k40_i++) {
			k40_blank = k40_blank.concat(" ");
		}
		String k40_result =k40_blank+k40_txt;//만든 공백을 앞에 넣어줌 
		return k40_result;
	}
	//2. 입력된 한글에 뒤에 공백을 포함한 15글자 만들기
	static String HanBlankBackword(String k40_txt, int k40_textsize) {
		byte[] k40_tmp = k40_txt.getBytes(); //String인 텍스트를 byte로 변환한 수를 배열에 넣고
		int k40_countKor =0; //한국어를 셀 변수 선언
		int k40_countElse =0; //그외 영어, 기호 등을 셀 변수 선언
		for (int k40_i=0; k40_i<k40_tmp.length; k40_i++) {
			if(k40_tmp[k40_i] <0) { //만일 바이트 수가 음수라면 한국어
				k40_countKor++;
			}else {
				k40_countElse++;//아니라면 기호 또는 영어
			}
		}
		int k40_blanksize = k40_textsize -k40_countKor -k40_countElse; 
		String k40_blank="";
		for (int i =0; i<k40_blanksize; i++) {
			k40_blank = k40_blank.concat(" ");
		}
		String k40_result =k40_txt+k40_blank; //만든 공백을 뒤에 넣어줌
		return k40_result;
	}
	//3.입력된 한글은 몇 바이트 인지 계산하는 메소드
	static int HanCount(String k40_txt) {
		byte[] k40_tmp = k40_txt.getBytes(); //String인 텍스트를 byte로 변환한 수를 배열에 넣고
		int k40_countKor =0; //한국어를 셀 변수 선언
		int k40_countElse =0; //그외 영어, 기호 등을 셀 변수 선언
		for (int k40_i=0; k40_i<k40_tmp.length; k40_i++) {
			if(k40_tmp[k40_i] <0) { //만일 바이트 수가 음수라면 한국어
				k40_countKor++;
			}else {
				k40_countElse++; //아니라면 기호 또는 영어
			}
		}

		return k40_countKor/2;//한글을 2bytes씩이니까
	}
}
