package k40_ArrayMinMax_07;
/*
 * 6.배열의 최대,최소값 찾기 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에 숫자들을 넣어줌.
		int[] k40_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		
		//최대값 찾기
		for(int k40_i=0;k40_i<k40_iArray.length;k40_i++)  
			System.out.printf("iArrav[%d]=%d\n",k40_i,k40_iArray[k40_i]);//숫자들을 차례로 출력
		int k40_iMax = k40_iArray[0];  //최대값은 현재 0번째 숫자
		int k40_iMaxPt=0; //최대값이 있는 인덱스 수를 기록해줄 변수를 선언
		for(int i=0;i<k40_iArray.length;i++) 
			if(k40_iMax < k40_iArray[i]) {	//배열의 숫자를 순서대로 확인해서 만일 현재 최대값보다 큰수가 나타나면  
				k40_iMax = k40_iArray[i];//최대값을 그 수로 바꿔준 후 
				k40_iMaxPt = i; //몇 번째 숫자인지 저장
			}
		System.out.printf("MAX : iArray[%d]=%d\n",k40_iMaxPt,k40_iMax); //최대값 출력

		//최소값 찾기
		for(int k40_i=0;k40_i<k40_iArray.length;k40_i++) 
			System.out.printf("iArrav[%d]=%d\n",k40_i,k40_iArray[k40_i]); //숫자들을 차례로 출력
		int k40_iMin = k40_iArray[0]; //최소값은 현재 0번째 숫자
		int iMinPt=0; //배열중 최소값의 인덱스를 저장해줄 변수를 선언
		for(int k40_i=0;k40_i<k40_iArray.length;k40_i++) 
			if(k40_iMin > k40_iArray[k40_i]) { //만일 최소값보다 작은 수가 나타나면
				k40_iMin = k40_iArray[k40_i]; //최소값을 바꿔주고
				iMinPt = k40_i; //그 인덱스를 저장
			}
		System.out.printf("Min : iArray[%d]=%d\n",iMinPt,k40_iMin);
		//***-> 1이 배열 안에 3개 있는데, 이런 경우 첫번째 1이 최소값이 됨.
	}
}
