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
		
		//(1)File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		File K40_file = new File("C:\\Users\\최신\\Desktop\\12_04_07_E_무료와이파이정보(수정).txt");
		//(2) BufferedReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함)
		BufferedReader K40_br = new BufferedReader (new FileReader(K40_file));
		 //앞으로 읽어올 파일의 문자열을 담아줄 변수 지정 
		String K40_readtxt;
		
		if ((K40_readtxt = K40_br.readLine()) == null) { //(3) if 조건문 : 만일 내용이 없다면 
			System.out.printf("빈 파일 입니다\n"); //시행문 : "빈파일 입니다"를 출력해라
			return; //밖으로 나오기
		}
		
		String[] K40_field_name = K40_readtxt.split("\t");  //(1줄만)문장을 읽어와서 탭으로 구분해라 (첫줄은 필드이름)
		int K40_LineCnt = 1; //시행횟수를 세어줄 변수 지정 , 초기화
		while((K40_readtxt = K40_br.readLine()) != null) { //(3) while반복문 (내용이 없지(null) 않다면(!=) 즉, 내용이 있다면,  한줄씩 읽어서 String readtxt에 담아라)
			String[] K40_field = K40_readtxt.split("\t"); //한줄씩 담아온 내용을 탭으로 나눠서 배열에 field라는 배열에 넣기 
			
			/**필드명 상세정보**
			 * field[0]: 번호, field[1]:설치장소명,field[2]:설치장소상세, filed[3]:설치시도명 ,filed[4]:설치시군구, field[5]:설치시설구
			 *filed[6]: 서비스제공사명,  filed[7]:와이파이SSID, filed[8]:설치연월, filed[9]:소재지도로명주소, filed[10]:소재지번주소
			 * filed[11]:관리기관명,  filed[12]:관리기관전화번호, filed[13]:위도, filed[14]:경도, filed[15]:데이터기준일자
			 */
			
			//출력폼
			System.out.printf("*************[%d번째 항목]***************\n",K40_LineCnt); //횟수출력 ('LineCnt번째 자료')
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
				
		K40_br.close(); //리소스 닫기

	}//FileRead

	public static void main (String[] args) throws IOException {

		K40_FileRead(); //BufferedReader로 파일 읽어오는 메소드를 호출
	}//main

}//class
