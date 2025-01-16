package j0115;


public class Ja0115_01 {

	public static void main(String[] args) {
		//1~10까지의 랜덤숫자
		int sum=0;
		int[] score = new int[100];
		for(int i=0 ; i<10 ; i++) {
			score[i]=(int)(Math.random()*10)+1;
			sum+=score[i];
			System.out.println(score[i]);
		}
		System.out.println(sum);
		
		
		
		//score 배열 100개 생성 후 1~100까지 숫자 출력
//		int[] score = new int[100];
//		int sum=0;
//		for(int i=0 ; i<100 ; i++) {
//			score[i]=i+1;
//			//System.out.println(score[i]);
//			sum+=score[i];
//		}
//		System.out.println(sum);

//		int[] score = new int[10];
//		score[0]=1; // ....
//		
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(score2.length);
//		
//		int[] score3 = new int[10];
//		for(int i=0 ; i<score3.length ; i++) {
//			score3[i]=i;
//			System.out.println(score3[i]);
//		}
//		
//		int[] score4 = new int[] {1,2,3,4,5};
//		System.out.println(score4.length);
//		int[] score = new int[5];
//		score[0]=-0;
//		score[1]=-1;
//		score[2]=-2;
//		score[3]=-3;
//		score[4]= 4;
//		
//		int[] num = new int[10];
//		for(int i=0 ; i<10 ; i++) {
//			num[i]=i;
//			System.out.println(num[i]);
//		}
////		String str  = new String("abc");
//		String str2 = "abc";
//		
	}

}
