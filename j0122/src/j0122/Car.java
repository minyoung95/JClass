package j0122;

public class Car{ // extends Object

//	Car(){
//		super();
//	}
	
	Car(){}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	String color;
	String gearType;
	int door;
//	private String gearType;
//	private int door;
	
	String getgearType() {
		// 제약조건 넣기 (private으로 접근을 막아두고)
//		if(user.id == "admin") {
			return gearType;			
//		}
	}
	
	void setDoor(int door) {
		if(door>0 && door<10) {
			this.door = door;			
		}
	}
	
	int getDoor() {
		return door;
	}
	
	void drive() {
		System.out.println("자동차가 출발합니다.");
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
