package j0120;

public class Ja0120_06 {
	
	static int bb = 0; // 클래스 변수
	int aa = 0; // 인스턴스 변수
	
	public static void main(String[] args) {
		
		System.out.println(fac(5));
		
	}
	
	static long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n * fac(n-1);
		}
		return result;
	}
	// 오버로딩 : 이름은 같지만, 매개변수의 갯수가 다르거나 타입이 다를 때
//	static long fac() {
//		
//	}
//	
//	static long fac(int n, int b) {
//		
//	}
}
