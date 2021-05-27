package k40_VarEx02_04;
/*
 * 4.값교환하기(VarEx02)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k40_x = 10;  //리터럴 : int k40_x =10
		int k40_y = 20; // 리터럴 : int  k40_y =20
		int k40_tmp = 0; //값교환을 위한 변수 설정
		System.out.println("x : "+ k40_x + " y : " + k40_y); // k40_x와  k40_y를 각각 출력
		k40_tmp = k40_x;  // k40_tmp에  k40_x값(10)을 옮기기
		k40_x = k40_y; //비어있는  k40_x에  k40_y값(20)을 옮기기
		k40_y = k40_tmp; //비어있는  k40_y에  k40_tmp값(10)을 옮기기
		System.out.println("x : "+ k40_x + " y : " + k40_y); //현재  k40_x = 20, k40_y = 10
		System.out.println("temp : "+k40_tmp); //<-마지막  k40_tmp값이 출력

	}

}
