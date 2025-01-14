package j0114;

import java.util.Scanner;

public class Ja0114_08 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String str = "홍길동";
		System.out.println("이름을 입력하세요. >>");
		String input = scan.next();
		
		if(str.equals(input)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		// break : 반복문 중지, continue : 1번 중지
		// 구구단
		for(int i=2;i<=9;i++) {
			System.out.printf("[ %d 단 ] \n",i);
			for(int j=1;j<=9;j++) {
				if(j==3) {
					continue; // *3만 제외
				}
				System.out.printf("%d * %d = %d \t",i,j,i*j);
			}
			System.out.println();
		}
		
		
		
//		String str = "안녕하세요.";
//		String str2 = new String("안녕하세요.");
//		기본형 타입이 아니면 등가비교 X
//		if(str==str2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		// 기본형 타입 이외 비교 .equals()
//		if(str.equals(str2)) {
//			System.out.println("같다.");
//		}else {
//			System.out.println("다르다.");
//		}
		
		
//		int num = 10;
//		int num2 = 10;
//		
//		if(num==num2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
//		// 1-100 랜덤숫자를 입력받아, 10번 출력하여 숫자 맞추기 게임 구현
//		int ran = (int)(Math.random()*100)+1;
//		
//		for(int i=0;i<=9;i++) {
//			System.out.println("숫자를 입력하세요");
//			int num = scan.nextInt();
//			if(num==ran) {
//				System.out.println("정답입니다.");
//				break;	
//			}else {
//				System.out.println("오답입니다.");
//			}
//		}
//		System.out.printf("정답은 %d입니다. \n",ran);
		
		
//		// 1-100 랜덤 5개 숫자
//		for(int i=0;i<5;i++) {
//			int ran = (int)(Math.random()*100)+1;
//			System.out.println(ran);	
//		}
		
//		Math.random(); // 0.000000000 <= x < 1.000000000
//		double num = Math.random();
//		System.out.println(num);
			
		
//		// 반복문을 사용하여 000~999까지 출력하시오.
//		int i;
//		
//		for(i=0;i<=999;i++) {
//			System.out.printf("%03d \n",i);					
//		}
	}
}