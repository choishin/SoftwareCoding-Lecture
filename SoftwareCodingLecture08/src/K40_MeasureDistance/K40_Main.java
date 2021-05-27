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
//3.거리계산 ('전국무료와이파이 표준데이터.csv 파일을 이용해 분당융합기술교육원에서 가장 가까운 곳과 먼곳 출력하기)
public class K40_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//(1)File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		File K40_file = new File("C:\\Users\\최신\\Desktop\\12_04_07_E_무료와이파이정보(수정).txt");
		//(2) BufferedReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함)
		BufferedReader K40_br = new BufferedReader (new FileReader (K40_file));
		 //앞으로 읽어올 파일의 문자열을 담아줄 변수 지정 
		String K40_readtxt;

		if((K40_readtxt= K40_br.readLine()) == null){//(3) if 조건문 : 만일 내용이 없다면 
			System.out.printf(" 빈 파일입니다.Wn");  //시행문 : "빈파일 입니다"를 출력해라
			return; //밖으로 나오기
		}//if

		String[] K40_field_name= K40_readtxt.split("\t");  //(1줄만)문장을 읽어와서 탭으로 구분해라 (첫줄은 필드이름)
		//***융합기술원과 우리집 위도경도, 지도에서 알아보기 
		//double  lat = 37.38639282318312; //우리집 위도
		//double lng = 127.12625095535718; //우리집 경도
		double lat = 37.3860521; //융기원위도
		double Ing = 127.1214038; //융기원경도
		
		int K40_LineCnt = 1; //시행횟수를 세어줄 변수 지정 , 초기화
		double K40_min = Double.MAX_VALUE; //최소값을 담아줄 변수 지정, 초기화
		double K40_max = Double.MIN_VALUE; //최대값을 담아줄 변수 지정, 초기화

		String K40_temp1name ="", K40_temp2name ="";  //가장가까운거리와 먼거리의 이름을 넣어줄 변수 지정, 초기화
		String K40_temp1address ="", K40_temp2address ="";   //가장가까운거리와 먼거리의 주소를 넣어줄 변수 지정, 초기화
		String K40_temp1lat = "", K40_temp1lng = "";  //위도경도
		String K40_temp2lat = "", K40_temp2lng = ""; //위도경도
		while((K40_readtxt= K40_br.readLine()) !=null){ //(3) while반복문 (내용이 없지(null) 않다면(!=) 즉, 내용이 있다면,  한줄씩 읽어서 String readtxt에 담아라)
			String[] K40_field = K40_readtxt.split("\t");  //한줄씩 담아온 내용을 탭으로 나눠서 배열에 field라는 배열에 넣기
			//출력 폼
			System.out.printf("*************[%d 번째 항목 ]******************\n",K40_LineCnt); 
			System.out.printf("%s : %s\n", K40_field_name[9], K40_field[9]); //지번주소 //**PPT에 나와있는 지번주소는 데이터가 누락되어있습니다**
			System.out.printf("%s : %s\n", K40_field_name[13], K40_field[13]); //위도 
			System.out.printf("%s : %s\n", K40_field_name[14], K40_field[14]); //경도
			double K40_dist=Math.sqrt (Math.pow(Double.parseDouble(K40_field[13])-lat, 2) //거리구하기 : 피타고라스의 정리 
					+ Math.pow(Double.parseDouble(K40_field[14])-Ing,2)); //해당위치에서 이곳의 위도를 뺀값과, 경도를 뺀값을 각각 제곱한 값의 루트값
			System.out.printf("현재지점과 거리 : %f\n",K40_dist); 
			System.out.printf("*********************************************\n");
			
			if (K40_min > K40_dist) { //(4)-1. 가장 가까운 거리 구하기 (매 항목마다 현재지점과의 거리를 구해서 이전까지의 최소값보다 작다면 
				K40_min = K40_dist; //min값에 넣어라
				K40_temp1name = K40_field[1]; //이름과
				K40_temp1address = K40_field[9]; //주소도
				K40_temp1lat = K40_field[13]; //주소도
				K40_temp1lng = K40_field[14]; //주소도
			}
			
			if (K40_max < K40_dist) {//(4)-2. 가장 먼 거리 구하기 (매 항목마다 현재지점과의 거리를 구해서 이전까지의 최대값보다 크다면 
				K40_max = K40_dist;  //max값에 넣어라
				K40_temp2name =K40_field[1]; //이름과
				K40_temp2address = K40_field[9]; //주소도
				K40_temp2lat = K40_field[13]; //주소도
				K40_temp2lng = K40_field[14]; //주소도

			}
			K40_LineCnt++; //이 모든 작업 이 끝나고, 숫자를 올리기
				
		}//while
		K40_br.close();
		System.out.printf("*************[총 시행횟수 : %s ]****************\n",K40_LineCnt-1);
		System.out.printf("*********************************************\n");
		System.out.printf("분당융합기술교육원에서 가장 가까운 곳 : %s\n주소 : %s\n위도 : %s\n경도 : %s\n분당융합기술교육원부터의 거리 :  %f\n",K40_temp1name, K40_temp1lat, K40_temp1lng,K40_temp1address,K40_min);
		System.out.printf("*********************************************\n");
		System.out.printf("분당융합기술교육원에서 가장 먼 곳 : %s\n주소 : %s\n위도 : %s\n경도 : %s\n분당융합기술교육원부터의 거리 : %f\n",K40_temp2name,K40_temp2lat,K40_temp2lng,K40_temp2address,K40_max);
		System.out.printf("*********************************************\n");
		

		}

}//class

