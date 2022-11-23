package test.ch10;

public class ExceptionEX4 {

	public static void main(String[] args) {
		String array[] = { "100", "1oo", null, "200" };
		
		for (int i = 0; i <= array.length; i++) {
			
			try {
				int value = Integer.parseInt(array[i]);						// int형으로 형변환
				System.out.println("array[" + i + "] : " + value);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				
			} catch (NullPointerException | NumberFormatException e) {		// 2가지 이상의 예외를 동일하게 처리
				System.out.println("Data have problem : " + e.getMessage());
				
			}
		}
	}

}
