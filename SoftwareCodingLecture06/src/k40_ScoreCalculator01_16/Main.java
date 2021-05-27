package k40_ScoreCalculator01_16;
/*
 * 16. 성적집계표 출력 (다 페이지)
 * (1) 200개의 입력 값 자동 생성
 * (2) 개인별 합계, 평균, 과목별 합계,평균, 반 합계 평균 출력
 * (3) 출력한 일자, 시간 표시
 * (4) 한 페이지당 30명을 처리하고, 페이지별 집계, 누적 집계를 인쇄
 */
public class Main {
	static int k40_page_count;//**페이지 수를 입력해줄 변수**/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_iPerson = 330;
		InputData k40_inData = new InputData(k40_iPerson);
		k40_page_count =1;
		//정보생성, 입력부로 전달
		for(int k40_i =1; k40_i<k40_iPerson; k40_i++) {
			String k40_name = String.format("학생%02d", k40_i);
//						int k40_kor = (int)(Math.random()*100);
//						int k40_eng = (int)(Math.random()*100);
//						int k40_mat = (int)(Math.random()*100);
			int k40_kor = 100;
			int k40_eng = 100;
			int k40_mat = 100;
			k40_inData.setData(k40_i,k40_name,k40_kor,k40_eng,k40_mat);

		}
		int k40_lineCount = 0; //<-처리 횟수를 세어줄 변수 선언, 초기화
		k40_inData.printHeader();
		//정보를 불러와서 출력
		int cnt = 0;
		for(int k40_i=0; k40_i < k40_iPerson; k40_i++) {
			cnt++;
			System.out.printf("%03d %6s %4d %4d %4d %5d %4d\n",
					k40_i, k40_inData.k40_names[k40_i], k40_inData.k40_kors[k40_i], k40_inData.k40_engs[k40_i], 
					k40_inData.k40_mats[k40_i], k40_inData.k40_sums[k40_i],k40_inData.k40_avgs[k40_i]); 
			k40_lineCount++; //<-정보를 출력해주고 1씩 lineCount를 올림
			if (cnt % 30 == 0 && k40_i < (k40_iPerson - 1)) { //만일 30번 수행했다면 
				k40_page_count++; //<-(1)page_count를 올리고
				k40_inData.print_mid_Result(k40_lineCount); //<-(2)print_mid_Result로 현재 집계 숫자 전달
				k40_inData.printResult(k40_lineCount); //(3)<-printResult로 누적집계 숫자 전달
				System.out.println();//<-한줄 개행 후
				k40_inData.printHeader();//<-헤더 출력후 다시 반복
				continue;
			}
		}
		k40_inData.print_mid_Result(k40_lineCount - 1);
		k40_inData.printResult(k40_lineCount - 1);

	}

}
