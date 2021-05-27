package k40_OverflowEx_10;
/*
 * 10. Overflow,ChartoCode 
 * short vs byte : byte�� 127���� ǥ�� ����, short �� 65535���� ���� ǥ�� ����
 * short�� ���� ���� �ַ� C������ ȣȯ�� ���� ��� �� (�ڹٿ����� �� ������ �ʴ� Ÿ��)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short k40_sMin = -32768;  //short : 2����Ʈ�� ũ��, �� 16��Ʈ�� ������ �� �ִ�.  (65536���� ����)
		short k40_sMax = 32767; 
		char k40_cMin = 0;  //char : 2byte ũ�⸦ ������.
		char k40_cMax = 65535;
		System.out.println("sMin  =  " + k40_sMin); //short k40_sMin = -32768 ���
		System.out.println("sMin-1= " + (short) (k40_sMin-1));  //-32768-1 = -32767�� short������ ���
		System.out.println("sMax  = " + k40_sMax); //short k40_sMax = 32767�� ���
		System.out.println("sMax+1= "+ (short) (k40_sMax+1)); //32767+1 =32768�� short������ ���
		System.out.println("cMin  = " + (int) k40_cMin); //char k40_cMin = 0�� int������ ���
		System.out.println("cMin-1= " + (int) --k40_cMin); //char k40_cMin�� -1ó���� ���ְ� int������ ��ȯ (0���� ���� ���� ǥ�� ���ϱ� ������ 65535)
		System.out.println("cMax  = " + (int) k40_cMax); //char k40_cMax = 65535 �� int������ ���
		System.out.println("cMax+1= " + (int) ++k40_cMax); //k40_cMax = 65535�� +1���� �� int������ ��ȯ (������ 65536�� ���� ������ 0)

	}

}
