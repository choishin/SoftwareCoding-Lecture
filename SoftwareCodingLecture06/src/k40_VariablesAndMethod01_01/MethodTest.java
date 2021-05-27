package k40_VariablesAndMethod01_01;
/*
 * 1. 변수와 메소드(1)
 */
public class MethodTest { 

	public static void iamMethod(){ 
		System.out.printf("메소드라 불러줘요\n");

	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			MethodTest. iamMethod(); //메소드를 호출하는 방법: 클래스명.메소드명(); <- 보통 다른 클래스의 메소드를 부르는 경우 이렇게 함
			iamMethod(); //같은 클래스내의 다른 메소드를 부를때: 메소드명();
	}

}
