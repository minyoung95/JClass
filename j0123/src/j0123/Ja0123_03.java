package j0123;

import java.util.Scanner;

public class Ja0123_03 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.printn("안녕하세요"); // 오타 : 컴파일에러 (컴파일 도중 에러)
//		int[] n = new int[3];
//		for(int i=0;i<4;i++) {
//			System.out.println("숫자 입력");
//			n[i] = scan.nextInt(); // n 범위는 3 > for문 4번 : 런타임에러 (실행도중 에러)
//		
//		}
		
		// 예외처리 try-catch : 파일생성, DB
		try {
			// 정상적으로 돌아가는 프로그램 구현
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			throw new Exception("고의로 에러"); // 고의로 에러발생
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 고의로 에러 라는 메세지 출력
			e.printStackTrace(); // 에러가 났을때 에러 위치, 에러 설명 
			// 에러가 났을때 실행되는 부분
			System.out.println("에러발생 4-2");
		}
		System.out.println(5);
		System.out.println(6);
	}
}
