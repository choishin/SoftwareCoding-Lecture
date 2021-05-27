package K40_StockProject03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//4.�ֽ����� �����ϱ� (������ �ǽ�1.�Ｚ���� (�����ڵ� A005930)�� �����Ͽ� A005930.csv ������ ����ÿ�)
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		//1-(1).File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
		File K40_f = new File("C:\\Users\\�ֽ�\\Desktop\\day_data\\THTSKS010H00.dat"); 
		//1-(2).BufferedReaderŬ�������� ������Ʈ �ҷ����� (�ܺο��� ������ �о���� ����)
		BufferedReader K40_br = new BufferedReader (new FileReader(K40_f));
		//2-(1).File Ŭ�������� ������Ʈ �ҷ����� (�ܺη� ���� ��θ� �������ֱ� ����)
		File K40_f1 = new File("C:\\Users\\�ֽ�\\Desktop\\day_data\\A005930.csv"); 
		 //2-(2)BufferedWriterŬ�������� ������Ʈ �ҷ����� (�ڹ� ������ ������ �����ϱ� ����)
		BufferedWriter K40_bw1 = new BufferedWriter (new FileWriter (K40_f1));
		//������ �о�� ������ ���ڿ��� ����� ���� ���� 
		String K40_readtxt;
		//����Ƚ���� ������ ���� ���� , �ʱ�ȭ
		int K40_cnt=0; 
		//�ܾ ������ ���� ����, �ʱ�ȭ
		int K40_wcnt=0; 
		while((K40_readtxt= K40_br.readLine()) !=null){ //(3) while�ݺ��� (���ѹݺ�)
			StringBuffer K40_s = new StringBuffer();  // StringBuffer Ŭ�󽺸� �ҷ��� (�����Ϳ� ���ԵǾ� �ִ� ���ڿ��� �����Ӱ� �����ϱ� ����)
			String[] K40_field = K40_readtxt.split("%_%"); //���ٿ��� '%_%�� �����ڷ�, �����͸� ������ �迭�� �ֱ�
			//if ���ǹ� : 2��° �ʵ����Ȯ�� ����, field[2]�׸� ���Ե� '^'�� ""���� �ٲ��ְ�, ������ ���ְ� �׸� 'A005930'�� ���Ե� �׸��� �ִٸ�
			if(K40_field.length > 2 && K40_field[2].replace("^","").trim().equals("A005930")) {
				//field[0]��°�� '^'�� ""���� �ٲ��ְ�, ���� ���ֱ�
				K40_s.append(K40_field[0].replace("^","").trim());
				//for �ݺ��� : 1��°���� ��ü �ʵ忡 
				for (int j=1; j< K40_field.length; j++){
				//	 ','�߰��ϰ�'^'�� ""���� �ٲ��ְ�,������ �����ֱ�
					K40_s.append(","+K40_field[j].replace("^","").trim()); 
				}
				//������ ������ ���� ������
				K40_bw1.write(K40_s.toString()); 
				//����
				K40_bw1.newLine();
				//�� �ܾ ó���ɶ����� ���ڿø���
				K40_wcnt++; 
			}
			 //���� ó���ɶ����� ���� �ø���
			K40_cnt++;
		}
		K40_br.close(); 
		K40_bw1.close();
		System.out.printf("Program End[%d] [%d]recordsWn",K40_cnt,K40_wcnt);

	}
}


