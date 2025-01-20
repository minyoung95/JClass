package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 배열 5*5 만들기
		String[][] arr = new String[5][5];
		int x = 0;
		int y = 0;
		int count = 0;
		int money = 0;
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		// 숫자 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
		
		// 배열 arr2 만들기
		String[][] arr2 = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j] = num[5*i+j]+"";
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = "뽑기";
			}
		}
		
		// 20번 뽑기
		int no=0;
		loop:while(no<20) {
			
			System.out.println("[ 뽑기 게임 ]");
			System.out.println("-------------------------------------------");
			System.out.printf("좌표 |\t0\t1\t2\t3\t4\n");
			System.out.println("-------------------------------------------");
			
			for(int i=0;i<5;i++) {
				System.out.printf("%d   |\t",i);
				for(int j=0;j<5;j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("-------------------------------------------");
			
			while(true) {
				System.out.print("x좌표를 입력하세요. (종료 : -1) >>");
				x = scan.nextInt();
				if(x == -1) {
					System.out.println("프로그램 종료");
					break loop;
				}
				System.out.print("y좌표를 입력하세요.");
				y = scan.nextInt();
				
				// 좌표값을 0-4 안넣으면
				if(x>=0 && x<=4 && y>=0 && y<=4) {
					break;
				}else {
					System.out.println("좌표를 잘못 입력하셨습니다.");
				}
			}
			System.out.printf("입력한 좌표 : [%d,%d]\n",x,y);
			
			// 당첨, 꽝 확인
			if(arr2[x][y].equals("1")) {
				arr[x][y] = "당첨";
				switch(count) {
				case 0:
					money += 100000000;
					break;
				case 1:
					money += 100000000;
					break;
				case 2:
					money += 200000000;
					break;
				case 3:
					money += 400000000;
					break;
				case 4:
					money += 800000000;
					break;
				}
				count++;
			}else {
				arr[x][y] = "꽝";
			}
			System.out.printf("결과 : %s \n",arr2[x][y]);
			System.out.printf("총 상금 : %d \n",money);
			
			no++;
		}
		
	}
}
