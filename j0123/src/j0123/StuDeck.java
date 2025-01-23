package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {

	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no=0,kor=0,eng=0,math=0,total=0,rank=0;
	String name="";
	double avg=0;
	int choice = 0, temp = 0, rankC = 0;
	
	// 상단 메뉴메소드
	int main_print() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적 입력");
		System.out.println("2. 학생성적 출력");
		System.out.println("3. 학생성적 수정");
		System.out.println("4. 학생성적 삭제");
		System.out.println("5. 등수 처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		return choice;
	}
	
	//
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		while(true) {
			System.out.printf("[ %d 번째 ]\n",list.size()+1);
			// 이름
			System.out.println("이름을 입력하세요. (뒤로가기 : 0)");
			name = scan.next();
			if(name.equals("0")) {
				break;
			}
			// 국,영,수
			System.out.printf("국어점수를 입력하세요.\n ");
			kor = scan.nextInt();
			System.out.printf("영어점수를 입력하세요.\n ");
			eng = scan.nextInt();
			System.out.printf("수학점수를 입력하세요.\n ");
			math = scan.nextInt();

			// list 저장
			list.add(new Stu(name,kor,eng,math));
			
			
			System.out.printf("%s 학생의 성적 입력이 완료되었습니다.\n",name);
			
			
		} // while
	}
	
	// 출력메소드
	void output() {
		System.out.println("[ 학생성적 출력 ]");
		System.out.println("--------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("--------------------------------------------------------");
		for(int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j); // Object 타입 > Stu로 형변환
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());		
			System.out.printf("%d\t",s.getTotal());							
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
		System.out.println();
		
	}
	
	void update() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("수정하고자 하는 학생 이름을 입력하세요.");
		String search = scan.next();
		
		for(int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j);
			if(s.getName().equals(search)) {
				System.out.printf("%s 학생의 정보를 찾았습니다.\n",search);
				System.out.println("--------------------------------------------------------");
				for(int k=0;k<title.length;k++) {
					System.out.printf("%s\t",title[k]);
				}
				System.out.println();
				System.out.println("--------------------------------------------------------");
				System.out.printf("%d\t",s.getNo());
				System.out.printf("%s\t",s.getName());
				System.out.printf("%d\t",s.getKor());
				System.out.printf("%d\t",s.getEng());
				System.out.printf("%d\t",s.getMath());		
				System.out.printf("%d\t",s.getTotal());							
				System.out.printf("%.2f\t",s.getAvg());
				System.out.printf("%d\n",s.getRank());
				System.out.println();
				
				System.out.println("수정하고자 하는 과목 번호를 입력하세요.");
				System.out.println("[ 1. 국어점수 ]");
				System.out.println("[ 2. 영어점수 ]");
				System.out.println("[ 3. 수학점수 ]");
				choice = scan.nextInt();
				
				switch(choice) {
				
				case 1:
					System.out.println("[ 국어점수 ]");
					System.out.printf("현재 국어점수 : %d\n",s.getKor());
					System.out.println("변경할 국어점수를 입력하세요.");
					int updateK = scan.nextInt();
					s.setKor(updateK);
					break;
				case 2:
					System.out.println("[ 영어점수 ]");
					System.out.printf("현재 영어점수 : %d\n",s.getEng());
					System.out.println("변경할 영어점수를 입력하세요.");
					int updateE = scan.nextInt();
					s.setEng(updateE);
					break;
				case 3:
					System.out.println("[ 수학점수 ]");
					System.out.printf("현재 수학점수 : %d\n",s.getMath());
					System.out.println("변경할 수학점수를 입력하세요.");
					int updateM = scan.nextInt();
					s.setMath(updateM);
					break;
				}
				
				s.setTotal(s.getKor()+s.getEng()+s.getMath());
				s.setAvg(s.getTotal()/3.0);
				
				temp = 1;
				break;
				
			}
			
			if(temp == 0) {
				System.out.printf("%s학생의 정보가 없습니다. 다시 입력해주세요.\n",search);
			}
			break;
		}
	}
}
