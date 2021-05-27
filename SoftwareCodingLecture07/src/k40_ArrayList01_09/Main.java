package k40_ArrayList01_09;

import java.util.ArrayList;
/*
 * 9.ArrayList (사용법)
 * (1)arr.size() : 배열에 담긴 요소가 몇개가 있는지
 * (2)arr.get(i) : i번째 배열의 요소를 가져오기
 * (3)arr.set(i,수정내용) : i번째 요소를 바꾸기
 * (4)arr.remove(i) :i번째 요소 제거하기 (뒤에있던 요소가 당겨짐)
 * (5)arr.sort(null) :순서대로 정렬 
 * (6)arr.clear(); : ArrayList 전부 삭제
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList k40_iAL = new ArrayList(); //ArrayList 생성
		 k40_iAL.add("abc"); 	//ArrayList에 저장 (0번)
		 k40_iAL.add("abcd"); 	//ArrayList에 저장 (1번)
		 k40_iAL.add("efga"); 	//ArrayList에 저장 (2번)
		 k40_iAL.add("가나다0");//ArrayList에 저장 (3번)
		 k40_iAL.add("1234"); 	//ArrayList에 저장 (4번)
		 k40_iAL.add("12rk34");	//ArrayList에 저장 (5번)
		 //※iAL.add(356); 어레이리스트를 스트링으로 쓰려고하는데 중간에 숫자를 넣으면 안됨.
		System.out.printf("****************************************\n");
		System.out.printf("시작 Arraysize %d \n",k40_iAL.size()); //현재 6개의 string이 저장
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n",k40_i,k40_iAL.get(k40_i)); //각 요소 출력
		 k40_iAL.set(3,"가라라라"); //***3번 ArrayList의 내용을 변경
		System.out.printf("****************************************\n");
		 System.out.printf("내용변경 ArraySize %d \n",k40_iAL.size()); //현재 6개 
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++) 
		 System.out.printf("Arraylist %d = %s\n",k40_i,k40_iAL.get(k40_i)); //각요소 출력 (3번요소가 변함)
		 k40_iAL.remove(4); //****4번 ArrayList 요소 제거
		 System.out.printf("****************************************\n");
		 System.out.printf("내용변경 ArraySize %d \n",k40_iAL.size()); //현재 5개
		 for(int k40_i=0; k40_i < k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n", k40_i, k40_iAL.get(k40_i)); //***4번이사라지고 5번이 4번이 됨
		 k40_iAL.sort(null); //ArrayList를 순서대로 정렬
		 System.out.printf("****************************************\n");
		 System.out.printf("리스트Sort ArraySize %d \n",k40_iAL.size());//현재 5개
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n",k40_i,k40_iAL.get(k40_i)); //***숫자->영문->한글 순
		 k40_iAL.clear(); //***ArrayList 전부 삭제
		 System.out.printf("****************************************\n");
		 System.out.printf("전부 삭제 ArraySize %d \n",k40_iAL.size());
		 for(int k40_i=0; k40_i<k40_iAL.size(); k40_i++)
		 System.out.printf("ArrayList %d = %s\n",k40_i,k40_iAL.get(k40_i)); //전부 삭제 됨
	}

}
