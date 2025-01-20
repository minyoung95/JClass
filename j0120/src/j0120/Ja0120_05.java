package j0120;

import java.util.Arrays;

public class Ja0120_05 {
	public static void main(String[] args) {
		
		String[] name = new String[3];
		int[] kor = new int[3];
		
		Cal4 c4 = new Cal4();
		// name,kor를 보내서 데이터를 입력 받아, main 메소드에서 출력
		c4.input(name,kor);
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		
	}
}
