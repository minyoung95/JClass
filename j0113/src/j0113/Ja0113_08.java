package j0113;

public class Ja0113_08 {
	public static void main(String[] args) {
		
		// 연산자
		System.out.println(10/3.0); // double : 3.3333333333333335(15자리 이후엔 관련없는 숫자가 출력)
		
		// %d - 정수형 byte, short, int, long / %f - 실수형 float,double / %c - 문자형 char / %s - 문자열 String
		System.out.printf("%.3f \n", 10/3.0); // printf는 자릿수 표시
		System.out.printf("%,d \n", 100000000); // 천단위 표시
		System.out.printf("나이 : %d, 생년월일 : %d \n", 14,20170226);
		System.out.println("나이 : "+ 14 + ", 생년월일 : " + 20170226);
		System.out.printf("%05d \n", 100); // 5자리 중 빈자리는 0으로 채우기
		System.out.printf("%5d \n", 100); // 5자리 중 빈자리는 공백
		
		
		System.out.printf("%d \n", 0x1A); // 16+10 = 26 (16진수)
		System.out.printf("%#X", 65); // #: 16진수표시
	}
}
