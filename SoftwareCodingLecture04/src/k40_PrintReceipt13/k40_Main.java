package k40_PrintReceipt13;
//13.ĭ ���߱� �ǽ�
import java.text.DecimalFormat;
import java.util.Scanner;

public class k40_Main {

	public static void main (String[] args) {
		
		String k40_item = "���"; //ǰ�� 
		int k40_unit_price = 5000; //�ܰ�
		int k40_num = 500; //����
		int k40_total = 0; //�� �հ�
		
		//DecimalFormat Ŭ�������� �ҷ��� ������Ʈ �����, �̹����� 3�ڸ��� �ϳ��� �޸��� ���� ����
		DecimalFormat df = new DecimalFormat("###, ###, ###, ###, ###");
		
		/// �ش� ��� (������ �ڸ�Ʈ : �Ϲ����� ����Ʈ�� ��� �μ� �� ������ �μ�)
		System.out.printf("=====================================================\n"); 
		//***ĭ���߱� �ٽ� '���� �ڸ����� �����ϴ� ���'***//
		//%10.10s (����) %8.8s (�ִ�8����) 3�� �ݺ� �� ����, "ǰ��"(ù��°s�ڸ�),"�ܰ�"(�ι�° s�ڸ�)...
		System.out.printf("%10.10s %8.8s %8.8s %8.8s\n", "ǰ��", "�ܰ�", "����", "�հ� ");
		System.out.printf("=====================================================\n");
		// ����� 
		//%10.10s(����) %14.14 (�ϴ� �⺻������ 5�ڸ�(5,000)�� �־�� �ϰ� ����8ĭ�� ����� 13�� �Ȱ�)
		//%9.9(���������� 3�ڸ��� ���� 6ĭ, ���� �������� //
		System.out.printf("%10.10s %13.13s %9.9s %10.10s\n",
				k40_item, df.format(k40_unit_price), df.format(k40_num), df.format (k40_unit_price*k40_num));
		System.out.printf("======================================================\n");

	}
}
	

