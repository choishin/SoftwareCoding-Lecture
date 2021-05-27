package k40_ArrayList02_10;

import java.util.ArrayList;
/*
 * 10.ArrayList2 (백만에서 숫자를 랜덤하게 뽑아 배열에 넣어 출력하기)
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k40_iTestMAX= 1000000;
		ArrayList k40_iAL= new ArrayList(); //ArrayList 클래스에서 오브젝트를 생성
		for(int k40_i=0; k40_i<k40_iTestMAX; k40_i++)
			k40_iAL.add((int)(Math.random()*1000000)); //iAL.add()<-데이터 생성, 배열에 넣기

		for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
			System.out.printf("ArrayList %d = %d\n",k40_i,k40_iAL.get(k40_i)); //iAL.get() <-데이터를 가지고와서 출력

		System.out.printf("****************************************\n");
		k40_iAL.sort(null); //iAL.sort <- 순서대로 정렬하기 
		for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
			System.out.printf("ArrayList %d=%d\n",k40_i,k40_iAL.get(k40_i)); //<-배열 가지고와서 출력

	}

}

