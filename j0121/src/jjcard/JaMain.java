package jjcard;

import java.util.Scanner;

public class JaMain extends Object {
	JaMain(){}
	
	public static void main(String[] args) {
		
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		Card[] my_card = new Card[5];
		
		loop:while(true) {
			
			System.out.println("[ 카드 게임 ]");
			System.out.println("[ 1. 카드 생성 - 번호부여 ]");
			System.out.println("[ 2. 카드 전체 출력 ]");
			System.out.println("[ 3. 카드 섞기 ]");
			System.out.println("[ 4. 카드 5장 받기 ]");
			System.out.println("[ 5. 내 카드 보기 ]");
			System.out.println("[ 6. 특정위치 카드 받기 ]");
			System.out.println("[ 0. 게임 종료 ]");
			System.out.println("------------------------------------------");
			System.out.println("원하시는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("[ 카드 생성 - 번호부여 ]");
				System.out.println("카드가 생성되었습니다.");
				d.input();
				break;
			case 2:
				System.out.println("[ 카드 전체 출력 ]");
				d.print(52);
				break;
			case 3:
				System.out.println("[ 카드 섞기 ]");
				System.out.println("카드 섞기가 완료되었습니다.");
				d.shuffle();
				break;
			case 4:
				System.out.println("[ 카드 5장 받기 ]");
				for(int i=0;i<5;i++) {
					my_card[i] = d.pick(i);					
				}
				System.out.println("카드 5장을 받았습니다.");
				break;
			case 5:
				System.out.println("[ 내 카드 보기 ]");
				System.out.println("-------------------------");
				for(int i=0;i<5;i++) {
					System.out.println(my_card[i]);				
				}
				break;
			case 6:
				System.out.println("[ 특정위치 카드 받기 ]");
				System.out.println("몇번째 카드를 받으시겠습니까?");
				int no = scan.nextInt();
				Card c_pick = d.pick(no);
				d.print(c_pick);
				break;
			case 0:
				System.out.println("[ 게임 종료 ]");
				System.out.println("게임을 종료합니다.");
				break loop;
				
			}
		}
		
	} // main
} // JaMain
