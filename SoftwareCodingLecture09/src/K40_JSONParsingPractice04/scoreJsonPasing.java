package K40_JSONParsingPractice04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.text.ParseException;
/*
 * 3. JSON 파싱
 */
public class scoreJsonPasing {
		
		public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, ParseException, 
																															ParseException, org.json.simple.parser.ParseException {
			// TODO Auto-generated method stub 
			//(1)JSONParser 클래스에서 오브젝트를 불러옴 (JSON 파싱을 하기위해)
			//** Json Parser란,  XML보다 좀 더 간략화된 정보 전달 방법 중 하나로 Java Script Object Notation이라는 뜻
			JSONParser K40_parser = new JSONParser();
			//(2)파일 경로를 지정해서 파일을 읽어오고 이것을 JSON으로 파싱 함 
			Object K40_obj = K40_parser.parse(new FileReader("C:\\Users\\최신\\Desktop\\test.json"));
			//(3)JSON array를 생성하고 위에서 읽어온 JSON파일을 배열에 넣음
			JSONArray K40_array = (JSONArray) K40_obj;
			//출력폼
			 System.out.println("*********************************************");
			  for(int i=0; i<K40_array.size(); i++){  
			JSONObject result = (JSONObject) K40_array.get(i); //각 배열에서 가져온 내용을 JSONObject형태인 result에 저장하고
			System.out.println("이름 : " +result.get("name"));  //"name" 항목의 데이터를 가져와 출력
			System.out.println("학번 : " +result.get("studentid"));  //"studentid" 항목의 데이터를 가져와 출력
			
			JSONArray K40_score = (JSONArray) result.get("score");  //"score" 항목의 데이터를 가져와 출력
			long kor= (long) K40_score.get(0);  //성적항목의 0번째를 가지고와서 long타입으로 바꾸기
			long eng= (long) K40_score.get(1);//성적항목의 1번째를 가지고와서 long타입으로 바꾸기
			long mat= (long) K40_score.get(2); //성적항목의 2번째를 가지고와서 long타입으로 바꾸기
			System.out.println("국어 : " + kor);  //성적항목의 0번째를 출력
			System.out.println("영어 : " + eng); //성적항목의 1번째를 출력
			System.out.println("수학 : " + mat);  //성적항목의 2번째를 출력
			System.out.println("총점 : " + (kor+eng+mat));  //성적항목의 총점
			System.out.println("평균 : " +((kor+eng+mat)/3.0));  //성적항목의 평균
			System.out.println("******************************************");
			  }
	}
}
