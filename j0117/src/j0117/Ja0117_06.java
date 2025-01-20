package j0117;

public class Ja0117_06 {
	
	static int c = 0; // 1. 클래스변수 - 프로그램이 실행되면 사용가능 // 클래스명.클래스변수명
	int num = 10;         // 2. 인스턴스변수 - 객체선언을 해야 사용가능 // 참조변수명.인스턴수변수명
		
	public static void main(String[] args) {
		
		// static : 클래스변수
		Stu.count = 1;
		System.out.println(Stu.count);
		
		
		
		// 1-100까지 합 구하기
		// 합이 200이 넘는 시점의 i 값
		int sum = 0;
		int k = 0;
		int sum2 = 0;
		int k2 = 0;
		for(int i=0;i<=100;i++) {
			sum += i;
			if(sum>200) {
				k = i;
				k2 = i-1;
				sum2 = sum-i;
				break;
			}
		}
		System.out.println(k2);
		System.out.println(sum2);
		
		System.out.println(k);
		System.out.println(sum);
		
//		int a = 5; // 3. 지역변수 - 객체선언을 해야 사용가능
//		System.out.println(a);
	}
}
