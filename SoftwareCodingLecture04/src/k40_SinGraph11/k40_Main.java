package k40_SinGraph11;
//11.Sin�Լ� �׷��� �׸���
public class k40_Main {

	public static void main(String[] args) {
		
		double k40_fSin;
		//1.�������� sin�� ����ϱ�
		//�ݺ� : 360�� �ݺ����ٰ��� (k40_i�� ������)
		for(int k40_i = 0; k40_i < 360; k40_i++) { //�������ڸ�Ʈ : 360�� ���� ���� ������
			//MathŬ������ sin �޼ҵ带 �ҷ�����
			//sin ��� �ǻ츮�� : 2��� 360��, ��� 180��, 1/2��� 90��, 1/3��� 60��, 1/6��� 30��...
			//double k40_fSin = ���� * 1���� ��(��/180)
			k40_fSin = Math.sin(k40_i *3.141592/180); 
			System.out.printf("%d sin ==>%f\n", k40_i, k40_fSin); //������ sin���� ���
		}//for
			//2.������ ���� ��� �׷����� ǥ������ ����
			//�ݺ� : 360�� �ݺ��� ��
			for(int k40_i = 0; k40_i < 360; k40_i++) { //������ �ڸ�Ʈ : 360������ �׸���
			//double k40_fSin = ���� * 1���� ��(��/180)
				k40_fSin= Math.sin(k40_i * 3.141592/180);
			//***k40_iSpace = (1.0 - k40_fSin) : ���ΰ� �� ������ �ֱ� ������ ���ȭ �ϱ����� ��� 
			//(int)�� ���� ����ȯ�ؼ� �������� ���� ���ְ�
			//���⿡ �׷����� �׸���ŭ �ð������� ���� ���� ���̸� ũ�� ���ֱ� ���� 50�� ���ϱ�
			//��1) ���ΰ� : 0.000000�̸�, (int)(1 -0.0000 =1) *50 = 50�̰� ������ 50���� ����
			//��2) ���ΰ� : 0.981627�̸�, (int)(1 -0.981627 =0.1)*50 = 0�̰� ������ 0��
			int k40_iSpace = (int) ((1.0 - k40_fSin) * 50);
			//�ݺ�2 : k40_iSpcae�� ��ŭ �ݺ� ������ �� (1) : �������
			for (int k40_j = 0; k40_j < k40_iSpace; k40_j++) System.out.printf(" "); 
			//�ݺ� �����Ұ�(2) : *�� ���ΰ��� k40_iSpace�� ��� (���鳡�� ����)
			System.out.printf("*[%f] [%d] \n", k40_fSin, k40_iSpace);
		}
		
	}
}
	
