package j0131;

public class Buyer {

	private String id;
	private String pw;
	private String uName;
	private String address;
	private int money;
	private int myPoint;
	
	public Buyer() {}
	public Buyer(String id, String pw, String uName, String address, int money, int myPoint) {
		super();
		this.id = id;
		this.pw = pw;
		this.uName = uName;
		this.address = address;
		this.money = money;
		this.myPoint = myPoint;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMyPoint() {
		return myPoint;
	}
	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	
}
