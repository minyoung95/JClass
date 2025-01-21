package j0121;

// 상속 : 클래스의 재사용, extends // extends Object : 모든클래스의 조상(extends가 없을땐 Object한테 상속된다.)
public class Circle extends Shape{

	Circle(){
		this(new Point(0,0),100);
	}
	
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}
	
	// Shape 클래스에 있는 String color;가 상속받아있음
	Point center; // 클래스의 참조변수 선언 
	int r;
	
}
