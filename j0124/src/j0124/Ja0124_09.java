package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ja0124_09 {
	public static void main(String[] args) {
		
		
		try {
			// 폴더 확인 및 폴더 생성
			String folder = "c:/save3";
			File f = new File(folder);
			
			if(!f.exists()) { // 존재하지 않으면
				f.mkdirs(); // 폴더 생성
				System.out.println("폴더 생성완료");
			}
			
			// 파일 생성
			File file = new File(folder+"/bbb.txt");
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일 생성완료");
			}
			
			// FileOutputStream - 글자를 파일로 저장
			FileOutputStream fos = new FileOutputStream(folder+"/bbb.txt");
			String str = "1,hong홍,100,100,100,300,100.00,0\r\n";
			str += "2,yu유,90,90,90,270,90.00,0\r\n";
			// String을 byte 단위로 분리 
			byte[] bytes = str.getBytes();
			for(byte b:bytes) {
				fos.write(b);
			}
			fos.close();
			
		} catch (Exception e) {e.printStackTrace();}
		
		
//		// FileInputStream 파일 읽기
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/stu.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				System.out.print((char)read);
//			}
//			System.out.println();
//			fis.close();
//		} catch (Exception e) {e.printStackTrace();}
//		
		System.out.println("프로그램 종료!!");
	}
}
