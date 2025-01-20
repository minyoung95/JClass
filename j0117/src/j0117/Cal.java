package j0117;

public class Cal {

	int result;
	
	int add(int a, int b) {
		result = a+b;
		return result; // 리턴값은 변수 1개
	}
	
	int sub(int a, int b) {
		result = a-b;
		return result;
	}
	
	void mult(int a, int b) {
		System.out.println(a*b);
	}
	
	
}
