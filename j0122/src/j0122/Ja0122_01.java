package j0122;

import Stu.Shape;

public class Ja0122_01 {
	public static void main(String[] args) {
		
		Time t1 = new Time(12,05,10);
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+1);
		System.out.println(t1.getHour());
		
		Time t2 = new Time(17,35,30);
		System.out.printf("%d:%d:%d",t2.getHour(),t2.getMinute(),t2.getSecond());
		
		
		// private - 같은클래스, default - 같은클래스, 같은패키지
		// protected - 다른패키지의 자손클래스까지, public - 제한 X
//		Car c = new Car();
//		System.out.println(c.color);
//		Car c2 = new Car("white","auto",5);
//		System.out.println(c2.gearType); // gearType는 private이라 안된다.
//		System.out.println(c2.getgearType()); // gearType는 private이라 안된다.
		
//		c2.door = -50;
//		System.out.println(c2.door); // private이라 안된다.
		
//		c2.setDoor(-50);
//		System.out.println(c2.getDoor());
		
//		Shape s = new Shape(); // 선언이 되지않음 > Shape은 default 제어자이기 때문
		Shape s = new Shape(); // import Stu.Shape;
		
	}
}
