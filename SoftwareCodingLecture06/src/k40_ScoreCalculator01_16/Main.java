package k40_ScoreCalculator01_16;
/*
 * 16. ��������ǥ ��� (�� ������)
 * (1) 200���� �Է� �� �ڵ� ����
 * (2) ���κ� �հ�, ���, ���� �հ�,���, �� �հ� ��� ���
 * (3) ����� ����, �ð� ǥ��
 * (4) �� �������� 30���� ó���ϰ�, �������� ����, ���� ���踦 �μ�
 */
public class Main {
	static int k40_page_count;//**������ ���� �Է����� ����**/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_iPerson = 330;
		InputData k40_inData = new InputData(k40_iPerson);
		k40_page_count =1;
		//��������, �Էºη� ����
		for(int k40_i =1; k40_i<k40_iPerson; k40_i++) {
			String k40_name = String.format("�л�%02d", k40_i);
//						int k40_kor = (int)(Math.random()*100);
//						int k40_eng = (int)(Math.random()*100);
//						int k40_mat = (int)(Math.random()*100);
			int k40_kor = 100;
			int k40_eng = 100;
			int k40_mat = 100;
			k40_inData.setData(k40_i,k40_name,k40_kor,k40_eng,k40_mat);

		}
		int k40_lineCount = 0; //<-ó�� Ƚ���� ������ ���� ����, �ʱ�ȭ
		k40_inData.printHeader();
		//������ �ҷ��ͼ� ���
		int cnt = 0;
		for(int k40_i=0; k40_i < k40_iPerson; k40_i++) {
			cnt++;
			System.out.printf("%03d %6s %4d %4d %4d %5d %4d\n",
					k40_i, k40_inData.k40_names[k40_i], k40_inData.k40_kors[k40_i], k40_inData.k40_engs[k40_i], 
					k40_inData.k40_mats[k40_i], k40_inData.k40_sums[k40_i],k40_inData.k40_avgs[k40_i]); 
			k40_lineCount++; //<-������ ������ְ� 1�� lineCount�� �ø�
			if (cnt % 30 == 0 && k40_i < (k40_iPerson - 1)) { //���� 30�� �����ߴٸ� 
				k40_page_count++; //<-(1)page_count�� �ø���
				k40_inData.print_mid_Result(k40_lineCount); //<-(2)print_mid_Result�� ���� ���� ���� ����
				k40_inData.printResult(k40_lineCount); //(3)<-printResult�� �������� ���� ����
				System.out.println();//<-���� ���� ��
				k40_inData.printHeader();//<-��� ����� �ٽ� �ݺ�
				continue;
			}
		}
		k40_inData.print_mid_Result(k40_lineCount - 1);
		k40_inData.printResult(k40_lineCount - 1);

	}

}
