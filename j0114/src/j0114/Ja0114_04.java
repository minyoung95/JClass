package j0114;

import java.util.Scanner;

public class Ja0114_04 {
	public static void main(String[] args) {
		int a = 10;
		int b = a++; // 대입하고 증가
		// int b = ++a; 증가하고 대입
		
//		int a = 10;
//		a++;
//		int b = a : ++a, a++ 상관없이 증가하고 b에 대입
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		byte c = 1;
		byte d = 2;
		byte e = (byte)(c+d); // byte,short,char는 사칙연산을 했을때 int타입으로 변경된다. 사칙연산을 한 후 형변환
		
		char ch = 'a'; // 97
		char ch2 = 'b'; // 98
		int ch3 = ch+ch2;
		System.out.println(ch3);
		
		// 사칙연산을 할 때 타입이 더 큰 쪽으로 바뀐다. float + int = float
		
		int f = 1000000;
		int g = 2000000;
		long h = (long)f*g; // long * int = long : int의 최댓값은 21억이므로 연산 시 21억이 넘을거 같으면 형변환
		System.out.println(h);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요.");
		char str = scan.next().charAt(0);
		// 대문자로 출력하기
		str = (char)(str - 32);
		System.out.println(str);
	}
}
