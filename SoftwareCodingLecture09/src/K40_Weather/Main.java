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
//2.OpenAPI 기상청 데이터 재가공 하기
public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		//(1) DocumentBuilder 클래스에서 오브젝트를 불러옴 
		//**DocumentBuilder 클래스 :  xml 문서를 파싱하는 클래스
		//**DocumnetBuilderFactory :  DocumnetBuilder 객체를 생성하는 클래스
		DocumentBuilder K40_docBuilder  = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//(2) Document 클래스에서 오브젝트를 불러옴 
		//**Document클래스 : 파싱된 xml문서에 대한 접근 방법을 제공하는 클래스
		Document K40_doc = K40_docBuilder.parse(new File("C:\\Users\\최신\\Desktop\\queryDFS.jsp.xml"));
		Element K40_root = K40_doc.getDocumentElement(); 
		//(3)NodeList 클래스에서 오브젝트를 불러옴
		//**NodeList  클래스 : 태그이름으로 정보를 읽어와서 저장 (노드형태)
		NodeList K40_tag_001 = K40_doc.getElementsByTagName("data"); //<data ~ > </data ~> 정보를 저장

		String K40_seq="";  //48시간중 몇번째 인지 가르킴
		String K40_hour=""; //동네예보 3시간 단위
		String K40_day=""; //1번째날 (0: 오늘/1 : 내일/2: 모레)
		String K40_temp="";  // 현재 시간온도
		String K40_tmx=""; // 최고 온도
		String K40_tmn=""; // 최저 온도 
		String K40_sky=""; //하늘 상태코드 (1: 맑음, 2: 구름조금, 3: 구름많음, 4: 흐림)
		String K40_pty=""; // 강수 상태코드 (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈) 
		String K40_wfKor="";//날씨 한국에
		String K40_wfEn=""; //날씨 영어
		String K40_pop="";  // 강수 확률%
		String K40_r12="";  //12시간 예상 강수량
		String K40_s12=""; //12시간 예상 적설량
		String K40_ws=""; // 풍속(m/s) 
		String K40_wd=""; //풍향 (0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String K40_wdKor=""; // 풍향 한국어
		String K40_wdEn="";  // 풍향 영어
		String K40_reh=""; //습도%
		String K40_r06=""; //6시간 예상 강수량
		String K40_s06="";//6시간 예상 적설량
		
		System.out.println(" 날짜를 선택해주세요."); //사용자의 선택 받기
		System.out.println("0.오늘 1. 내일 2. 모레"); 
		Scanner K40_scanner = new Scanner(System.in);
		String K40_type1 = K40_scanner.next(); 
		
		for (int i = 0; i < K40_tag_001.getLength(); i++) {
			Element elmt = (Element) K40_tag_001.item(i); //<data ~ > </data ~> 정보를 가지고 옴
			//각 항목의 저장된 값을 가져오기
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
			
			if (K40_type1.contains(K40_day)) { //만일 사용자가 선택한 타입이 day 자료 안에 있다면 출력
			System.out.printf("****************[%s 번째 항목]****************\n",K40_seq);
			System.out.printf("%s시\n",K40_hour);
			if (K40_day.equals( "0") ) {
				K40_day = "오늘";
			}
			else if (K40_day.equals( "1")) {
				K40_day = "내일";
			}
			else 
				K40_day = "모레";
			System.out.printf("날짜 : %s\n",K40_day);
			System.out.printf("온도 : %s℃\n",K40_temp);
			System.out.printf("최고온도 : %s℃\n",K40_tmx);
			System.out.printf("최저온도 : %s℃\n",K40_tmn);
			if (K40_sky.equals( "1") ) {
				K40_sky = "맑음";
			}
			else if (K40_day.equals( "2")) {
				K40_sky = "구름조금";
			}
			else if (K40_sky.equals( "3")) {
				K40_sky = "구름많음";
			}
			else 
				K40_sky = "흐림";
			System.out.printf("기상상황 : %s\n",K40_sky);
			if (K40_pty.equals( "0") ) {
				K40_pty = "없음";
			}
			else if (K40_pty.equals( "1")) {
				K40_pty = "비";
			}
			else if (K40_pty.equals( "2")) {
				K40_pty = "비 또는 눈";
			}
			else if (K40_pty.equals( "3")) {
				K40_pty = "눈 또는 비";
			}
			else 
				K40_pty = "눈";
			System.out.printf("강수상황 : %s\n",K40_pty);
			System.out.printf("한국어 날씨 : %s\n",K40_wfKor);
			System.out.printf("영어 날씨 : %s\n",K40_wfEn);
			System.out.printf("강수확률 : %s%%\n",K40_pop);
			System.out.printf("12시간 예상 강수량 : %s\n",K40_r12);
			System.out.printf("12시간 예상 적설량 : %s\n",K40_s12);
			System.out.printf("풍속 : %sm/s\n",K40_ws);
			if (K40_wd.equals( "0") ) {
				K40_wd = "북";
			}
			else if (K40_wd.equals( "1")) {
				K40_wd = "북동";
			}
			else if (K40_wd.equals( "2")) {
				K40_wd = "동";
			}
			else if (K40_wd.equals( "3")) {
				K40_wd = "남동";
			}
			else if (K40_wd.equals( "4")) {
				K40_wd = "남";
			}
			else if (K40_wd.equals( "5")) {
				K40_wd = "남서";
			}
			else if (K40_wd.equals( "6")) {
				K40_wd = "서";
			}
			else 
				K40_wd = "북서";
			System.out.printf("풍향 : %s\n",K40_wd);
			System.out.printf("한국어 풍향 : %s\n",K40_wdKor);
			System.out.printf("영어 풍향 : %s\n",K40_wdEn);
			System.out.printf("습도 : %s%%\n",K40_reh);
			System.out.printf("6시간 예상 강수량 : %s\n",K40_r06);
			System.out.printf("6시간 예상 적설량 : %s\n",K40_s06);
			System.out.printf("*****************************************\n");
			
			}
		}
	}
}
