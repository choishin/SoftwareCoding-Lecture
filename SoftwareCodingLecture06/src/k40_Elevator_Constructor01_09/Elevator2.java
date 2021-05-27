package k40_Elevator_Constructor01_09;
/*
 * 9.생성자, 소멸자, 이벤트 (엘레베이터 클라스 develop)
 * -> 생성자 : 클래스의 메소드가 호출될 때, 가장 먼저 시행되는 것 (클래스 이름과 똑같은 이름을 가졌음)
 */
public class Elevator2 { //엘레베이터 클라스 생성
	int k40_limit_up_floor;  //전역변수(1) 최상위층 
	int k40_limit_down_floor;  //전역변수(2) 최하위층
	int k40_floor; //전역변수(3) 현재층
	String k40_help; //각 help에 담겨진 String을 저장할 전역변수
	
	Elevator2() { //**<- 생성자(1) 생성 (Elevator클라스가 호출되면 가장 먼저 실행)**/
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("엘레베이터 준공완료\n");
	}
	Elevator2(int k40_a) { //**<- 생성자(2) 생성 (Elevator클라스가 호출되면 가장 먼저 실행)**/
		k40_limit_up_floor = 10;
		k40_limit_down_floor = 0;
		k40_floor = 1;
		System.out.printf("엘레베이터 준공완료[%d]\n",k40_a); //<-올라가고싶은 층수
		
		if(k40_a>0) { //<- 만일 입력한 수가 음수가 아니라면
			for(int i =0; i<k40_a; i++) this.up(); //올라가기 메소드를 반복해서 수행 
		}
		else if (k40_a <0) { //<- 만일 음수라면
			for (int i =0; i<(k40_a*-1); i++) this.down(); //내려가기 메소드를 반복해서 수행
		}
	}

	void up() { //<-메소드(1) 올라가기
		if (k40_floor== k40_limit_up_floor) { //조건문 if : 만일 현재층이 최상위층이라면
			k40_help="마지막층입니다."; // -> 마지막층입니다.
		}else{ 
			k40_floor++; //만일 최상위층이 아니라면 1층씩  증가하고
			k40_help= String.format("%2d층입니다.",k40_floor); //현재층수 출력
		}
	}

	void down() {//<-메소드(2) 내려가기
		if (k40_floor == k40_limit_down_floor){ //조건문if : 만일 현재층이 최하위층이라면
			k40_help="처음층입니다.";  //->처음층입니다.
		}else{ //만일 최하위층이 아니라면
			k40_floor--; //한층씩 감소하고
			k40_help= String.format("%2d층입니다.", k40_floor); //현재 층수 출력
		}
	}
}

