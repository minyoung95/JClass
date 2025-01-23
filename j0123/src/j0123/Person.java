package j0123;

public class Person {
	long id;
	String name;
	
	Person(){}
	
	Person(long id){
		this.id = id;
	}
	
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	// Object클래스 메소드
	@Override
	public String toString() {
		return id+"";
	}
	
	// equals
	@Override
	public boolean equals(Object obj) { // 비교대상 객체
		if(obj != null && obj instanceof Person) {
//			if(id == ((Person)obj).id) {
//				return true;				
//			}else {
//				return false;
//			}
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
}
