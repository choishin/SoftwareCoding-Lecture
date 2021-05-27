package K40_MeasureDistance02;

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
//3.거리계산 ('전국공영주차장정보.csv'파일을 이용해 분당융합기술교육원에서 가장 가까운 곳과 먼곳 출력하기)
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//(1)File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		File K40_file = new File("C:\\Users\\최신\\Desktop\\한국교통안전공단_전국공영주차장정보_20191224.txt");
		//(2) BufferedReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함)
		BufferedReader K40_br = new BufferedReader (new FileReader (K40_file));
		 //앞으로 읽어올 파일의 문자열을 담아줄 변수 지정 
		String readtxt;
		
		if((readtxt= K40_br.readLine()) == null){//(3) if 조건문 : 만일 내용이 없다면 
			System.out.printf(" 빈 파일입니다.Wn"); //시행문 : "빈파일 입니다"를 출력해라
			return;  //밖으로 나오기
		}//if

		String[] K40_field_name= readtxt.split("\t"); //(1줄만)문장을 읽어와서 탭으로 구분해라 (첫줄은 필드이름)

		double K40_lat = 37.3860521; //위도
		double K40_Ing = 127.1214038; //경도
		
		int K40_LineCnt=1;  //시행횟수를 세어줄 변수 지정 , 초기화
		double K40_min = Double.MAX_VALUE; //최소값을 담아줄 변수 지정, 초기화
		double K40_max = Double.MIN_VALUE; //최대값을 담아줄 변수 지정, 초기화
 
		String K40_temp1name ="", K40_temp2name ="";//가장가까운거리와 먼거리의 이름을 넣어줄 변수 지정, 초기화
		String K40_temp1address ="", K40_temp2address ="";  //가장가까운거리와 먼거리의 주소를 넣어줄 변수 지정, 초기화
		String K40_temp1type ="", K40_temp2type ="";	//주차장 종류
		String K40_temp1lat = "", K40_temp1lng = "";  //위도경도
		String K40_temp2lat = "", K40_temp2lng = "";  //위도경도
		String K40_temp1free="",K40_temp2free=""; //무료유료여부
		while((readtxt= K40_br.readLine()) !=null){   //(3) while반복문 (내용이 없지(null) 않다면(!=) 즉, 내용이 있다면,  한줄씩 읽어서 String readtxt에 담아라)
			String[] K40_field = readtxt.split("\t"); //한줄씩 담아온 내용을 탭으로 나눠서 배열에 field라는 배열에 넣기
			//출력 폼
			System.out.printf("***************[%5d번째 항목]****************\n",K40_LineCnt); 
			System.out.printf("%s : %s\n", K40_field_name[6], K40_field[6]); //지번주소 
			System.out.printf("%s : %s\n", K40_field_name[3], K40_field[3]); //위도 
			System.out.printf("%s : %s\n", K40_field_name[2], K40_field[2]); //경도
			double K40_dist=Math.sqrt (Math.pow(Double.parseDouble(K40_field[3])-K40_lat, 2) //거리구하기 : 피타고라스의 정리 
					+ Math.pow(Double.parseDouble(K40_field[2])-K40_Ing,2));  //해당위치에서 이곳의 위도를 뺀값과, 경도를 뺀값을 각각 제곱한 값의 루트값
			System.out.printf("현재지점과 거리 : %f\n",K40_dist); 
			System.out.printf("*********************************************\n");
			
			if (K40_min > K40_dist) { //(4)-1. 가장 가까운 거리 구하기 (매 항목마다 현재지점과의 거리를 구해서 이전까지의 최소값보다 작다면 
				K40_min = K40_dist; //min값에 넣어라
				K40_temp1name = K40_field[1]; //이름
				K40_temp1type = K40_field[5]; //주차장유형
				K40_temp1address = K40_field[6]; //주소
				K40_temp1free=K40_field[16]; //무료,유료 여부
				K40_temp1lat=K40_field[20]; //위도
				K40_temp1lng=K40_field[21]; //경도
			}
			
			if (K40_max < K40_dist) {
				K40_max = K40_dist; 
				K40_temp2name = K40_field[1]; //이름
				K40_temp2type = K40_field[5]; //주차장유형
				K40_temp2address = K40_field[6]; //주소
				K40_temp2free=K40_field[16]; //무료,유료 여부
				K40_temp2lat=K40_field[20]; //위도
				K40_temp2lng=K40_field[21]; //경도

			}
			K40_LineCnt++;
				
		}//while
		K40_br.close();
		System.out.printf("*************[총 시행횟수 : %s ]***************\n",K40_LineCnt-1);
		System.out.printf("분당융합기술교육원에서 가장 가까운 곳 : %s\n주차장유형 : %s\n주소 :%s\n무료여부 : %s\n위도 : %s\n경도 : %s\n여기서부터의 거리 : %f\n",
				K40_temp1name,K40_temp1type,K40_temp1address,K40_temp1free,K40_temp1lat,K40_temp1lng,K40_min );
		System.out.printf("*********************************************\n");
		System.out.printf("분당융합기술교육원에서 가장 먼 곳 : %s\n주차장유형 : %s\n주소 :%s\n무료여부 : %s\n위도 : %s\n경도 : %s\n여기서부터의 거리 : %f\n",
				K40_temp2name,K40_temp2type,K40_temp2address,K40_temp2free,K40_temp2lat,K40_temp2lng,K40_max );
		System.out.printf("*********************************************\n");
		}


}//class

