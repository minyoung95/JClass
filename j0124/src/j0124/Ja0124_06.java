package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Ja0124_06 {
	public static void main(String[] args) throws Exception{
		
		ArrayList<Stu> list = new ArrayList<Stu>();
		list.add(new Stu("홍길동",100,90,90));
		list.add(new Stu("유관순",90,80,80));
		list.add(new Stu("이순신",80,70,70));
		
		// list 파일에 들어있는 내용을 stu.txt
		// 1,홍길동,100,100,100,300,100.00,0
		
		FileWriter fw = new FileWriter("c:/save/stu.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<list.size();i++) {
			String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", 
					list.get(i).getNo(),list.get(i).getName(),
					list.get(i).getKor(),list.get(i).getEng(),
					list.get(i).getMath(),list.get(i).getTotal(),
					list.get(i).getAvg(),list.get(i).getRank());
			bw.write(str);
		}
		bw.close();
		fw.close();
		
//		// save2 폴더에 stu.txt로 아래의 글 저장
//		FileWriter fw = new FileWriter("c:/save2/stu.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		String[] str = new String[4];
//		str[0] = "1,홍길동,100,90,90";
//		str[1] = "2,유관순,90,80,80";
//		str[2] = "3,이순신,80,70,70";
//		
//		for(int i=0;i<str.length;i++) {
//			bw.write(str[i]+"\r\n");
//		}
//		bw.close();
//		fw.close();
//		
//		str[3] = "4,강감찬,70,60,60";
//		FileWriter fw2= new FileWriter("c:/save2/stu.txt",true); // true : 이어쓰기, false : 덮어쓰기
//		BufferedWriter bw2 = new BufferedWriter(fw2);
//		
//		for(int i=3;i<4;i++) {
//			bw.write(str[i]+"\r\n");
//		}
//		bw2.close();
//		fw2.close();
//		
//		// 파일 출력
//		FileReader fr = new FileReader("c:/save2/stu.txt");
//		BufferedReader br = new BufferedReader(fr);
//		while(true) {
//			String line = br.readLine();
//			if(line==null) break;
//			System.out.println(line);
//		}
		
		System.out.println("프로그램 종료");
	}
}
