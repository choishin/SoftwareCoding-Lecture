package k40_MethodOverloading_08;
/*
 * 8.�޼ҵ� �����ε�
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto generated method stub 
		ScoreCal k40_sc= new ScoreCal(); //ScoreCal  Ŭ������ ȣ���ؼ� ������Ʈ ����
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
		System.out.printf("%d�� ����ǥ\n",3);
		System.out.println("=============================================================");		
		System.out.printf("%s%6.2s%7.2s%7.2s%7.2s%6.2s\n","�̸�","����","����","����","����","���");
		System.out.println("=============================================================");
		System.out.printf("%s%6d%8d%8d%8d%9.1f\n","������",k40_kor,k40_eng,k40_math,k40_sum,k40_avg);
	}
	public int  sum (int k40_kor, int k40_eng, int k40_math, int k40_sci){		
		return  k40_kor+k40_eng+k40_math+k40_sci;
	}
	public void ave (int k40_kor, int k40_eng, int k40_math, int k40_sci){		
		int k40_sum= sum(k40_kor,k40_eng,k40_math,k40_sci);
		double k40_avg = (k40_kor+k40_eng+k40_math+k40_sci)/4;
		System.out.println();
		System.out.printf("%d�� ����ǥ\n",4);
		System.out.println("=============================================================");	
		System.out.printf("%s%6.2s%7.2s%7.2s%7.2s%7.2s%6.2s\n","�̸�","����","����","����","����","����","���");
		System.out.println("=============================================================");
		System.out.printf("%s%6d%8d%8d%8d%8d%9.1f\n","������",k40_kor,k40_eng,k40_math,k40_sci,k40_sum,k40_avg);
	}
	public int sum (int k40_kor, int k40_eng, int k40_math, int k40_sci, int k40_soc) {
		return k40_kor+k40_eng+k40_math+k40_sci+k40_soc;

	}	
	public void ave (int k40_kor, int k40_eng, int k40_math, int k40_sci, int k40_soc) {
		int k40_sum = sum(k40_kor,k40_eng,k40_math,k40_sci,k40_soc);
		double k40_avg = (k40_kor+k40_eng+k40_math+k40_sci+k40_soc)/5;
		System.out.println();
		System.out.printf("%d�� ����ǥ\n",5);
		System.out.println("=============================================================");
		System.out.printf("%s%6s%7.2s%7.2s%7.2s%7.2s%6.2s%6.2s\n","�̸�","����","����","����","����","��ȸ","����","���");
		System.out.println("=============================================================");
		System.out.printf("%s%6d%8d%8d%8d%8d%8d%9.1"
				+ "f\n","������",k40_kor,k40_eng,k40_math,k40_sci,k40_soc,k40_sum,k40_avg);
	}

}

/* ���� sum�� �Ʒ� sum�� ���� ���� �� �� ����
 * �ֳĸ� �޴� �Ű������� �Ȱ��Ƽ� ������ �� ���� ����
 */

