package k40_ArrayMinMax_07;
/*
 * 6.�迭�� �ִ�,�ּҰ� ã�� 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� ���ڵ��� �־���.
		int[] k40_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		
		//�ִ밪 ã��
		for(int k40_i=0;k40_i<k40_iArray.length;k40_i++)  
			System.out.printf("iArrav[%d]=%d\n",k40_i,k40_iArray[k40_i]);//���ڵ��� ���ʷ� ���
		int k40_iMax = k40_iArray[0];  //�ִ밪�� ���� 0��° ����
		int k40_iMaxPt=0; //�ִ밪�� �ִ� �ε��� ���� ������� ������ ����
		for(int i=0;i<k40_iArray.length;i++) 
			if(k40_iMax < k40_iArray[i]) {	//�迭�� ���ڸ� ������� Ȯ���ؼ� ���� ���� �ִ밪���� ū���� ��Ÿ����  
				k40_iMax = k40_iArray[i];//�ִ밪�� �� ���� �ٲ��� �� 
				k40_iMaxPt = i; //�� ��° �������� ����
			}
		System.out.printf("MAX : iArray[%d]=%d\n",k40_iMaxPt,k40_iMax); //�ִ밪 ���

		//�ּҰ� ã��
		for(int k40_i=0;k40_i<k40_iArray.length;k40_i++) 
			System.out.printf("iArrav[%d]=%d\n",k40_i,k40_iArray[k40_i]); //���ڵ��� ���ʷ� ���
		int k40_iMin = k40_iArray[0]; //�ּҰ��� ���� 0��° ����
		int iMinPt=0; //�迭�� �ּҰ��� �ε����� �������� ������ ����
		for(int k40_i=0;k40_i<k40_iArray.length;k40_i++) 
			if(k40_iMin > k40_iArray[k40_i]) { //���� �ּҰ����� ���� ���� ��Ÿ����
				k40_iMin = k40_iArray[k40_i]; //�ּҰ��� �ٲ��ְ�
				iMinPt = k40_i; //�� �ε����� ����
			}
		System.out.printf("Min : iArray[%d]=%d\n",iMinPt,k40_iMin);
		//***-> 1�� �迭 �ȿ� 3�� �ִµ�, �̷� ��� ù��° 1�� �ּҰ��� ��.
	}
}
