package k40_VariablesAndMethod01_01;
/*
 * 1. ������ �޼ҵ�(1)
 */
public class MethodTest { 

	public static void iamMethod(){ 
		System.out.printf("�޼ҵ�� �ҷ����\n");

	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			MethodTest. iamMethod(); //�޼ҵ带 ȣ���ϴ� ���: Ŭ������.�޼ҵ��(); <- ���� �ٸ� Ŭ������ �޼ҵ带 �θ��� ��� �̷��� ��
			iamMethod(); //���� Ŭ�������� �ٸ� �޼ҵ带 �θ���: �޼ҵ��();
	}

}
