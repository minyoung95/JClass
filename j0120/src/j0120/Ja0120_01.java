package j0120;

public class Ja0120_01 {
	
	static int a = 10; // 클래스 변수
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		change(d);
		System.out.println("d.x : "+d.x);
	}
	
	static void change(Data d) {
		
		d.x = 1000; // 지역변수 : change를 벗어나면 의미X
		System.out.println("d.x : "+d.x);
		
	}
	
//	static void change(int x) {
//		
//		x = 1000; // 지역변수 : change를 벗어나면 의미X
//		System.out.println("d.x : "+x);
//		
//	}
}
