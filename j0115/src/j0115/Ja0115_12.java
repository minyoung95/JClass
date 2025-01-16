package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_12 {

	public static void main(String[] args) {
		// 국어 영어 수학 합계 3명의 성적 입력
		Scanner sc = new Scanner(System.in);
		
//		int[] input = new int[3];
//		for(int i=0 ; i<3 ; i++) {
//			System.out.println("숫자 입력: ");
//			int in = sc.nextInt();
//			input[i]=in;
//		}
//		System.out.println(Arrays.toString(input));
		String[] title = {"이름", "국어", "영어", "수학", "합계", "평균"};
		
		String[] name = new String[3];
		int[][] arr = new int[3][4];
		double[] avg = new double[3];
		//1.입력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("이름을 입력하시오 : ");
			name[i] = sc.next();
			
			int sum=0;
			for(int j=0 ; j<arr[i].length-1 ; j++) {
				System.out.printf("[%s] 번째 점수 입력 : ",title[j+1]);
				arr[i][j] = sc.nextInt();
				sum+=arr[i][j];
				avg[i]=sum/3.0;
				arr[i][j+1]=sum;

			}
			
		}
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", title[0],title[1],title[2],title[3],title[4],title[5]);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
		}
		
		
	}

}
