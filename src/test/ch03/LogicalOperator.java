package test.ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) {	// 65~90
			System.out.println("대문자입니다.");
		}
		
		if ((charCode >= 97) & (charCode <= 122)) {	// 97~122
			System.out.println("소문자입니다");
		}
		
		if ((charCode >= 48) & (charCode <= 57)) {	// 48~57
			System.out.println("0-9 숫자입니다.");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2의 3의");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2의 3의");
		}
	}
}
