package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5개의 숫자 입력받고 출력 후 합계 출력
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum=0;
		for(int i=0 ; i<num.length ; i++) {
			System.out.println((i+1) + "번째 숫자 입력");			
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		System.out.println("입력받은 값");
		for(int i=0 ; i<num.length ; i++) {
			System.out.println(num[i]);
		}
		System.out.println("합게  "+sum);
	}

}
