package k40_Parsing_01;
/*
 * 1. Parsing (�ſ��߿�)
 * ���ڷ� ������ �� ����ó���� �Ϸ��� �������·� �ٲ㼭 �ϰ�, 
 * ���ڷ� ó���� �Ϳ� ���ڿ��� ���̷��� ���ڷ� ��ģ�� �ض� 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k40_s = "12345"; //(���ͷ� : ���ڱ״��) String k40_s = 12345 
		int k40_i = Integer.parseInt(k40_s); //String k40_s(12345)�� �����̰� ->������ ��ȯ(12345) 
		System.out.printf("���ڸ� ���ڷ� %d (%d) \n", k40_i, k40_i+10); //���ڷ� ��ȯ�� 12345�� 10�� ������
		
		String k40_a; //k40_a ��� String Ÿ���� �����͸� ���� (����)
		k40_a = String.format("%d", k40_i); //������ �Ǿ��ִ� 12345�� String���� ��ȯ
		System.out.printf("���ڸ� ���ڷ� %s (%s)\n", k40_a, k40_a+"abcde"); // ���ڿ��� ��ȯ�� 12345�� abcde�� ������

	}

}
