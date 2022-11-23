package test.ch10.makeException;

// 사용자 정의 예외 클래스
public class InsuffException extends Exception {
	
	public InsuffException() {
		
	}
	
	public InsuffException(String message) {
		super(message);		// Exception의 생성자에 message를 넣는다.
	}
}
