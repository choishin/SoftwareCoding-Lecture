package CalendarPractice;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//calendar �ҷ��ö� Ŭ���̸� Calendar�̸� ���� �ȵ�
public class kopo40CalendarPractice2 {

	public static void main(String[] args) {

		/**��¥ ��� �� : Simpledateformat(��¥�� ���� ����)�� Date(��¥����) Ŭ�������� ������Ʈ �ҷ�����
		 *Calendar class�� �ý��ۿ��� �ҷ����� ���̱� ������ new�� �ƴ϶� get*/
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		DecimalFormat df = new DecimalFormat("###,###,###,###,###,###,###,###");
		
		int kopo40MyWon = 1000000;
		double kopo40Ex_rate = 1238.21;
		double kopo40commission = 0.003;//3%
		//kopo40ComPerOne : usd 1�� �� �ٴ� Ŀ�̼�
		double kopo40ComPerOne = kopo40Ex_rate * kopo40commission;
		
		//����� usd �׼��� �ٲ�! �����δ� ���� ���� ȯ��+ȯ�������Ḧ ������ ������ ������ ����
		//=> 100���� / (1238.21��(=1�޷�) + ������(ComPerOne))
		int kopo40usd = (int)(kopo40MyWon/(kopo40Ex_rate +kopo40ComPerOne));
		//kopo40remain = 100���� - usd���� * ȯ�� : �Ž�����
		int kopo40remain = (int)(kopo40MyWon -kopo40usd*kopo40Ex_rate);
		//kopo40total_Commition = �� ������
		double kopo40total_Commission = kopo40usd * kopo40ComPerOne;
		
		//���⼭���� �����Ḧ double�� �޴� ���� int�� ó���� ����(�ø�)
		int kopo40i_totalcom;
		//if������ üũ '���� ��ŻĿ�̼��� int�� ����ȯ �� ���� ��ŻĿ�̼��� ���� ���� �ʴٸ�'
		if (kopo40total_Commission != (double)((int)(kopo40total_Commission))) {
			//'������ ��ȯ�� Ŀ�̼ǿ��� 1�� ���ϰڴ�'
			kopo40i_totalcom = (int)(kopo40total_Commission)+1;
		} else { 
			//�ƴ϶��, ���� (���� �� �������� ���)
			kopo40i_totalcom = (int)(kopo40total_Commission);
		}
		//�����Ḧ ���� ���� �ܵ��� ����ؾ� ��!		
		kopo40remain = (int) (kopo40MyWon - kopo40usd*kopo40Ex_rate - (kopo40i_totalcom));
		
		System.out.printf("**************************************************************************\n");
		System.out.printf("         		   �޸����, ��¥ ����   	    			   \n");
		                //decimalformat�� %s�� ����
		System.out.printf("�� ������: %s �� => ��ȭ : %s �޷�, �޷��� ������ : %f ��\n",
						df.format(kopo40i_totalcom),
						df.format(kopo40usd),
						kopo40ComPerOne); //ComPerOne�� double�̶� �� �� ����
		System.out.printf("�� ��ȭȯ���ݾ�: %s ��=> ��ȭ : %s �޷�, ������û�� : %s ��, �ܵ� : %s ��\n", 
						df.format(kopo40MyWon), 
						df.format(kopo40usd),
						df.format(kopo40i_totalcom), 
						df.format(kopo40remain));
											/***�߰��� ��¥�� ���⿡ ��ġ������ ����***/
		System.out.printf("���� ���� �ð� : %s\n",simple.format(calendar.getTime()));
		
		System.out.printf("**************************************************************************\n");


	}//main





}//class
