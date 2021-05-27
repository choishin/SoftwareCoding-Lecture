package k40_ClassArraylist01_11;

import java.util.ArrayList;
/*
 * 11.클래스의 ArrayList (성적집계표를 이용해 Class를 ArrayList에 넣기)
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
		//datasSet() : 데이터를 생성하는 메소드
		public static void dataSet() { 
			for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
				int k40_studentId = k40_i;
				String k40_name = String.format("홍길%02d", k40_i);
				int k40_kor = (int)(Math.random()*100);
				int k40_eng = (int)(Math.random()*100);
				int k40_mat = (int)(Math.random()*100);
				//생성된 데이터를 클래스에 넣고,'OneRec2'라는 데이터 타입을 넣는 ArrayList에 넣기
				k40_ArrayOneRec.add(new OneRec(k40_studentId, k40_name,k40_kor,k40_eng,k40_mat)); 
			}

	}
		
		//HeaderPrint() : 데이터를 출력할 헤더부분 
		public static void HeaderPrint() {
			System.out.printf("*****************************************\n");
			System.out.printf("%2s %4s %2s %2s %2s %2s	%2s\n","번호","이름","국어","영어","수학","합계","평균");
			System.out.printf("*****************************************\n");
		}
		//ItemPrint() : 데이터를 출력하고, 합계를 구함. (<-for문 안에서 계속 호출이 되기 때문)
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
		//TailPrint() : 위에서 구한 합계와 평균을 출력
		public static void TailPrint() {
			System.out.printf("*****************************************\n");
			System.out.printf("국어합계 %d	  국어평균: %6.2f\n",k40_sumkor,k40_sumkor/(double)k40_ArrayOneRec.size());
			System.out.printf("영어합계 %d	  영어평균: %6.2f\n",k40_sumeng,k40_sumeng/(double)k40_ArrayOneRec.size());
			System.out.printf("수학합계 %d	  수학평균: %6.2f\n",k40_summat,k40_summat/(double)k40_ArrayOneRec.size());
			System.out.printf("*****************************************\n");
			System.out.printf("반평균합계 %d	    반평균: %6.2f\n",k40_sumave,k40_sumave/(double)k40_ArrayOneRec.size());


		}

}
