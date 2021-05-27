package K40_FileWriter01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//1. �����ϰ� �а� ���� (FileWriter �� FileReader�� �̿��ؼ� ���� �а� ����)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File K40_file = new File("C:\\Users\\�ֽ�\\Desktop\\test.txt"); //(1)File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
			FileWriter K40_fw = new FileWriter(K40_file); //(2)FileWriterŬ�������� ������Ʈ �ҷ����� (�ڹ� ������ ������ �����ϱ� ����)
			
			K40_fw.write("�ȳ� ����\n");  //ù��° ������ ����
			K40_fw.write("hello ���\n"); //�ι�° ������ ����
			K40_fw.close(); //�ݱ� 
			
			FileReader fr = new FileReader(K40_file); //(3) FileReaderŬ�������� ������Ʈ �ҷ����� (�ܺο��� ������ �о���� ����)
			
			int K40_n = -1; //**�������� ǥ��**
			char[] K40_ch ; //���ڸ� ������� �迭����
			while(true) { //(4) while�ݺ��� (���ѹݺ�)
				K40_ch = new char[100]; //����100���� ��� ���� �迭�� ����
				K40_n = fr.read(K40_ch);  //**�������� ǥ��** (-1�ڸ��� �о�� ���ڿ��� ��)
				
				if (K40_n == -1) break; //n�� -1�� ��� �ݺ��� Ż�� (��, 1���� ����)
				
				for (int i = 0; i < K40_n; i++ ) {   //**�������� ǥ��** (���ڿ��� ���̸�ŭ ���)
					System.out.printf("%c",K40_ch[i]);  
				}
			}

			fr.close();
			System.out.printf("\nFILE READ END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.printf("�� ���� [%s]\n",e);
		}
	}//main
}//class
