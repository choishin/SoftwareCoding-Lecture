package k40_ArrayList01_09;

import java.util.ArrayList;
/*
 * 9.ArrayList (����)
 * (1)arr.size() : �迭�� ��� ��Ұ� ��� �ִ���
 * (2)arr.get(i) : i��° �迭�� ��Ҹ� ��������
 * (3)arr.set(i,��������) : i��° ��Ҹ� �ٲٱ�
 * (4)arr.remove(i) :i��° ��� �����ϱ� (�ڿ��ִ� ��Ұ� �����)
 * (5)arr.sort(null) :������� ���� 
 * (6)arr.clear(); : ArrayList ���� ����
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList k40_iAL = new ArrayList(); //ArrayList ����
		 k40_iAL.add("abc"); 	//ArrayList�� ���� (0��)
		 k40_iAL.add("abcd"); 	//ArrayList�� ���� (1��)
		 k40_iAL.add("efga"); 	//ArrayList�� ���� (2��)
		 k40_iAL.add("������0");//ArrayList�� ���� (3��)
		 k40_iAL.add("1234"); 	//ArrayList�� ���� (4��)
		 k40_iAL.add("12rk34");	//ArrayList�� ���� (5��)
		 //��iAL.add(356); ��̸���Ʈ�� ��Ʈ������ �������ϴµ� �߰��� ���ڸ� ������ �ȵ�.
		System.out.printf("****************************************\n");
		System.out.printf("���� Arraysize %d \n",k40_iAL.size()); //���� 6���� string�� ����
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n",k40_i,k40_iAL.get(k40_i)); //�� ��� ���
		 k40_iAL.set(3,"������"); //***3�� ArrayList�� ������ ����
		System.out.printf("****************************************\n");
		 System.out.printf("���뺯�� ArraySize %d \n",k40_iAL.size()); //���� 6�� 
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++) 
		 System.out.printf("Arraylist %d = %s\n",k40_i,k40_iAL.get(k40_i)); //����� ��� (3����Ұ� ����)
		 k40_iAL.remove(4); //****4�� ArrayList ��� ����
		 System.out.printf("****************************************\n");
		 System.out.printf("���뺯�� ArraySize %d \n",k40_iAL.size()); //���� 5��
		 for(int k40_i=0; k40_i < k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n", k40_i, k40_iAL.get(k40_i)); //***4���̻������ 5���� 4���� ��
		 k40_iAL.sort(null); //ArrayList�� ������� ����
		 System.out.printf("****************************************\n");
		 System.out.printf("����ƮSort ArraySize %d \n",k40_iAL.size());//���� 5��
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n",k40_i,k40_iAL.get(k40_i)); //***����->����->�ѱ� ��
		 k40_iAL.clear(); //***ArrayList ���� ����
		 System.out.printf("****************************************\n");
		 System.out.printf("���� ���� ArraySize %d \n",k40_iAL.size());
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n",k40_i,k40_iAL.get(k40_i)); //���� ���� ��
	}

}
