package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		
//		for(int i=0;i<10;i++) {
//			list.add(i+1); // 값 입력
//		}
//		
//		// 출력(데이터 읽어오기) 기본형태 Iterator
//		Iterator i1 = list.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); // 값 출력
//		}
		
		HashSet set = new HashSet();
		set.add(1); // set : 순서X, 중복X
		set.add(3);
		set.add(2);
		set.add(1); // 중복X
		set.add(4);
		
		System.out.println(set.size());
		
		// 순서상관없기 때문에 for문 X >> Iterator 사용
//		for(int i=0;i<set.size();i++) {
//			System.out.println(set.get(i)); // 값 출력
//		}
		
		Iterator i = set.iterator(); // Iterator는 1회성
		while(i.hasNext()) {
			System.out.println(i.next());
		} // 1,3,2,1,4 순서로 나열했지만 1,2,3,4로 출력(1은 중복제거, 순서X)
		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		} // i를 또 사용할 수 없음
	}
}
