package K40_StockProject02;
//4.주식정보 가공하기 (감 잡은 내용으로 파일정제) 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//1-(1).File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		File K40_f= new File("C:\\Users\\최신\\Desktop\\day_data\\THTSKS010H00.dat"); 
		//1-(2).BufferedReader클래스에서 오브젝트 불러오기 (외부에서 파일을 읽어오기 위함)
		BufferedReader K40_br=new BufferedReader (new FileReader(K40_f));
		//2-(1).File 클래스에서 오브젝트 불러오기 (외부로 파일 경로를 지정해주기 위함)
		File K40_f1= new File("C:\\Users\\최신\\Desktop\\day_data\\StockDailyPrice.csv"); 
		 //2-(2)BufferedWriter클래스에서 오브젝트 불러오기 (자바 내에서 파일을 생성하기 위함)
		BufferedWriter K40_bw1=new BufferedWriter (new FileWriter (K40_f1));
		//앞으로 읽어올 파일의 문자열을 담아줄 변수 지정 
		String K40_readtxt;
		//시행횟수를 세어줄 변수 지정 , 초기화
		int K40_cnt=0; 
		//단어를 세어줄 변수 지정, 초기화
		int K40_wcnt=0; 
		while((K40_readtxt= K40_br.readLine())!=null) {  //(3) while반복문 (무한반복)
			StringBuffer K40_s = new StringBuffer();  // StringBuffer 클라스를 불러옴 (데이터에 포함되어 있는 문자열을 자유롭게 수정하기 위해)
			String[] field = K40_readtxt.split("%_%"); //각줄에서 '%_%을 구분자로, 데이터를 나누어 배열에 넣기
			//if 조건문 : 2번째 필드부터확인 시작, field[2]항목에 포함된 '^'를 ""으로 바꿔주고, 공백은 없애고 첫글자가 'A'인 항목에 대해서
			if(field. length > 2&&field[2].replace("^","").trim().substring(0,1).equals("A")) { 
				//field[0]번째에 '^'를 ""으로 바꿔주고, 공백 없애기
				K40_s.append(field[0].replace("^","").trim()); 
				//for 반복문 : 1번째부터 전체 필드에
				for (int j =1; j< field.length; j++){
					//	 ','추가하고'^'를 ""으로 바꿔주고,공백을 없애주기
					K40_s.append(", "+field[j].replace("^","").trim()); 
				}//for
				//위에서 가공한 파일 입히기
				K40_bw1.write(K40_s.toString()); 
				//개행
				K40_bw1.newLine();
				//한 단어씩 처리될때마다 숫자올리기
				K40_wcnt++; 
			}//if
			K40_cnt++; //한줄 처리될때마다 숫자 올리기
		}
		K40_br.close(); 
		K40_bw1.close();
		System.out.printf("Program End [%d] [%d] records#n", K40_cnt,K40_wcnt);
	}
}

