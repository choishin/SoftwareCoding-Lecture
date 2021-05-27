package k40_ScoreCalculator01_14;
/*
 * 14.  성적 집계 프로그램 만들기 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_iPerson = 10; //총 학생 수
		InputData inData = new InputData(k40_iPerson); //InputData 클래스를 불러와 오브젝트 생성
		
		for(int k40_i =0; k40_i<k40_iPerson; k40_i++) { //반복문 : 학생의 수만큼 반복
			String k40_name = String.format("학생%02d", k40_i); //이름 넣기
			int k40_kor = (int)(Math.random()*100); //아무 성적이나 랜덤으로 뽑아 국어 성적에 넣어줄 것
			int k40_eng = (int)(Math.random()*100); //아무 성적이나 랜덤으로 뽑아 영어 성적에 넣어줄 것
			int k40_mat = (int)(Math.random()*100); //아무 성적이나 랜덤으로 뽑아 수학 성적에 넣어줄 것
			inData.setData(k40_i,k40_name,k40_kor,k40_eng,k40_mat); //<-그렇게 생성된 데이터를 Iput의 setData 메소드로 전달
			
		}
		
		for(int k40_i=0; k40_i<k40_iPerson; k40_i++) { //반복문 : 학생의 수 만큼 반복 (다시)
			System.out.printf("번호 : %d, 이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %f\n", //생성했던 성적 출력하기
					k40_i, inData.k40_names[k40_i], inData.k40_kors[k40_i], inData.k40_engs[k40_i], 
					inData.k40_mats[k40_i], inData.k40_sums[k40_i],inData.k40_avgs[k40_i]);
		}

	}

}
