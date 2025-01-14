package j0114;

import java.util.Scanner;

public class Ja0114_07_반복 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// while문 구구단
		int i = 2;
		while(i<=9) {
			System.out.printf("[ %d 단 ] \n",i);
			int j = 1;
			while(j<=9) {
				System.out.printf("%d * %d = %d \t",i,j,i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		
//		// while 문
//		int i = 1; // 초기값
//		while(i<=5) { // 조건문
//			System.out.println("안녕"+i);
//			i++; // 증감식
//		}
//		
//		for(int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}
		
//		// 입력받은 숫자부터 구구단
//		System.out.println("숫자 입력");
//		int num = scan.nextInt();
//		System.out.println("숫자2 입력");
//		int num2 = scan.nextInt();
//		
//		int max,min=0;
//		
//		max = Math.max(num, num2);
//		min = Math.min(num, num2);
//		
//		if(num>num2) {
//			for(int i=min;i<=max;i++) {
//				System.out.printf("[ %d 단 ] \n",i);
//				for(int j=1;j<=9;j++) {
//					System.out.printf("%d * %d = %d \t",i,j,i*j);
//				}
//				System.out.println();
//			}
//		}
//	}
		
		
		
		
//		// 구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
//		String input = "abcdefghijk";
//		System.out.println(input.length()); // .length() : 길이
//		System.out.println(input.charAt(input.length()-1)); // 제일 마지막 글자
//
//		// 단어 1개씩 출력
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
//		// 영문자일 때 입력받은 글자를 1개씩 출력하는 프로그램, 아닐 땐 출력X
//		System.out.println("영문자를 입력하세요.");
//		String input2 = scan.next();
//		
//		int temp = 0;
//		// 영문자인지 확인
//		for(int j=0;j<input2.length();j++) {
//			if(!(input2.charAt(j)>='a'&&input2.charAt(j)<='z'||input2.charAt(j)>='A'&&input2.charAt(j)<='Z')) {
//				temp = 1;
//				break;
//			}
//		}	// temp = 1일때 for문 빠져나오고 아래 if문 실행
//		
//		// 영문자면 출력, 아닐때 미 출력
//		if(temp == 0) {
//			for(int j=0;j<input2.length();j++) {
//				System.out.println(input2.charAt(j));
//			}
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
		
//		for 문 무한반복 (조건문이 없을 때)
//		for(int i=0;;) {
//			System.out.println("안녕");
//		}

		
//		System.out.println("영문자를 입력하세요. >> ");
//		String str = scan.next();
//		char ch = str.charAt(0); // 첫글자 따오기
//		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력 : "+ch);
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
		
//		 반복문
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//			sum = sum + i;
//			sum += i; // 한 줄일 경우 중괄호 생략가능
//		}
		
//		System.out.println(sum);
	}
}