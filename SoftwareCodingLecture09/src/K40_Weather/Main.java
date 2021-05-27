package K40_Weather;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
//2.OpenAPI ���û ������ �簡�� �ϱ�
public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		//(1) DocumentBuilder Ŭ�������� ������Ʈ�� �ҷ��� 
		//**DocumentBuilder Ŭ���� :  xml ������ �Ľ��ϴ� Ŭ����
		//**DocumnetBuilderFactory :  DocumnetBuilder ��ü�� �����ϴ� Ŭ����
		DocumentBuilder K40_docBuilder  = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//(2) Document Ŭ�������� ������Ʈ�� �ҷ��� 
		//**DocumentŬ���� : �Ľ̵� xml������ ���� ���� ����� �����ϴ� Ŭ����
		Document K40_doc = K40_docBuilder.parse(new File("C:\\Users\\�ֽ�\\Desktop\\queryDFS.jsp.xml"));
		Element K40_root = K40_doc.getDocumentElement(); 
		//(3)NodeList Ŭ�������� ������Ʈ�� �ҷ���
		//**NodeList  Ŭ���� : �±��̸����� ������ �о�ͼ� ���� (�������)
		NodeList K40_tag_001 = K40_doc.getElementsByTagName("data"); //<data ~ > </data ~> ������ ����

		String K40_seq="";  //48�ð��� ���° ���� ����Ŵ
		String K40_hour=""; //���׿��� 3�ð� ����
		String K40_day=""; //1��°�� (0: ����/1 : ����/2: ��)
		String K40_temp="";  // ���� �ð��µ�
		String K40_tmx=""; // �ְ� �µ�
		String K40_tmn=""; // ���� �µ� 
		String K40_sky=""; //�ϴ� �����ڵ� (1: ����, 2: ��������, 3: ��������, 4: �帲)
		String K40_pty=""; // ���� �����ڵ� (0: ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��) 
		String K40_wfKor="";//���� �ѱ���
		String K40_wfEn=""; //���� ����
		String K40_pop="";  // ���� Ȯ��%
		String K40_r12="";  //12�ð� ���� ������
		String K40_s12=""; //12�ð� ���� ������
		String K40_ws=""; // ǳ��(m/s) 
		String K40_wd=""; //ǳ�� (0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String K40_wdKor=""; // ǳ�� �ѱ���
		String K40_wdEn="";  // ǳ�� ����
		String K40_reh=""; //����%
		String K40_r06=""; //6�ð� ���� ������
		String K40_s06="";//6�ð� ���� ������
		
		System.out.println(" ��¥�� �������ּ���."); //������� ���� �ޱ�
		System.out.println("0.���� 1. ���� 2. ��"); 
		Scanner K40_scanner = new Scanner(System.in);
		String K40_type1 = K40_scanner.next(); 
		
		for (int i = 0; i < K40_tag_001.getLength(); i++) {
			Element elmt = (Element) K40_tag_001.item(i); //<data ~ > </data ~> ������ ������ ��
			//�� �׸��� ����� ���� ��������
			K40_seq = K40_tag_001.item(i).getAttributes ().getNamedItem("seq").getNodeValue(); 
			K40_hour = elmt.getElementsByTagName("hour").item (0).getFirstChild().getNodeValue(); 
			K40_day = elmt.getElementsByTagName("day").item (0).getFirstChild().getNodeValue(); 
			K40_temp = elmt.getElementsByTagName("temp").item (0).getFirstChild().getNodeValue(); 
			K40_tmx = elmt.getElementsByTagName("tmx").item (0).getFirstChild().getNodeValue();
			K40_tmn = elmt.getElementsByTagName("tmn").item (0).getFirstChild().getNodeValue(); 
			K40_sky = elmt.getElementsByTagName("sky").item (0).getFirstChild().getNodeValue();
			K40_pty = elmt.getElementsByTagName("pty").item (0).getFirstChild().getNodeValue();
			K40_wfKor = elmt.getElementsByTagName("wfKor").item (0).getFirstChild().getNodeValue(); 
			K40_wfEn = elmt.getElementsByTagName("wfEn").item (0).getFirstChild().getNodeValue(); 
			K40_pop = elmt.getElementsByTagName("pop").item (0).getFirstChild().getNodeValue();
			K40_r12 = elmt.getElementsByTagName("r12").item (0).getFirstChild().getNodeValue();
			K40_s12 = elmt.getElementsByTagName("s12").item (0).getFirstChild().getNodeValue(); 
			K40_ws = elmt.getElementsByTagName("ws").item (0).getFirstChild().getNodeValue(); 
			K40_wd = elmt.getElementsByTagName("wd").item (0).getFirstChild().getNodeValue(); 
			K40_wdKor = elmt.getElementsByTagName("wdKor").item (0).getFirstChild().getNodeValue(); 
			K40_wdEn = elmt.getElementsByTagName("wdEn").item (0).getFirstChild().getNodeValue(); 
			K40_reh =  elmt.getElementsByTagName("reh").item (0).getFirstChild().getNodeValue();
			K40_r06 = elmt.getElementsByTagName("r06").item (0).getFirstChild().getNodeValue(); 
			K40_s06 = elmt.getElementsByTagName("s06").item (0).getFirstChild().getNodeValue();
			
			if (K40_type1.contains(K40_day)) { //���� ����ڰ� ������ Ÿ���� day �ڷ� �ȿ� �ִٸ� ���
			System.out.printf("****************[%s ��° �׸�]****************\n",K40_seq);
			System.out.printf("%s��\n",K40_hour);
			if (K40_day.equals( "0") ) {
				K40_day = "����";
			}
			else if (K40_day.equals( "1")) {
				K40_day = "����";
			}
			else 
				K40_day = "��";
			System.out.printf("��¥ : %s\n",K40_day);
			System.out.printf("�µ� : %s��\n",K40_temp);
			System.out.printf("�ְ�µ� : %s��\n",K40_tmx);
			System.out.printf("�����µ� : %s��\n",K40_tmn);
			if (K40_sky.equals( "1") ) {
				K40_sky = "����";
			}
			else if (K40_day.equals( "2")) {
				K40_sky = "��������";
			}
			else if (K40_sky.equals( "3")) {
				K40_sky = "��������";
			}
			else 
				K40_sky = "�帲";
			System.out.printf("����Ȳ : %s\n",K40_sky);
			if (K40_pty.equals( "0") ) {
				K40_pty = "����";
			}
			else if (K40_pty.equals( "1")) {
				K40_pty = "��";
			}
			else if (K40_pty.equals( "2")) {
				K40_pty = "�� �Ǵ� ��";
			}
			else if (K40_pty.equals( "3")) {
				K40_pty = "�� �Ǵ� ��";
			}
			else 
				K40_pty = "��";
			System.out.printf("������Ȳ : %s\n",K40_pty);
			System.out.printf("�ѱ��� ���� : %s\n",K40_wfKor);
			System.out.printf("���� ���� : %s\n",K40_wfEn);
			System.out.printf("����Ȯ�� : %s%%\n",K40_pop);
			System.out.printf("12�ð� ���� ������ : %s\n",K40_r12);
			System.out.printf("12�ð� ���� ������ : %s\n",K40_s12);
			System.out.printf("ǳ�� : %sm/s\n",K40_ws);
			if (K40_wd.equals( "0") ) {
				K40_wd = "��";
			}
			else if (K40_wd.equals( "1")) {
				K40_wd = "�ϵ�";
			}
			else if (K40_wd.equals( "2")) {
				K40_wd = "��";
			}
			else if (K40_wd.equals( "3")) {
				K40_wd = "����";
			}
			else if (K40_wd.equals( "4")) {
				K40_wd = "��";
			}
			else if (K40_wd.equals( "5")) {
				K40_wd = "����";
			}
			else if (K40_wd.equals( "6")) {
				K40_wd = "��";
			}
			else 
				K40_wd = "�ϼ�";
			System.out.printf("ǳ�� : %s\n",K40_wd);
			System.out.printf("�ѱ��� ǳ�� : %s\n",K40_wdKor);
			System.out.printf("���� ǳ�� : %s\n",K40_wdEn);
			System.out.printf("���� : %s%%\n",K40_reh);
			System.out.printf("6�ð� ���� ������ : %s\n",K40_r06);
			System.out.printf("6�ð� ���� ������ : %s\n",K40_s06);
			System.out.printf("*****************************************\n");
			
			}
		}
	}
}
