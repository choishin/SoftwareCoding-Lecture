package K40_FileWriter01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//1. 무식하게 읽고 쓰기 (FileWriter 과 FileReader을 이용해서 파일 읽고 쓰기)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File K40_file = new File("C:\\Users\\최신\\Desktop\\test.txt"); //(1)File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
			FileWriter K40_fw = new FileWriter(K40_file); //(2)FileWriter클래스에서 오브젝트 불러오기 (자바 내에서 파일을 생성하기 위함)
			
			K40_fw.write("안녕 파일\n");  //첫번째 문장을 쓰고
			K40_fw.write("hello 헬로\n"); //두번째 문장을 쓰고
			K40_fw.close(); //닫기 
			
			FileReader fr = new FileReader(K40_file); //(3) FileReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함)
			
			int K40_n = -1; //**관용적인 표현**
			char[] K40_ch ; //문자를 담기위한 배열생성
			while(true) { //(4) while반복문 (무한반복)
				K40_ch = new char[100]; //문자100개를 담기 위한 배열을 생성
				K40_n = fr.read(K40_ch);  //**관용적인 표현** (-1자리에 읽어온 문자열이 들어감)
				
				if (K40_n == -1) break; //n이 -1인 경우 반복문 탈출 (즉, 1번만 실행)
				
				for (int i = 0; i < K40_n; i++ ) {   //**관용적인 표현** (문자열의 길이만큼 출력)
					System.out.printf("%c",K40_ch[i]);  
				}
			}

			fr.close();
			System.out.printf("\nFILE READ END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.printf("나 에러 [%s]\n",e);
		}
	}//main
}//class
