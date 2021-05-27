package K40_StockProject03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
//4.�ֽ����� �����ϱ� (������ �ǽ�3.�Ｚ������ �ְ��� ���Ͽ� 2015�� �ִ밪�� �ּҰ��� ���Ͻÿ�(��������))
public class  Main3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1-(1).File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
		File K40_file = new File("C:\\Users\\�ֽ�\\Desktop\\day_data\\A005930_minmax.csv");
		//1-(2).BufferedReaderŬ�������� ������Ʈ �ҷ����� (�ܺο��� ������ �о���� ����
		BufferedReader K40_br = new BufferedReader (new FileReader(K40_file));
		//������ �о�� ������ ���ڿ��� ����� ���� ���� 
		String K40_readtxt;
		
		if ((K40_readtxt = K40_br.readLine()) == null) { //(3) if ���ǹ� : ���� ������ ���ٸ� 
			System.out.printf("�� ���� �Դϴ�\n");  //���๮ : "������ �Դϴ�"�� ����ض�
			return;
		}
		
		int K40_LineCnt = 0; //����Ƚ���� ������ ���� ���� , �ʱ�ȭ
		int K40_min = Integer.MAX_VALUE ; //�ּҰ��� ����� ���� ����, �ʱ�ȭ
		int K40_max = Integer.MIN_VALUE; //�ִ밪�� ����� ���� ����, �ʱ�ȭ
		String K40_temp1date = "",K40_temp2date = ""; //��¥
		String K40_temp1min = "",K40_temp2min = ""; //��¥
		String K40_temp1max = "",K40_temp2max = ""; //��¥
		while((K40_readtxt = K40_br.readLine()) != null) {
			String[] K40_field = K40_readtxt.split(",");
			//field[2] : �����ڵ� field[1]: ��¥, field[3]:�ֽ�����
			System.out.printf("***********************************************\n");
			System.out.printf("�����ڵ� [%s]  ��¥ : %s : ���� :  %s\n",K40_field[2],K40_field[1],K40_field[3]);
			System.out.printf("***********************************************\n");
			
			if (K40_min > Integer.parseInt( K40_field[3])) { //�ֽ������� Integer������ �ٲ���, �ּҰ� ���ϱ�
				K40_min =Integer.parseInt( K40_field[3]);
				K40_temp1date = K40_field[1]; //��¥

			}
			
			if (K40_max < Integer.parseInt( K40_field[3])) {  //�ֽ������� Integer������ �ٲ���, �ִ밪 ���ϱ�
				K40_max =Integer.parseInt( K40_field[3]);
				K40_temp2date = K40_field[1]; //��¥

			}
			
			K40_LineCnt++; //��� �۾��� ���� �� ���� �ø���
		}
		System.out.printf("***************[�� ó��Ƚ�� %s��]****************\n",K40_LineCnt-1); //���������� �� 1�� �÷��� ����ϱ� ������ -1
		System.out.printf("���� �ڵ� [A005930], [�Ｚ����]\n2015�� ���� ���� : %d\n��¥ :  %s\n",
				K40_min,K40_temp1date); 
		System.out.printf("***********************************************\n");
		System.out.printf("���� �ڵ� [A005930], [�Ｚ����]\n2015�� �ְ� ���� : %d\n��¥ :  %s\n",
				K40_max,K40_temp2date);
		System.out.printf("***********************************************\n");
		
		K40_br.close();

	}//main

	}//class


