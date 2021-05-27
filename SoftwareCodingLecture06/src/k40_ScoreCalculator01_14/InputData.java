package k40_ScoreCalculator01_14;
/*
 * 14. 성적 집계 프로그램 만들기 (전역배열 사용하기)
 */
public class InputData { //<-InputData 클래스 작성
	static int k40_size; 
	static int k40_i;
	public static String[] k40_names; //배열을 전역변수로 선언
	public static int[] k40_kors;
	public static int[] k40_engs;
	public static int[] k40_mats;
	public static int[] k40_sums;
	public static double[] k40_avgs;
	
	InputData(int k40_iPerson) { //<-메소드(1) iPerson 값 만큼 각각 이름, 국어, 영어, 수학, 총점, 평균 값을 넣어줄 배열을 만들얼 줄 것임.
		k40_size = k40_iPerson; 
		k40_names = new String[k40_size]; //이름
		k40_kors = new int[k40_size]; //국어
		k40_engs= new int[k40_size]; //영어
		k40_mats = new int[k40_size]; //수학
		k40_sums = new int[k40_size]; //총점
		k40_avgs = new double[k40_size]; //평균
		
	}
	
	void setData(int k40_i, String k40_name, int k40_kor, int k40_eng, int k40_mat) { //<-메소드(2) 배열에 순서대로 값을 입력해주는 메소드

		k40_names[k40_i] = k40_name; 
		k40_kors[k40_i] = k40_kor;
		k40_engs[k40_i] = k40_eng;
		k40_mats[k40_i] = k40_mat;
		k40_sums[k40_i] = k40_kor+k40_eng+k40_mat; //총점
		k40_avgs[k40_i] =  (k40_kor+k40_eng+k40_mat)/3.0;	//평균
		
	}
}
