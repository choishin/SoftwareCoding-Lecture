package k40_ClassArray_08;
/*
 * 8.Ŭ������ �迭 
 */
public class OneRec1 { 
	
	private String k40_name ; 
	private int k40_kor;
	private int k40_eng ;
	private int k40_mat ;


	OneRec1(String k40_name, int k40_kor, int k40_eng, int k40_mat) { //������ : ������ �޾ƿ�
	
		this.k40_name = k40_name;
		this.k40_kor = k40_kor;
		this.k40_eng = k40_eng;
		this.k40_mat = k40_mat;
	}
	
	public String name() {return this.k40_name;};   //**<-�޾ƿ� ���� return�ϴ� ���� �� �޼ҵ�
	public int kor() {return this.k40_kor;};		//**<-�޾ƿ� ���� return�ϴ� ���� �� �޼ҵ�
	public int eng() {return this.k40_eng;};		//**<-�޾ƿ� ���� return�ϴ� ���� �� �޼ҵ�
	public int mat() {return this.k40_mat;};		//**<-�޾ƿ� ���� return�ϴ� ���� �� �޼ҵ�
	public int sum() {return this.k40_kor+this.k40_eng+this.k40_mat;}; //**<-�հ� �޼ҵ�
	public double ave() {return this.sum()/3.0;};		    //**<-��� �޼ҵ�



}
