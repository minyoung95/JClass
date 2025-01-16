package j0115;

public class Ja0115_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		//번호 저장
		for (int i=0 ; i<ball.length ; i++) {
			ball[i]=i+1;
		}
//		//번호 출력
//		for (int i=0 ; i<ball.length ; i++) {
//			System.out.print(ball[i]+ " ");
//		}
		//배열 섞기
		int temp=0;
		for(int i=0 ; i<300 ; i++) {
			int ran=(int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}
		System.out.println();
		//번호 출력
		for (int i=0 ; i<ball.length ; i++) {
			System.out.print(ball[i]+ " ");
		}
	}

}
