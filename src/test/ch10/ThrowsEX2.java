package test.ch10;

public class ThrowsEX2 {

		// main 메소드는 JVM에서 실행한다.
		// main 메소드에 throws를 사용해서 예외를 떠넘기면 JVM이 예외 내용을 콘솔에 출력한다.
	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
