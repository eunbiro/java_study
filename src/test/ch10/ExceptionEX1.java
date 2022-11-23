package test.ch10;

public class ExceptionEX1 {

	public static void printLength(String data) {
		
		try {
			int result = data.length();
			System.out.println("answktn : " + result);
			
		} catch (NullPointerException e) {				// 에러 발생시 실행시킬 코드
//			System.out.println(e.getMessage());			// 예외가 발생한 이유만 리턴
//			System.out.println(e.toString());			// 예외가 발생한 이유 + 예외의 종류 리턴
			e.printStackTrace();						// 예외가 발생한 이유 + 예외의 종류 리턴 + 예외가 발생한 곳
			
		} finally {				// 사용유무는 선택	,	마지막에 무조건 실행
			System.out.println("last run\n");
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("program start\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("program end");
	}

}
