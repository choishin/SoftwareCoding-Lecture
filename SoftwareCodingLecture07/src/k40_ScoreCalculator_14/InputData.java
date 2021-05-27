package k40_ScoreCalculator_14;

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

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.printf("%20s\n","성적집계표");
		System.out.printf("%s %20s %s\n","PAGE :"+ main.k40_page_count,"출력일자 : ",sdf.format(date));
		System.out.println("============================================");
		System.out.printf("%2.2s %3s %4s %2s %2s %3.2s %2.2s\n","번호","이름","국어","영어","수학","총점","평균");
	}

	public void print_mid_Result(int lineCount) {
		
		int mid_total_kor_sum =0;
		int mid_total_eng_sum =0;
		int mid_total_mat_sum =0;
		int mid_total_sum =0;
		int mid_total_avg =0;
		int subject = 3;
		int contents = 30;
		if(lineCount%30 == 0) {
			for (int i=lineCount-30; i<lineCount; i++) { //<-1부터 시작하기 때문에 숫자를 수정
				mid_total_kor_sum = mid_total_kor_sum + main.k40_OneRec3Arr.get(i).kor();
				mid_total_eng_sum = mid_total_eng_sum + main.k40_OneRec3Arr.get(i).eng();
				mid_total_mat_sum = mid_total_mat_sum + main.k40_OneRec3Arr.get(i).mat();
				mid_total_sum = mid_total_sum + main.k40_OneRec3Arr.get(i).sum();
		}
		mid_total_avg = mid_total_sum/subject;
		System.out.println("============================================");
		System.out.println("현재페이지");
		System.out.printf("합계 %7s %4d %4d %4d %5d %4d\n"," ",
				mid_total_kor_sum,mid_total_eng_sum,mid_total_mat_sum,mid_total_sum,mid_total_avg);
		System.out.printf("평균 %7s %4d %4d %4d %5d %4d\n", " ",
				mid_total_kor_sum/contents,mid_total_eng_sum/contents,mid_total_mat_sum/contents,mid_total_sum/contents,mid_total_avg/contents);	
		}
		else {
			for (int i=lineCount-((lineCount-(main.k40_page_count-1)*contents)); i<lineCount; i++) { 
				mid_total_kor_sum = mid_total_kor_sum + main.k40_OneRec3Arr.get(i).kor();
				mid_total_eng_sum = mid_total_eng_sum + main.k40_OneRec3Arr.get(i).eng();
				mid_total_mat_sum = mid_total_mat_sum + main.k40_OneRec3Arr.get(i).mat();
				mid_total_sum = mid_total_sum + main.k40_OneRec3Arr.get(i).sum();
		}
		mid_total_avg = mid_total_sum/subject;
		System.out.println("============================================");
		System.out.println("현재페이지");
		System.out.printf("합계 %7s %4d %4d %4d %5d %4d\n"," ",
				mid_total_kor_sum,mid_total_eng_sum,mid_total_mat_sum,mid_total_sum,mid_total_avg);
		System.out.printf("평균 %7s %4d %4d %4d %5d %4d\n", " ",
				mid_total_kor_sum/((lineCount-(main.k40_page_count-1)*contents)),
				mid_total_eng_sum/((lineCount-(main.k40_page_count-1)*contents)),
				mid_total_mat_sum/((lineCount-(main.k40_page_count-1)*contents)),
				mid_total_sum/((lineCount-(main.k40_page_count-1)*contents)),
				mid_total_avg/((lineCount-(main.k40_page_count-1)*contents)));	
		}
	}
	public void printResult(int lineCount) {
		
		total_kor_sum = 0;
		total_eng_sum = 0;
		total_mat_sum = 0;
		total_sum =0;
		total_avg = 0;
		for(int i=0; i<lineCount; i++) {
			total_kor_sum = total_kor_sum +main.k40_OneRec3Arr.get(i).kor();
			total_eng_sum = total_eng_sum +main.k40_OneRec3Arr.get(i).eng();
			total_mat_sum = total_mat_sum +main.k40_OneRec3Arr.get(i).mat();
			total_sum = total_sum + main.k40_OneRec3Arr.get(i).sum();
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
