package k40_ReadNumber08;
//8.숫자읽기
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String배열 선언 
		String[] k40_units = {"영","일","이","삼","사","오","육","칠","팔","구"};
		String[] k40_unitx = {"십"};
		//반복 : 100번 반복해 줄 것
		for(int k40_i = 0; k40_i < 101; k40_i++){
			//조건(1) : k40_i가 0과 같거나 크고, 10보다는 작다면 
			if(k40_i >= 0 && k40_i < 10 ) {
				//일의자리 : k40_unit[k40_i]를 출력
				//예) k40_i=0 일때 k40_unit[0] = "영" 출력
				System.out.printf("일의 자리 : %s\n",k40_units[k40_i]); 
			}
			//조건(2) : k40_i가 10과 같거나 크고 100보다 작다면
			else if(k40_i >= 10 && k40_i < 100 ) {
				//조건을 위해 필요한 변수 선언해주기
				int k40_i10, k40_i0; 
				k40_i10 = k40_i/10; //십의 자리를 표현할 변수(k40_i를 10으로 나눈값)
				k40_i0= k40_i %10; //일의 자리(k40_i를 10으로 나눈 나머지)
				//조건 : 일의자리가 0이라면
				if(k40_i0 == 0){
					//k40_i를 10으로 나눈 값은 k40_i의 십의자리, 인덱스에 맞게 출력 
					System.out.printf("십의 자리 : %s%s\n",k40_units[k40_i10],k40_unitx[0]);
				}
				else{
					//일의자리가 0이 아니라면, k40_i의 십의자리와 k40_i를 10으로 나눈 나머지 즉, 일의자리를 같이 출력
					System.out.printf("십의 자리 : %s%s%s\n",k40_units[k40_i10],k40_unitx[0],k40_units[k40_i0]);
				}
			}
			//조건(3) : 그 어느것도 아니라면 그냥 k40_i를 출력 (즉, 마지막 수를 출력)
			else System.out.printf("==> %d\n", k40_i);

		}
	}

}
