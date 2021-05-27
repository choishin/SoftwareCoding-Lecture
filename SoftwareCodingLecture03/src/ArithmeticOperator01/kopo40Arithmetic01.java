package ArithmeticOperator01;
//1.연산 후 대입 
public class kopo40Arithmetic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		int kopo40;
		
		//1-1.변수는 1+2 인데, int 이기 때문에 3이 됨
		kopo40 = 1+2; //kopo = 1+2 = 3
		System.out.printf("#1-1. %d\n",kopo40);
		
		//1-2.연산순서 *, / 다음 +,-
		kopo40 = 1+2*3; //kopo40 = 1+2*3 = 7
		System.out.printf("#1-2. %d\n",kopo40);

	}

}
