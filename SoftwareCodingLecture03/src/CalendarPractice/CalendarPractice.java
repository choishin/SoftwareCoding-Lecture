package CalendarPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//calendar 불러올때 클라스이름 Calendar이름 쓰면 안됨
public class CalendarPractice {

	public static void main(String[] args) {

		//시스템에서 불러오는 것이기 때문에 new가 아니라 get
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		System.out.printf("최종 실행 시간 : %s\n",simple.format(calendar.getTime()));


	}//main





}//class
