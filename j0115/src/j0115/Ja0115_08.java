package j0115;


public class Ja0115_08 {

	public static void main(String[] args) {
		//1~10까지 랜덤숫자 입력받아 동일한 번호가 없게 저장
		//1.
		int[] num = new int[10];
		int i=0;
		a:while(i<10) {
			int ran = (int)(Math.random()*10)+1;
			for(int j=0 ; j<i ; j++) {
				if(num[j]==ran) {
					continue a;
				}
			}
			num[i]=ran;
			i++;
		}
		for(int j=0 ; j<num.length ; j++) {
			System.out.print(num[j]+ " ");
		}
		//2.
		int[] num2 = new int[10];
		for(int j=0 ; j<10 ; j++) {
			num2[j] = j+1;
		}
		
		int temp = 0;
		for(int j=0; j<300 ; i++) {
			int ran = (int)(Math.random()*10);
			temp = num2[0];
			num2[0] = num2[ran];
			num2[ran] = temp;
		}
		for(int j=0 ; j<10 ; j++) {
			System.out.print(num2[j]+ " ");
		}
		System.out.println();
	}
}
