package test.ch06.question;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in);
	
	// ���°�ü�� ���� �迭
	private static Account2[] accountArray = new Account2[100];
		
	// 1. ���� ����
	public static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");


		// ���»��� �޼ҵ� ����
		System.out.println("���¹�ȣ : ");
		String accNum = scanner.next();
		
		System.out.println("������ : ");
		String accName = scanner.next();

		System.out.println("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		Account2 newAccount = new Account2(accNum, accName, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	// 2. ���� ���
	public static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(
						accountArray[i].getAccNum() + "   " +
						accountArray[i].getAccName() + "   " +
						accountArray[i].getBalance()
				);
			} else {
				break;
			}
		}
	}
	
	// 3. ����
	public static void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");

		System.out.println("���¹�ȣ : ");
		String accNum = scanner.next();
		System.out.println("���ݾ�");
		int balance = scanner.nextInt();
		findAccount(accNum).setSumBalance(balance);
		
	}
	
	// 4. ���
	public static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");

		System.out.println("���¹�ȣ : ");
		String accNum = scanner.next();
		System.out.println("��ݾ�");
		int balance = scanner.nextInt();
		findAccount(accNum).setMinusBalance(balance);
		
	}
	
	private static Account2 findAccount(String accNum) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAccNum().equals(accNum)) {
				return accountArray[i];
			}
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.println("����> ");
			
			int num = scanner.nextInt();
			
			switch (num) {
			case 1:
				// ���¹�ȣ �Է�
				createAccount();
				break;
			case 2:
				// ���¸��
				accountList();
				break;
			case 3:
				// ����
				deposit();
				break;
			case 4:
				// ���
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");

	}

}


/*
1. �⺻������ ����� ������ �ý���â
2. ���»���
2-1. ���ɳʸ޼ҵ� �Է¹��������� account ��ü���� continue;
3. ���¸��	���º��� �ʿ�
3-1. getAccount  continue;
4. ����
4-1. for������ �������� ��ȸ ��ġ�ϸ� ������ += �� continue;
5. ���
5-1. for������ �������� ��ȸ ��ġ�ϸ� ������ += �� continue;
6. ���� break;
*/
