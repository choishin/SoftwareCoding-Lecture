package ArithmeticOperator02;
//2. 누적하기, 합구하기
public class kopo40Arithmetic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수선언 
		int kopo40sum = 0;
		//반복문 : 1부터 100까지 총합을 구하려고 함
		for (int i = 1; i < 101; i++) {
			kopo40sum = kopo40sum + i;		
		}
		//2-1.for문에 넣었던 kopo40sum 결과 출력
		//2-2.kopo40sum에서 100으로 나눈 것 = 평균값 출력
		System.out.printf("#2 -1 :  %d\n",kopo40sum);
		System.out.printf("#2 -2 :  %d\n",kopo40sum/100);

		//배열선언
		int [] kopo40Arr = {1,2,3,4,5};
		int Arrsum =0;
		//for문 : 0부터 kopo40Arr의 갯수만큼 반복할 것 임
		//데이터흐름에 주목해야함 (1)->(2)->(3)->(4)->(2)->(3)->(4)->(2)
		//(1)변수선언 ;(2)이 조건이 참이라면 반복 (4)값을 올려
		for (int i = 0; i <kopo40Arr.length; i++) {
			//(3)시행할 명령, 여기서는 총합을 구해줄 것임
			Arrsum = Arrsum + kopo40Arr[i];
		}
		//2-3. for문에 배열의 값을 하나씩 넣어 총합을 구한 결과 출력
		System.out.printf("#2 -3 :  %d\n",Arrsum);
		
	}//main

}//class
