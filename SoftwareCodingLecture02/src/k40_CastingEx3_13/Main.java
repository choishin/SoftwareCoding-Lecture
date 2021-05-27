package k40_CastingEx3_13;
/*
 * 13. float, double 연습 (CastringEx_3)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float k40_f = 9.1234567f; 
		double k40_d = 9.1234567; 
		double k40_d2 = (double) k40_f; //float을 double로 형변환
		System.out.printf("f =%20.18f\n", k40_f); //20자리를 예약하고 18자리를 출력
		System.out.printf("d =%20.18f\n", k40_d); //
		System.out.printf("d2=%20.18f\n", k40_d2);

	}

}
