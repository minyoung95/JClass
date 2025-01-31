package j0131;

import java.util.Scanner;

public class ShopMall {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		ShopDeck sd = new ShopDeck();
		int choice = 0;
		
		sd.login(); // 로그인
		
		loop:while(true) {
			choice = sd.mainPrint();
			
			switch(choice) {
			
			case 1:
				sd.buy(new Tv());
				break;
			
			case 2:
				sd.buy(new Tv("LG75TV",1500000,150000,75,"LED","BLACK"));
				break;
				
			case 3:
				sd.buy(new Computer());
				break;
				
			case 4:
				sd.buy(new Refrigerator());
				break;
				
			case 5:
				sd.buy(new Washing());
				break;
			
			case 6:
				break;
				
			case 7:
				sd.proList();
				break;
				
			case 8:
				sd.charge();
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			} // switch
			
		}
		
	} // main
} // ShopMall
