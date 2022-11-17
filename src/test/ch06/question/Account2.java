package test.ch06.question;

public class Account2 {

	private String accNum;
	private String accName;
	private int balance;
	
	public Account2(String accNum, String accName, int balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void setAccNum (String accNum) {
		this.accNum = accNum;
	}
	
	public void setAccName (String accName) {
		this.accName = accName;
	}
	
	public void setSumBalance (int accBal) {
		this.balance += accBal;
	}
	
	public void setMinusBalance (int accBal) {
		this.balance -= accBal;
	}

	public String getAccNum() {
		return accNum;
	}

	public String getAccName() {
		return accName;
	}

	public int getBalance() {
		return balance;
	}

}
