package j0121;

public class Ja0121_01 {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		// 원의 넓이
		double di = c1.r * c1.r * 3.14;
		System.out.println("원의 넓이 : "+di);
		c1.draw();
		
//		Point center = new Point(150,150);
//		Circle c2 = new Circle(center, 50);
		Circle c2 = new Circle(new Point(150,150),50);
		double di2 = c2.r * c2.r * 3.14;
		System.out.println("원2의 넓이 : "+di2);
		c2.draw();
		
//		int[] arr = {1,2,3};
//		int[] arr2 = new int[3];
//		arr2[0] = 1;
//		arr2[1] = 2;
//		arr2[2] = 3;
//		int[] arr3 = new int[] {1,2,3};
		
//		Point[] p
		Point[] p = new Point[3];
		p[0] = new Point(100,100);
		p[1] = new Point(140,50);
		p[2] = new Point(200,100);
//		Point[] p = {new Point(100,100),new Point(140,50),new Point(200,100)};
		Triangle t1 = new Triangle(p); // 생성자 1
//		Triangle t1 = new Triangle(p[0],p[1],p[2]); // 생성자 2
		t1.draw();
		
//		Point p = new Point();
//		p.x = 10;
//		p.y = 5;
//		System.out.println(p.x);
//		System.out.println(p.y);
		
//		Circle c = new Circle();
//		c.x = 100;
//		System.out.println(c.x);
		
	}
}
