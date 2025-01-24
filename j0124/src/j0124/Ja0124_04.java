package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ja0124_04 {
	public static void main(String[] args) throws Exception {
		
//		// 글을 가져와서 출력하는 기본형태
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			while((read=fis.read()) != -1) { // 읽을 데이터가 있는 경우
//				System.out.println((char)read);
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		// 파일을 읽어서 데이터 출력
//		byte[] b = new byte[1024];
//		FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//		fis.read(b);
//		System.out.println(new String(b));
		
		// 글을 파일에 저장
		File f = new File("c:/save2");
		if(!f.exists()) { // 존재유무 확인
			f.mkdirs(); // 디렉토리 만들기 , mkdirs : c:/save2/aaa/ - save2와 aaa를 다 만들어줌 (mkdir : c:/save2/aaa/ save2만 만들어줘서 에러)
		}
		
		// 파일 복사
		FileInputStream fis = new FileInputStream("c:/save/rose.jpg"); // 파일 읽기
		FileOutputStream fos = new FileOutputStream("c:/save2/rose2.jpg"); // 파일 저장
		while(true) {
			int read = fis.read();
			if(read==-1) break;
			fos.write(read);
		
		}
		fis.close();
		fos.close();		
		
		System.out.println("이미지 복사 프로그램 종료");
	}
}
