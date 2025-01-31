package j0131;

public class Computer extends Product{
	
	private int size;
	private int thick;
	private boolean cType;
	
	// 기본생성자
	Computer(){
		
		this("GCOM",2000000,200000,17,3,true); // this : 생성자 호출
		
	}

	public Computer(String name, int price, int point, int size, int thick, boolean cType) {
		
		setName(name);
		setPrice(price);
		setPoint(point);
		this.size = size;
		this.thick = thick;
		this.cType = cType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getThick() {
		return thick;
	}

	public void setThick(int thick) {
		this.thick = thick;
	}

	public boolean iscType() {
		return cType;
	}

	public void setcType(boolean cType) {
		this.cType = cType;
	}
	

	
}
