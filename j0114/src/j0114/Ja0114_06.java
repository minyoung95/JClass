package j0114;

import java.util.Scanner;

public class Ja0114_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 조건문 - switch 문
		// 1. 입력창, 2. 검색창, 3. 수정창, 4. 삭제창, 5. 종료
		System.out.println("사용자 권한 생성");
		int num = scan.nextInt();
		
		switch(num) {
		case 5:
			System.out.println("슈퍼바이저 권한");
		case 4:
			System.out.println("삭제 권한");
		case 3:
			System.out.println("수정 권한");
		case 2:
			System.out.println("작성 권한");
		case 1:
			System.out.println("읽을 권한");
			break;
		}
		// if문이 였으면 3번일 경우 위에서부터 3번동안 비교 but switch문은 한번에 비교해서 찾아냄
		
		
		// 점수를 입력받아 A 90 B 80 C 70 D 60 F 60미만
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		
		if(score>=90) {
			System.out.print('A');
		}else if(score>=80) {
			System.out.print('B');
		}else if(score>=70) {
			System.out.print('C');
		}else if(score>=60) {
			System.out.print('D');
		}else{
			System.out.print('F');
		}
		System.out.println("학점");
		
		// 조건문 - if 문
		System.out.println("숫자를 입력하세요.");
		int num2 = scan.nextInt();
		if(num2>0) {
			System.out.println("양수입니다.");
		}else if(num2==0){
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
	}
}
