package K40_FreeWifi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class K40_Main {

	public static void K40_FileRead() throws IOException {
		
		//(1)File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
		File K40_file = new File("C:\\Users\\�ֽ�\\Desktop\\12_04_07_E_���������������(����).txt");
		//(2) BufferedReaderŬ�������� ������Ʈ �ҷ����� (�ܺο��� ������ �о���� ����)
		BufferedReader K40_br = new BufferedReader (new FileReader(K40_file));
		 //������ �о�� ������ ���ڿ��� ����� ���� ���� 
		String K40_readtxt;
		
		if ((K40_readtxt = K40_br.readLine()) == null) { //(3) if ���ǹ� : ���� ������ ���ٸ� 
			System.out.printf("�� ���� �Դϴ�\n"); //���๮ : "������ �Դϴ�"�� ����ض�
			return; //������ ������
		}
		
		String[] K40_field_name = K40_readtxt.split("\t");  //(1�ٸ�)������ �о�ͼ� ������ �����ض� (ù���� �ʵ��̸�)
		int K40_LineCnt = 1; //����Ƚ���� ������ ���� ���� , �ʱ�ȭ
		while((K40_readtxt = K40_br.readLine()) != null) { //(3) while�ݺ��� (������ ����(null) �ʴٸ�(!=) ��, ������ �ִٸ�,  ���پ� �о String readtxt�� ��ƶ�)
			String[] K40_field = K40_readtxt.split("\t"); //���پ� ��ƿ� ������ ������ ������ �迭�� field��� �迭�� �ֱ� 
			
			/**�ʵ�� ������**
			 * field[0]: ��ȣ, field[1]:��ġ��Ҹ�,field[2]:��ġ��һ�, filed[3]:��ġ�õ��� ,filed[4]:��ġ�ñ���, field[5]:��ġ�ü���
			 *filed[6]: �����������,  filed[7]:��������SSID, filed[8]:��ġ����, filed[9]:���������θ��ּ�, filed[10]:���������ּ�
			 * filed[11]:���������,  filed[12]:���������ȭ��ȣ, filed[13]:����, filed[14]:�浵, filed[15]:�����ͱ�������
			 */
			
			//�����
			System.out.printf("*************[%d��° �׸�]***************\n",K40_LineCnt); //Ƚ����� ('LineCnt��° �ڷ�')
			/*
			 * System.out.printf(" %s : %s\n", K40_field_name[1],K40_field[1]);
			 * System.out.printf(" %s : %s\n", K40_field_name[2],K40_field[2]);
			 * System.out.printf(" %s : %s\n", K40_field_name[3],K40_field[3]);
			 * System.out.printf(" %s : %s\n", K40_field_name[4],K40_field[4]);
			 * System.out.printf(" %s : %s\n", K40_field_name[5],K40_field[5]);
			 * System.out.printf(" %s : %s\n", K40_field_name[6],K40_field[6]);
			 * System.out.printf(" %s : %s\n", K40_field_name[7],K40_field[7]);
			 * System.out.printf(" %s : %s\n", K40_field_name[8],K40_field[8]);
			 * System.out.printf(" %s : %s\n", K40_field_name[9],K40_field[9]);
			 * System.out.printf(" %s : %s\n", K40_field_name[10],K40_field[10]);
			 * System.out.printf(" %s : %s\n", K40_field_name[11],K40_field[11]);
			 */
			System.out.printf(" %s : %s\n", K40_field_name[12],K40_field[12]); 
			/*
			 * System.out.printf(" %s : %s\n", K40_field_name[13],K40_field[13]);
			 * System.out.printf(" %s : %s\n", K40_field_name[14],K40_field[14]);
			 * System.out.printf(" %s : %s\n", K40_field_name[15],K40_field[15]);
			 */
			System.out.printf("***************************************\n");
			K40_LineCnt++;

		}
				
		K40_br.close(); //���ҽ� �ݱ�

	}//FileRead

	public static void main (String[] args) throws IOException {

		K40_FileRead(); //BufferedReader�� ���� �о���� �޼ҵ带 ȣ��
	}//main

}//class
