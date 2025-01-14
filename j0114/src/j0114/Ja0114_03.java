package j0114;

import java.util.Scanner;

public class Ja0114_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		System.out.printf("이름 : %s, 국어: %d 영어: %d, 수학: %d, 합계: %d, 평균: %.2f \n", name,kor,eng,math,kor+eng+math,(float)(kor+eng+math)/3); // (kor+eng+math)/3.0 : 정수/실수 = 실수
		
		// 논리형 ||,|(or)보다 &&,&(AND)가 우선순위
	}
}
