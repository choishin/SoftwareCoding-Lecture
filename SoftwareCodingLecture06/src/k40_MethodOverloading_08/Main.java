package k40_MethodOverloading_08;
/*
 * 8.메소드 오버로딩
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto generated method stub 
		ScoreCal k40_sc= new ScoreCal(); //ScoreCal  클래스를 호출해서 오브젝트 생성
		k40_sc.ave(100, 100, 100);
		k40_sc.ave(100, 100, 100,100);
		k40_sc.ave(100, 100, 100,100,100);

	}
}

class ScoreCal { 

	public int sum(int k40_, int k40_eng, int k40_math){
		return k40_+k40_eng+k40_math;
	}
	public void ave(int k40_kor, int k40_eng, int k40_math){
		int k40_sum = sum(k40_kor,k40_eng,k40_math);
		double k40_avg = (k40_kor+k40_eng+k40_math)/3;
		System.out.printf("%d월 성적표\n",3);
		System.out.println("=============================================================");		
		System.out.printf("%s%6.2s%7.2s%7.2s%7.2s%6.2s\n","이름","국어","영어","수학","총점","평균");
		System.out.println("=============================================================");
		System.out.printf("%s%6d%8d%8d%8d%9.1f\n","폴리융",k40_kor,k40_eng,k40_math,k40_sum,k40_avg);
	}
	public int  sum (int k40_kor, int k40_eng, int k40_math, int k40_sci){		
		return  k40_kor+k40_eng+k40_math+k40_sci;
	}
	public void ave (int k40_kor, int k40_eng, int k40_math, int k40_sci){		
		int k40_sum= sum(k40_kor,k40_eng,k40_math,k40_sci);
		double k40_avg = (k40_kor+k40_eng+k40_math+k40_sci)/4;
		System.out.println();
		System.out.printf("%d월 성적표\n",4);
		System.out.println("=============================================================");	
		System.out.printf("%s%6.2s%7.2s%7.2s%7.2s%7.2s%6.2s\n","이름","국어","영어","수학","과학","총점","평균");
		System.out.println("=============================================================");
		System.out.printf("%s%6d%8d%8d%8d%8d%9.1f\n","폴리융",k40_kor,k40_eng,k40_math,k40_sci,k40_sum,k40_avg);
	}
	public int sum (int k40_kor, int k40_eng, int k40_math, int k40_sci, int k40_soc) {
		return k40_kor+k40_eng+k40_math+k40_sci+k40_soc;

	}	
	public void ave (int k40_kor, int k40_eng, int k40_math, int k40_sci, int k40_soc) {
		int k40_sum = sum(k40_kor,k40_eng,k40_math,k40_sci,k40_soc);
		double k40_avg = (k40_kor+k40_eng+k40_math+k40_sci+k40_soc)/5;
		System.out.println();
		System.out.printf("%d월 성적표\n",5);
		System.out.println("=============================================================");
		System.out.printf("%s%6s%7.2s%7.2s%7.2s%7.2s%6.2s%6.2s\n","이름","국어","영어","수학","과학","사회","총점","평균");
		System.out.println("=============================================================");
		System.out.printf("%s%6d%8d%8d%8d%8d%8d%9.1"
				+ "f\n","폴리융",k40_kor,k40_eng,k40_math,k40_sci,k40_soc,k40_sum,k40_avg);
	}

}

/* 위의 sum과 아래 sum은 같이 정의 할 수 없다
 * 왜냐면 받는 매개변수가 똑같아서 구별할 수 없기 때문
 */

