package k40_MethodOverloading_07;
/*
 * 7.메소드 오버로딩 
 * -> 메소드 오버로딩이란, 파라미터의 데이터종류나 갯수가 다르면 같은 이름의 메소드를 사용 가능한 것을 말함. 
 */
public class TestMain2 {
	public static void main(String[] args) {
		// TODO Auto generated method stub 
		Calc1 k40_cc= new Calc1();
		System.out.printf("2개 덧셈이 호출됨 [%d]\n",k40_cc.sum(1,2)); //파라미터 int a, int b
		System.out.printf("3개 덧셈이 호출됨 [%d]\n",k40_cc.sum(1,2,3)); //파라미터 int a, int b,  int c
		System.out.printf("4개 덧셈이 호출됨 [%d]\n",k40_cc.sum(1,2,3,4)); //파라미터 int a,int b, int c, int d
		System.out.printf("더블형 덧셈이 호출됨[%f]\n",k40_cc.sum(1.2,3.4)); //파라미터 double a, double b

	}
}

class Calc1 { 
	public int sum(int k40_a, int k40_b){
		return k40_a+k40_b;
	}
	public int sum(int k40_a, int k40_b, int k40_c){
		return k40_a+k40_b+k40_c;
	}
	public int sum(int k40_a, int k40_b, int k40_c, int k40_d) {
		return k40_a+k40_b+k40_c+k40_d;
	}
	public double sum(double k40_a, double k40_b){
		return k40_a+k40_b;
	}

}

/** 위의 sum과 아래 sum은 같이 정의 할 수 없다
 * 왜냐면 받는 매개변수가 똑같아서 구별할 수 없기 때문
 */

