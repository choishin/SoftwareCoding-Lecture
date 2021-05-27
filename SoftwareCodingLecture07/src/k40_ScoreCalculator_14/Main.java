package k40_ScoreCalculator_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * 14. ArrayList ���� ����ǥ
 */
public class Main {
	static int k40_page_count;
	static ArrayList<OneRec> k40_OneRec3Arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_iPerson = 240;
		k40_OneRec3Arr = new ArrayList<OneRec>(); //ArrayList�� ����
		InputData k40_inData = new InputData();
		k40_page_count =1;
		//��������, �Էºη� ����
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
			int k40_student_id = k40_i+1;
			String k40_name = String.format("�л�%02d",k40_i+1);
			int k40_kor = (int)(Math.random()*100);
			int k40_eng = (int)(Math.random()*100);
			int k40_mat = (int)(Math.random()*100);
			//ArrayList�� Ŭ������ �߰�
			k40_OneRec3Arr.add(new OneRec(k40_student_id,k40_name,k40_kor,k40_eng,k40_mat)); //ArrayList�� �л������� ���� Class�� �־���
		}
		OneRec k40_rec; //Ŭ������ �ҷ��ͼ� ������Ʈ�� �����ϰ�
		int k40_lineCount = 0;
		k40_inData.printHeader();
		dataSort();
		//������ �ҷ��ͼ� ���
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
			k40_rec = k40_OneRec3Arr.get(k40_i);
			k40_lineCount++; //�� Ŭ������ �޼ҵ���� ȣ�� (�� �޼ҵ�� ���� return�ϰ�, �հ�� ����� ������)
			System.out.printf("%03d %6s %4d %4d %4d %5d %.0f\n",k40_rec.student_id(),k40_rec.name(),k40_rec.kor(),
					k40_rec.eng(),k40_rec.mat(),k40_rec.sum(),k40_rec.ave() );
			if (k40_lineCount % 30 == 0 && k40_lineCount<k40_iPerson-1) { 
				k40_page_count++;
				k40_inData.print_mid_Result(k40_lineCount);
				k40_inData.printResult(k40_lineCount);
				System.out.println();
				k40_inData.printHeader();
				continue;
			}
		}
		k40_inData.print_mid_Result(k40_lineCount);
		k40_inData.printResult(k40_lineCount);

	}

	public static void dataSort() { //***�����͸� ������� ������ �޼ҵ带 ����
		Comparator<OneRec> k40_comparator = new Comparator<OneRec>() { //***Comparator�̶�� Ŭ�������� ������Ʈ�� ����
			public int compare(OneRec k40_a1, OneRec k40_a2) { //***�޼ҵ带 ���ν��� (OneRec3 �̶�� ���� �ٸ� �����͸� ������ �´�)
				return (k40_a2.sum() -k40_a1.sum()); //***������ ���ش�
			}
		};
		//�������
		Collections.sort(k40_OneRec3Arr, k40_comparator); //***�迭�� ������ ������ ������ ����
		//����
		//	Collections.sort(OneRec3Arr);

	}
}
