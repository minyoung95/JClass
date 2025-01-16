package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_05 {

	public static void main(String[] args) {
		// 이름, 국어점수 - 5명의 국어 성적 입력
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		for(int i=0; i <name.length ; i++) {
			System.out.println((i+1)+"번째 이름 입력 : ");
			name[i] = sc.next();
			System.out.println((i+1)+"번째 국어 점수 입력 : ");
			kor[i] = sc.nextInt();
			System.out.println((i+1)+"번째 영어 점수 입력 : ");
			eng[i] = sc.nextInt();
			total[i]=kor[i]+eng[i];
			avg[i]=total[i]/2.0;
		}
		System.out.println("이름 : "+Arrays.toString(name));
		System.out.println("국어 : "+Arrays.toString(kor));
		System.out.println("영어 : "+Arrays.toString(eng));
		System.out.println("합계 : "+Arrays.toString(total));
		for(int i=0 ; i<avg.length ; i++) {
			System.out.printf("평균 : %.3f\t",avg[i]);
		}
		
	}

}
