package k40_MethodOverloading_07;
/*
 * 7.�޼ҵ� �����ε� 
 * -> �޼ҵ� �����ε��̶�, �Ķ������ ������������ ������ �ٸ��� ���� �̸��� �޼ҵ带 ��� ������ ���� ����. 
 */
public class TestMain2 {
	public static void main(String[] args) {
		// TODO Auto generated method stub 
		Calc1 k40_cc= new Calc1();
		System.out.printf("2�� ������ ȣ��� [%d]\n",k40_cc.sum(1,2)); //�Ķ���� int a, int b
		System.out.printf("3�� ������ ȣ��� [%d]\n",k40_cc.sum(1,2,3)); //�Ķ���� int a, int b,  int c
		System.out.printf("4�� ������ ȣ��� [%d]\n",k40_cc.sum(1,2,3,4)); //�Ķ���� int a,int b, int c, int d
		System.out.printf("������ ������ ȣ���[%f]\n",k40_cc.sum(1.2,3.4)); //�Ķ���� double a, double b

	}
}

class Calc1 { 
	public int sum(int k40_a, int k40_b){
		return k40_a+k40_b;
	}
	public int sum(int k40_a, int k40_b, int k40_c){
		return k40_a+k40_b+k40_c;
	}
	public int sum(int k40_a, int k40_b, int k40_c, int k40_d) {
		return k40_a+k40_b+k40_c+k40_d;
	}
	public double sum(double k40_a, double k40_b){
		return k40_a+k40_b;
	}

}

/** ���� sum�� �Ʒ� sum�� ���� ���� �� �� ����
 * �ֳĸ� �޴� �Ű������� �Ȱ��Ƽ� ������ �� ���� ����
 */

