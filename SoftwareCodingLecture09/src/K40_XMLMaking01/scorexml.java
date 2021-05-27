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
//1.XML �Ľ� �⺻ 
public class scorexml {

		public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
			//(1) DocumentBuilder Ŭ�������� ������Ʈ�� �ҷ��� 
			//**DocumentBuilder Ŭ���� :  xml ������ �Ľ��ϴ� Ŭ����
			//**DocumnetBuilderFactory :  DocumnetBuilder ��ü�� �����ϴ� Ŭ����
			DocumentBuilder K40_docBuilder  = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			//(2) Document Ŭ�������� ������Ʈ�� �ҷ��� 
			//**DocumentŬ���� : �Ľ̵� xml������ ���� ���� ����� �����ϴ� Ŭ����
			Document K40_doc = K40_docBuilder.parse(new File("C:\\Users\\�ֽ�\\Desktop\\score.xml"));
			Element K40_root = K40_doc.getDocumentElement(); 
			//(3)NodeList Ŭ�������� ������Ʈ�� �ҷ���
			//**NodeList  Ŭ���� : �±��̸����� ������ �о�ͼ� ���� (�������)
			NodeList K40_tag_name = K40_doc.getElementsByTagName("name");  //�̸�
			NodeList K40_tag_studentid = K40_doc.getElementsByTagName("studentid"); //�й� 
			NodeList K40_tag_kor = K40_doc.getElementsByTagName("kor");  //����
			NodeList K40_tag_eng = K40_doc.getElementsByTagName("eng");  //����
			NodeList K40_tag_mat = K40_doc.getElementsByTagName("mat"); //����
			//�����
			System.out.printf("*******************************************\n");
					for(int i = 0; i < K40_tag_name.getLength() ; i++) { //for �ݺ��� : tag_name�� ����� ���� ���� ��ŭ
																											//�� �׸��� ����� ���� ��������
						System.out.printf("�̸� : %s\n",K40_tag_name. item(i).getFirstChild().getNodeValue()); 
						System.out.printf("�й� : %s\n",K40_tag_studentid.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("���� : %s\n",K40_tag_kor.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("���� : %s\n",K40_tag_eng.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("���� : %s\n",K40_tag_mat.item(i).getFirstChild().getNodeValue()); 
						System.out.printf("*******************************************\n");
					}

	}

}
