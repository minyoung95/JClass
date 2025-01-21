package jcard;

import java.util.Scanner;

public class Ja01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 52장 카드 생성 > 순차적 출력
		// 랜덤으로 섞기 후 52장 출력 
		// 0-51까지의 숫자를 입력 받아 해당되는 카드 출력
		
		Deck d = new Deck();
		
		// 전체출력
		d.all_print(52);
		
		// 랜덤 섞기
		d.shuffle();
		d.all_print(52);
		
		// 숫자 입력받기
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		Card c = d.pick(num);
		d.all_print(c);
		
	}
}
