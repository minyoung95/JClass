package j0114;

import java.util.Scanner; // 만들어져 있는 것을 가져옴

public class Ja0114_02 {
	public static void main(String[] args) {
		
		// 입력 input("데이터를 입력하세요.")
		Scanner scan = new Scanner(System.in); // 입력을 위한 객체선언
				
		System.out.println("문자를 입력하세요.");
		String str = scan.next(); // 띄워쓰기 앞까지만 출력, 엔터키 입력못받음
		System.out.println("문자열1 : "+str);
		scan.nextLine(); // 엔터키를 입력받게 해줌
		
		System.out.println("문자를 입력하세요.");
		String str2 = scan.nextLine(); // 전체 출력
		System.out.println("문자열2 : "+str2);
				
//		System.out.println("정수를 입력하세요."); // input 정보에 관한 설명
//		int num =  scan.nextInt(); // 정수형
//		System.out.println("정수 : "+num);
//		
//		System.out.println("실수를 입력하세요."); // input 정보에 관한 설명
//		float num2 =  scan.nextFloat(); // 실수형
//		System.out.println("실수 : "+num2);
	}
}
