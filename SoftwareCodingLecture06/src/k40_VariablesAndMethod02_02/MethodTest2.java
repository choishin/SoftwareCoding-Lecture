package k40_VariablesAndMethod02_02;
/*
 * 2.������ �޼ҵ�(2)
 */
public class MethodTest2 {
		static int k40_iStatic; //<-(1)���� Ŭ���� �������� ��� ����� �� �ֵ��� �ϱ� ���� '���� ����'�� ���� 
								//(���ڴ� ���������� ������ �帧)
		
		public static void add(int k40_i) {  //add(iMain -> int i)
			k40_iStatic++; //(5)iStatic = 1++ =2;
			System.out.printf("add�޼ҵ忡��->iStatic-[%d]\n", k40_iStatic); //(6)iStatic =2;
			System.out.printf("add�޼ҵ忡��->i=[%d] \n", k40_i); // iMain-> i =1
		}
			public static int add2(int k40_i) {//add2(iMain->int i)
			k40_iStatic++; //(9)iStatic = 2++ =3;
			System.out.printf("add�޼ҵ忡�� ->iStatic=[%d]\n", k40_iStatic);//iStatic = 3;
			System.out.printf("add�޼ҵ忡��->i=[%d]\n", k40_i); //iMain->i =1;
				return k40_i; //i = 1;
			}
			public static void main(String[] args) { //<-(2)��� �Լ��� �� ������� ȣ��Ǵ� main �Լ� 
			// TODO Auto-generated method stub
			int k40_iMain; //<-�޼ҵ� ������ ���Ǵ� '��������'�� ���� 
			k40_iMain=1; //iMain = 1�� ����
			k40_iStatic=1; //(3)���� iStatic = 1 �� ����
			System.out.printf("**********************************\n"); 
			System.out.printf("�޼ҵ� ȣ���� ���ο���->iStatic=[%d]\n", k40_iStatic); //iStatic = 1
			System.out.printf("�޼ҵ� ȣ���� ���ο���->iMain=[%d]\n", k40_iMain); //iMain =1
			System.out.printf("**********************************\n");
			add (k40_iMain); //(4)add�Լ� ȣ�� (iMain���� �־���)
			System.out.printf("***********************************\n"); 
			System.out.printf("�޼ҵ� ȣ�� �� ���ο���->iStatic=[%d]\n", k40_iStatic); //(7)iStatic =2
			System.out.printf("�޼ҵ� ȣ�� �� ���ο���->iMain=[%d]\n", k40_iMain); //iMain�� ���������̱� ������ �״�� 1
			System.out.printf("**********************************\n");
			k40_iMain=add2(k40_iMain); //(8)add2�� ȣ���� (iMain���� �ְ�), return���� iMain�� �޾ƿ��� (->1)
			System.out.printf("*********************************\n"); 
			System.out.printf("�޼ҵ� add2ȣ�� �� ���ο���->iStatic=[%d]\n", k40_iStatic);//(10)iStatic =3; 
			System.out.printf("�޼ҵ� add2ȣ�� �� ���ο��� ->iMain=[%d]\n", k40_iMain); //iMain = 1;
			System.out.printf("*********************************\n");
	}
}
