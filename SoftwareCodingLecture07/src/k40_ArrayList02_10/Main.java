package k40_ArrayList02_10;

import java.util.ArrayList;
/*
 * 10.ArrayList2 (�鸸���� ���ڸ� �����ϰ� �̾� �迭�� �־� ����ϱ�)
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_iTestMAX= 1000000;
		ArrayList k40_iAL= new ArrayList(); //ArrayList Ŭ�������� ������Ʈ�� ����
		for(int k40_i=0; k40_i<k40_iTestMAX; k40_i++)
			k40_iAL.add((int)(Math.random()*1000000)); //iAL.add()<-������ ����, �迭�� �ֱ�

		for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
			System.out.printf("ArrayList %d = %d\n",k40_i,k40_iAL.get(k40_i)); //iAL.get() <-�����͸� ������ͼ� ���

		System.out.printf("****************************************\n");
		k40_iAL.sort(null); //iAL.sort <- ������� �����ϱ� 
		for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
			System.out.printf("ArrayList %d=%d\n",k40_i,k40_iAL.get(k40_i)); //<-�迭 ������ͼ� ���

	}

}

