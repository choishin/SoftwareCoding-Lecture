package K40_BufferedReaderWriter01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//2.Buffered �а� ����
public class K40_FileReadWrite {

	public static void K40_FileWrite () throws IOException {
		// TODO Auto-generated method stub
		
		File K40_file = new File("C:\\Users\\�ֽ�\\Desktop\\HelloWorld.txt"); //1-(1)File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
		BufferedWriter K40_bw = new BufferedWriter( new FileWriter(K40_file)); // 1-(2)BufferedWriterŬ�������� ������Ʈ �ҷ����� (�ڹ� ������ ������ �����ϱ� ����)
		
		K40_bw.write("�ȳ� ����"); //����
		K40_bw.newLine(); //����
		K40_bw.write("Hello File"); //����2
		K40_bw.newLine(); //����
		K40_bw.append("�̰� ���ο� ����"); //����3
		K40_bw.close(); //������ �� �����ٸ� ���ҽ� �ݱ�
	}
	
	public static void K40_FileRead() throws IOException {
	
	File K40_file = new File("C:\\Users\\�ֽ�\\Desktop\\HelloWorld.txt"); //2-(1)File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
	BufferedReader K40_br = new BufferedReader (new FileReader(K40_file)); //2-(2) FileReaderŬ�������� ������Ʈ �ҷ����� (�ܺο��� ������ �о���� ����)
	String readtxt; //������ �о�� ������ ���ڿ��� ����� ���� ���� 
	
	while((readtxt = K40_br.readLine()) != null) { //2-(3) while�ݺ��� (������ ����(null) �ʴٸ�(!=) ��, ������ �ִٸ�,  ���پ� �о String readtxt�� ��ƶ�)
		System.out.printf("%s\n",readtxt); // ���๮ : ��ƿ� ������ ����ض�
		
	}
	
	K40_br.close(); //���ҽ� �ݱ�
	
	}
	
	public static void main (String[] args) throws IOException {
		
		K40_FileWrite(); //(1)Buffered Writer�� ���� �޼ҵ� ȣ��
		K40_FileRead(); //(2)Buffered Reader�� �д� �޼ҵ� ȣ��
	}


}
