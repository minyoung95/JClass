package j0120;

import java.util.Arrays;

public class Ja0120_04 {
	public static void main(String[] args) {
	
		// 두 수를 Cal3에 보내면 +,-,* 의 값을 리턴하여 출력
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;
		c3.op(a, b, re);
		System.out.println(Arrays.toString(re));
		
		
//		Cal2 x = new Cal2();
//		String[] name = x.strPrint();
//		System.out.println(Arrays.toString(name));
		
//		Input i = new Input(); // 객체선언
//		// 5개 입력받아 출력 (배열)
//		int[] inputArr = new int[5]; // 배열선언
//		for(int j=0;j<inputArr.length;j++) {
//			inputArr[j] = i.valInput();
//		}
//		for(int j=0;j<inputArr.length;j++) {
//			System.out.println(inputArr[j]);
//		}
		
		
//		int a = 10;
//		int b = 3;
//		
//		Cal x = new Cal();
//		int result = x.mult(a, b);
//		System.out.println(result);
//		
//		int result2 = x.add(a, b);
//		System.out.println(result2);
//		
//		double result3 = x.div(a, b);
//		System.out.println(result3);
	}
}
