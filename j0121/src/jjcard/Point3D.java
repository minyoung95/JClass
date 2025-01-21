package jjcard;

public class Point3D extends Point {

	int z;
	Point3D(int x, int y, int z){
//		super(x,y); // 부모의 생성자를 호출하면 에러 X
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : "+x+","+"y : "+y+","+"z : "+z;
	}
}
