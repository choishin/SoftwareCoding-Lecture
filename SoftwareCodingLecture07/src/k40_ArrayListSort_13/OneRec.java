package k40_ArrayListSort_13;

public class OneRec {
	
		private int studentId;
		private String name ;
		private int kor;
		private int eng ;
		private int mat ;


		OneRec(int studentId, String name, int kor, int eng, int mat) {
			this.studentId = studentId;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
		
		public int studentId() {return this.studentId;};
		public String name() {return this.name;};
		public int kor() {return this.kor;};
		public int eng() {return this.eng;};
		public int mat() {return this.mat;};
		public int sum() {return this.kor+this.eng+this.mat;};
		public double ave() {return this.sum()/3.0;};



}
