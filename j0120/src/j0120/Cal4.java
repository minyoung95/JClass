package j0120;

import java.util.Scanner;

public class Cal4 {
	
	void input(String[] name,int[] kor) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
		}
		
		for(int i=0;i<name.length;i++) {
			System.out.println("국어점수을 입력하세요.");
			kor[i] = scan.nextInt();
		}
		
	}
}
