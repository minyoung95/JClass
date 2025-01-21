package jjcard;

class Card {

	int shape;
	int number;
	String[] s = {"Spade","Diamond","Clover","Heart"};
	String[] n = {"","A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	@Override
	public String toString() {
		return String.format("[ %s,%s ]",s[shape], n[number]);
	}
	
	// 기본 생성자
	Card(){
		shape = 0;
		number = 1;
	}
	
	Card(int shape, int number){
		
		this.shape = shape;
		this.number = number;
	}
		
}
