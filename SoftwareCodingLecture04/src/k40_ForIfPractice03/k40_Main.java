package k40_ForIfPractice03;
//3.������ �־� ��(ã��)
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_iVal; //int�� ���� k40_iVal ����
		for(int k40_i = 0; k40_i < 300; k40_i++){ //�ݺ��� : 300�� ����
			k40_iVal= 5 * k40_i; // k40_iVal�� 5�� ����� �����
		if(k40_iVal >= 0 && k40_iVal < 10) System.out.printf("�� %d\n",k40_iVal); 
		//if�� üũ : ����(1) ��, k40_iVal�� 0���� ũ�� 10���� ���� ���� "�� �ش����" ���
		else if (k40_iVal >= 10 && k40_iVal<100) System.out.printf("�� %d\n",k40_iVal); 
		//if�� üũ : ����(2) ��, k40_iVal�� 10���� ũ�� 100���� ���� ���� "�� �ش����" ���
		else if (k40_iVal >= 100 && k40_iVal<1000) System.out.printf("�� %d\n",k40_iVal); 
		//if�� üũ : ����(3) ��, k40_iVal�� 100���� ũ�� 1000���� ���� ���� "�� �ش����" ���
		else System.out.printf("õ %d\n",k40_iVal);
		}

	}

}
