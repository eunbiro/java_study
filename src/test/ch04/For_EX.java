package test.ch04;

public class For_EX {

	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		int j = 0;
//		for (int i = 1; i <= 10 && j <= 10; i++, j++) {
//			System.out.println(i);
//			System.out.println(j);
//		}
		
//		int sum = 0;
//		
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("sun = " + sum);
		
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "´Ü ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
				
			}
		}
		
	}

}
