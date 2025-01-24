package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int choice = 0, temp = 0, count = 0, rankC = 0;
	int no=0,kor=0,eng=0,math=0,total=0,rank=0;
	String name = "";
	double avg = 0;		
	
	// 파일 읽기
	void fileRead() throws Exception{
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
			
		}
		br.close();
		fr.close();
	} // fileRead()
	
	// 학생성적 입력
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		while(true) {
			System.out.printf("[ %d번째 ]\n",list.size()+1);
			System.out.println("학생 이름을 입력하세요. (0. 뒤로가기)");
			name = scan.next();
			if(name.equals("0")) {
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			
			list.add(new Stu(name,kor,eng,math));
			
			System.out.println("학생 성적 입력이 완료되었습니다.");
			System.out.println();
		}
	} // input()
	
	// list 출력
	void listPrint() {
		System.out.println("                       [ 학생성적 출력 ]");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
	} // listPrint()
	
	// 학생성적 수정
	void update() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("학생 이름을 입력하세요.");
		String uName = scan.next();
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(s.getName().equals(uName)) {
				System.out.printf("%s학생의 정보를 찾았습니다.",uName);
				System.out.println("--------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.out.println("--------------------------------------------------------------");
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				
				System.out.println("수정하고자 하는 과목번호를 입력해주세요.");
				System.out.println("[ 1. 국어점수 ]");
				System.out.println("[ 2. 영어점수 ]");
				System.out.println("[ 3. 수학점수 ]");
				choice = scan.nextInt();
				
				switch(choice) {
				
				case 1:
					System.out.println("[ 국어점수 ]");
					System.out.printf("현재 국어점수는 %d점입니다.\n",s.getKor());
					System.out.println("변경할 국어점수를 입력하세요.");
					int updateK = scan.nextInt();
					s.setKor(updateK);
					break;
				case 2:
					System.out.println("[ 영어점수 ]");
					System.out.printf("현재 영어점수는 %d점입니다.\n",s.getEng());
					System.out.println("변경할 영어점수를 입력하세요.");
					int updateE = scan.nextInt();
					s.setEng(updateE);
					break;
				case 3:
					System.out.println("[ 수학점수 ]");
					System.out.printf("현재 수학점수는 %d점입니다.\n",s.getMath());
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
				System.out.printf("%s학생의 정보가 없습니다. 다시 입력해주세요.\n",uName);
				System.out.println();
			}
			break;
		}
	} // update()
	
	// 학생성적 삭제
	void remove() {
		System.out.println("[ 학생성적 삭제 ]");
		System.out.println("학생 이름을 입력하세요.");
		String rName = scan.next();
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(s.getName().equals(rName)) {
				System.out.printf("%s학생의 정보를 찾았습니다.\n",rName);
				System.out.println("--------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.out.println("--------------------------------------------------------------");
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				System.out.println("정말로 삭제하시겠습니까? (1.삭제, 2.뒤로가기)");
				choice = scan.nextInt();
				switch(choice) {
				
				case 1:
					list.remove(i);
					System.out.printf("%s학생의 정보가 삭제되었습니다\n",rName);
					break;
				case 2:
					System.out.println("상위 메뉴로 이동합니다.");
					break;
				}
				
				temp = 1;
				break;
			}
			
			if(temp == 0) {
				System.out.printf("%s학생의 정보가 없습니다. 다시 입력해주세요.\n",rName);
				System.out.println();
			}
			break;
		}
	} // remove()
	
	// 학생성적 검색
	void search() {
		System.out.println("[ 학생성적 검색 ]");
		System.out.println("학생 이름을 입력하세요.");
		String search = scan.next();
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(s.getName().equals(search)) {
				System.out.printf("%s학생의 정보를 찾았습니다.\n",search);
				System.out.println("--------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.out.println("--------------------------------------------------------------");
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				
				temp = 1;
				break;
			}
			
			if(temp == 0) {
				System.out.printf("%s학생의 정보가 없습니다. 다시 입력해주세요.\n",search);
				System.out.println();
			}
			break;
		}
	} // search()
	
	// 학생 등수정렬
	void rSort() {
		System.out.println("[ 학생 등수정렬 ]");
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) { 
				return s2.getTotal()-s1.getTotal(); 
			} 
		});
		
		System.out.println("등수정렬이 완료되었습니다.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
	} // rSort()
	
	// 학생 이름정렬
	void nSort() {
		System.out.println("[ 학생 이름정렬 ]");
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		
		System.out.println("이름정렬이 완료되었습니다.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
	} // nSort()
	
	// 등수 처리
	void rank() {
		System.out.println("[ 등수 처리 ]");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			rankC = 1;
			for(int j=0;j<list.size();j++) {
				Stu s2 = list.get(j);
				if(s.getTotal()<s2.getTotal()) {
					rankC++;
				}
			}
			s.setRank(rankC);
		}
		System.out.println("등수처리가 완료되었습니다.");
		System.out.println();

	} // rank()
	
	// 파일 저장
	void save() throws Exception {
		
		// 폴더 확인,생성 
		String folder = "c:/save4";
		File f = new File(folder);
		
		if(!f.exists()) {
			f.mkdirs();
			System.out.println("폴더 생성완료");
		}
		
		// 파일 생성
		File file = new File(folder+"StuScore.txt");
		if(!file.exists()) {
			f.createNewFile();
			System.out.println("파일 생성완료");
		}
		
		FileWriter fw = new FileWriter("c:/save4/StuScore.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<list.size();i++) {
			String score = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",
					list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),
					list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),
					list.get(i).getAvg(),list.get(i).getRank());
			bw.write(score);
		}
		bw.close();
		fw.close();
		
		System.out.println("학생성적 파일 저장이 완료되었습니다.");
		System.out.println();
		
	} // save()
	
}
