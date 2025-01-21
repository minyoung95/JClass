package j0121;

public class Triangle extends Shape {

	Triangle(){}
	
	// 생성자 1
	Triangle(Point[] p){
		this.p = p;
	}
	// 생성자 2
	Triangle(Point p1, Point p2, Point p3){
		p = new Point[]{p1,p2,p3};
	}
	
	Point[] p;
	
}
