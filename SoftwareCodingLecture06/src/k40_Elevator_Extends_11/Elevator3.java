package k40_Elevator_Extends_11;
/*
 * 11.Inheritance (상속으로 클래스 만들기)
 * -> 상속 : 클래스 내용을 그대로 가져오되, 여기서 메소드를 더 추가 할 수 있음 
 * -> 상속의 장점 : 같은 내용을 여러번 작성하지 않아도 됨.
 * -> 상속하는 방법 : 새로 클라스를 작성 후 뒤에 extends '부모클라스' 이름 을 적어주면 됨.
 */
public class Elevator3 extends Elevator2 { //<- extends Elevator2 : Elevator2로부터 상속받음
	
	void Repair() {
		k40_help = String.format("수리중입니다.");
	}
}

