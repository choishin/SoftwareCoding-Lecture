package k40_ScannerEx_07;

import java.util.Scanner;
/*
 * 7. Scanner Ŭ���� �̿��ϱ� 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k40_scanner = new Scanner (System.in); //Scanner Ŭ�������� ������Ʈ �ҷ����� 
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>"); 
		String k40_input = k40_scanner.nextLine(); //���ڿ� �Է¹ޱ�
		int k40_num = Integer.parseInt(k40_input); //���� �Է¹ޱ�
		System.out.println("�Է³��� :"+k40_input); //�Է¹��� ���ڿ� ����ϱ�
		System.out.printf("num = %d%n", k40_num); //�Է¹��� ���� ����ϱ�

	}

}