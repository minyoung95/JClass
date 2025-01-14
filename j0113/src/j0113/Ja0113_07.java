package j0113;

public class Ja0113_07 {
	public static void main(String[] args) {
		
		// 형 변환 : 높은타입에서 낮은타입 - 변수형타입 넣어주기
		int n1 = 65;
		char ch1 = (char)n1; // 65가 char타입으로 변경 : 'A'
		System.out.println(ch1);
		
		char ch2 = 'a';
		int n2 = ch2; // 낮은타입 > 높은타입 : 변수형타입 생략가능
		System.out.println(n2);
		
		float f1 = 3.14f;
		int n3 = (int)f1; // 실수 > 정수형 : 소숫점 아래 버림
		System.out.println(n3);
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2); // 소숫점(.0) 붙음
		
		
	}
}
