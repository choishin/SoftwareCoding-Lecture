package k40_Stringbuffer_05;
/*
 * 5. StringBuffer Ŭ���� ����ϱ� 
 * String Ŭ�������� ������ : String Ŭ������ �ѹ� �����Ǹ� �� ���� �б⸸ �� �� �ְ�
 *								������ �� �� ����. ������ StringBufferŬ������ �ν��Ͻ��� 
 *								�� ���� ������ ���� �ְ�, �߰� �� ���� ����. 
 *(1) StringBufferŬ�������� ������Ʈ�� �ҷ����� 
 *(2) sb.append(" ") : ���� �߰��ϱ�
 *(3) sb.toString() : String���� ��ȯ�� ��
 *(4) sb.concat(String) : ���ڿ��� ��ħ
 *(5) sb.length() : ���ڿ��� ����
 *
 * String Ŭ�������� �ִ� �� :
 * (1) String replace(char old, char new) : Ư�� ���ڸ� ��λ��ο� ���ڷ� ġȯ
 * (2) String substring(int begin , int end) : String �Ϻθ� �̾Ƴ�
 * (3) char[] toCharArray() : char �迭�� ��ȯ
 * (4) String toLowerCase() : ��� �ҹ��ڷ� ��ȯ
 * (5) String toUpperCase() : ��� �빮�ڷ� ��ȯ
 * (6) String trim() : ���� �پ��ִ� ���鹮�� ����
 * (7) String valueOf(char []) : char�迭�κ��� ���ڿ��� ����
 * (8) String valueOf(int i) : integer�κ��� ���ڿ��� ����

 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k40_str="abcdef";
		StringBuffer sb= new StringBuffer(k40_str);   //String��StringBuffer�κ����ߴ�. 
		System.out.println(sb.append("abcd"));  //stringbuffer���Ŀ������ڿ��ٿ�����
		System.out.println(k40_str.charAt(4));
		k40_str= sb.toString();  				   // �ٽ�StringBuffer����String�����κ�����
		
	}

}

