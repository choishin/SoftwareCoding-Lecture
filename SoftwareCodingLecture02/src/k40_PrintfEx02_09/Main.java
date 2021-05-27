package k40_PrintfEx02_09;
/*
 * 9.float, double ����
 * %f : double,float ���� �Ҽ��� ǥ��
 * %e : double, float ���� ������ ǥ��
 * %g : ���ڰ��� ũ�⿡ ���� f�� e�� ��� (���ڰ��� ���밪�� 0.0001���� ���� ��� e������ ���Ǿ���)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k40_url = "www.codechobo.com";
		float k40_f1 = .10f; //0.1�� f(�Ҽ�)�� ǥ��
		float k40_f2 = 1e1f; //1���� e�� �ְ�, 1�� f(�Ҽ�)�� ǥ��
		float k40_f3 = 3.14e3f; //3���� e�� �ְ�, 3.14�� f(�Ҽ�)�� ǥ��
		double k40_d = 1.23456789; 
		System.out.printf("f1=%f, %e, %g%n", k40_f1, k40_f1, k40_f1); // %f :�Ҽ���ǥ��  %e : ������ ǥ��  %g :  (���ڰ��� ���밪�� 0.0001���� ���� ��� e������ ���Ǿ���)
		System.out.printf("f2=%f, %e, %g%n", k40_f2, k40_f2, k40_f2); //%f :  %e : %g :
		System.out.printf("f3=%f, %e, %g%n", k40_f3, k40_f3, k40_f3); //%f :  %e : %g :
		
		System.out.printf("d=%f%n", k40_d); //%f : double�� ����ϰڴ�
		System.out.printf("d=%14.10f%n", k40_d); //14�ڸ��� �����ϰ� 10�ڸ� ��ŭ ����ϰڴ�(�������� ����)
		System.out.printf("[12345678901234567890]%n");  //[12345678901234567890]�����  %n : ����
		System.out.printf("[%s] %n", k40_url);  //%s : ���ڿ��� ����ϰڴ�
		System.out.printf("%20s ] %n", k40_url); //%20s : �����ʺ��� ������ ���ڿ��� 20�ڸ� ��ŭ ����ϰڴ�
		System.out.printf("[%-20s] %n", k40_url); // %-20s : ���ʺ��� ������ ���ڿ��� 20�ڸ� ��ŭ ����ϰڴ�
		System.out.printf("[%.8s] %n", k40_url); //%.s : ���ڿ��� 8�ڸ� ��ŭ ����ϰڴ�.
	}

}
