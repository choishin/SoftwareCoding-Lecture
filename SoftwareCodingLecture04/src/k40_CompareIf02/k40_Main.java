package k40_CompareIf02;
//2.숫자형, 문자형 비교
public class k40_Main {

	public static void main(String[] args) {
		
		int k40_il; double k40_iD;
		k40_il = 10/3; // k40_il은 int값이기 때문에 = 3 (나머지 소수점 이하는 버려짐)
		k40_iD = 10/3.0; //k40_iD는 double값이기 때문에 = 3.333333
		
		//2-1. if문으로 체크 10/3을 한 double형의 결과와 int형의 결과가 같다면 'equal', 
		// 다르다면 'Not equal'과 함께 결과 출력
		if (k40_il == k40_iD) System.out.printf("(2-1.)equal\n"); 
		else System.out.printf("(2-1.)Not equal [%f][%f]\n", (double)k40_il, k40_iD);
		
		//2-2. k40_iD = 3.333333 이라면 'equal' 다르다면 'Not equal'과 함께 결과 출력
		if (k40_iD == 3.333333) System.out.printf("(2-2.)equal\n"); 
		else System.out.printf("(2-2.)Not equal [3.333333][%f]\n", k40_iD); 
		
		//2-3. double형인 k40_iD는 이제 int로 강제 형변환한 결과값이고
		//그 결과값이 그냥 int로 계산한 10/3과 결과값이 같다면 'equal' 다르다면 'Not equal'과 결과출력
		k40_iD = (int) k40_iD; 
		if(k40_il == k40_iD) System.out.printf("(2-3.)equal\n"); 
		else System.out.printf("(2-3.)Not equal [%f][%f]\n",(double)k40_il, 0); 
		System.out.printf("(2-3.)int로 인쇄 [%d][%f]\n",k40_il,k40_iD); 
		System.out.printf("(2-3.)double로 인쇄 [%f][%f]\n", (double)k40_il, k40_iD); 
		
		//2-4. char 타입의 데이터(''사용)에 대한 if문 체크
		char k40_a ='c';
		if (k40_a =='b') System.out.printf("(2-4.)a는 b이다\n"); //char a == 'b'라면 다음을 출력
		if (k40_a =='c') System.out.printf("(2-4.)a는 c이다\n"); //char a == 'c'라면 다음을 출력
		if (k40_a =='d') System.out.printf("(2-4.)a는 d이다\n"); //char a == 'd'라면 다음을 출력
		
		//2-5. String 타입의 데이터의 if문 체크
		String k40_aa = "abcd";
		if(k40_aa.equals("abcd")) System.out.printf("(2-5.)aa는 abcd이다\n"); 
		else System.out.printf("(2-5.)aa는 abcd이 아니다\n");
		
		//2-6. boolean 타입의 데이터의 if문 체크
		boolean k40_bb = true; 
		if(!!k40_bb) System.out.printf("(2-6.)bb가 아니고 아니면 참이다 \n"); //not not k40_bb(결국 자기자신)이 참이면 이 결과출력
		else System.out.printf("(2-6.)bb가 아니고 아니면 거짓이다\n"); //거짓이라면 이 결과를 출력
	}
}

