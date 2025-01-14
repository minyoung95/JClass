package j0114;

public class Ja0114_01 {
	public static void main(String[] args) {
		boolean temp = true; // 논리형
		char ch = 'a'; // 문자형
		String str = "abc"; // 문자열(참조형)
		// String str2 = new String("abc");
		byte n1 = 1; // 정수형
		short n2 = 2; // 정수형
		int num = 100; // 정수형
		long num2 = 10000L; // 정수형
		float num3 = 3.14F; // 실수형
		double num4 = 10.345; // 실수형
		
		// println : 어떤 타입이 와도 출력해줌
		System.out.println(temp);
		System.out.println(ch);
		System.out.println(num);
		
		// printf : 타입을 맞춰주어야 함
		System.out.printf("논리형 : %b \n", temp); // %b : boolean
		System.out.printf("문자형 : %c \n", ch);   // %c : char
		System.out.printf("정수형 : %d, %d, %05d, %010d \n", n1,n2,num,num2);  // %d : byte,short,int,long
		System.out.printf("실수형 : %f, %.2f \n", num3,num4); // %f : float,double
		System.out.printf("문자열 : %s \n", str); // %s : String
	}
}
