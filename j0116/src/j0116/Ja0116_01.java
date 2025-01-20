package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5]; // 배열 선언
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		
		System.out.println(num); // 주소값
		System.out.println(num[0]);
		
//		int[] num2 = {1,2,3,4,5}; // 2
//		
//		int[] num3 = new int[5]; // 3
//		for(int i=0;i<5;i++) {
//			num3[i] = i+1;
//		}
		
		// 로또 만들기
		int[] ball = new int[45];
		int[] lotto = new int[6]; // 45개중 6개 뽑기
		int[] input = new int[6]; // 입력값 6개
		int[] answer = new int[6]; // 당첨숫자 6개
		int count = 0;
		
		
		for(int i=0;i<45;i++) {
			ball[i] = i+1;			
		} // 입력 (1~45 번호생성)
				
		// 숫자 섞기
		int temp =0;
		for(int i=0;i<300;i++) {
			int randomN = (int)(Math.random()*45);
			// 위치 바꾸기
			temp = ball[0];
			ball[0] = ball[randomN];
			ball[randomN] = temp;
		}
		
		// 6개 뽑기
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		
		// 번호입력받기
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 번호를 입력하세요. >> \n",i+1);
			input[i] = scan.nextInt();
		}
		
		// 입력번호와 로또번호 비교
		// 반복문에 이름을 부여해서 break 할 반복문을 정해줌 loop:for // break loop;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i] == lotto[j]) {
					answer[count] = input[i];
					count++;
					break;
				}
			}
		}
		System.out.println("[ 로또번호 확인 ]");
		System.out.println("------------------------------");
		System.out.printf("로또번호 : %s \n",Arrays.toString(lotto));
		System.out.printf("입력번호 : %s \n",Arrays.toString(input));
		System.out.printf("맞춘갯수 : %s \n",count);
		System.out.print("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.println(answer[i]+" ");
		}
		System.out.println();
		
		
	}
}
