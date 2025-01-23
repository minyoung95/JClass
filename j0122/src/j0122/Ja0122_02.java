package j0122;

import java.util.Calendar;
import java.util.Date;

public class Ja0122_02 {
	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();
//		// 주소값들만 넘겨줌 - s라는 객체 하나
//		Singleton s1 = Singleton.getInstance();
//		System.out.println(s1.getNum());
//		Singleton s2 = Singleton.getInstance();
//		System.out.println(s2.getNum());
//		Singleton s3 = Singleton.getInstance();
//		System.out.println(s3.getNum());
//		Singleton s4 = Singleton.getInstance();
//		System.out.println(s4.getNum());
//		s1.setNum(100);
//		System.out.println(s2.getNum());
//		System.out.println(s4.getNum());		
//		
//		// new : 각각의 공간을 따로 만들어줌
		Car cc1 = new Car();
		Car cc2 = new Car();
		Car cc3 = new Car();
		
		// Date : 시간 각각 따로
		Date d = new Date();
		System.out.println(d.toString());
		Date d2 = new Date();
		System.out.println(d2.toString());
		
		// Calendar : 주소값이 같음
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.getTime());
		Calendar c2 = Calendar.getInstance();
		System.out.println(c2.getTime());
		
		Time t1 = new Time();
		
//		cc1 = (Car)t1; // 관계가(상속) 없는 객체는 형변환 X
		
		
	}
}
