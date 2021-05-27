package k40_Overriding_13;
/*
 * 13.Overriding
 *  ->Overriding :  클래스를 상속받아 재정의 할때, 메소드를 새롭게 정의 하는 것
 * -> 특징 (1) : 부모 클래스의 것을 지칭할 때는 'super', 자기 클래스의 것을 지칭할 때는 'this'로 구분
 * -> 특징(2) :super class의 메소드와 동일한 이름과 매개변수로 자식클래스에서 메소드를 정의하면 자식클래스의 것이 호출 됨.
 */
public class Elevator2 { 
	int k40_limit_up_floor;  
	int k40_limit_down_floor; 
	int k40_floor;
	String k40_help;
	
	Elevator2() { 
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("엘레베이터 준공완료\n");
	}
	Elevator2(int k40_a) { 
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("엘레베이터 준공완료[%d]\n",k40_a);
		
		if(k40_a>0) {
			for(int i =0; i<k40_a; i++) this.up();
		}
		else if (k40_a <0) { //<- 만일 음수라면
			for (int i =0; i<(k40_a*-1); i++) this.down();
		}
	}

	void up() {
		if (k40_floor== k40_limit_up_floor) {
			k40_help="마지막층입니다.";
		}else{ 
			k40_floor++;
			k40_help= String.format("%2d층입니다.",k40_floor);
		}
	}

	void down() {
		if (k40_floor == k40_limit_down_floor){ 
			k40_help="처음층입니다.";
		}else{ 
			k40_floor--;
			k40_help= String.format("%2d층입니다.", k40_floor);
		}
	}
}

