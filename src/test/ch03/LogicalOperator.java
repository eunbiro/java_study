package test.ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) {	// 65~90
			System.out.println("�빮���Դϴ�.");
		}
		
		if ((charCode >= 97) & (charCode <= 122)) {	// 97~122
			System.out.println("�ҹ����Դϴ�");
		}
		
		if ((charCode >= 48) & (charCode <= 57)) {	// 48~57
			System.out.println("0-9 �����Դϴ�.");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2�� 3��");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2�� 3��");
		}
	}
}
