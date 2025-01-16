package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또 맞추기
		//1. 변수선언
		//2. 1-45 번호저장
		//3. 배열섞기
		//4. 6개 로또번호
		//5. 입력창만들기
		// 6. 맞춘번호 확인 - input,lotto
		// 7. 출력
		Scanner sc = new Scanner(System.in);
		String[] ball = new String[6];
		int[] lotto = new int[45];
		int[] in = new int[6]; 
		for(int i=0 ; i<lotto.length ; i++) {
			lotto[i]=i+1;
		}
		
		int temp=0;
		for(int i=0 ; i<300 ; i++) {
			int ran = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0]=lotto[ran];
			lotto[ran]=temp;
		}
		for(int i=0 ; i<ball.length ; i++) {
			ball[i]=i+1+" ";
		}
		int j=0;
		while(j<6) {
			System.out.println("로또 번호 입력 : ");
			in[j] = sc.nextInt();
		}
		System.out.println(Arrays.toString(lotto));
	}

}
