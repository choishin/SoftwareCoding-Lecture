package K40_StockProject01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//4.�ֽ����� �����ϱ� (���� �Ⱦ�� �����) 
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//(1)File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
		File K40_file = new File ("C:\\Users\\�ֽ�\\Desktop\\day_data\\THTSKS010H00.dat"); 
		//(2) BufferedReaderŬ�������� ������Ʈ �ҷ����� (�ܺο��� ������ �о���� ����)
		BufferedReader K40_br= new BufferedReader (new FileReader(K40_file));
		 //������ �о�� ������ ���ڿ��� ����� ���� ���� 
		String K40_readtxt; 
		//����Ƚ���� ������ ���� ���� , �ʱ�ȭ
		int K40_LineCnt=0; 
		//�����ε����� ������ ���� ����, �ʱ�ȭ 
		int K40_n = -1;  //**���������� ���Ǵ� �κ�**
		//**String Buffer Ŭ������ ���ڿ��� �߰��ϰų�, ������ �� ���Ǵ� Ŭ��**
		//(3)�����Ϳ� ���ԵǾ� �ִ� ���ڿ��� �����Ӱ� �����ϱ� ���� StringBuffer Ŭ�󽺸� �ҷ���
		StringBuffer K40_s = new StringBuffer(); 

		while (true) {  //(3) while�ݺ��� (���ѹݺ�)
			char[] K40_ch = new char[1000];  //����100���� ��� ���� �迭�� ����
			K40_n = K40_br.read(K40_ch);  //�ε���[-1]�� �迭 ch�� ���� 100���� ��� 
			if(K40_n == -1) break;     //**���������� ���Ǵ� �κ�**
			for(char c : K40_ch){   //ch�� ��Ƶξ��� ��ҵ��� �ϳ��� ���
				if(c == '\n'){ //�ٹٲ��� �Ҷ��� �Ǹ�
					System.out.printf("[%s]***\n",K40_s.toString()); //���ڿ��� [ ]***<-�ȿ� �־� ���
					K40_s. delete(0, K40_s.length());  //���� �ڷ�� �����
				}else{
					K40_s.append(c); //�׿ܿ��� ���ڿ��� �߰�
				}
				K40_LineCnt++;  //��� �۾��� ������ ���ڸ� �÷��ֱ�
			}
			System.out.printf("[%s]***\n",K40_s.toString());	 
		}
		
		K40_br.close();	

	}//main

}//class
