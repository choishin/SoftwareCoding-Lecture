package k40_ScoreCalculator01_14;
/*
 * 14. ���� ���� ���α׷� ����� (�����迭 ����ϱ�)
 */
public class InputData { //<-InputData Ŭ���� �ۼ�
	static int k40_size; 
	static int k40_i;
	public static String[] k40_names; //�迭�� ���������� ����
	public static int[] k40_kors;
	public static int[] k40_engs;
	public static int[] k40_mats;
	public static int[] k40_sums;
	public static double[] k40_avgs;
	
	InputData(int k40_iPerson) { //<-�޼ҵ�(1) iPerson �� ��ŭ ���� �̸�, ����, ����, ����, ����, ��� ���� �־��� �迭�� ����� �� ����.
		k40_size = k40_iPerson; 
		k40_names = new String[k40_size]; //�̸�
		k40_kors = new int[k40_size]; //����
		k40_engs= new int[k40_size]; //����
		k40_mats = new int[k40_size]; //����
		k40_sums = new int[k40_size]; //����
		k40_avgs = new double[k40_size]; //���
		
	}
	
	void setData(int k40_i, String k40_name, int k40_kor, int k40_eng, int k40_mat) { //<-�޼ҵ�(2) �迭�� ������� ���� �Է����ִ� �޼ҵ�

		k40_names[k40_i] = k40_name; 
		k40_kors[k40_i] = k40_kor;
		k40_engs[k40_i] = k40_eng;
		k40_mats[k40_i] = k40_mat;
		k40_sums[k40_i] = k40_kor+k40_eng+k40_mat; //����
		k40_avgs[k40_i] =  (k40_kor+k40_eng+k40_mat)/3.0;	//���
		
	}
}
