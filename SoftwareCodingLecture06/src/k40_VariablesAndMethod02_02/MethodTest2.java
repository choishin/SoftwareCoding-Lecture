package k40_VariablesAndMethod02_02;
/*
 * 2.변수와 메소드(2)
 */
public class MethodTest2 {
		static int k40_iStatic; //<-(1)같은 클래스 내에서는 모두 사용할 수 있도록 하기 위해 '전역 변수'로 선언 
								//(숫자는 전역변수의 데이터 흐름)
		
		public static void add(int k40_i) {  //add(iMain -> int i)
			k40_iStatic++; //(5)iStatic = 1++ =2;
			System.out.printf("add메소드에서->iStatic-[%d]\n", k40_iStatic); //(6)iStatic =2;
			System.out.printf("add메소드에서->i=[%d] \n", k40_i); // iMain-> i =1
		}
			public static int add2(int k40_i) {//add2(iMain->int i)
			k40_iStatic++; //(9)iStatic = 2++ =3;
			System.out.printf("add메소드에서 ->iStatic=[%d]\n", k40_iStatic);//iStatic = 3;
			System.out.printf("add메소드에서->i=[%d]\n", k40_i); //iMain->i =1;
				return k40_i; //i = 1;
			}
			public static void main(String[] args) { //<-(2)모든 함수들 중 가장먼저 호출되는 main 함수 
			// TODO Auto-generated method stub
			int k40_iMain; //<-메소드 내에서 사용되는 '지역변수'로 선언 
			k40_iMain=1; //iMain = 1로 저장
			k40_iStatic=1; //(3)현재 iStatic = 1 로 저장
			System.out.printf("**********************************\n"); 
			System.out.printf("메소드 호출전 메인에서->iStatic=[%d]\n", k40_iStatic); //iStatic = 1
			System.out.printf("메소드 호출전 메인에서->iMain=[%d]\n", k40_iMain); //iMain =1
			System.out.printf("**********************************\n");
			add (k40_iMain); //(4)add함수 호출 (iMain값을 넣어줌)
			System.out.printf("***********************************\n"); 
			System.out.printf("메소드 호출 후 메인에서->iStatic=[%d]\n", k40_iStatic); //(7)iStatic =2
			System.out.printf("메소드 호출 후 메인에서->iMain=[%d]\n", k40_iMain); //iMain은 지역변수이기 때문에 그대로 1
			System.out.printf("**********************************\n");
			k40_iMain=add2(k40_iMain); //(8)add2를 호출해 (iMain값을 넣고), return값을 iMain에 받아오기 (->1)
			System.out.printf("*********************************\n"); 
			System.out.printf("메소드 add2호출 후 메인에서->iStatic=[%d]\n", k40_iStatic);//(10)iStatic =3; 
			System.out.printf("메소드 add2호출 후 메인에서 ->iMain=[%d]\n", k40_iMain); //iMain = 1;
			System.out.printf("*********************************\n");
	}
}
