package k40_Remocon_Extends_12;
/*
 * 12.Inheritance ������� Ŭ���� ����� (������ Ŭ����)
 *  -> ��� : Ŭ���� ������ �״�� ��������, ���⼭ �޼ҵ带 �� �߰� �� �� ���� 
 * -> ����� ���� : ���� ������ ������ �ۼ����� �ʾƵ� ��.
 * -> ����ϴ� ��� : ���� Ŭ�󽺸� �ۼ� �� �ڿ� extends '�θ�Ŭ��' �̸� �� �����ָ� ��.
 */
public class RemoteControl3 extends RemoteControl2 { //'extends RemoteControl2'  :  RemoteControl2�κ��� ��ӹ���

	void checkBattery() {
		k40_message = String.format("�������� ��ü�� �Դϴ�.");
	}
}

