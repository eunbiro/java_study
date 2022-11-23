package test.ch10;

public class ExceptionEX3 {

	public static void main(String[] args) {
		String array[] = { "100", "1oo" };
		
		for (int i = 0; i <= array.length; i++) {
			
			try {
				int value = Integer.parseInt(array[i]);		// int형으로 형변환
				System.out.println("array[" + i + "] : " + value);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				
			} catch (Exception e) {
//			} catch (NumberFormatException e) {
				e.printStackTrace();
				
				
			}
		}
	}

}
