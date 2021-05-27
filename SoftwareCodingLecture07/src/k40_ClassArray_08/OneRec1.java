package k40_ClassArray_08;
/*
 * 8.클래스의 배열 
 */
public class OneRec1 { 
	
	private String k40_name ; 
	private int k40_kor;
	private int k40_eng ;
	private int k40_mat ;


	OneRec1(String k40_name, int k40_kor, int k40_eng, int k40_mat) { //생성자 : 값들을 받아옴
	
		this.k40_name = k40_name;
		this.k40_kor = k40_kor;
		this.k40_eng = k40_eng;
		this.k40_mat = k40_mat;
	}
	
	public String name() {return this.k40_name;};   //**<-받아온 값을 return하는 것이 각 메소드
	public int kor() {return this.k40_kor;};		//**<-받아온 값을 return하는 것이 각 메소드
	public int eng() {return this.k40_eng;};		//**<-받아온 값을 return하는 것이 각 메소드
	public int mat() {return this.k40_mat;};		//**<-받아온 값을 return하는 것이 각 메소드
	public int sum() {return this.k40_kor+this.k40_eng+this.k40_mat;}; //**<-합계 메소드
	public double ave() {return this.sum()/3.0;};		    //**<-평균 메소드



}
