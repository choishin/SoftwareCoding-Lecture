package K40_StockProject03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
//4.주식정보 가공하기 (스스로 실습3.삼성전자의 주가에 대하여 2015년 최대값과 최소값을 구하시오(종가기준))
public class  Main3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1-(1).File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		File K40_file = new File("C:\\Users\\최신\\Desktop\\day_data\\A005930_minmax.csv");
		//1-(2).BufferedReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함
		BufferedReader K40_br = new BufferedReader (new FileReader(K40_file));
		//앞으로 읽어올 파일의 문자열을 담아줄 변수 지정 
		String K40_readtxt;
		
		if ((K40_readtxt = K40_br.readLine()) == null) { //(3) if 조건문 : 만일 내용이 없다면 
			System.out.printf("빈 파일 입니다\n");  //시행문 : "빈파일 입니다"를 출력해라
			return;
		}
		
		int K40_LineCnt = 0; //시행횟수를 세어줄 변수 지정 , 초기화
		int K40_min = Integer.MAX_VALUE ; //최소값을 담아줄 변수 지정, 초기화
		int K40_max = Integer.MIN_VALUE; //최대값을 담아줄 변수 지정, 초기화
		String K40_temp1date = "",K40_temp2date = ""; //날짜
		String K40_temp1min = "",K40_temp2min = ""; //날짜
		String K40_temp1max = "",K40_temp2max = ""; //날짜
		while((K40_readtxt = K40_br.readLine()) != null) {
			String[] K40_field = K40_readtxt.split(",");
			//field[2] : 종목코드 field[1]: 날짜, field[3]:주식종가
			System.out.printf("***********************************************\n");
			System.out.printf("종목코드 [%s]  날짜 : %s : 종가 :  %s\n",K40_field[2],K40_field[1],K40_field[3]);
			System.out.printf("***********************************************\n");
			
			if (K40_min > Integer.parseInt( K40_field[3])) { //주식종가를 Integer형으로 바꾼후, 최소값 구하기
				K40_min =Integer.parseInt( K40_field[3]);
				K40_temp1date = K40_field[1]; //날짜

			}
			
			if (K40_max < Integer.parseInt( K40_field[3])) {  //주식종가를 Integer형으로 바꾼후, 최대값 구하기
				K40_max =Integer.parseInt( K40_field[3]);
				K40_temp2date = K40_field[1]; //날짜

			}
			
			K40_LineCnt++; //모든 작업이 끝난 후 숫자 올리기
		}
		System.out.printf("***************[총 처리횟수 %s건]****************\n",K40_LineCnt-1); //마지막시행 후 1을 올려서 출력하기 때문에 -1
		System.out.printf("종목 코드 [A005930], [삼성전자]\n2015년 최저 종가 : %d\n날짜 :  %s\n",
				K40_min,K40_temp1date); 
		System.out.printf("***********************************************\n");
		System.out.printf("종목 코드 [A005930], [삼성전자]\n2015년 최고 종가 : %d\n날짜 :  %s\n",
				K40_max,K40_temp2date);
		System.out.printf("***********************************************\n");
		
		K40_br.close();

	}//main

	}//class


