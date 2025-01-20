package j0117;

public class Tv {

	String color;
	boolean power;
	int channel;
	
	// void (메소드, 함수)
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
