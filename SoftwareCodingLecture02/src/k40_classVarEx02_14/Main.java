package k40_classVarEx02_14;
/*
 * 14.int,double,float ����ȯ 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_i = 91234567; 
		float k40_f = (float)k40_i; //int�� float���� ����ȯ
		int k40_i2 = (int) k40_f; //float�� int�� ����ȯ

		double k40_d = (double)k40_i; //int�� double�� ����ȯ
		int k40_i3 = (int) k40_d; //double�� int�� ����ȯ
		
		float k40_f2 = 1.666f; 
		int k40_i4 = (int) k40_f2; //float�� int�� ����ȯ
		
		System.out.printf("i=%d\n", k40_i); //int i = 91234567; 
		System.out.printf("f=%f i2=%d\n", k40_f, k40_i2); //float f = (float) 91234567//i2 = (double) 9123456'8' <- **�Ҽ��� ���ϰ� �ø� ó�� �Ǿ���**
		System.out.printf("d=%f i3=%d\n", k40_d, k40_i3); // double k40_d =(double)91234567// k40_i3 = (int) 91234567<-���� double
		System.out.printf("(int) %f=%d\n", k40_f2, k40_i4); //float k40_f2 = 1.666f; //k40_i4 = (int) 1 <-���� float 1.666f

	}

}
