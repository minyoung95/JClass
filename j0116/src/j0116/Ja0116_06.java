package j0116;

import java.util.Scanner;

public class Ja0116_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int choice = 0 ,temp = 0;
		
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("[ 학생성적 입력 ]");
				int i = count;
				while(i<10) {
					System.out.printf("[ %d 번째 ]\n",count+1);
					no[i] = count+1;
					System.out.println("이름을 입력하세요. (0. 뒤로가기) >> ");
					name[i] = scan.next();
					if(name[i].equals("0")) {
						break;
					}
					int total = 0;
					for(int j=0;j<3;j++) {
						System.out.printf("%s 점수를 입력하세요.\n",title[j+2]);
						score[i][j] =  scan.nextInt();
						total += score[i][j];
					}
					score[i][3] = total;
					avg[i] = total/3.0;
					
					System.out.printf("%d번 학생의 성적이 입력되었습니다.\n",count+1);
					
					i++;
					count++;
					
				} // while
				break;
				
			case 2:
				System.out.println("[ 학생성적 출력 ]");
				System.out.println("-----------------------------------------------------");
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				System.out.println("-----------------------------------------------------");
				for(int j=0;j<count;j++) {
					System.out.printf("%d\t",no[j]);
					System.out.printf("%s\t",name[j]);
					for(int k=0;k<4;k++) {
						System.out.printf("%d\t",score[j][k]);
					}
					System.out.printf("%.2f\n",avg[j]);
				}
				
				break;
			
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("수정하고자 하는 학생 이름을 입력하세요.");
				String search = scan.next();
				
				for(int j=0;j<count;j++) {
					if(name[j].equals(search)) {
						System.out.printf("%s 학생의 정보를 찾았습니다.\n",search);
						System.out.println("-----------------------------------------------------");
						for(int k=0;k<title.length;k++) {
							System.out.printf("%s\t",title[k]);
						}
						System.out.println();
						System.out.println("-----------------------------------------------------");
						System.out.printf("%d\t",no[j]);
						System.out.printf("%s\t",name[j]);
						for(int k=0;k<4;k++) {
							System.out.printf("%d\t",score[j][k]);
						}
						System.out.printf("%.2f\n",avg[j]);
						
						System.out.println("수정하고자 하는 과목 번호를 입력하세요.");
						System.out.println("[ 1. 국어점수 ]");
						System.out.println("[ 2. 영어점수 ]");
						System.out.println("[ 3. 수학점수 ]");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1:
							System.out.println("1. 국어점수");
							System.out.printf("현재 국어점수 : %d\n",score[j][0]);
							System.out.println("변경하고자하는 국어점수를 입력하세요.");							
							int updateK = scan.nextInt();
							score[j][0] = updateK;
							break;
						case 2:
							System.out.println("2. 영어점수");
							System.out.printf("현재 영어점수 : %d\n",score[j][1]);
							System.out.println("변경하고자하는 영어점수를 입력하세요.");							
							int updateE = scan.nextInt();
							score[j][1] = updateE;
							break;
						case 3:
							System.out.println("3. 수학점수");
							System.out.printf("현재 수학점수 : %d\n",score[j][2]);
							System.out.println("변경하고자하는 수학점수를 입력하세요.");							
							int updateM = scan.nextInt();
							score[j][2] = updateM;
							break;
							

						} // choice
						
						// 합계 평균
						score[j][3] = score[j][0]+score[j][1]+score[j][2];
						avg[j] = score[j][3]/3.0;
						
						
						temp = 1;
						break;
					}					
				}
				
				if(temp == 0) {
					System.out.println("학생 정보를 찾을 수 없습니다.");
				}
				break;
				
			default:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}// switch
		} // while loop
		
	}
}
