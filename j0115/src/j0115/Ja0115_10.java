package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ball = new String[45];
		//번호 저장
		int[] input = new int[6];
		for (int i=0 ; i<ball.length ; i++) {
			ball[i]=i+1+"";
		}
		int j=0;
		while(j<6) {
			System.out.print("\t   [[로또맞추기]]");
			for(int i=0 ; i<ball.length ; i++) {
				if(i%5==0) {
					System.out.println();
				}
				System.out.print(ball[i]+"\t");							
			}
			System.out.println();
			System.out.println("원하는 번호 입력 : "+(j+1)+"번째");
			int in = sc.nextInt();
			input[j]=in;
			ball[in-1]="X";
			j++;
		}
		System.out.println(Arrays.toString(input));

		
	
//		int[] num = {1,9,3,8,5,2,7};
//		Integer[] num2 = {1,9,3,8,5,2,7};
//		System.out.println(Arrays.toString(num));
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));
	}
}
