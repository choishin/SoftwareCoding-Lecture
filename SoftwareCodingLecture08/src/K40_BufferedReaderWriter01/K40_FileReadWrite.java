package K40_BufferedReaderWriter01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//2.Buffered 읽고 쓰기
public class K40_FileReadWrite {

	public static void K40_FileWrite () throws IOException {
		// TODO Auto-generated method stub
		
		File K40_file = new File("C:\\Users\\최신\\Desktop\\HelloWorld.txt"); //1-(1)File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		BufferedWriter K40_bw = new BufferedWriter( new FileWriter(K40_file)); // 1-(2)BufferedWriter클래스에서 오브젝트 불러오기 (자바 내에서 파일을 생성하기 위함)
		
		K40_bw.write("안녕 파일"); //내용
		K40_bw.newLine(); //개행
		K40_bw.write("Hello File"); //내용2
		K40_bw.newLine(); //개행
		K40_bw.append("이건 새로운 문장"); //내용3
		K40_bw.close(); //내용을 다 적었다면 리소스 닫기
	}
	
	public static void K40_FileRead() throws IOException {
	
	File K40_file = new File("C:\\Users\\최신\\Desktop\\HelloWorld.txt"); //2-(1)File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
	BufferedReader K40_br = new BufferedReader (new FileReader(K40_file)); //2-(2) FileReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함)
	String readtxt; //앞으로 읽어올 파일의 문자열을 담아줄 변수 지정 
	
	while((readtxt = K40_br.readLine()) != null) { //2-(3) while반복문 (내용이 없지(null) 않다면(!=) 즉, 내용이 있다면,  한줄씩 읽어서 String readtxt에 담아라)
		System.out.printf("%s\n",readtxt); // 시행문 : 담아온 내용을 출력해라
		
	}
	
	K40_br.close(); //리소스 닫기
	
	}
	
	public static void main (String[] args) throws IOException {
		
		K40_FileWrite(); //(1)Buffered Writer로 쓰는 메소드 호출
		K40_FileRead(); //(2)Buffered Reader로 읽는 메소드 호출
	}


}
