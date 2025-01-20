package j0120;

import java.util.Scanner;

public class Ja0120_08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		Car c = new Car();
//		c.color = "White";
//		c.gearType = "auto";
//		c.door = 4;
//		
//		// red, stick, 5
//		Car c2 = new Car("red","stick",5);
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door)
//		
//		 1,홍길동,100,100,100 입력하여, 합계,평균까지 같이 출력되도록 하기
//		StuScore s1 = new StuScore(1,"홍길동",100,100,100);
//		s1.print();
		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		c2 = c1 얕은 복사 : 주소가 복사됨
//		Car c3 = new Car(c1); // red,auto,5 : Car(Car c){}를 불러옴
//		c3 = c1 주소값은 다르지만 값은 같음
		
		StuScore[] s = new StuScore[3]; // 배열선언
		for(int i=0;i<3;i++) {
			
			System.out.println("이름을 입력하세요.");
			String name = scan.next();
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			s[i] = new StuScore(name,kor,eng,math);
			s[i].print();
			
		}
		
		// 4번째 학생
		StuScore s1 = new StuScore();
		System.out.println("");
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		s1.print();
	}
}
