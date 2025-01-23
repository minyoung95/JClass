package jbuy;

public class Buyer{

	int money = 10000000;
	int bonusPoint = 0;
	
	Buyer(){}
	
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Tv t) {
		money -= t.price;
		bonusPoint += t.bonusPoint;
	}
	
	void buy(Computer c) {
		money -= c.price;
		bonusPoint += c.bonusPoint;		
	}
	
}
