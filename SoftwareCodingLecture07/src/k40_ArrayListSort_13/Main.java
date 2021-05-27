package k40_ArrayListSort_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 13.ArrayLsit 정렬 집계표
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
	
	public static void dataSort() { //***데이터를 순서대로 정렬할 메소드를 선언
		Comparator<OneRec> k40_comparator = new Comparator<OneRec>() { //***Comparator이라는 클래스에서 오브젝트를 생성
			public int compare(OneRec k40_a1, OneRec k40_a2) { //***메소드를 새로써줌 (OneRec3 이라는 서로 다른 데이터를 가지고 온다)
				return (k40_a2.sum() -k40_a1.sum()); //***총합을 빼준다
			}
		};
		//순서대로
		Collections.sort(k40_ArrayOneRec, k40_comparator); //***배열을 위에서 정의한 순서로 정렬
		//역순
		//	Collections.sort(OneRec3Arr);

	}

	public static void dataSet() {
		for(int k40_i=0; k40_i<iPerson; k40_i++) {
			int k40_studentId = k40_i;
			String k40_name = String.format("홍길%02d", k40_i);
			int k40_kor = (int)(Math.random()*100);
			int k40_eng = (int)(Math.random()*100);
			int k40_mat = (int)(Math.random()*100);
			k40_ArrayOneRec.add(new OneRec(k40_studentId, k40_name,k40_kor,k40_eng,k40_mat));
		}

	}
	public static void HeaderPrint() {
		System.out.printf("*****************************************\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s	%2s\n","번호","이름","국어","영어","수학","합계","평균");
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
		System.out.printf("국어합계 %d	  국어평균: %6.2f\n",k40_sumkor,k40_sumkor/(double)k40_ArrayOneRec.size());
		System.out.printf("영어합계 %d	  영어평균: %6.2f\n",k40_sumeng,k40_sumeng/(double)k40_ArrayOneRec.size());
		System.out.printf("수학합계 %d	  수학평균: %6.2f\n",k40_summat,k40_summat/(double)k40_ArrayOneRec.size());
		System.out.printf("*****************************************\n");
		System.out.printf("반평균합계 %d      반평균: %6.2f\n",k40_sumave,k40_sumave/(double)k40_ArrayOneRec.size());


	}


}
