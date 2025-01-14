package j0114;

import java.util.Scanner;

public class Ja0114_05 {
	public static void main(String[] args) {
		
//		// 올림-ceil, 버림-floor, 반올림-round
//		float pi = 3.141592f;
//		// 버림공식 : 셋째자리(*1000/1000f)
//		float pi2 = (int)(pi*1000)/1000f; 
//		System.out.println(pi2);
//		
//		// 반올림 : Math.round - 소숫점 첫째자리에서 반올림
//		double pi3 = 3.141592;
//		double pi4 = Math.round(pi3*1000)/1000.0;
//		System.out.println(pi4);
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소숫점 3자리 실수를 입력하세요.");
//		double input = scan.nextDouble();
//		
//		// 3자리에서 반올림 하여 값을 출력
//		System.out.println(Math.round(input*100)/100.0);
//		
//		// 0.1d != 0.1f : d는 소숫점 16자리까지, f는 소숫점 8자리까지 이후 숫자는 임의
//		
//		System.out.println("영문자를 입력하세요.");
//		char input2 = scan.next().charAt(0);
//		if((input2>='a' && input2 <='z')||(input2 >= 'A' && input2 <= 'Z')) {
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}			
		

//		int x = -10;
//		int absX = x>=0?x:-x; // 절댓값
//		System.out.println(absX);
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		// 합격, 불합격 정하기
//		String result = score>=60?"합격":"불합격";
//		System.out.println("결과 : "+result);
//		// 양수, 음수 구분하기
//		String result = score>0?"양수":score==0?"0":"음수";
//		System.out.println("결과 : "+result);
		
		// 3개의 숫자를 입력받아, 가장 큰 수 출력
		System.out.println("첫번째 숫자 입력");
		int num = scan.nextInt();
		System.out.println("두번째 숫자 입력");
		int num2 = scan.nextInt();
		System.out.println("세번째 숫자 입력");
		int num3 = scan.nextInt();
		
		int result = (num>num2 && num>num3)?num:num2>num3?num2:num3;
		System.out.println("최댓값 : "+result);
		int result2 = (num<num2 && num<num3)?num:num2<num3?num2:num3;
		System.out.println("최솟값 : "+result2);
		
	}
}
