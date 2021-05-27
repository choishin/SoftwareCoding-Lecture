package K40_JSONPractice02;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/*
 * 3.JSON �����
 * Ư¡ : �ܼ��� �ؽ�Ʈ �����̱� ������ ��Ʈ��ũ�� ������ ���ϰ�, ��� ���� �÷������� ����� �����ϴ�
 * Ư¡ 2: ���, ���ӽ����̽� �� �������� ������ ���������� ���� �������� �����Ƿ� XML���� ���̰� ª��
 * ����Ǵ� ������ ���� : ���ȣ ���� ���� �޸��� �����Ͽ� �����ϸ� �迭�� ����� ������ �Ű�����.
 *  										��ġ, ���ڿ�, ����,null 4���� Ÿ���� �����ϸ�, ��¥�� �ð� ȭ�� ���� ������ ������ ����X
 */
public class scoreJsonMake {

	public static JSONObject oneRec (String name, int studentid, int kor, int eng, int mat) {
		//(1)���� �ϼ��� JSONObject ����
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
		//(1)���� �ϼ��� JSONObject ����
		JSONObject K40_jsonObject = new JSONObject(); 
		//(2)�Ѹ��� ������ ���� Array����
		JSONArray K40_datasArray = new JSONArray();
		//(3)�Ѹ��� ������ JSONObject ����
		JSONObject K40_dataObject = new JSONObject(); 
		K40_dataObject.put("name", "����"); 
		K40_dataObject.put("studentid", 209901); 
		//(4)������ ���� Array����
		JSONArray score = new JSONArray(); 
		score.add(90);
		score.add(100);
		score.add(95); 
		//�ۼ��� 3���� ������ dataObject�� �ֱ�
		K40_dataObject.put("score", score);
		//���� dataObject�� datasArray�� �ֱ�
		K40_datasArray.add(K40_dataObject);
		
		//���� ������ �޼ҵ�� ����� �ݺ��ϸ� �̷��� ��
		K40_datasArray.add(oneRec("����", 209902,100,85,75)); 
		K40_datasArray.add(oneRec("���", 209903,90,75,85)); 
		K40_datasArray.add(oneRec("�糪", 209904,90,85,75));
		K40_datasArray.add(oneRec("��ȿ", 209905, 80, 75,85)); 
		K40_datasArray.add(oneRec("�̳�", 209906,90,85,55)); 
		K40_datasArray.add(oneRec("�ٿ�", 209907,70,75,65)); 
		K40_datasArray.add(oneRec("ä��", 209908, 100,75,95)); 
		K40_datasArray.add(oneRec("����", 209909,80,65,95));

		try {
			FileWriter file = new FileWriter("C:\\Users\\�ֽ�\\Desktop\\test.json"); 
			file.write(K40_datasArray.toJSONString()); 
			file. flush();
			file.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON ���� �ۼ��� ����"+K40_datasArray);

	}

}
