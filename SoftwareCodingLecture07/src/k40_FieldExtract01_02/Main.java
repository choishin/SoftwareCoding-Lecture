package k40_FieldExtract01_02;

import java.text.DecimalFormat;
/*
 * 2.고정길이에서 필드 추출 처리 (영수증의 데이터 합계검증프로그램)
 */
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat k40_dcf = new DecimalFormat("###,###,###,###,###"); 

		String[] k40_ReceiptRecord = { //영수증의 내역을 배열에 한줄씩 넣기
				"*[서울우유] 체다       1,000 1      1,000",
				"*(G)LH원형유리화병       100 1        100",
				"*상투과자E             2,300 1     23,000",
				" 사양벌꿀 1.5kg          120 1        120",
				" 해피홈 SAFE 핸드      2,345 1      2,345",
				" [찹쌀치킨스틱         2,346 1      2,346",
				" [20년산] 이맛쌀 1    23,532 1     23,532",
				" CJ 비비고 도톰한      1,000 1      1,000",
				" 100년 역사의 시원     1,000 1      1,000",
				" [튀김공방]찹쌀치      1,000 1      1,000",
				" 훈제오리 500g*2       1,000 1      1,000",
				" 순살닭강정(g)         1,000 1      1,000",
				" CJ백설매실청310ml     1,000 1      1,000",
				" DZ주니어양말3족C_     1,000 1      1,000",
				" [파티셰리 마담정]     1,000 1      1,000",
				" [피코크] 송탄식       1,000 1      1,000",
				" [서울우유] 서울우     1,000 1      1,000",
				" [빙그레] 바나나맛     1,000 1      1,000",
				" 진라면소컵(매)65g     1,000 1      1,000",
				" 케라시스 앰플 트      1,000 1      1,000",
				" [활][국산] 완도       1,000 1      1,000",
				" [냉장][노르웨이]      1,000 1      1,000",
				" CJ비비고왕교자만      1,000 1      1,000",
				" [서울우유] 커피       1,000 1      1,000",
				" 흑원당 말차 밀크      1,000 1      1,000",
				" 1+ 등급란 10개입      1,000 1      1,000",
				" [프리미엄] 미국산     1,000 1      1,000",
				" 양면 틈새 청소 브     1,000 1      1,000",
				" 흡착 발 브러쉬        1,000 1      1,000",
				" 집게형 헤어롤 3p      1,000 1      1,000",
				" 코털가위              1,000 1      1,000",
				" [이마트 특별기획]     1,000 1      1,000",
				" 롯데 ABC초콜릿 60     1,000 1      1,000"
		};
		
		
		String[] k40_tmp;
		int k40_count =0;
		for (int k40_i=0; k40_i<k40_ReceiptRecord.length; k40_i++) { //한줄씩 처리
			//1.배열의 내용을 이름부분까지 자른후 2.','를 모두 없애준 후, 3.공백을 없앤 후 
			//4.공백으로 split해 배열에 넣기
			k40_tmp = k40_ReceiptRecord[k40_i].substring(13).replaceAll(",","").trim().split(" ");
			//System.out.println(Arrays.toString(tmp));
			int[] k40_tmpToInt = new int[3]; //새로운 배열을 만들어 String인 데이터를 Int로 변환
			k40_tmpToInt[0] = Integer.parseInt(k40_tmp[0]); //위에서 가공한 첫번째 데이터 (단가)
			k40_tmpToInt[1] = Integer.parseInt(k40_tmp[1]); //위에서 가공한 두번째 데이터 (수량)
			k40_tmpToInt[2] = Integer.parseInt(k40_tmp[k40_tmp.length-1]); //위에서 가공한 세번째 데이터 (총액)
			k40_count++; 
				
			if (k40_tmpToInt[0]*k40_tmpToInt[1] != k40_tmpToInt[2]) { //**검증 만일 단가*수량이 총합과 같지 않다면**//
				System.out.println("*********************************************************");
				System.out.printf("오류[%d] %s \n",k40_count,k40_ReceiptRecord[k40_i]); //오류났던 데이터 출력
				System.out.printf("수정[%d] %s%12s%2s%11s\n",k40_count, k40_ReceiptRecord[k40_i].substring(0,12), 
						k40_dcf.format(k40_tmpToInt[0]),k40_dcf.format(k40_tmpToInt[1]),k40_dcf.format(k40_tmpToInt[0]*k40_tmpToInt[1]));
						//수정된 데이터에 다시 decimalformat을 입혀서 출력
				System.out.println("*********************************************************");
			}

			
		}
		}
	
}
