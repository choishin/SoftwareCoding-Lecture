package k40_ScoreCalculator01_14;
/*
 * 14.  ���� ���� ���α׷� ����� 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_iPerson = 10; //�� �л� ��
		InputData inData = new InputData(k40_iPerson); //InputData Ŭ������ �ҷ��� ������Ʈ ����
		
		for(int k40_i =0; k40_i<k40_iPerson; k40_i++) { //�ݺ��� : �л��� ����ŭ �ݺ�
			String k40_name = String.format("�л�%02d", k40_i); //�̸� �ֱ�
			int k40_kor = (int)(Math.random()*100); //�ƹ� �����̳� �������� �̾� ���� ������ �־��� ��
			int k40_eng = (int)(Math.random()*100); //�ƹ� �����̳� �������� �̾� ���� ������ �־��� ��
			int k40_mat = (int)(Math.random()*100); //�ƹ� �����̳� �������� �̾� ���� ������ �־��� ��
			inData.setData(k40_i,k40_name,k40_kor,k40_eng,k40_mat); //<-�׷��� ������ �����͸� Iput�� setData �޼ҵ�� ����
			
		}
		
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) { //�ݺ��� : �л��� �� ��ŭ �ݺ� (�ٽ�)
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, ���� : %d, ���� : %d, ���� : %d, ��� : %f\n", //�����ߴ� ���� ����ϱ�
					k40_i, inData.k40_names[k40_i], inData.k40_kors[k40_i], inData.k40_engs[k40_i], 
					inData.k40_mats[k40_i], inData.k40_sums[k40_i],inData.k40_avgs[k40_i]);
		}

	}

}
