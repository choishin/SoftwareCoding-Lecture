package TaxPractice03;
//3.�Һ��ڰ� ���� ��� (������ �����)
public class kopo40TaxPractice03 {

	public static void main (String[] args) {
		String[] kopo40item = {"������","���Ͻ�","�Ե�����","����","��극"};//�׸�
		int[] kopo40price = {1000,2000,3000,2500,1450}; //�ܰ�
		int[] kopo40amount = {10,2,1,3,5}; //����
		double kopo40tax_rate = 0.1;//����
		int kopo40total_sum = 0; //������ ���� �Ѱ���
		
		//������ ��
		System.out.printf("************************************\n");
		System.out.printf("           ��!!! ���ڴ�                \n");
		System.out.printf(" �׸�	�ܰ�	����	�հ�\n");
		//for�� : �������� ������ŭ �ݺ��� ���̴�
		//����� �� : �׸��� ���� ��ŭ �ܰ��� ������ �հ踦 �ݺ��ؼ� ���
		for (int i = 0; i<kopo40item.length; i++) {
			kopo40total_sum += kopo40total_sum + kopo40price[i]*kopo40amount[i];
	        System.out.printf("%.5s	%4d	%3d	%9d\n",kopo40item[i],kopo40price[i],kopo40amount[i],kopo40total_sum);
		}
		System.out.printf("************************************\n");
		System.out.printf("���ұݾ� :	%20d\n",kopo40total_sum); //���ұݾ� (����*���� ����)
		int kopo40total_netprice = (int)(kopo40total_sum/(1+kopo40tax_rate));
		//�����ݾ� = �� �հ迡�� ����+1�� ������ �� (�տ��� ���� ��)
		System.out.printf("�����ݾ� :	%20d\n",kopo40total_netprice);//������ �ݾ�
		//���� = �� �հ�(�Һ����ǸŰ���) - �� ��������
		int tax = (kopo40total_sum) - (kopo40total_netprice);
		System.out.printf("��  �� :	%20d\n",tax);


	}//main
}//class



