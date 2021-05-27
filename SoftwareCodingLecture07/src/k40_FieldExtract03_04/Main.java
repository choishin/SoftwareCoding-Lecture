package k40_FieldExtract03_04;
/*
 * 4.�����ڵ� �ʵ� ���� ó��2 (������ �� �����ͷ� �����ϰ�, ���� �ѱ۷� �б���)
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<String> k40_arr1 = new ArrayList<String>();
		String k40_path = "C:\\Users\\�ֽ�\\Downloads\\�ѱ����°���_�ñ����� �뵵������ ���»�뷮_20170504.csv";
		String k40_line;
		BufferedReader k40_reader = new BufferedReader(new FileReader(k40_path));

		//1. �ڷ� ���پ� �ް� ArrayList�� �ֱ�
		while ((k40_line = k40_reader.readLine()) != null) {
			String[] k40_column = k40_line.split(",");
			k40_arr1.add(k40_line);
		}
		//Ȯ��//System.out.println(arr1.get(0));

		//2. ���پ� �Ǿ��ִ� �ڷḦ ,�� �߶� String[][] �� �ֱ�
		String[][] k40_arr2 = new String[k40_arr1.size()][];

		for (int k40_i = 0; k40_i<k40_arr1.size(); k40_i++) {	
			k40_arr2[k40_i] = k40_arr1.get(k40_i).split(",");
		}
		System.out.println("�ѱ����°���_�ñ����� �뵵������ ���»�뷮");
		//arr2[i][2] : �ñ���, arr2[i][3] : �뵵,arr2[i][2] : �Ǹŷ�(�ʵ��̸�)   
		for(int i=1; i<k40_arr2.length; i++) {
		System.out.printf("[%s]%5s %3s :",k40_arr2[i][2],k40_arr2[i][3],k40_arr2[0][4]);
			//voiceNumber �޼ҵ�� ���� ����
			voiceNumber(k40_arr2[i][4]);
			
			if (i ==100) break;
		}

	}
	
	public static void voiceNumber(String k40_number) {

		String[] k40_numbers = {"��","��","��","��","��","��","��","ĥ","��","��"}; 
		String[] k40_units = {"","��","��","õ","��","��","��","õ","��","��"}; 
		//-> main���� �޾ƿ� ����
		String k40_sNumVal = k40_number; 
		String k40_sNumVoice="";

		int i = 0;                  
		int j = k40_sNumVal.length()-1;
		while (true) { 
			//������ ���̸�ŭ �ݺ��ϰ�, ���� ���̺��� ���ٸ� ���߱�
			if(i >= k40_sNumVal.length()) break;
			//���� ������ 0�� �ְ�
			if(k40_sNumVal.substring(i, i+1).equals("0")) {
				//"��"�̳�"��"�� ���ԵǾ� �ִٸ�
				if(k40_units[j].equals("��") || k40_units[j].equals("��")) {
					//���ݱ��� ������ ���̱�
					k40_sNumVoice = k40_sNumVoice +""+ k40_units[j];
				}else{ 
				}
			}else { 
				//sNumVoice �� �ش� ���ڸ� ���ڷ� ��ȯ�� �ε����� ã�� ���̱�  
				k40_sNumVoice = k40_sNumVoice 
						+ k40_numbers[Integer.parseInt(k40_sNumVal.substring(i,i+1))]
								+ k40_units[j]; 
			}
			i++; j--; 
		}
		System.out.printf(" %s[%s]\n", k40_sNumVal, k40_sNumVoice);
	}
}//class





