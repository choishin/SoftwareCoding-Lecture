package k40_Remocon_Extends_12;
/*
 * 12.Inheritance 상속으로 클래스 만들기 (리모콘 클래스)
 *  -> 상속 : 클래스 내용을 그대로 가져오되, 여기서 메소드를 더 추가 할 수 있음 
 * -> 상속의 장점 : 같은 내용을 여러번 작성하지 않아도 됨.
 * -> 상속하는 방법 : 새로 클라스를 작성 후 뒤에 extends '부모클라스' 이름 을 적어주면 됨.
 */
public class RemoteControl3 extends RemoteControl2 { //'extends RemoteControl2'  :  RemoteControl2로부터 상속받음

	void checkBattery() {
		k40_message = String.format("건전지를 교체중 입니다.");
	}
}

