package test.ch06.question;

public class Account {

	private int balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	
	
	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}


	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance()); // ÇöÀç ÀÜ°í: 10000

		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance()); // ÇöÀç ÀÜ°í: 10000

		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance()); // ÇöÀç ÀÜ°í: 10000

		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance()); // ÇöÀç ÀÜ°í: 300000

	}

}
