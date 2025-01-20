package j0120;

import java.util.Scanner;

public class Ja0120_11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StuScore[] s = new StuScore[10]; // 배열선언
		int no=0,total=0,rank=0;
		int[] score = new int[3];
		String name = "";
		double avg = 0;
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0, count = 0, temp = 0, rankC = 0;
		
		loop: while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("[ 1. 학생성적 입력 ]");
			System.out.println("[ 2. 학생성적 출력 ]");
			System.out.println("[ 3. 학생성적 수정 ]");
			System.out.println("[ 4. 등수처리 ]");
			System.out.println("[ 0. 프로그램 종료 ]");
			System.out.println("-----------------------------");
			System.out.println("원하시는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("[ 학생성적 입력 ]");
				while(count<10) {
					System.out.printf("[ %d 번째 ]\n",count+1);
					System.out.println("학생 이름을 입력하세요.");
					name = scan.next();
					if(name.equals("0")) {
						break;
					}
					for(int i=0;i<score.length;i++) {
						System.out.printf("%s점수를 입력하세요.\n",title[i+2]);
						score[i] = scan.nextInt();
					}
					
					s[count] = new StuScore(name,score[0],score[1],score[2]);
					
					s[count].print();
					System.out.printf("%s학생 성적이 저장되었습니다.",name);
					
					count++;
				}
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
					System.out.printf("%d\t",s[j].no);
					System.out.printf("%s\t",s[j].name);
					System.out.printf("%d\t",s[j].kor);
					System.out.printf("%d\t",s[j].eng);
					System.out.printf("%d\t",s[j].math);
					System.out.printf("%d\t",s[j].total);
					System.out.printf("%.2f\t",s[j].avg);
					System.out.printf("%d\n",s[j].rank);
				}
				break;
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("수정하고자 하는 학생 이름을 입력하세요.");
				String search = scan.next();
				
				for(int j=0;j<count;j++) {
					if(s[j].name.equals(search)) {
						System.out.printf("%s학생 정보를 찾았습니다.",search);
						System.out.println("-----------------------------------------------------");
						for(int k=0;k<title.length;k++) {
							System.out.printf("%s\t",title[k]);
						}
						System.out.println();
						System.out.println("-----------------------------------------------------");
						
						System.out.printf("%d\t",s[j].no);
						System.out.printf("%s\t",s[j].name);
						System.out.printf("%d\t",s[j].kor);
						System.out.printf("%d\t",s[j].eng);
						System.out.printf("%d\t",s[j].math);
						System.out.printf("%d\t",s[j].total);
						System.out.printf("%.2f\t",s[j].avg);
						System.out.printf("%d\n",s[j].rank);
						System.out.println("------------------------------------------------------");	
						
						System.out.println("수정하고자 하는 과목번호를 입력하세요. (0. 수정 취소)");
						System.out.println("[ 1. 국어점수 ]");
						System.out.println("[ 2. 영어점수 ]");
						System.out.println("[ 3. 수학점수 ]");
						choice = scan.nextInt();
						
						switch(choice) {
						
						case 1:
							System.out.println("1. 국어점수");
							System.out.printf("현재 국어점수 : %d\n",s[j].kor);
							System.out.println("수정하고자 하는 점수를 입력하세요.");
							int updateK = scan.nextInt();
							s[j].kor = updateK;
							break;
						case 2:
							System.out.println("2. 영어점수");
							System.out.printf("현재 영어점수 : %d\n",s[j].eng);
							System.out.println("수정하고자 하는 점수를 입력하세요.");
							int updateE = scan.nextInt();
							s[j].eng = updateE;
							break;
						case 3:
							System.out.println("3. 수학점수");
							System.out.printf("현재 수학점수 : %d\n",s[j].math);
							System.out.println("수정하고자 하는 점수를 입력하세요.");
							int updateM = scan.nextInt();
							s[j].math = updateM;
							
							break;
						default:
							System.out.println("성적 수정이 취소되었습니다.");
							break loop;
						}
						
						s[j].total = s[j].kor+s[j].eng+s[j].math;
						s[j].avg = s[j].total/3.0;
						
						System.out.printf("%s 학생 성적 수정이 완료되었습니다.\n",search);
						temp = 1;
						break;
						
					}
					if(temp==0) {
						System.out.println("%s 학생의 정보가 없습니다. 다시 입력해주세요."+search);
						break;				
					}
				}
				break;
			case 4:
				System.out.println("[ 등수 처리 ]");
				for(int j=0;j<count;j++) {
					rankC = 1;
					for(int k=0;k<count;k++) {
						if(s[j].total<s[k].total) {
							rankC++;
						}
					}
					s[j].rank = rankC;
				}
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
				
			default:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
	}
}
