package CalendarPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//calendar �ҷ��ö� Ŭ���̸� Calendar�̸� ���� �ȵ�
public class CalendarPractice {

	public static void main(String[] args) {

		//�ý��ۿ��� �ҷ����� ���̱� ������ new�� �ƴ϶� get
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		System.out.printf("���� ���� �ð� : %s\n",simple.format(calendar.getTime()));


	}//main





}//class
