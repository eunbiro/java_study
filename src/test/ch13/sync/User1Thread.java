package test.ch13.sync;

public class User1Thread extends Thread {
	private Calculator calculator = new Calculator();
	
	public User1Thread() {
		setName("user1Thread");		// 스레드의 이름 변경
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
		// 스레드가 실행되 때 실제로 실행되는 코드
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
}
