package j0121;

public class Ja0121_02 {
	public static void main(String[] args) {
		
		Card[] c = new Card[52];
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] shape = {"Spade","Diamond","Clover","Heart"}; 
		// A,2,3,4,5,6,7,8,9,10,J,Q,K
		// Spade,Diamond,Clover,Heart
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(shape[i],j+1);
			}
		}
		
		System.out.println(c[0]);
		System.out.printf("[ %s,%d ]\n",c[0].shape,c[0].number);
		System.out.println(c[0].number);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.printf("[ %s, %s ] \n",c[i*13+j].shape,n[c[i*13+j].number]);
			}
		}
		
	}
}
