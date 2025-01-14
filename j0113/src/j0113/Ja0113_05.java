package j0113;

public class Ja0113_05 {
	public static void main(String[] args) {
		
		// char = ''표시, 아스키코드값으로도 표현 가능 
		char ch = 'a';
		System.out.println(ch);
		
		char ch2 = '\u0041'; // 16진수코드 16*4 + 1*1 = 65 > A
		System.out.println(ch2);
		
		char ch3 = 97; // 아스키코드 : +-32를 하면 대소문자 치환 가능, 48은 0
		System.out.println(ch3);
		
		char ch4 = '\t'; // tab키도 문자로 인식
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.println(ch5); // println = print + enter키
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		// boolean : true,false 둘다 소문자
		boolean p = true;
		boolean p2 = false;

		long l = 10000000000L; // long은 마지막에 L을 붙임
		
		float f = 3.14F; // float은 마지막에 F를 붙임
		float f2 = 1000F; // 접미사를 안붙여도 되지만 표시해주기
		System.out.println(f2);
		
		double d = 3.14; // double은 마지막에 D 생략 가능 
	}
}
