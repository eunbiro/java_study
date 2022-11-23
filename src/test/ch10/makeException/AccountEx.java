package test.ch10.makeException;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("deposit : " + account.getBalance() + "won");
		
		try {
			account.withdraw(30000);
			
		} catch (InsuffException e) {
			String message = e.getMessage();
			System.out.println(message);
			
		}
		
	}

}
