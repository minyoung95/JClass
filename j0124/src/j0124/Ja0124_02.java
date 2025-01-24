package j0124;

import java.util.ArrayList;
import java.util.Comparator;

public class Ja0124_02 {
	public static void main(String[] args) {
		
		ArrayList<Stu> list = new ArrayList<Stu>(); // Generics : <Stu>만 담을 수 있게 함
		list.add(new Stu("홍길동",100,90,90)); // 컬렉션엔 Object만 담을 수 있음
//		list.add(1);
//		list.add(new Card());
		
		for(int i=0;i<list.size();i++) {
//		Stu s = (Stu)list.get(i); 형 변환 생략가능
//		System.out.printf("[%d,%s,%d,%d,%d,%d,%.2f,%d]\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		System.out.printf("[%d,%s,%d,%d,%d,%d,%.2f,%d]\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
	}
		
		
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,90,90));
//		list.add(new Stu("유관순",90,80,80));
//		list.add(new Stu("이순신",80,90,90));
//		list.add(new Stu("강감찬",70,60,60));
//		list.add(new Stu("김구",60,50,70));
//		list.add(new Stu("홍길순",100,100,100));
//		list.add(new Stu("홍길자",90,90,70));
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d,%d,%d,%d,%.2f,%d]\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//		}
		
		//정렬
//		list.sort(new Comparator<Stu>() {
//			@Override // 숫자비교
//			public int compare(Stu s1, Stu s2) { // list를 두개씩 가져옴
//				return s1.getTotal()-s2.getTotal(); // +값이 나오면 둘의 위치를 바꿈 (순차정렬)
////			return s2.getTotal()-s1.getTotal(); // +값이 나오면 둘의 위치를 바꿈 (역순정렬)
//			}
//		});
		
//		list.sort(new Comparator<Stu>() {
//			
//			@Override // @ : 애너테이션 - 주석, 스프링 : 명령어
//			@Override // 문자열비교
//			public int compare(Stu s1, Stu s2) {
//				return s1.getName().compareTo(s2.getName()); // 순차정렬 ㄱㄴㄷ
////			return s2.getName().compareTo(s1.getName()); // 역순정렬 ㅎㅍㅌ
//			}
//			
//		});
//		
//		System.out.println("------------------------순차 정렬---------------------------");
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d,%d,%d,%d,%.2f,%d]\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//		}
		
	}
}
