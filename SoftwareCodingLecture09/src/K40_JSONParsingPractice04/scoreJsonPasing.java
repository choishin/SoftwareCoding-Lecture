package K40_JSONParsingPractice04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.text.ParseException;
/*
 * 3. JSON �Ľ�
 */
public class scoreJsonPasing {
		
		public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, ParseException, 
																															ParseException, org.json.simple.parser.ParseException {
			// TODO Auto-generated method stub 
			//(1)JSONParser Ŭ�������� ������Ʈ�� �ҷ��� (JSON �Ľ��� �ϱ�����)
			//** Json Parser��,  XML���� �� �� ����ȭ�� ���� ���� ��� �� �ϳ��� Java Script Object Notation�̶�� ��
			JSONParser K40_parser = new JSONParser();
			//(2)���� ��θ� �����ؼ� ������ �о���� �̰��� JSON���� �Ľ� �� 
			Object K40_obj = K40_parser.parse(new FileReader("C:\\Users\\�ֽ�\\Desktop\\test.json"));
			//(3)JSON array�� �����ϰ� ������ �о�� JSON������ �迭�� ����
			JSONArray K40_array = (JSONArray) K40_obj;
			//�����
			 System.out.println("*********************************************");
			  for(int i=0; i<K40_array.size(); i++){  
			JSONObject result = (JSONObject) K40_array.get(i); //�� �迭���� ������ ������ JSONObject������ result�� �����ϰ�
			System.out.println("�̸� : " +result.get("name"));  //"name" �׸��� �����͸� ������ ���
			System.out.println("�й� : " +result.get("studentid"));  //"studentid" �׸��� �����͸� ������ ���
			
			JSONArray K40_score = (JSONArray) result.get("score");  //"score" �׸��� �����͸� ������ ���
			long kor= (long) K40_score.get(0);  //�����׸��� 0��°�� ������ͼ� longŸ������ �ٲٱ�
			long eng= (long) K40_score.get(1);//�����׸��� 1��°�� ������ͼ� longŸ������ �ٲٱ�
			long mat= (long) K40_score.get(2); //�����׸��� 2��°�� ������ͼ� longŸ������ �ٲٱ�
			System.out.println("���� : " + kor);  //�����׸��� 0��°�� ���
			System.out.println("���� : " + eng); //�����׸��� 1��°�� ���
			System.out.println("���� : " + mat);  //�����׸��� 2��°�� ���
			System.out.println("���� : " + (kor+eng+mat));  //�����׸��� ����
			System.out.println("��� : " +((kor+eng+mat)/3.0));  //�����׸��� ���
			System.out.println("******************************************");
			  }
	}
}
