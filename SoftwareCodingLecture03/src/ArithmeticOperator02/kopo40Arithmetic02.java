package ArithmeticOperator02;
//2. �����ϱ�, �ձ��ϱ�
public class kopo40Arithmetic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� 
		int kopo40sum = 0;
		//�ݺ��� : 1���� 100���� ������ ���Ϸ��� ��
		for (int i = 1; i < 101; i++) {
			kopo40sum = kopo40sum + i;		
		}
		//2-1.for���� �־��� kopo40sum ��� ���
		//2-2.kopo40sum���� 100���� ���� �� = ��հ� ���
		System.out.printf("#2 -1 :  %d\n",kopo40sum);
		System.out.printf("#2 -2 :  %d\n",kopo40sum/100);

		//�迭����
		int [] kopo40Arr = {1,2,3,4,5};
		int Arrsum =0;
		//for�� : 0���� kopo40Arr�� ������ŭ �ݺ��� �� ��
		//�������帧�� �ָ��ؾ��� (1)->(2)->(3)->(4)->(2)->(3)->(4)->(2)
		//(1)�������� ;(2)�� ������ ���̶�� �ݺ� (4)���� �÷�
		for (int i = 0; i <kopo40Arr.length; i++) {
			//(3)������ ���, ���⼭�� ������ ������ ����
			Arrsum = Arrsum + kopo40Arr[i];
		}
		//2-3. for���� �迭�� ���� �ϳ��� �־� ������ ���� ��� ���
		System.out.printf("#2 -3 :  %d\n",Arrsum);
		
	}//main

}//class
