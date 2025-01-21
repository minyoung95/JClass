package j0121;

class Card {

	// 카드 1장
	
	Card(){}
	Card(String shape,int number){
		this.shape = shape;
		this.number = number;
	}
	
	int number;
	String shape;
	
//	// 오버라이딩 : 메소드 재정의 / 선언부 같아야함 / 상속받은 곳에서 사용
//	@Override
//	public String toString() {
//		return "[ "+shape+","+n[number]+" ]";
//	}
}
