package k40_SinGraph11;
//11.Sin함수 그래프 그리기
public class k40_Main {

	public static void main(String[] args) {
		
		double k40_fSin;
		//1.각도마다 sin값 출력하기
		//반복 : 360번 반복해줄것임 (k40_i는 각도값)
		for(int k40_i = 0; k40_i < 360; k40_i++) { //교수님코멘트 : 360도 값이 어찌 나오나
			//Math클래스에 sin 메소드를 불러오기
			//sin 기억 되살리기 : 2π는 360도, π는 180도, 1/2π는 90도, 1/3π는 60도, 1/6π는 30도...
			//double k40_fSin = 각도 * 1도당 π값(π/180)
			k40_fSin = Math.sin(k40_i *3.141592/180); 
			System.out.printf("%d sin ==>%f\n", k40_i, k40_fSin); //각도와 sin값을 출력
		}//for
			//2.이제는 별을 찍는 그래프로 표현해줄 것임
			//반복 : 360번 반복할 것
			for(int k40_i = 0; k40_i < 360; k40_i++) { //교수님 코멘트 : 360도까지 그리기
			//double k40_fSin = 각도 * 1도당 π값(π/180)
				k40_fSin= Math.sin(k40_i * 3.141592/180);
			//***k40_iSpace = (1.0 - k40_fSin) : 사인값 중 음수도 있기 때문에 양수화 하기위한 방법 
			//(int)로 강제 형변환해서 나머지는 버림 해주고
			//여기에 그래프에 그릴만큼 시각적으로 값과 값의 차이를 크게 해주기 위해 50을 곱하기
			//예1) 사인값 : 0.000000이면, (int)(1 -0.0000 =1) *50 = 50이고 공백은 50개를 찍음
			//예2) 사인값 : 0.981627이면, (int)(1 -0.981627 =0.1)*50 = 0이고 공백은 0개
			int k40_iSpace = (int) ((1.0 - k40_fSin) * 50);
			//반복2 : k40_iSpcae값 만큼 반복 실행할 것 (1) : 공백찍기
			for (int k40_j = 0; k40_j < k40_iSpace; k40_j++) System.out.printf(" "); 
			//반복 실행할것(2) : *과 사인값과 k40_iSpace값 출력 (공백끝에 찍힘)
			System.out.printf("*[%f] [%d] \n", k40_fSin, k40_iSpace);
		}
		
	}
}
	

