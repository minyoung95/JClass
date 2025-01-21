package j0121; // package : 폴더

import java.util.Scanner; // import : 사용 시 앞에 패키지 코드(java.util) 생략가능

// 접근제어자 : public, protected, default, private
public class Ja0121_04 {
	// static : 공용 / final : 상수(변경 불가) / abstract : 미완성(재정의를 해야 클래스or메서드 사용가능), 추상메서드, 클래스or메서드명 지정해주기
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		Card ran_card = new Card();
		Card my_card = new Card();
		
		while(true) {
			System.out.println("[ 카드 게임 ]");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("랜덤 섞기");
				d.shuffle();
				System.out.println("카드 섞기 완료");
				break;
			
			case 2:
				System.out.println("랜덤카드뽑기");
				ran_card = d.random();
				System.out.printf("랜덤카드 : [ %s,%s ]\n",ran_card.shape,ran_card.number);
				break;
			
			case 3:
				System.out.println("내 카드뽑기");
				System.out.println("원하는 번호 선택");
				int num = scan.nextInt();
				my_card = d.pick(num);
				System.out.printf("내 카드 : [ %s,%s ]\n",my_card.shape,my_card.number);
				break;
			
			case 4:
				// 무늬 ♠,◆,♥,♣ 순으로 높음, 숫자 2,3,4,5,6,7,8,9,10,J,Q,K,A 순으로 높음
				System.out.println("카드 비교");
				
			}
			
		}
	}
}
