package getBytePractice;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//한국어 변환
		char tmp1 = (char) -95;
		System.out.println(tmp1);

		//한국어 변환
		for (int i =-95; i < -30; i++) {
			char tmp2 = (char) i;
			System.out.println(tmp2);
		}
		
		//getByte연습
		String txt = "한글aa";
		byte[] txtByteArr = txt.getBytes();
		//(1)
		System.out.println(Arrays.toString(txtByteArr));
		/*(2)
		for (int i=0; i<txtByteArr.length; i++) {
			System.out.println(txtByteArr[i]);
		}*/
	}
}
