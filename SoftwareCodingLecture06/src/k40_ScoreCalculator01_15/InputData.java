package k40_ScoreCalculator01_15;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 15.  ���� ���� ���α׷� ����� (�����迭 ����ϱ�)
 * 
 */
public class InputData {
	static int k40_size;
	static int k40_i;
	public static String[] k40_names;
	public static int[] k40_kors;
	public static int[] k40_engs;
	public static int[] k40_mats;
	public static int[] k40_sums;
	public static int[] k40_avgs;
	public static int k40_total_kor_sum;
	public static int k40_total_eng_sum;
	public static int k40_total_mat_sum;
	public static int k40_total_sum;
	public static int k40_total_avg;
	
	InputData(int k40_iPerson) {
		k40_size = k40_iPerson;
		k40_names = new String[k40_size];
		k40_kors = new int[k40_size];
		k40_engs= new int[k40_size];
		k40_mats = new int[k40_size];
		k40_sums = new int[k40_size];
		k40_avgs = new int[k40_size];
		
	}
	
	void setData(int k40_i, String k40_name, int k40_kor, int k40_eng, int k40_mat) {

		k40_names[k40_i] = k40_name;
		k40_kors[k40_i] = k40_kor;
		k40_engs[k40_i] = k40_eng;
		k40_mats[k40_i] = k40_mat;
		k40_sums[k40_i] = k40_kor+k40_eng+k40_mat;
		k40_avgs[k40_i] =  (k40_kor+k40_eng+k40_mat)/3;		
		
	}
	
	void printHeader() {
		Date k40_date = new Date();
		SimpleDateFormat k40_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.printf("%20s\n","��������ǥ");
		System.out.printf("%20s %s\n","������� : ",k40_sdf.format(k40_date));
		System.out.println("============================================");
		System.out.printf("%2.2s %3s %4s %2s %2s %3.2s %2.2s\n","��ȣ","�̸�","����","����","����","����","���");
		System.out.println("============================================");
	}
	
	void printResult() {
		k40_total_kor_sum = 0;
		k40_total_eng_sum = 0;
		k40_total_mat_sum = 0;
		k40_total_sum =0;
		k40_total_avg = 0;
		for(int k40_i=0; k40_i<k40_size; k40_i++) {
			k40_total_kor_sum = k40_total_kor_sum +k40_kors[k40_i];
			k40_total_eng_sum = k40_total_eng_sum +k40_engs[k40_i];
			k40_total_mat_sum = k40_total_mat_sum +k40_mats[k40_i];
			k40_total_sum = k40_total_sum + k40_sums[k40_i];
		}
		k40_total_avg = k40_total_sum/3;
		System.out.println("============================================");
		System.out.printf("�հ� %7s %4d %4d %4d %5d %4d\n"," ",
				k40_total_kor_sum,k40_total_eng_sum,k40_total_mat_sum,k40_total_sum,k40_total_avg);
		System.out.printf("��� %7s %4d %4d %4d %5d %4d\n", " ",
				k40_total_kor_sum/(k40_size-1),k40_total_eng_sum/(k40_size-1),k40_total_mat_sum/(k40_size-1),k40_total_sum/(k40_size-1),
				k40_total_avg/(k40_size-1));		
	}
}
