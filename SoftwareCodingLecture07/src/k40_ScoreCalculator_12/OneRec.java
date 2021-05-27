package k40_ScoreCalculator_12;

public class OneRec {
	private int k40_student_id;
	private String k40_name ;
	private int k40_kor;
	private int k40_eng ;
	private int k40_mat ;
	
	static Main main = new Main();

	public OneRec(int k40_student_id, String k40_name, int k40_kor, int k40_eng, int k40_mat) {

		this.k40_student_id = k40_student_id;
		this.k40_name = k40_name;
		this.k40_kor = k40_kor;
		this.k40_eng = k40_eng;
		this.k40_mat = k40_mat;
	}
	
	public int student_id() {return this.k40_student_id;};
	public String name() {return this.k40_name;};
	public int kor() {return this.k40_kor;};
	public int eng() {return this.k40_eng;};
	public int mat() {return this.k40_mat;};
	public int sum() {return this.k40_kor+this.k40_eng+this.k40_mat;};
	public double ave() {return this.sum()/3.0;};


}
