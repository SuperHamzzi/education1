package arrayExam;

import java.util.Arrays;

public class LottoExam {

	public static void main(String[] args) {
		// 초기값 설정 : 0 ~ 9
		// 섞기 -> random,  10
		// 자리바꿈 => 임시 변수(temp)
	//0~9까지 담고 있을 공간
		int[] numArray = new int[46];
		
		for(int i=0; i<numArray.length; i++) {
			numArray[i] = i; //배열에 0~ 9까지 순차적으로 담김
		}
//		//확인
//		for(int i=0;i<numArray.length; i++) {
//			System.out.print(numArray[i]+" ");
//		}
//		System.out.println();
//	
//		System.out.println(Arrays.toString(numArray));
//		
//		for(int k : numArray) {
//			System.out.print(k+" ");
//		}
//		System.out.println();
		// 배열의 요소값 섞기
		for(int i=0; i<46; i++) {
			int n = (int)(Math.random()*45)+1;
			int temp=0;
			
			temp = numArray[i];
			numArray[i] = numArray[n];
			numArray[n] = temp;
		}

	System.out.println(Arrays.toString(numArray));
	
	
	}
}
