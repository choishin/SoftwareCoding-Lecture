package K40_JSONPractice02;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/*
 * 3.JSON 만들기
 * 특징 : 단순한 텍스트 파일이기 때문에 네트워크로 전송이 편리하고, 모든 언어와 플랫폼에서 사용이 가능하다
 * 특징 2: 헤더, 네임스페이스 등 형식적인 정보나 구두점들이 없고 정보만을 가지므로 XML보다 길이가 짧다
 * 저장되는 정보의 형태 : 대괄호 안의 값을 콤마로 구분하여 나열하며 배열의 요소의 순서가 매겨진다.
 *  										수치, 문자열, 논리형,null 4가지 타입을 지원하며, 날짜나 시간 화폐 등의 복잡한 정보는 지원X
 */
public class scoreJsonMake {

	public static JSONObject oneRec (String name, int studentid, int kor, int eng, int mat) {
		//(1)최종 완성될 JSONObject 선언
		JSONObject K40_dataObject = new JSONObject(); 
		K40_dataObject.put("name", name);  //
		K40_dataObject.put("studentid", studentid); 
		JSONArray K40_score = new JSONArray(); 
		K40_score.add(kor);
		K40_score.add(eng);
		K40_score.add(mat); 
		K40_dataObject.put("score", K40_score);
		return K40_dataObject;
	}
	public static void main(String[] args) {
		//(1)최종 완성될 JSONObject 선언
		JSONObject K40_jsonObject = new JSONObject(); 
		//(2)한명의 성적을 담을 Array선언
		JSONArray K40_datasArray = new JSONArray();
		//(3)한명의 정보가 JSONObject 선언
		JSONObject K40_dataObject = new JSONObject(); 
		K40_dataObject.put("name", "나연"); 
		K40_dataObject.put("studentid", 209901); 
		//(4)성적을 넣을 Array선언
		JSONArray score = new JSONArray(); 
		score.add(90);
		score.add(100);
		score.add(95); 
		//작성한 3개의 성적을 dataObject에 넣기
		K40_dataObject.put("score", score);
		//위의 dataObject를 datasArray에 넣기
		K40_datasArray.add(K40_dataObject);
		
		//위의 과정을 메소드로 만들어 반복하면 이렇게 됨
		K40_datasArray.add(oneRec("정연", 209902,100,85,75)); 
		K40_datasArray.add(oneRec("모모", 209903,90,75,85)); 
		K40_datasArray.add(oneRec("사나", 209904,90,85,75));
		K40_datasArray.add(oneRec("지효", 209905, 80, 75,85)); 
		K40_datasArray.add(oneRec("미나", 209906,90,85,55)); 
		K40_datasArray.add(oneRec("다연", 209907,70,75,65)); 
		K40_datasArray.add(oneRec("채영", 209908, 100,75,95)); 
		K40_datasArray.add(oneRec("쯔위", 209909,80,65,95));

		try {
			FileWriter file = new FileWriter("C:\\Users\\최신\\Desktop\\test.json"); 
			file.write(K40_datasArray.toJSONString()); 
			file. flush();
			file.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON 으로 작성한 내용"+K40_datasArray);

	}

}
