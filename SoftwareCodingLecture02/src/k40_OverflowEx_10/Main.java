package k40_OverflowEx_10;
/*
 * 10. Overflow,ChartoCode 
 * short vs byte : byte는 127까지 표현 가능, short 는 65535까지 숫자 표현 가능
 * short가 사용될 때는 주로 C언어와의 호환을 위해 사용 됨 (자바에서는 잘 사용되지 않는 타입)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short k40_sMin = -32768;  //short : 2바이트의 크기, 즉 16비트를 저장할 수 있다.  (65536개의 숫자)
		short k40_sMax = 32767; 
		char k40_cMin = 0;  //char : 2byte 크기를 가진다.
		char k40_cMax = 65535;
		System.out.println("sMin  =  " + k40_sMin); //short k40_sMin = -32768 출력
		System.out.println("sMin-1= " + (short) (k40_sMin-1));  //-32768-1 = -32767을 short형으로 출력
		System.out.println("sMax  = " + k40_sMax); //short k40_sMax = 32767을 출력
		System.out.println("sMax+1= "+ (short) (k40_sMax+1)); //32767+1 =32768을 short형으로 출력
		System.out.println("cMin  = " + (int) k40_cMin); //char k40_cMin = 0을 int형으로 출력
		System.out.println("cMin-1= " + (int) --k40_cMin); //char k40_cMin에 -1처리를 해주고 int형으로 변환 (0보다 작은 수는 표현 못하기 때문에 65535)
		System.out.println("cMax  = " + (int) k40_cMax); //char k40_cMax = 65535 를 int형으로 출력
		System.out.println("cMax+1= " + (int) ++k40_cMax); //k40_cMax = 65535를 +1더한 후 int형으로 변환 (하지만 65536은 없기 때문에 0)

	}

}
