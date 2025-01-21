package j0121;

public class Deck {
	// 카드에 사용되는 메소드

	// 생성자
	Deck(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"♠","◆","♣","♥"};
	
	// 카드 전체 출력메소드
	void print_all(int no) {
		System.out.printf("      [ %d장 출력 ]\n",no);
		System.out.println("----------------------------------------");
		for(int i=0;i<no;i++) {
			System.out.printf("[ %s,%s ]\n",c[i].shape,n[c[i].number]);
		}
	}
	
	// x번째 카드 출력메소드
	void print_all(Card c) {
		System.out.printf("      [ 카드 확인 ]\n",c.number);
		System.out.println("----------------------------------------");
		System.out.printf("[ %s,%s ]\n",c.shape,n[c.number]);
	}
	
	// 섞기 메소드
	void shuffle() {
		Card temp = null;
		for(int i=0;i<300;i++) {
			int random = (int)(Math.random()*52);
			// 위치바꾸기
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	Card pick(int no) {
		if(no>=1 && no<=51) {
			return c[no];
		}else {
			System.out.println("[경고] 번호 확인을 해주세요.");
			return c[0];
		}
	}
	
	// 랜덤 뽑기
	Card random() {
		int randomP = (int)(Math.random()*52);
		return c[randomP];
	}

}
