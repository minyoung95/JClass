package jbuy;

import java.util.Scanner;

public class JaMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 로그인 구현
		Buyer b = new Buyer(); // b 10000000,0
		System.out.printf("현재 보유금액 : %,d \n",b.money);
		System.out.printf("보유 포인트 : %,d \n",b.bonusPoint);
		
		while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. COMPUTER");
			System.out.println("3. AUDIO");
			System.out.println("원하는 제품 번호를 입력하세요.");
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
//				Tv t = new Tv();
//				b.buy(t);
				b.buy(new Tv());
				System.out.printf("현재 보유금액 : %,d \n",b.money);
				System.out.printf("보유 포인트 : %,d \n",b.bonusPoint);
				break;
			
			case 2:
				b.buy(new Computer());
				System.out.printf("현재 보유금액 : %,d \n",b.money);
				System.out.printf("보유 포인트 : %,d \n",b.bonusPoint);
				break;
			}
		}
		
		
		
		
	}
}
