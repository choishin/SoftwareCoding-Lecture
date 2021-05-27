package k40_ScoreCalculator01_16;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 16. �����迭 ����ϱ� (Ŭ������ �����)
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

	static Main k40_main = new Main();

	InputData(int iPerson) {
		k40_size = iPerson;
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.printf("%20s\n","��������ǥ");
		System.out.printf("%s %20s %s\n","PAGE :"+ k40_main.k40_page_count,"������� : ",sdf.format(k40_date));
		System.out.println("============================================");
		System.out.printf("%2.2s %3s %4s %2s %2s %3.2s %2.2s\n","��ȣ","�̸�","����","����","����","����","���");
		System.out.println("============================================");
	}

	void print_mid_Result(int k40_lineCount) { //<-���������� ���踦 ���� �޼ҵ�
		int k40_mid_total_kor_sum =0;
		int k40_mid_total_eng_sum =0;
		int k40_mid_total_mat_sum =0;
		int k40_mid_total_sum =0;
		int k40_mid_total_avg =0;
		if(k40_lineCount%30 == 0) { //lineCount�� ���������� ������ ���� 
			for (int i=k40_lineCount-29; i<k40_lineCount+1; i++) { //29�� �� ��������, ���� lineCount��������
				k40_mid_total_kor_sum = k40_mid_total_kor_sum + k40_kors[i]; //���� �հ�
				k40_mid_total_eng_sum = k40_mid_total_eng_sum + k40_engs[i]; //���� �հ�
				k40_mid_total_mat_sum = k40_mid_total_mat_sum + k40_mats[i]; //���� �հ�
				k40_mid_total_sum = k40_mid_total_sum + k40_sums[i]; //�� �հ�
			
		}
		k40_mid_total_avg = k40_mid_total_sum/3;//��� ��
		System.out.println("============================================");
		System.out.println("����������");
		System.out.printf("�հ� %7s %4d %4d %4d %5d %4d\n"," ", //�հ踦 ���
				k40_mid_total_kor_sum,k40_mid_total_eng_sum,k40_mid_total_mat_sum,k40_mid_total_sum,k40_mid_total_avg);
		System.out.printf("��� %7s %4d %4d %4d %5d %4d\n", " ", //����� ���
				k40_mid_total_kor_sum/30,k40_mid_total_eng_sum/30,k40_mid_total_mat_sum/30,k40_mid_total_sum/30,k40_mid_total_avg/30);	
		}
		else { // ������ �����Ͱ� 30������ ���� �����Ͷ��
				//������ ������ �������� ������������*30�� ���� ��(��, ��������)�� ���� ������, ������ �������� 
			for (int i=k40_lineCount-((k40_lineCount-(k40_main.k40_page_count-1)*30))+1; i<k40_lineCount+1; i++) {
				k40_mid_total_kor_sum = k40_mid_total_kor_sum + k40_kors[i]; //���� �հ�
				k40_mid_total_eng_sum = k40_mid_total_eng_sum + k40_engs[i]; //���� �հ�
				k40_mid_total_mat_sum = k40_mid_total_mat_sum + k40_mats[i]; //���� �հ�
				k40_mid_total_sum = k40_mid_total_sum + k40_sums[i]; //�� �հ�
			
		}
		k40_mid_total_avg = k40_mid_total_sum/3; //��� ��
		System.out.println("============================================");
		System.out.println("����������");
		System.out.printf("�հ� %6s %4d %4d %4d %5d %4d\n"," ",
				k40_mid_total_kor_sum,k40_mid_total_eng_sum,k40_mid_total_mat_sum,k40_mid_total_sum,k40_mid_total_avg);
		System.out.printf("��� %6s %4d %4d %4d %5d %4d\n", " ",
				//������ ���ڿ��� ���������� ���� = ���� ������ ���� 
				k40_mid_total_kor_sum/((k40_lineCount-(k40_main.k40_page_count-1)*30)),//�����հ�/���� ������ ����
				k40_mid_total_eng_sum/((k40_lineCount-(k40_main.k40_page_count-1)*30)),//�����հ�/���� ������ ����
				k40_mid_total_mat_sum/((k40_lineCount-(k40_main.k40_page_count-1)*30)),//�����հ�/���� ������ ����
				k40_mid_total_sum/((k40_lineCount-(k40_main.k40_page_count-1)*30)), //�� �հ�/���� ������ ����
				k40_mid_total_avg/((k40_lineCount-(k40_main.k40_page_count-1)*30)));//�� ��� /���� ������ ����	
		}
	}
	void printResult(int k40_lineCount) {
		k40_total_kor_sum = 0;
		k40_total_eng_sum = 0;
		k40_total_mat_sum = 0;
		k40_total_sum =0;
		k40_total_avg = 0;
		for(int k40_i=1; k40_i<k40_lineCount+1; k40_i++) {
			k40_total_kor_sum = k40_total_kor_sum +k40_kors[k40_i];
			k40_total_eng_sum = k40_total_eng_sum +k40_engs[k40_i];
			k40_total_mat_sum = k40_total_mat_sum +k40_mats[k40_i];
			k40_total_sum = k40_total_sum + k40_sums[k40_i];

		}
		k40_total_avg = k40_total_sum/3;
		System.out.println("============================================");
		System.out.println("����������");
		System.out.printf("�հ� %5s %5d %5d %5d %5d %5d\n"," ",
				k40_total_kor_sum,k40_total_eng_sum,k40_total_mat_sum,k40_total_sum,k40_total_avg);
		System.out.printf("��� %6s %4d %5d %5d %5d %5d\n", " ",
				k40_total_kor_sum/(k40_lineCount),k40_total_eng_sum/(k40_lineCount),k40_total_mat_sum/(k40_lineCount),
				k40_total_sum/(k40_lineCount),k40_total_avg/(k40_lineCount));		
	}
}
