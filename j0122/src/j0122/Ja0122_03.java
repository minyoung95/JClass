package j0122;

public class Ja0122_03 {
	public static void main(String[] args) {
		
		// Tv - power,channel,power(),channelUp(),channelDown()
		// CaptionTv - text,caption()
		CaptionTv c = new CaptionTv();
		c.text = "[뮤직비디오] 로제-APT";
		System.out.println("자막 : "+c.text);
		c.caption();
		
		Tv t2 = new Tv();
//		t2.text = "자막기능 X"
		Tv t = new CaptionTv(); // 다형성 : 부모의 참조변수로 자식의 객체를 다룬다.
		CaptionTv c3;
		c3 = (CaptionTv)t; // 형변환
		c3.text = "aaa";
		t = c3; // 자식 > 부모 : 형변환 생략가능
//		t.text = "" // 공간은 있지만 자손만 가지고있는 변수사용은 X
//		CaptionTv c2 = new Tv(); 자손의 참조변수 = 부모객체 (X)
	}
}
