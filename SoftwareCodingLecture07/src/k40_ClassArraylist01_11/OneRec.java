package k40_ClassArraylist01_11;
/*
 * 11. Ŭ������ ArrayList
 * �ָԾ��� �κ� : �ٸ� ��Ű���� OneRec�̶�� �Ȱ��� �̸��� Ŭ������ �־, ���� �߰��� �����͸� �ν��� ������.
 * �ذ��� ��� : �̸��� �ٲٸ� ��. (�ٸ� ��Ű���� Ŭ���� ������ �̸��� ���Ƽ� �� ��)
 */
public class OneRec {
	
	private int k40_studentId;
	private String k40_name ;
	private int k40_kor;
	private int k40_eng ;
	private int k40_mat ;

	OneRec(int k40_studentId, String k40_name, int k40_kor, int k40_eng, int k40_mat) {
		this.k40_studentId = k40_studentId; //<-�й��� �߰� �� 
		this.k40_name = k40_name;
		this.k40_kor = k40_kor;
		this.k40_eng = k40_eng;
		this.k40_mat = k40_mat;
	}
	 
	public int studentId() {return this.k40_studentId;}; //<-�й��� �߰� ��
	public String name() {return this.k40_name;};
	public int kor() {return this.k40_kor;};
	public int eng() {return this.k40_eng;};
	public int mat() {return this.k40_mat;};
	public int sum() {return this.k40_kor+this.k40_eng+this.k40_mat;};
	public double ave() {return this.sum()/3.0;};



}
