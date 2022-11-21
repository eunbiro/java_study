package test.ch06.question;						
						
import java.util.Scanner;						
						
public class BankApplication {						
	private static Scanner scanner = new Scanner(System.in);					
						
	// 계좌객체를 담을 배열					
	private static Account2[] accountArray = new Account2[100];					
						
	// 1. 계좌 생성					
	public static void createAccount() {					
		System.out.println("------");				
		System.out.println("계좌생성");				
		System.out.println("------");				
						
						
		// 계좌생성 메소드 실행				
		System.out.println("계좌번호 : ");				
		String accNum = scanner.next();				
						
		System.out.println("계좌주 : ");				
		String accName = scanner.next();				
						
		System.out.println("초기입금액 : ");				
		int balance = scanner.nextInt();				
						
		Account2 newAccount = new Account2(accNum, accName, balance);				
						
		for (int i = 0; i < accountArray.length; i++) {				
			if (accountArray[i] == null) {			
				accountArray[i] = newAccount;		
				System.out.println("결과 : 계좌가 생성되었습니다.");		
				break;		
			}			
		}				
	}					
						
	// 2. 계좌 목록					
	public static void accountList() {					
		System.out.println("------");				
		System.out.println("계좌목록");				
		System.out.println("------");				
						
		for (int i = 0; i < accountArray.length; i++) {				
			if (accountArray[i] != null) {			
				System.out.println(accountArray[i].getAccNum() + "   " + accountArray[i].getAccName() + "   " +	accountArray[i].getBalance()
				);		
			} else {			
				break;		
			}			
		}				
	}					
						
	// 3. 예금					
	public static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");

		System.out.println("계좌번호 : ");
		
		for (int i = 0; i < 5; i++) {
			String accNum = scanner.next();
			
			Account2 chkNum = findAccount(accNum);
			
			if (chkNum != null) {
				System.out.println("예금액");
				int balance = scanner.nextInt();
				chkNum.setSumBalance(balance);
			} else {
				System.out.println("잘못 입력하셨습니다.");
				
			}
		}
		
		
	}					
						
	// 4. 출금					
	public static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");

		System.out.println("계좌번호 : ");
		

		for (int i = 0; i < 5; i++) {
			String accNum = scanner.next();
			
			Account2 chkNum = findAccount(accNum);
			
			if (chkNum != null) {
				System.out.println("출금액");
				int balance = scanner.nextInt();
				chkNum.setMinusBalance(balance);
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	private static Account2 findAccount(String accNum) {
		Account2 chkNum = null;

		for (int i = 0; i < accountArray.length; i++) {

			if (accountArray[i] != null) {
				if (accountArray[i].getAccNum().equals(accNum)) {
					chkNum = accountArray[i];
				}
			}
		}
		return chkNum;
	}			
						
						
						
	public static void main(String[] args) {					
		boolean run = true;				
						
		while(run) {				
						
			System.out.println("-----------------------------------------");			
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");			
			System.out.println("-----------------------------------------");			
			System.out.println("선택> ");			
						
			int num = scanner.nextInt();			
						
			switch (num) {			
			case 1:			
				// 계좌번호 입력		
				createAccount();		
				break;		
			case 2:			
				// 계좌목록		
				accountList();		
				break;		
			case 3:			
				// 예금		
				deposit();		
				break;		
			case 4:			
				// 출금		
				withdraw();		
				break;		
			case 5:			
				run = false;		
				break;		
			}			
		}				
		System.out.println("프로그램 종료");				
						
	}					
						
}						
						
						
/*						
1. 기본적으로 목록을 선택할 시스템창						
2. 계좌생성						
2-1. 스케너메소드 입력받을때마다 account 객체생성 continue;						
3. 계좌목록	계좌변수 필요					
3-1. getAccount  continue;						
4. 예금						
4-1. for문으로 계좌정보 조회 일치하면 변수에 += 값 continue;						
5. 출금						
5-1. for문으로 계좌정보 조회 일치하면 변수에 += 값 continue;						
6. 종료 break;						
*/						
