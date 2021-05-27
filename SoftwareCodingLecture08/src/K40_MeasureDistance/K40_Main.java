package K40_MeasureDistance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
//3.�Ÿ���� ('��������������� ǥ�ص�����.csv ������ �̿��� �д����ձ������������ ���� ����� ���� �հ� ����ϱ�)
public class K40_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//(1)File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
		File K40_file = new File("C:\\Users\\�ֽ�\\Desktop\\12_04_07_E_���������������(����).txt");
		//(2) BufferedReaderŬ�������� ������Ʈ �ҷ����� (�ܺο��� ������ �о���� ����)
		BufferedReader K40_br = new BufferedReader (new FileReader (K40_file));
		 //������ �о�� ������ ���ڿ��� ����� ���� ���� 
		String K40_readtxt;

		if((K40_readtxt= K40_br.readLine()) == null){//(3) if ���ǹ� : ���� ������ ���ٸ� 
			System.out.printf(" �� �����Դϴ�.Wn");  //���๮ : "������ �Դϴ�"�� ����ض�
			return; //������ ������
		}//if

		String[] K40_field_name= K40_readtxt.split("\t");  //(1�ٸ�)������ �о�ͼ� ������ �����ض� (ù���� �ʵ��̸�)
		//***���ձ������ �츮�� �����浵, �������� �˾ƺ��� 
		//double  lat = 37.38639282318312; //�츮�� ����
		//double lng = 127.12625095535718; //�츮�� �浵
		double lat = 37.3860521; //���������
		double Ing = 127.1214038; //������浵
		
		int K40_LineCnt = 1; //����Ƚ���� ������ ���� ���� , �ʱ�ȭ
		double K40_min = Double.MAX_VALUE; //�ּҰ��� ����� ���� ����, �ʱ�ȭ
		double K40_max = Double.MIN_VALUE; //�ִ밪�� ����� ���� ����, �ʱ�ȭ

		String K40_temp1name ="", K40_temp2name ="";  //���尡���Ÿ��� �հŸ��� �̸��� �־��� ���� ����, �ʱ�ȭ
		String K40_temp1address ="", K40_temp2address ="";   //���尡���Ÿ��� �հŸ��� �ּҸ� �־��� ���� ����, �ʱ�ȭ
		String K40_temp1lat = "", K40_temp1lng = "";  //�����浵
		String K40_temp2lat = "", K40_temp2lng = ""; //�����浵
		while((K40_readtxt= K40_br.readLine()) !=null){ //(3) while�ݺ��� (������ ����(null) �ʴٸ�(!=) ��, ������ �ִٸ�,  ���پ� �о String readtxt�� ��ƶ�)
			String[] K40_field = K40_readtxt.split("\t");  //���پ� ��ƿ� ������ ������ ������ �迭�� field��� �迭�� �ֱ�
			//��� ��
			System.out.printf("*************[%d ��° �׸� ]******************\n",K40_LineCnt); 
			System.out.printf("%s : %s\n", K40_field_name[9], K40_field[9]); //�����ּ� //**PPT�� �����ִ� �����ּҴ� �����Ͱ� �����Ǿ��ֽ��ϴ�**
			System.out.printf("%s : %s\n", K40_field_name[13], K40_field[13]); //���� 
			System.out.printf("%s : %s\n", K40_field_name[14], K40_field[14]); //�浵
			double K40_dist=Math.sqrt (Math.pow(Double.parseDouble(K40_field[13])-lat, 2) //�Ÿ����ϱ� : ��Ÿ����� ���� 
					+ Math.pow(Double.parseDouble(K40_field[14])-Ing,2)); //�ش���ġ���� �̰��� ������ ������, �浵�� ������ ���� ������ ���� ��Ʈ��
			System.out.printf("���������� �Ÿ� : %f\n",K40_dist); 
			System.out.printf("*********************************************\n");
			
			if (K40_min > K40_dist) { //(4)-1. ���� ����� �Ÿ� ���ϱ� (�� �׸񸶴� ������������ �Ÿ��� ���ؼ� ���������� �ּҰ����� �۴ٸ� 
				K40_min = K40_dist; //min���� �־��
				K40_temp1name = K40_field[1]; //�̸���
				K40_temp1address = K40_field[9]; //�ּҵ�
				K40_temp1lat = K40_field[13]; //�ּҵ�
				K40_temp1lng = K40_field[14]; //�ּҵ�
			}
			
			if (K40_max < K40_dist) {//(4)-2. ���� �� �Ÿ� ���ϱ� (�� �׸񸶴� ������������ �Ÿ��� ���ؼ� ���������� �ִ밪���� ũ�ٸ� 
				K40_max = K40_dist;  //max���� �־��
				K40_temp2name =K40_field[1]; //�̸���
				K40_temp2address = K40_field[9]; //�ּҵ�
				K40_temp2lat = K40_field[13]; //�ּҵ�
				K40_temp2lng = K40_field[14]; //�ּҵ�

			}
			K40_LineCnt++; //�� ��� �۾� �� ������, ���ڸ� �ø���
				
		}//while
		K40_br.close();
		System.out.printf("*************[�� ����Ƚ�� : %s ]****************\n",K40_LineCnt-1);
		System.out.printf("*********************************************\n");
		System.out.printf("�д����ձ������������ ���� ����� �� : %s\n�ּ� : %s\n���� : %s\n�浵 : %s\n�д����ձ�������������� �Ÿ� :  %f\n",K40_temp1name, K40_temp1lat, K40_temp1lng,K40_temp1address,K40_min);
		System.out.printf("*********************************************\n");
		System.out.printf("�д����ձ������������ ���� �� �� : %s\n�ּ� : %s\n���� : %s\n�浵 : %s\n�д����ձ�������������� �Ÿ� : %f\n",K40_temp2name,K40_temp2lat,K40_temp2lng,K40_temp2address,K40_max);
		System.out.printf("*********************************************\n");
		

		}

}//class

