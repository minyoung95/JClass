package j0120;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	Car(){
//		color = "black";
//		gearType = "auto";
//		door = 4;
		this("black","auto",4); // 생성자에서 다른 생성자를 불러오고싶을때 this(매개변수)
		door = 5; // this 위에는 변수값 X, 아래에 넣기
	}
//	Car(String c,String g,int d){
//		color = c; // 인스턴스변수 = 매개변수
//		gearType = g;
//		door = d;
//	}
	Car(String color,String gearType, int door){
		this.color = color; // 인스턴스변수를 가리킬 때 this
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color; // 변수명이 다르므로 this 생략해도된다.
		gearType = c.gearType;
		door = c.door;		
	}
	
}
