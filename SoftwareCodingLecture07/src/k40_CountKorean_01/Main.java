package k40_CountKorean_01;
/*
 * 1.�ѱ۰�� 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� : ���ο� ���ǵ� �� �޼ҵ���� �����Ͻÿ�.
		System.out.printf("HanBalckForeword[%s]\n",HanBlankForeword("�ѱ�abcd",15));
		System.out.printf("HanBalckForeword[%s]\n",HanBlankForeword("�ѱ��ѱ�aa",15));
		System.out.printf("HanBalckBackword[%s]\n",HanBlankBackword("�ѱ�aa",15));
		System.out.printf("HanBalckBackword[%s]\n",HanBlankBackword("�ѱ��ѱ�aa",15));
		System.out.printf("�ѱ���[%d]��\n",HanCount("�ѱ��ѱ�aa"));

	}
	
	//1. �Էµ� �ѱۿ� �տ� ������ ������ 15���� �����
	static String HanBlankForeword(String k40_txt, int k40_textsize) {
		byte[] k40_tmp = k40_txt.getBytes();//String�� �ؽ�Ʈ�� byte�� ��ȯ�� ���� �迭�� �ְ�
		int k40_countKor =0; //�ѱ�� �� ���� ����
		int k40_countElse =0; //�׿� ����, ��ȣ ���� �� ���� ����
		for (int k40_i=0; k40_i<k40_tmp.length; k40_i++) { 
			if(k40_tmp[k40_i] <0) { //���� ����Ʈ ���� ������� �ѱ��� (��Ȯ�ϰԴ� -95���� -30)
				k40_countKor++;
			}else {
				k40_countElse++; //�ƴ϶�� ��ȣ �Ǵ� ����
			}
		}
		int k40_blanksize = k40_textsize -k40_countKor -k40_countElse;//15���� �ȿ� ä���� ���� ���� ����� �ֱ�
		String k40_blank="";
		for (int k40_i =0; k40_i<k40_blanksize; k40_i++) {
			k40_blank = k40_blank.concat(" ");
		}
		String k40_result =k40_blank+k40_txt;//���� ������ �տ� �־��� 
		return k40_result;
	}
	//2. �Էµ� �ѱۿ� �ڿ� ������ ������ 15���� �����
	static String HanBlankBackword(String k40_txt, int k40_textsize) {
		byte[] k40_tmp = k40_txt.getBytes(); //String�� �ؽ�Ʈ�� byte�� ��ȯ�� ���� �迭�� �ְ�
		int k40_countKor =0; //�ѱ�� �� ���� ����
		int k40_countElse =0; //�׿� ����, ��ȣ ���� �� ���� ����
		for (int k40_i=0; k40_i<k40_tmp.length; k40_i++) {
			if(k40_tmp[k40_i] <0) { //���� ����Ʈ ���� ������� �ѱ���
				k40_countKor++;
			}else {
				k40_countElse++;//�ƴ϶�� ��ȣ �Ǵ� ����
			}
		}
		int k40_blanksize = k40_textsize -k40_countKor -k40_countElse; 
		String k40_blank="";
		for (int i =0; i<k40_blanksize; i++) {
			k40_blank = k40_blank.concat(" ");
		}
		String k40_result =k40_txt+k40_blank; //���� ������ �ڿ� �־���
		return k40_result;
	}
	//3.�Էµ� �ѱ��� �� ����Ʈ ���� ����ϴ� �޼ҵ�
	static int HanCount(String k40_txt) {
		byte[] k40_tmp = k40_txt.getBytes(); //String�� �ؽ�Ʈ�� byte�� ��ȯ�� ���� �迭�� �ְ�
		int k40_countKor =0; //�ѱ�� �� ���� ����
		int k40_countElse =0; //�׿� ����, ��ȣ ���� �� ���� ����
		for (int k40_i=0; k40_i<k40_tmp.length; k40_i++) {
			if(k40_tmp[k40_i] <0) { //���� ����Ʈ ���� ������� �ѱ���
				k40_countKor++;
			}else {
				k40_countElse++; //�ƴ϶�� ��ȣ �Ǵ� ����
			}
		}

		return k40_countKor/2;//�ѱ��� 2bytes���̴ϱ�
	}
}
