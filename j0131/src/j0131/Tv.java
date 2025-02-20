package j0131;

public class Tv extends Product {

	private int size;
	private String panel;
	private String color;
	
	// 기본생성자
	Tv(){
		
		this("LG50TV",1000000,100000,50,"LED","BLACK"); // this : 생성자 호출
		setName("LGTV");
		setPrice(1000000);
		setPoint(100000);
		
	}
	
	// 매개변수 생성자
	Tv(String name, int price, int point, int size, String panel, String color){
		
		setName(name);
		setPrice(price);
		setPoint(point);
		this.size = size; // this : 인스턴스변수를 가리킴
		this.panel = panel;
		this.color = color;
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
