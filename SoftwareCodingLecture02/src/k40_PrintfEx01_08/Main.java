package k40_PrintfEx01_08;

public class Main {
/*
 * 8. 16����, 8���� ǥ�� ���� (PrintEx1)
 * 16���� ����� �ٷ� �տ� 0x�� �ٿ��� ��. �׷��� ������ FF�� ���ڰ� �ƴ� ���������� �����ϰ� �� ��) 0xFF , 0x10
 * Integer Ŭ���� toBinarySring() -> 2������ ���ڿ� ���·� ���
 * Integer Ŭ���� toOctalString() -> 8������ ���ڿ� ���·� ���
 * Integer Ŭ���� toHexString() -> 16������ ���ڿ� ���·� ���
 * Integer Ŭ���� valueOf(���ڿ�,2) -> ���ڿ� ���ڸ� 2���� ���ڷ� ��ȯ
 * Integer Ŭ���� valueOf(���ڿ�,8) -> ���ڿ� ���ڸ� 8���� ���ڷ� ��ȯ
 * Integer Ŭ���� valueOf(���ڿ�,16) -> ���ڿ� ���ڸ� 16���� ���ڷ� ��ȯ
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte k40_b = 1; 
		short k40_s = 2; 
		char k40_c = 'A';
		
		int K40_finger = 10;  // int :  10���� ǥ�� 
		long k40_big = 1000000000000000000L; //long : �ִ� 19�ڸ��� ǥ�� ����  
		long k40_hex = 0xFFFFFFFFFFFFFFFFL;  // long hex : 16����
		int k40_octNum = 010; //
		int k40_hexNum = 0x10; 
		int k40_binNum = 0b10;

		System.out.printf("b=%d%n", k40_b); // byte k40_b = 1
		System.out.printf("s=%d%n", k40_s); // short k40_s = 2
		System.out.printf("c=%c, %d  %n", k40_c, (int) k40_c); //%c : �ڸ��� char�� ���//A��� ������ �ƽ�Ű�ڵ带 ��� 
		System.out.printf("finger=[%5d] %n", K40_finger); //int 10�� �����ʺ��� 5�ڸ��� ǥ�� (�׷��� ������ 3)
		System.out.printf("finger=[%-5d]%n", K40_finger); //int 10�� ���ʺ��� 5�ڸ��� ǥ�� (�׷��� ���������� ������ 3)
		System.out.printf("finger=[%05d] %n", K40_finger); //�����ʺ��� 5�ڸ��� ����ϴµ� ������ 0���� ǥ�� 
		System.out.printf("big=%d%n", k40_big);//long big = 1000000000000000000L
		System.out.printf("hex=%#x%n", k40_hex); // %#x : 16���� ǥ�� 
		System.out.printf("octNum=%o, %d%n", k40_octNum, k40_octNum); //%o : 8������ ǥ��// %d : 2������ ǥ��
		System.out.printf("hexNum=%x, %d%n", k40_hexNum, k40_hexNum); //%x :  16������ ǥ��//%d : 2������ ǥ�� 
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(k40_binNum), k40_binNum); //2������ ���ڿ� ���·� ���//���ڷ� ���

	}
}
