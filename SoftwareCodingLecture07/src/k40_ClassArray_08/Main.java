package k40_ClassArray_08;
/*
 * 8.클래스의 배열 (배열에 클래스를 저장 하기)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_iPerson = 5;
		OneRec1[] k40_inData = new OneRec1[k40_iPerson];//OneRec1 클래스로 오브젝트 생성 
		
		k40_inData[0] = new OneRec1("홍길01",100,100,90); //생성자를 통해 이 값들을 저장
		k40_inData[1] = new OneRec1("홍길02",90,90,90); 
		k40_inData[2] = new OneRec1("홍길03",80,70,90); 
		k40_inData[3] = new OneRec1("홍길04",70,60,90); 
		k40_inData[4] = new OneRec1("홍길05",60,100,90);
		
		for (int k40_i=0; k40_i<k40_iPerson; k40_i++) {
		
		String k40_name = k40_inData[k40_i].name(); //순서대로 이름, 국어, 영어, 수학, 총합, 평균 성적을 불러와 출력
		int k40_kor = k40_inData[k40_i].kor(); 
		int k40_eng = k40_inData[k40_i].eng();
		int k40_mat = k40_inData[k40_i].mat();
		int k40_sum = k40_inData[k40_i].sum();
		double k40_ave = k40_inData[k40_i].ave();
		System.out.printf("번호 : %d, 이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %f\n",
				k40_i,k40_name,k40_kor,k40_eng,k40_mat,k40_sum,k40_ave);
	
		}	
		

	}
}
