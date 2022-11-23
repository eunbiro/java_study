package test.ch10;

public class ExceptionEX2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");	// 주어진 클래스를 찾는 코드
			System.out.println("Java.lang.String class have");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
