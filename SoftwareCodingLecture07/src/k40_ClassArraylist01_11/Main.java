package k40_ClassArraylist01_11;

import java.util.ArrayList;
/*
 * 11.Ŭ������ ArrayList (��������ǥ�� �̿��� Class�� ArrayList�� �ֱ�)
 */
public class Main {
	
		static ArrayList<OneRec> k40_ArrayOneRec = new ArrayList<OneRec>();;
		static int k40_sumkor = 0;
		static int k40_sumeng = 0;
		static int k40_summat = 0;
		static int k40_sumsum = 0;
		static int k40_sumave = 0;
		static final int k40_iPerson = 20;
		
		public static void main (String[] args) {
			
			dataSet();
			HeaderPrint();
			for(int i=0; i<k40_ArrayOneRec.size(); i++) 
				ItemPrint(i);
			TailPrint();
		}
		//datasSet() : �����͸� �����ϴ� �޼ҵ�
		public static void dataSet() { 
			for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
				int k40_studentId = k40_i;
				String k40_name = String.format("ȫ��%02d", k40_i);
				int k40_kor = (int)(Math.random()*100);
				int k40_eng = (int)(Math.random()*100);
				int k40_mat = (int)(Math.random()*100);
				//������ �����͸� Ŭ������ �ְ�,'OneRec2'��� ������ Ÿ���� �ִ� ArrayList�� �ֱ�
				k40_ArrayOneRec.add(new OneRec(k40_studentId, k40_name,k40_kor,k40_eng,k40_mat)); 
			}

	}
		
		//HeaderPrint() : �����͸� ����� ����κ� 
		public static void HeaderPrint() {
			System.out.printf("*****************************************\n");
			System.out.printf("%2s %4s %2s %2s %2s %2s	%2s\n","��ȣ","�̸�","����","����","����","�հ�","���");
			System.out.printf("*****************************************\n");
		}
		//ItemPrint() : �����͸� ����ϰ�, �հ踦 ����. (<-for�� �ȿ��� ��� ȣ���� �Ǳ� ����)
		public static void ItemPrint(int i) {
			OneRec k40_rec;
			k40_rec = k40_ArrayOneRec.get(i);
			System.out.printf("%4s %4s %3s %3s %3s	%3s %6.2f\n",
					k40_rec.studentId(),k40_rec.name(),k40_rec.kor(),k40_rec.eng(),k40_rec.mat(),k40_rec.sum(),k40_rec.ave());
			k40_sumkor +=k40_rec.kor();
			k40_sumeng +=k40_rec.eng();
			k40_summat +=k40_rec.mat();
			k40_sumsum +=k40_rec.sum();
			k40_sumave +=k40_rec.ave();
		}
		//TailPrint() : ������ ���� �հ�� ����� ���
		public static void TailPrint() {
			System.out.printf("*****************************************\n");
			System.out.printf("�����հ� %d	  �������: %6.2f\n",k40_sumkor,k40_sumkor/(double)k40_ArrayOneRec.size());
			System.out.printf("�����հ� %d	  �������: %6.2f\n",k40_sumeng,k40_sumeng/(double)k40_ArrayOneRec.size());
			System.out.printf("�����հ� %d	  �������: %6.2f\n",k40_summat,k40_summat/(double)k40_ArrayOneRec.size());
			System.out.printf("*****************************************\n");
			System.out.printf("������հ� %d	    �����: %6.2f\n",k40_sumave,k40_sumave/(double)k40_ArrayOneRec.size());


		}

}
