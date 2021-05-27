package k40_ArrayListSort_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 13.ArrayLsit ���� ����ǥ
 */

public class Main {

	static ArrayList<OneRec> k40_ArrayOneRec = new ArrayList<OneRec>();
	static int k40_sumkor = 0;
	static int k40_sumeng = 0;
	static int k40_summat = 0;
	static int k40_sumsum = 0;
	static int k40_sumave = 0;
	static final int iPerson = 20;

	public static void main (String[] args) {
		dataSet();
		dataSort();
		HeaderPrint();
		for(int k40_i=0; k40_i<k40_ArrayOneRec.size(); k40_i++) 
			ItemPrint(k40_i);
		TailPrint();
	}
	
	public static void dataSort() { //***�����͸� ������� ������ �޼ҵ带 ����
		Comparator<OneRec> k40_comparator = new Comparator<OneRec>() { //***Comparator�̶�� Ŭ�������� ������Ʈ�� ����
			public int compare(OneRec k40_a1, OneRec k40_a2) { //***�޼ҵ带 ���ν��� (OneRec3 �̶�� ���� �ٸ� �����͸� ������ �´�)
				return (k40_a2.sum() -k40_a1.sum()); //***������ ���ش�
			}
		};
		//�������
		Collections.sort(k40_ArrayOneRec, k40_comparator); //***�迭�� ������ ������ ������ ����
		//����
		//	Collections.sort(OneRec3Arr);

	}

	public static void dataSet() {
		for(int k40_i=0; k40_i<iPerson; k40_i++) {
			int k40_studentId = k40_i;
			String k40_name = String.format("ȫ��%02d", k40_i);
			int k40_kor = (int)(Math.random()*100);
			int k40_eng = (int)(Math.random()*100);
			int k40_mat = (int)(Math.random()*100);
			k40_ArrayOneRec.add(new OneRec(k40_studentId, k40_name,k40_kor,k40_eng,k40_mat));
		}

	}
	public static void HeaderPrint() {
		System.out.printf("*****************************************\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s	%2s\n","��ȣ","�̸�","����","����","����","�հ�","���");
		System.out.printf("*****************************************\n");
	}
	public static void ItemPrint(int k40_i) {
		OneRec k40_rec;
		k40_rec = k40_ArrayOneRec.get(k40_i);
		System.out.printf("%4s %4s %3s %3s %3s	%3s %6.2f\n",
				k40_rec.studentId(),k40_rec.name(),k40_rec.kor(),k40_rec.eng(),k40_rec.mat(),k40_rec.sum(),k40_rec.ave());
		k40_sumkor +=k40_rec.kor();
		k40_sumeng +=k40_rec.eng();
		k40_summat +=k40_rec.mat();
		k40_sumsum +=k40_rec.sum();
		k40_sumave +=k40_rec.ave();
	}
	public static void TailPrint() {
		System.out.printf("*****************************************\n");
		System.out.printf("�����հ� %d	  �������: %6.2f\n",k40_sumkor,k40_sumkor/(double)k40_ArrayOneRec.size());
		System.out.printf("�����հ� %d	  �������: %6.2f\n",k40_sumeng,k40_sumeng/(double)k40_ArrayOneRec.size());
		System.out.printf("�����հ� %d	  �������: %6.2f\n",k40_summat,k40_summat/(double)k40_ArrayOneRec.size());
		System.out.printf("*****************************************\n");
		System.out.printf("������հ� %d      �����: %6.2f\n",k40_sumave,k40_sumave/(double)k40_ArrayOneRec.size());


	}


}
