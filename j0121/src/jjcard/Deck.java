package jjcard;

class Deck {
	
	final int CARD_NUM = 52; // final : 수정불가
	Card[] c = new Card[CARD_NUM];
	
	void input() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	}
	
	// 번호 출력
	void print(int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.println(c[i]);
		}
	}
	
	// 카드 섞기
	void shuffle() {
		Card temp = null; // int temp X 밑의 이유와 마찬가지
		for(int i=0;i<300;i++) {
			int random = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}		
	}
	
	// 카드 뽑기
	// Card의 c[]에 번호,모양 정보가 같이 있으므로 // int pick X > return을 하나밖에 못함
	Card pick(int no) {
		return c[no];
	}
	
	// 선택한 순서의 카드 출력
	void print(Card c) {
		System.out.println(c);
	}
}
