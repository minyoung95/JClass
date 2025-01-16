package j0115;

import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		// 1~5까지의 랜덤숫자 생성 후 5번 입력받아 몇번 맞췄는지 횟수 출력
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int[] in = new int[5];
		int cnt=0;
		for(int i=0 ; i<num.length ; i++) {
			num[i] = (int)(Math.random()*5)+1;
		}
		for(int i=0; i<num.length ; i++) {
			System.out.println((i+1)+"번째 숫자 입력");
			in[i] = sc.nextInt();
			if(num[i]==in[i]) {
				cnt++;
			}
		
		}
		System.out.print("랜덤 숫자 : ");
		for(int i=0; i<num.length ; i++) {
			System.out.printf("%d\t", num[i]);
		}
		System.out.println();
		System.out.print("입력 숫자 : ");
		for(int i=0; i<num.length ; i++) {
			System.out.printf("%d\t", in[i]);
		}
		System.out.println();
		System.out.println("정답 횟수 " +cnt);
	}

}
