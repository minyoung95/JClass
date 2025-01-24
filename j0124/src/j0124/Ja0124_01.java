package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0124_01 {
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,90,90)); // list에 입력
//		list.add(new Stu("유관순",90,80,80));
//		list.add(new Stu("이순신",80,70,70));
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(60);
//		s1.setMath(60);
//		list.add(s1);
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i); // list를 형변환
//			System.out.println(s.getNo()+","+s.getName());
//		}
		
//		// set : 순서X (출력시 for문x >> iterator 사용) , 중복X
//		HashSet set = new HashSet();
//		set.add(1);
//		set.add(4);
//		set.add(2);
//		set.add(3);
//		set.add(2);
//		set.add(5);
//		
//		Iterator i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		// iterator 의 변수를 한번 더 사용하려면 다시 지정 후 사용, 지정 안하면 사용 불가
//		i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		// Map
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "aaa"); // map에 저장 key / value
		map.put("userPw", "1111");
		map.put("userName", "홍길동");
//		map.put("list", list);
		
//		System.out.println("id : "+map.get("userId"));
//		System.out.println("id : "+map.get("userId2"));
//		System.out.println("pw : "+map.get("userPw"));
//		System.out.println("list : "+map.get("list"));
		
//		// map에 들어가있는 list 컬렉션 출력 > Object를 ArrayList로 형 변환
//		ArrayList list2 = (ArrayList)map.get("list");
//		
//		for(int i=0;i<list2.size();i++) {
//			Stu s = (Stu)list2.get(i); // list를 형변환
//			System.out.println(s.getNo()+","+s.getName());
//		}
		
//		Iterator i = map.entrySet().iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		System.out.println(map.containsKey("userId")); // key값 존재유무 확인
		System.out.println(map.containsValue("1111")); // value값 존재유무 확인
		
		if(map.containsKey("userId")==true) {
			System.out.println(map.get("userId")); // key값 출력
		}
	}
}
