package k40_ScoreCalculator_12;

import java.util.ArrayList;
/*
 * 12. 클래스의 ArrayList 
 */
public class Main {
	static int k40_page_count;
	static ArrayList<OneRec> k40_OneRec2Arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_iPerson = 240;
		k40_OneRec2Arr = new ArrayList<OneRec>(); //ArrayList를 생성
		InputData inData = new InputData();
		k40_page_count =1;
		//정보생성, 입력부로 전달
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
			int student_id = k40_i+1;
			String k40_name = String.format("학생%02d",k40_i+1);
//						int kor = (int)(Math.random()*100);
//						int eng = (int)(Math.random()*100);
//						int mat = (int)(Math.random()*100);
			int k40_kor = 100;
			int k40_eng = 100;
			int k40_mat = 100;
			//ArrayList에 클래스를 추가
			k40_OneRec2Arr.add(new OneRec(student_id,k40_name,k40_kor,k40_eng,k40_mat)); //ArrayList에 학생정보를 담은 Class를 넣어줌
		}
		
		OneRec k40_rec; //클래스를 불러와서 오브젝트를 생성하고
		int k40_lineCount = 0;
		inData.printHeader();
		//정보를 불러와서 출력
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) {
			k40_rec = k40_OneRec2Arr.get(k40_i);
			k40_lineCount++; //각 클래스의 메소드들을 호출 (각 메소드는 값을 return하고, 합계와 평균을 구해줌)
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
