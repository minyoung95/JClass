package j0117;

import java.util.Scanner;

public class Ja0117_09 {
	
	// 리턴타입 int
	int add(int a, int b) {
		int result = a+b;
		return result;
	}
	
	boolean power; // 인스턴스 변수
	void power() {
		power = !power;
		return; // 리턴 뒤에 값 안넣으면 넣어도 되긴하지만 의미가 없음
	}
	
	// 메소드 void : 리턴 없음
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int a = 0; // 지역변수
//		
//		Ja0117_09 j = new Ja0117_09(); // 객체선언
//		j.power = true;
//		System.out.println(j.power);
		
//		Cal c = new Cal();
//		
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기 : "+result);
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : "+result2);
//		
//		c.mult(num, num2); // 리턴이없으므로 변수에 값넣기 X(result3 = c.mult(num, num2);)
		
		// 1. 2개의 값을 넘겨주었을 때 a,b > 각 숫자에 10을 더한 후 두 숫자를 합친 값 리턴
		// 2. 각 숫자에 10을 곱한 후 두 숫자를 합친 값 리턴
		// 3. 각 숫자를 곱한 후 리턴
		loop:while(true) {
			Cal2 c2 = new Cal2();
			
			System.out.println("숫자 1을 입력하세요.");
			int num = scan.nextInt();
			if(num==-1) {
				System.out.println("프로그램 종료");
				break loop;
			}
			System.out.println("숫자 2을 입력하세요.");
			int num2 = scan.nextInt();
						
			int result = c2.aAdd(num, num2);
			System.out.println("1. "+result);
			
			int result2 = c2.mAdd(num, num2);
			System.out.println("2. "+result2);
			
			int result3 = c2.mult(num, num2);
			System.out.println("3. "+result3);
				

			
		}
		
	}
}
