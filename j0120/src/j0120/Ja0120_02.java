package j0120;

import java.util.Arrays;

public class Ja0120_02 {
	public static void main(String[] args) {
		
		Arr x = new Arr();
		
		System.out.println(Arrays.toString(x.num));
		cal(x.num); // cal() 호출
		System.out.println(Arrays.toString(x.num));
	}
	
	static void cal(int[] num) {
		
		for(int i=0;i<num.length;i++) {
			num[i] = num[i]+10;
		}
		
	}
}
