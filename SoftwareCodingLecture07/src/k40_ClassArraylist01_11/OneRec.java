package k40_ClassArraylist01_11;
/*
 * 11. 클래스의 ArrayList
 * 애먹었던 부분 : 다른 패키지에 OneRec이라는 똑같은 이름의 클래스가 있어서, 새로 추가한 데이터를 인식을 못했음.
 * 해결한 방법 : 이름을 바꾸면 됨. (다른 패키지라도 클래스 끼리는 이름이 같아선 안 됨)
 */
public class OneRec {
	
	private int k40_studentId;
	private String k40_name ;
	private int k40_kor;
	private int k40_eng ;
	private int k40_mat ;

	OneRec(int k40_studentId, String k40_name, int k40_kor, int k40_eng, int k40_mat) {
		this.k40_studentId = k40_studentId; //<-학번이 추가 됨 
		this.k40_name = k40_name;
		this.k40_kor = k40_kor;
		this.k40_eng = k40_eng;
		this.k40_mat = k40_mat;
	}
	 
	public int studentId() {return this.k40_studentId;}; //<-학번이 추가 됨
	public String name() {return this.k40_name;};
	public int kor() {return this.k40_kor;};
	public int eng() {return this.k40_eng;};
	public int mat() {return this.k40_mat;};
	public int sum() {return this.k40_kor+this.k40_eng+this.k40_mat;};
	public double ave() {return this.sum()/3.0;};



}
