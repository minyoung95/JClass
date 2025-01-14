package j0113;

public class Ja0113_03 {

	public static void main(String[] args) {
		// 타입을 무조건 써야하고 타입에 맞는 변수를 대입해야함
		
		int score; // 변수 선언
		score = 10;
		System.out.println(score);
		
		int s = 100;
		System.out.println(s);
		
		char ch = 'a'; // 한글자라 홑따옴표
		System.out.println(ch);
		
		char ch2 = '가'; // char는 한글자만 가능 "가나" X
		System.out.println(ch2);
		
		// String str = new String("가나");
		String str = "가나"; // 두글자 이상부턴 String
		System.out.println(str);
		
		String str2 = null; // null값 가능
		System.out.println(str2);
	}

}
