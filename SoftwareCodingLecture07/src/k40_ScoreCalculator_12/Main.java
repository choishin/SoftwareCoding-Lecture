package k40_ScoreCalculator_12;

import java.util.ArrayList;
/*
 * 12. Ŭ������ ArrayList 
 */
public class Main {
	static int k40_page_count;
	static ArrayList<OneRec> k40_OneRec2Arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_iPerson = 240;
		k40_OneRec2Arr = new ArrayList<OneRec>(); //ArrayList�� ����
		InputData inData = new InputData();
		k40_page_count =1;
		//��������, �Էºη� ����
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
			int student_id = k40_i+1;
			String k40_name = String.format("�л�%02d",k40_i+1);
//						int kor = (int)(Math.random()*100);
//						int eng = (int)(Math.random()*100);
//						int mat = (int)(Math.random()*100);
			int k40_kor = 100;
			int k40_eng = 100;
			int k40_mat = 100;
			//ArrayList�� Ŭ������ �߰�
			k40_OneRec2Arr.add(new OneRec(student_id,k40_name,k40_kor,k40_eng,k40_mat)); //ArrayList�� �л������� ���� Class�� �־���
		}
		
		OneRec k40_rec; //Ŭ������ �ҷ��ͼ� ������Ʈ�� �����ϰ�
		int k40_lineCount = 0;
		inData.printHeader();
		//������ �ҷ��ͼ� ���
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
			k40_rec = k40_OneRec2Arr.get(k40_i);
			k40_lineCount++; //�� Ŭ������ �޼ҵ���� ȣ�� (�� �޼ҵ�� ���� return�ϰ�, �հ�� ����� ������)
			System.out.printf("%03d %6s %4d %4d %4d %5d %.0f\n",k40_rec.student_id(),k40_rec.name(),k40_rec.kor(),
					k40_rec.eng(),k40_rec.mat(),k40_rec.sum(),k40_rec.ave() );
			if (k40_lineCount % 30 == 0 && k40_lineCount<k40_iPerson-1) { 
				k40_page_count++;
				inData.print_mid_Result(k40_lineCount);
				inData.printResult(k40_lineCount);
				System.out.println();
				inData.printHeader();
				continue;
			}
		}
		inData.print_mid_Result(k40_lineCount);
		inData.printResult(k40_lineCount);

	}

}
