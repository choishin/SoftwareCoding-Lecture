package k40_CastingEx1_11;
/*
 * 11. double  ->int (CastringEx1)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k40_d = 85.4; 
		int k40_score = (int) k40_d; //-> 85 //double -> int 정수형으로 형 변환 (소수점 이하가 버려짐)
		
		System.out.println("score="+k40_score); //85
		System.out.println("d="+k40_d); //85.4

	}

}
