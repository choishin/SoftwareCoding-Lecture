package k40_Overriding_13;
/*
 * 13.Overriding
 *  ->Overriding :  클래스를 상속받아 재정의 할때, 메소드를 새롭게 정의 하는 것
 * -> 특징 (1) : 부모 클래스의 것을 지칭할 때는 'super', 자기 클래스의 것을 지칭할 때는 'this'로 구분
 * -> 특징(2) :super class의 메소드와 동일한 이름과 매개변수로 자식클래스에서 메소드를 정의하면 자식클래스의 것이 호출 됨.
 */
public class Elevator3 extends Elevator2 {  //**Elevator2클래스에서 상속받음**/
	
	void Repair() {
		k40_help = String.format("수리중입니다.");
	}
	
	void up() { //**up()이라는 부모클래스의 메소드와 이름이 똑같은 메소드를 새롭게 정의 **/
		if (k40_floor>= k40_limit_up_floor) { 
			k40_help="마지막층입니다."; 
		}else{ 
			k40_floor = k40_floor+2; //**달라진 점 : 한번에 2층씩 올라감
			k40_help= String.format("%2d층입니다.",k40_floor);  
		}
		this.down(); //**자식클래스에서 작성한 down() 메소드를 호출 (<-자기자신을 계속해서 부르는 중)
	}

	void down() {
		
		super.down(); //부모클래스의  down()메소드를 호출  
		System.out.printf("클래스 안에서 찍고 있는 MSG [%s]\n",this.k40_help); 
}
}

