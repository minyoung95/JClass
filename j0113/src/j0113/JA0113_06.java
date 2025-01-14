package j0113;

public class JA0113_06 {
	public static void main(String[] args) {
		char ch = 65; // 아스키코드 65
		System.out.println(ch);
		
		int ch2 = 65; // 숫자 65
		System.out.println(ch2);
		
		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1); // 타입 : str + str = str
		System.out.println(""+7); // str + int = str
		System.out.println(""+7+7); // 77 : str타입이므로 더하면 옆에 붙음
		System.out.println(7+7+""+7); // 147 : 숫자 7+7 > 14 > "" > str타입으로 변환 > 뒷 숫자는 옆에 붙음
		
		char ch3 = ' '; // '' 에러, ' '(빈공백 : 문자)
		String s2 = "";
		
		// 정수의 오버플로우
		int n1 = 2147483647; // -2147483648 ~ 2147483647
		
		int n2 = n1 + 1; // 최대값에서 1을 더했을 때 최솟값으로
		System.out.println(n2);
		
		
	}
}
