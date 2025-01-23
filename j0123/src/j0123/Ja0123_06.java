package j0123;

import java.util.Scanner;

public class Ja0123_06 {
	public static void main(String[] args) throws CloneNotSupportedException {

		Scanner scan = new Scanner(System.in);
	
		
		
//		String a = new String("a");
//		StringBuffer str = new StringBuffer("aaa");
//		System.out.println(a+2); // a2
//		System.out.println(str.append(2)); // str+2 > 에러
		
//		// indexOf
//		String str = "aabbccAABBCCaaddeeffAAaa";
//		
//		int count=0; // aa가 총 몇개인지
//		for(int i=0;i<str.length();i++) {
//			if(str.indexOf("aa",i)!=-1) { // aa가 있을때
//				i = str.indexOf("aa",i); // 2
//				System.out.println("aa 존재하는 위치 : "+i);
//				count++;
//			}else { 
//				break; // aa가 없을때
//			}
//		}
		
//		// valueOf : 문자열로 바꾸기
//		int a = 10;
//		double b = 3.14;
//		String a1 = String.valueOf(a);
//		String.valueOf(b);
//		String a2 = ""+a;
//		
//		String str1 = "3.14";
//		double a3 = Double.parseDouble(str1); // double 타입으로
		
//		// substring : 잘라내기
//		String str = "1조1234567";
//		System.out.println(str.substring(2)); // 2번째부터 출력
//		System.out.println(str.substring(2,6)); // 2번째~6번째앞까지 출력
//		String[] arr = {"홍길동임","유관순입니다","이순신이다","강감찬일까요","김구에요.","홍길순","홍길자임다"};
//		// 첫글자, 마지막글자빼고 모두 출력
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].substring(1,arr[i].length()-1));
//		}
		
		
//		// length : 문자의 길이
//		String str = "안녕하세요. 반갑습니다. 홍길동입니다.";
//		while(true) {
//			System.out.println("10자 이내로 글자를 입력하세요. >>");
//			String str2 = scan.next();
//			if(str2.length()>10) {
//				System.out.println("글자를 다시 입력하세요.");
//			}else {
//				System.out.printf("입력한 글자는 %s입니다.",str2);
//				break;
//			}
//		}
		
//		// replace : 문자를 다른문자로 대체
//		String str = "안녕하세요. 홍길동입니다. 성은 홍입니다.";
//		String input = "김";
//		str.replace("홍","김"); // 원본은 수정 X
//		String str2 = str.replace("홍", "강");
//		System.out.println(str.replace("홍", "김"));
//		System.out.println(str2);
//		
//		String str3 = "          안녕    하     세      여";
//		String str4 = str3.replace(" ", ""); // 빈 공백 제거
//		System.out.println(str4);
		
//		// trim : 빈 공백 제거(앞뒤) - 사이 빈 공백은 X
//		String str = "          안녕    하     세      여";
//		System.out.println(str.trim());
		
//		// indexOf : 글자의 위치값 확인
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "성";
//		System.out.println("있는 위치 : "+str.indexOf(input));
//		int no = str.indexOf(input);
		
//		// contains : 문자열 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].contains(input)) {
//				System.out.println(arr[i]);
//			}
//		}
		
//		if(str.contains(input)) {
//			System.out.println("홍이라는 글자가 있습니다.");
//		}else {
//			System.out.println("홍이라는 글자는 없습니다.");
//		}
		
//		String str = "1,홍길동,100,100,100,0,0,0,0";
//		// 학번 : 1, 이름 : 홍길동, 국어 : 100, 영어 : 100, 수학 : 100, 합계 : 300, 평균 : 100.00, 등수 : 0 출력
//		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
//		String[] stu = str.split(",");
//		int kor = Integer.parseInt(stu[2]);
//		int eng = Integer.parseInt(stu[3]);
//		int math = Integer.parseInt(stu[4]);
//		int total = kor+eng+math;
//		double avg = total/3.0;
//		
//		System.out.println("학번 : "+stu[0]);
//		System.out.println("이름 : "+stu[1]);
//		System.out.println("국어 : "+stu[2]);
//		System.out.println("영어 : "+stu[3]);
//		System.out.println("수학 : "+stu[4]);
//		System.out.println("합계 : "+total);
//		System.out.println("평균 : "+avg);
//		System.out.println("등수 : "+stu[8]);
		
		
//		// 숫자 두개를 10,9 이런식으로 입력 후 두 수 합,곱 구하기
//		System.out.println("숫자를 입력하세요.>> 10,9");
//		String num = scan.next();
//		String[] arr = num.split(",");
//		int number1 = Integer.parseInt(arr[0]);
//		int number2 = Integer.parseInt(arr[1]);
//		int add = number1 + number2;
//		int mult = number1 * number2;
//		System.out.println(add);
//		System.out.println(mult);
//		
//		String str = "5";
//		int n = Integer.parseInt(str); // 문자열을 숫자로 변경
		
//		// split : 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		// concat : 문자열 합치기
//		String str = "안녕";
//		String str2 = "하세요";
//		System.out.println(str.concat(str2));
		
//		// charAt() : 한글자씩 때기
//		String str = "abcdef";
//		System.out.println(str.charAt(2)); 
		
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		// equals : 대소문자 구분 비교, equalsIgnoreCase : 대소문자 구분 X
//		if(str.equalsIgnoreCase(str2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		Person p1 = new Person(200101011111111L);
//		Person p2 = new Person(200101011111111L);
//		
//		System.out.println(p1);
//		
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
		
//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		
//		if(s1.equals(s2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
		
//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone(); // 복사
//		Point p3 = new Point(p1); // 객체복사
//		
//		// 값 변경
//		p1.x = 10;
//		p2.x = 100;
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
		
	}
}
