package TaxPractice01;
//1.�ܼ����ݰ��
public class kopo40TaxPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int kopo40value = 1000000; //����
		int kopo40rate = 3; //����
		int kopo40tax = taxCalcurator(kopo40value,kopo40rate);//����
		//�������� ���� �������� = kopo40value (����)
		//�������� ���� ���� = kopo40tax (����)
		//�������� ���� �������� ���� = kopo40value+kopo40tax(����+����)
	
	//�������� �μ�� ��
	System.out.printf("***********************************************\n");
	System.out.printf("                 �ܼ� ���� ���                    \n");
	System.out.printf("���� ���� ��� : %f\n",kopo40value*kopo40rate/100.0);
	System.out.printf("�������� : %d ���� : %d �������� ���� %d\n",kopo40value,kopo40tax,kopo40value+kopo40tax);
	System.out.printf("************************************************\n");

	}//main

static int taxCalcurator (int value, int rate) {
	
	//return�� ������� �켱 ���� �ϰ�
	int result;
	//if������ üũ�� ����
	//double�� ���� ����ȯ �� 'value' �� 'rate/100.0'�� ���� ����
	//Int�� ǥ���� 'value' * 'rate/100' �� ���ٸ�
	//=> ��, �Ҽ��� ���� ���� ���ٸ�
	if(((double)value *(double)rate/100.0) == value*rate/100) 
		result = value * rate/100;
	else 
		//���� �Ҽ����� �ִٸ� �׳� 1�� �÷���(���غ��� �ʱ� ����!)
		result = value * rate/100 +1;
	
	
	return result;
	
}//calcurator

}//class



