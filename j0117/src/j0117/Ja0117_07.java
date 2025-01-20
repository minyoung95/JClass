package j0117;

public class Ja0117_07 {
	public static void main(String[] args) {
		
		Stu.count = 10; // 클래스변수 : 클래스명.변수명 (객체선언X)
				
		
		Stu s1 = new Stu(); // 객체선언(인스턴스변수)
		s1.id = "aaa"; // 참조변수명.인스턴스변수명
		s1.count = 100;
		s1.age = 100;
		
		Stu s2 = new Stu();
		s2.id = "bbb";
		s2.count = 500;
		s2.age = 500;
		
		System.out.println(s2.count);
		System.out.println(s1.count); 
		// s1.count는 100이였지만 500으로나옴 static는 공용변수라 객체마다 있는개념 X
		// s2.count가 500으로 바뀌면 s1.count도 500으로 바뀜 > 참조변수명.인스턴스변수명으로 쓰지말기(가능은하다)
	}
}
