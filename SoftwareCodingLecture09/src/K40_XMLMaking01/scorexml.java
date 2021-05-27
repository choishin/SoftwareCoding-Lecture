package K40_XMLMaking01;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
//1.XML 파싱 기본 
public class scorexml {

		public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
			//(1) DocumentBuilder 클래스에서 오브젝트를 불러옴 
			//**DocumentBuilder 클래스 :  xml 문서를 파싱하는 클래스
			//**DocumnetBuilderFactory :  DocumnetBuilder 객체를 생성하는 클래스
			DocumentBuilder K40_docBuilder  = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			//(2) Document 클래스에서 오브젝트를 불러옴 
			//**Document클래스 : 파싱된 xml문서에 대한 접근 방법을 제공하는 클래스
			Document K40_doc = K40_docBuilder.parse(new File("C:\\Users\\최신\\Desktop\\score.xml"));
			Element K40_root = K40_doc.getDocumentElement(); 
			//(3)NodeList 클래스에서 오브젝트를 불러옴
			//**NodeList  클래스 : 태그이름으로 정보를 읽어와서 저장 (노드형태)
			NodeList K40_tag_name = K40_doc.getElementsByTagName("name");  //이름
			NodeList K40_tag_studentid = K40_doc.getElementsByTagName("studentid"); //학번 
			NodeList K40_tag_kor = K40_doc.getElementsByTagName("kor");  //국어
			NodeList K40_tag_eng = K40_doc.getElementsByTagName("eng");  //영어
			NodeList K40_tag_mat = K40_doc.getElementsByTagName("mat"); //수학
			//출력폼
			System.out.printf("*******************************************\n");
					for(int i = 0; i < K40_tag_name.getLength() ; i++) { //for 반복문 : tag_name에 저장된 값의 갯수 만큼
																											//각 항목의 저장된 값을 가져오기
						System.out.printf("이름 : %s\n",K40_tag_name. item(i).getFirstChild().getNodeValue()); 
						System.out.printf("학번 : %s\n",K40_tag_studentid.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("국어 : %s\n",K40_tag_kor.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("영어 : %s\n",K40_tag_eng.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("수학 : %s\n",K40_tag_mat.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("*******************************************\n");
					}

	}

}
