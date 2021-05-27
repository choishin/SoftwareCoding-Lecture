package k40_ScoreCalculator_12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {
	
	Main main = new Main();
	private static int total_kor_sum;
	private static int total_eng_sum;
	private static int total_mat_sum;
	private static int total_sum;
	private static int total_avg;
	
	public void printHeader() {

		Date k40_date = new Date();
		SimpleDateFormat k40_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.printf("%20s\n","성적집계표");
		System.out.printf("%s %20s %s\n","PAGE :"+ main.k40_page_count,"출력일자 : ",k40_sdf.format(k40_date));
		System.out.println("============================================");
		System.out.printf("%2.2s %3s %4s %2s %2s %3.2s %2.2s\n","번호","이름","국어","영어","수학","총점","평균");
	}

	public void print_mid_Result(int k40_lineCount) {
		
		int k40_mid_total_kor_sum =0;
		int k40_mid_total_eng_sum =0;
		int k40_mid_total_mat_sum =0;
		int k40_mid_total_sum =0;
		int mid_total_avg =0;
		int subject = 3;
		int contents = 30;
		if(k40_lineCount%30 == 0) {
			for (int i=k40_lineCount-30; i<k40_lineCount; i++) { //<-1부터 시작하기 때문에 숫자를 수정
				k40_mid_total_kor_sum = k40_mid_total_kor_sum + main.k40_OneRec2Arr.get(i).kor();
				k40_mid_total_eng_sum = k40_mid_total_eng_sum + main.k40_OneRec2Arr.get(i).eng();
				k40_mid_total_mat_sum = k40_mid_total_mat_sum + main.k40_OneRec2Arr.get(i).mat();
				k40_mid_total_sum = k40_mid_total_sum + main.k40_OneRec2Arr.get(i).sum();
		}
		mid_total_avg = k40_mid_total_sum/subject;
		System.out.println("============================================");
		System.out.println("현재페이지");
		System.out.printf("합계 %7s %4d %4d %4d %5d %4d\n"," ",
				k40_mid_total_kor_sum,k40_mid_total_eng_sum,k40_mid_total_mat_sum,k40_mid_total_sum,mid_total_avg);
		System.out.printf("평균 %7s %4d %4d %4d %5d %4d\n", " ",
				k40_mid_total_kor_sum/contents,k40_mid_total_eng_sum/contents,k40_mid_total_mat_sum/contents,k40_mid_total_sum/contents,mid_total_avg/contents);	
		}
		else {
			for (int i=k40_lineCount-((k40_lineCount-(main.k40_page_count-1)*contents)); i<k40_lineCount; i++) { 
				k40_mid_total_kor_sum = k40_mid_total_kor_sum + main.k40_OneRec2Arr.get(i).kor();
				k40_mid_total_eng_sum = k40_mid_total_eng_sum + main.k40_OneRec2Arr.get(i).eng();
				k40_mid_total_mat_sum = k40_mid_total_mat_sum + main.k40_OneRec2Arr.get(i).mat();
				k40_mid_total_sum = k40_mid_total_sum + main.k40_OneRec2Arr.get(i).sum();
		}
		mid_total_avg = k40_mid_total_sum/subject;
		System.out.println("============================================");
		System.out.println("현재페이지");
		System.out.printf("합계 %7s %4d %4d %4d %5d %4d\n"," ",
				k40_mid_total_kor_sum,k40_mid_total_eng_sum,k40_mid_total_mat_sum,k40_mid_total_sum,mid_total_avg);
		System.out.printf("평균 %7s %4d %4d %4d %5d %4d\n", " ",
				k40_mid_total_kor_sum/((k40_lineCount-(main.k40_page_count-1)*contents)),
				k40_mid_total_eng_sum/((k40_lineCount-(main.k40_page_count-1)*contents)),
				k40_mid_total_mat_sum/((k40_lineCount-(main.k40_page_count-1)*contents)),
				k40_mid_total_sum/((k40_lineCount-(main.k40_page_count-1)*contents)),
				mid_total_avg/((k40_lineCount-(main.k40_page_count-1)*contents)));	
		}
	}
	public void printResult(int lineCount) {
		
		total_kor_sum = 0;
		total_eng_sum = 0;
		total_mat_sum = 0;
		total_sum =0;
		total_avg = 0;
		for(int k40_i=0; k40_i<lineCount; k40_i++) {
			total_kor_sum = total_kor_sum +main.k40_OneRec2Arr.get(k40_i).kor();
			total_eng_sum = total_eng_sum +main.k40_OneRec2Arr.get(k40_i).eng();
			total_mat_sum = total_mat_sum +main.k40_OneRec2Arr.get(k40_i).mat();
			total_sum = total_sum + main.k40_OneRec2Arr.get(k40_i).sum();
		}
		total_avg = total_sum/3;
		System.out.println("============================================");
		System.out.println("누적페이지");
		System.out.printf("합계 %7s %5d %5d %5d %5d %5d\n"," ",
				total_kor_sum,total_eng_sum,total_mat_sum,total_sum,total_avg);
		System.out.printf("평균 %7s %5d %5d %5d %5d %5d\n", " ",
				total_kor_sum/(lineCount),total_eng_sum/(lineCount),total_mat_sum/(lineCount),total_sum/(lineCount),total_avg/(lineCount));		
	}
	

}
