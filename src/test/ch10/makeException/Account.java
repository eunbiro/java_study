package test.ch10.makeException;

public class Account {
	
	private long balance;
	
	
	public Account() {}
	
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsuffException {
			// 잔고보다 내가 출금하려는 돈이 더 크면 예외를 발생시킴.
		if (balance < money) {
			throw new InsuffException("balance : -" + (money - balance) + "won");
		}
			// 위에서 예외가 발생하면 그 아래는 실행시키지 않음
		balance -= money;		// 잔고에서 출금금액 빼줌
	}
}
