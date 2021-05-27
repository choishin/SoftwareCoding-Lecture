package k40_Elevator_ClassObjectInstance01_04;
/*
 * 4.클래스,객체,인스턴스 (엘레베이터 클라스 만들기)
 */
public class Elevator { //<-엘레베이터 클라스 생성
	int k40_limit_up_floor =10;  //전역변수(1) 최상위층
	int k40_limit_down_floor=0;  //전역변수(2) 최하위층
	int k40_floor =1 ; //전역변수(3) 현재층
	String k40_help; //각 help에 담겨진 String을 저장할 전역변수
	
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

