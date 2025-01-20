package j0116;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ja0116_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		String input = scan.next();
		System.out.println("숫자2를 입력하세요");
		String input2 = scan.next();
		
		// 타입을 int타입으로 변경(Integer.parseInt())
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("입력한 숫자 : "+(num+num2));
		
//		// 웹에서 입력받기 (문자열)
//		String input = JOptionPane.showInputDialog("1-100까지 숫자를 입력하세요.");
//		System.out.println("입력숫자 : "+input);
		
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6]; // 자리 6개인 배열 만들기
//		
//		System.arraycopy(num, 2, num2, 1, 3); // num 3번째 방부터 3개까지를 num2의 2번째방부터 3개 복사 
//
//		System.out.println(Arrays.toString(num2));
	
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6]; // 자리 6개인 배열 만들기
//		
//		num[5] = 6; 배열을 그냥 늘리기 X
//		System.out.println(Arrays.toString(num));
//		
//		for(int i=0;i<num.length;i++) {
//			num2[i] = num[i];
//		} // num2를 {1,2,3,4,5}로 만들기
//		
//		num = num2; // num2의 주소값을 num에
//		num2[5] = 6; // num2의 6번째 자리에 6을 대입 > num도 적용
//		System.out.println(Arrays.toString(num2));
//		System.out.println(Arrays.toString(num));
		
//		int[][] score = new int[4][6];
//		// 1-24
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = (6*i)+j+1;
//			}
//		}
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
//		int[][] score =  new int[5][5];
//		// 1-25
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = (5*i)+j+1;
//			}
//		}
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
//		int[] num = new int[5];
//		for(int i=0;i<5;i++) {
//			num[i] = i+1;
//		}
//		
//		for(int i=0;i<5;i++) {
//			System.out.print(num[i]+"\t");
//		}
		
		
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		int[] num2 = {1,2};
//		
//		num2 = num; // 주소값을 같게 만듬
//		
//		num[0] = 200; // num 0번의 값을 바꿈 > 주소값이 같은 num2 0번 값도 바뀜
//		System.out.println(Arrays.toString(num2)); // 배열 모두 출력
		
	}
}
