package test.ch11.System;

public class ExitEx {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			if (i == 5) {
				System.out.println("프로그램 강제 종료");
				System.exit(0);
					// 0 : 정상 종료
					// 1 || -1 : 비정상 종료
			}
		}
	}
}
