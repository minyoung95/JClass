package j0123;

import java.util.ArrayList;
import java.util.List;

public class Ja0123_07 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
//		List list2 = new ArrayList();
		
		for(int i=0;i<10;i++) {
			list.add(i+1);
		}
		
		list.add(4,100); // 4번 위치값에 100을 입력
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		System.out.println("-----------------------");

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(int i=0;i<list.size();i++) {
			list.remove(i);
		} // 0번을 삭제하면 나머지가 앞으로 한칸씩 땡겨짐 >> 후에 1번을 삭제하면 2번에서 땡겨진게 삭제됨
		
//		for(int i=list.size()-1;i>=0;i--) {
//			list.remove(i);
//		} // 뒤에서부터 삭제하면 한칸씩 땡겨져도 의미 X >> 전체삭제 (but!! list.clear()하면 전체삭제..)
		
		System.out.println("----------전체삭제 후 출력-------------");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		Integer i3 = new Integer(3);
//		Integer i4 = new Integer(4);
//		
//		list.add(i1); // 1:기본타입, list:객체타입
//		list.add(i2); // 1:기본타입, list:객체타입
//		list.add(i3); // 1:기본타입, list:객체타입
//		list.add(i4); // 1:기본타입, list:객체타입
		
//		list.add(1); // 원래 1자리에 객체만 가능하지만 
//		list.add(2); // 순서가 있고 중복가능
//		list.add(1); 
//		list.add(4);
//		list.add(3);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.remove(4); // index 번호삭제
//		System.out.println("-------------------------");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.clear(); // 전체삭제
//		System.out.println("-------------------------");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		if(list.isEmpty())
		
	}
}
