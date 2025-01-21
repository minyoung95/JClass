package jcard;

public class Deck {
	
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"♠","◆","♣","♥"};
	
	// 생성자 (카드 뽑기)
	Deck(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	// 카드 no장 출력
	void all_print(int no) {
		System.out.printf("            [ %d장 출력 ]\n",no);
		System.out.println("-----------------------------------------------");
		for(int i=0;i<no;i++) {
			System.out.printf("[ %s,%s ]\n",c[i].sh,n[c[i].num]);
		}
	}
	
	Card pick(int no) {
		if(no>=1 && no<=51) {
			return c[no];
		}else {
			System.out.println("번호 확인을 해주세요.");
			return c[0];
		}
	}
	
	// x번째 카드 뽑기
	void all_print(Card c) {
		System.out.println("            [ 카드 출력 ]");
		System.out.println("-----------------------------------------------");
		System.out.printf(" [ %s,%s ]\n",c.sh,n[c.num]);
	}
	
	// 카드 섞기
	void shuffle() {
		Card temp = null;
		for(int i=0;i<300;i++) {
			int random = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	
}
