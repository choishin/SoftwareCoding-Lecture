package k40_CastingEx2_12;
/*
 * 12. int ->byte (CastingEx2) 
 * ���ڸ� byte�� �ٲٴ� ���� Ư���� ��� (unix<->PC ��)
 * byte : ��� ���ڴ� ��ǻ�Ϳ��� ������ �� �ִ� byte�� ��ȯ�� �Ǵµ�, ���� ������ ������ �ִ� ������ byte ��ȣ (�ƽ�Ű�ڵ�)�� ǥ���ϴ� ����
 * ��) char tmp = (byte) 74; <-�ַ� �̷��� ���� ����
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_i = 10; 
		byte k40_b = (byte)k40_i; //byte k40_b = (byte)10;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k40_i, k40_b);
		
		k40_i = 300; 
		k40_b = (byte)k40_i; //k40_b = (byte)300
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k40_i, k40_b);
		
		k40_b = 10; 
		k40_i = (int)k40_b; 
		System.out.printf("[byte -> int] b=%d -> i=%d%n", k40_b, k40_i);
		
		k40_b = -2; 
		k40_i = (int)k40_b; 
		System.out.printf("[byte -> int] b=%d -> i=%d %n", k40_b, k40_i);
		System.out.println("i="+Integer.toBinaryString(k40_i)); //-2�� 2�������� ǥ��

	}

}
