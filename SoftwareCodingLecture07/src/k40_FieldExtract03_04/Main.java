package k40_FieldExtract03_04;
/*
 * 4.구분자된 필드 추출 처리2 (스스로 고른 데이터로 추출하고, 숫자 한글로 읽기방식)
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
		String k40_path = "C:\\Users\\최신\\Downloads\\한국전력공사_시군구별 용도업종별 전력사용량_20170504.csv";
		String k40_line;
		BufferedReader k40_reader = new BufferedReader(new FileReader(k40_path));

		//1. 자료 한줄씩 받고 ArrayList에 넣기
		while ((k40_line = k40_reader.readLine()) != null) {
			String[] k40_column = k40_line.split(",");
			k40_arr1.add(k40_line);
		}
		//확인//System.out.println(arr1.get(0));

		//2. 한줄씩 되어있는 자료를 ,로 잘라서 String[][] 에 넣기
		String[][] k40_arr2 = new String[k40_arr1.size()][];

		for (int k40_i = 0; k40_i<k40_arr1.size(); k40_i++) {	
			k40_arr2[k40_i] = k40_arr1.get(k40_i).split(",");
		}
		System.out.println("한국전력공사_시군구별 용도업종별 전력사용량");
		//arr2[i][2] : 시군구, arr2[i][3] : 용도,arr2[i][2] : 판매량(필드이름)   
		for(int i=1; i<k40_arr2.length; i++) {
		System.out.printf("[%s]%5s %3s :",k40_arr2[i][2],k40_arr2[i][3],k40_arr2[0][4]);
			//voiceNumber 메소드로 숫자 전달
			voiceNumber(k40_arr2[i][4]);
			
			if (i ==100) break;
		}

	}
	
	public static void voiceNumber(String k40_number) {

		String[] k40_numbers = {"영","일","이","삼","사","오","육","칠","팔","구"}; 
		String[] k40_units = {"","십","백","천","만","십","백","천","억","십"}; 
		//-> main에서 받아온 숫자
		String k40_sNumVal = k40_number; 
		String k40_sNumVoice="";

		int i = 0;                  
		int j = k40_sNumVal.length()-1;
		while (true) { 
			//숫자의 길이만큼 반복하고, 만일 길이보다 많다면 멈추기
			if(i >= k40_sNumVal.length()) break;
			//만일 숫자중 0이 있고
			if(k40_sNumVal.substring(i, i+1).equals("0")) {
				//"만"이나"억"이 포함되어 있다면
				if(k40_units[j].equals("만") || k40_units[j].equals("억")) {
					//지금까지 단위를 붙이기
					k40_sNumVoice = k40_sNumVoice +""+ k40_units[j];
				}else{ 
				}
			}else { 
				//sNumVoice 에 해당 숫자를 숫자로 변환한 인덱스를 찾아 붙이기  
				k40_sNumVoice = k40_sNumVoice 
						+ k40_numbers[Integer.parseInt(k40_sNumVal.substring(i,i+1))]
								+ k40_units[j]; 
			}
			i++; j--; 
		}
		System.out.printf(" %s[%s]\n", k40_sNumVal, k40_sNumVoice);
	}
}//class





