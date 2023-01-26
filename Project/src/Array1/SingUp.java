package Array1;

public class SingUp {
	private String SingID;
	private String SingPW;
	private String Name;
	private String LoginID;
	private String LoginPW;
	int Money;
	public String getSingID() {
		return SingID;
	}
	public String getSingPW() {
		return SingPW;
	}
	public String getName() {
		return Name;
	}
	public void setSingID(String singID) {
		this.SingID = singID;
	}
	public void setSingPW(String singPW) {
		this.SingPW = singPW;
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getLoginID() {
		return LoginID;
	}
	public String getLoginPW() {
		return LoginPW;
	}
	public void setLoginID(String loginID) {
		this.LoginID = loginID;
	}
	public void setLoginPW(String loginPW) {
		this.LoginPW = loginPW;
	}
	
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		this.Money = money;
	}
	@Override
	public String toString() {
		return "SingUp [SingID=" + SingID + ", SingPW=" + SingPW + ", Name=" + Name + ", LoginID=" + LoginID
				+ ", LoginPW=" + LoginPW + ", Money=" + Money + "]";
	}

	

}
