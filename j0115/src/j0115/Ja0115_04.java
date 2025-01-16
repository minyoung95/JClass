package j0115;

import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1~100 랜덤숫자 생성
		//10번의 도전으로 정답 맞추면 종료, 랜덤 숫자보다 큰수, 작은수 출력
		// 입력한 숫자 모두 출력
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int ran = (int)(Math.random()*100)+1;
		int cnt=1;
		for(int i=0 ; i<num.length ; i++) {
			System.out.println((i+1) + "번째 도전");
			num[i]=sc.nextInt();
			if(ran>num[i]) {
				System.out.println("입력값보다 큽니다");
			}
			else if(ran<num[i]) {
				System.out.println("입력값보다 작습니다");
			}
			else {
				System.out.println("정답");
				break;
			}
			cnt++;
		}
		System.out.println("랜덤숫자 : "+ran);
		System.out.print("입력숫자 : ");			
		for(int i=0 ; i<cnt ; i++) {
			System.out.printf("%d\t",num[i]);	
		}
		System.out.println();
		System.out.println("입력횟수 : "+cnt);
	}

}
