package j0123;

public class Ja0123_04 {
	public static void main(String[] args) {
		
//		System.out.println("프로그램 실행");
//		System.out.println(1);
//		method1();
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println("프로그램 종료");
//	}
//	
//	static void method1() {
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(4/0);
//			System.out.println(4);
//		}catch (Exception e) {
//			System.out.println(5);
//		}finally {
//			System.out.println("무조건 실행");
//		}
//		System.out.println(6);
//	}
	
		System.out.println("프로그램 실행");
		System.out.println(1);
		try {
			method1();			
		} catch (Exception e) {
			
		}
		System.out.println(7);
		System.out.println(8);
		System.out.println("프로그램 종료");
	}
	
	static void method1() throws Exception {
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0); // 에러 발생
		System.out.println(4);
		System.out.println(5);
		System.out.println("무조건 실행");
		System.out.println(6);
	}		
}
