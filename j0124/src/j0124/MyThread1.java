package j0124;
// 멀티쓰레드 : extends Thread
public class MyThread1 extends Thread{ 

		public void run() {
			for(int i=0;i<300;i++) {
				System.out.println("i : "+i);
			}
		}
}
