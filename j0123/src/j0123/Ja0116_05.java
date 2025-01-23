package j0123;

import java.util.Scanner;

public class Ja0116_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StuDeck sd = new StuDeck();
		int choice = 0;
		
		// 무한 반복
		loop:while(true) {
			
			// 화면구현
			choice = sd.main_print();
			
			switch(choice) {
			case 1:
				// 입력
				sd.input();
				break;
				
			case 2:
				// 출력	
				sd.output();
				break;
			case 3:
				// 수정
				sd.update();
				break;
			case 4:	
				break;
				
			case 5:	
				break;
				
			default:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;
			} // switch
			
		}// while loop
		
					
	} // main
} // class
