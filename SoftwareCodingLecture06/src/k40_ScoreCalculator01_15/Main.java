package k40_ScoreCalculator01_15;
/*
 * 15. ��������ǥ ��� (1������)
 * (1) 30���� �Է� ���� �ڵ�����
 * (2) ���κ� �հ�, ���, ���� �հ�,���, �� �հ� ��� ���
 * (3) ����� ����, �ð� ǥ��
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_iPerson = 31;
		InputData k40_inData = new InputData(k40_iPerson);
		//��������, �Էºη� ����
		for(int k40_i =1; k40_i<k40_iPerson; k40_i++) {
			String k40_name = String.format("�л�%02d", k40_i);
//			int k40_kor = (int)(Math.random()*100);
//			int k40_eng = (int)(Math.random()*100);
//			int k40_mat = (int)(Math.random()*100);
			int k40_kor = 100;
			int k40_eng = 100;
			int k40_mat = 100;
			k40_inData.setData(k40_i,k40_name,k40_kor,k40_eng,k40_mat);
		}
		
		k40_inData.printHeader();
		//������ �ҷ��ͼ� ���
		for(int i=1; i<k40_iPerson; i++) {
			System.out.printf("%03d %6s %4d %4d %4d %5d %4d\n",
					i, k40_inData.k40_names[i], k40_inData.k40_kors[i], k40_inData.k40_engs[i], 
					k40_inData.k40_mats[i], k40_inData.k40_sums[i],k40_inData.k40_avgs[i]);
		}
		k40_inData.printResult();
	

	}

}
