package k40_PrintReceipt13;
//13.칸 맞추기 실습
import java.text.DecimalFormat;
import java.util.Scanner;

public class k40_Main {

	public static void main (String[] args) {
		
		String k40_item = "사과"; //품목 
		int k40_unit_price = 5000; //단가
		int k40_num = 500; //수량
		int k40_total = 0; //총 합계
		
		//DecimalFormat 클래스에서 불러와 오브젝트 만들기, 이번에도 3자리당 하나씩 콤마를 찍을 것임
		DecimalFormat df = new DecimalFormat("###, ###, ###, ###, ###");
		
		/// 해더 찍기 (교수님 코멘트 : 일반적인 리포트는 헤더 인쇄 후 내용을 인쇄)
		System.out.printf("=====================================================\n"); 
		//***칸맞추기 핵심 '글자 자리수를 지정하는 방법'***//
		//%10.10s (공백) %8.8s (최대8글자) 3번 반복 후 엔터, "품목"(첫번째s자리),"단가"(두번째 s자리)...
		System.out.printf("%10.10s %8.8s %8.8s %8.8s\n", "품목", "단가", "수량", "합계 ");
		System.out.printf("=====================================================\n");
		// 값찍기 
		//%10.10s(공백) %14.14 (일단 기본적으로 5자리(5,000)는 있어야 하고 공백8칸을 고려해 13이 된것)
		//%9.9(마찬가지로 3자리에 공백 6칸, 가장 예뻐보임 //
		System.out.printf("%10.10s %13.13s %9.9s %10.10s\n",
				k40_item, df.format(k40_unit_price), df.format(k40_num), df.format (k40_unit_price*k40_num));
		System.out.printf("======================================================\n");

	}
}
	

