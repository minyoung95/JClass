package j0120;

// 기본 생성자
public class Ja0120_07 { 
	public static void main(String[] args) {
		
//		Cal c = new Cal(); // 객체 선언 - new Cal() : 생성자 호출
		Data1 d1 = new Data1();
		d1.value = 10;
		d1.name = "홍길동";
		d1.kor = 100;
		d1.eng = 100;
		d1.math = 100;
		System.out.println(d1.value);
		
		Data1 dd2 = new Data1();
		dd2.value = 11;
		dd2.name = "유관순";
		dd2.kor = 90;
		dd2.eng = 90;
		dd2.math = 90;		
		
//		Data2 d2 = new Data2(); 기본생성자가 있어서 에러 > ()안에 값이 있어야함
		Data2 d2 = new Data2(1,"홍길동",100,100,100);
		Data2 d3 = new Data2(2,"유관순",90,90,90);
		System.out.println(d2.value);
		System.out.println(d3.value);
	}
}

class Data1{
	int value; // 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
}

class Data2{
	int value;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	// 기본 생성자 : 클래스명과 같으면 생성자?
	Data2(int x,String n,int k, int e, int m){
		value = x;
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = kor+eng+math;
		avg = total/3.0;
	}
}