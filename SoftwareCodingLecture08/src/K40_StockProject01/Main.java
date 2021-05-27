package K40_StockProject01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//4.주식정보 가공하기 (파일 훑어보고 감잡기) 
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//(1)File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		File K40_file = new File ("C:\\Users\\최신\\Desktop\\day_data\\THTSKS010H00.dat"); 
		//(2) BufferedReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함)
		BufferedReader K40_br= new BufferedReader (new FileReader(K40_file));
		 //앞으로 읽어올 파일의 문자열을 담아줄 변수 지정 
		String K40_readtxt; 
		//시행횟수를 세어줄 변수 지정 , 초기화
		int K40_LineCnt=0; 
		//음수인덱스를 설정할 변수 지정, 초기화 
		int K40_n = -1;  //**관용적으로 사용되는 부분**
		//**String Buffer 클래스는 문자열을 추가하거나, 변경할 때 사용되는 클라스**
		//(3)데이터에 포함되어 있는 문자열을 자유롭게 수정하기 위해 StringBuffer 클라스를 불러옴
		StringBuffer K40_s = new StringBuffer(); 

		while (true) {  //(3) while반복문 (무한반복)
			char[] K40_ch = new char[1000];  //문자100개를 담기 위한 배열을 생성
			K40_n = K40_br.read(K40_ch);  //인덱스[-1]에 배열 ch의 문자 100개를 담기 
			if(K40_n == -1) break;     //**관용적으로 사용되는 부분**
			for(char c : K40_ch){   //ch에 담아두었던 요소들을 하나씩 출력
				if(c == '\n'){ //줄바꿈을 할때가 되면
					System.out.printf("[%s]***\n",K40_s.toString()); //문자열을 [ ]***<-안에 넣어 출력
					K40_s. delete(0, K40_s.length());  //원래 자료는 지우기
				}else{
					K40_s.append(c); //그외에는 문자열을 추가
				}
				K40_LineCnt++;  //모든 작업이 끝나면 숫자를 올려주기
			}
			System.out.printf("[%s]***\n",K40_s.toString());	 
		}
		
		K40_br.close();	

	}//main

}//class
