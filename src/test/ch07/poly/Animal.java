package test.ch07.poly;

public abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상메소드 선언
	// 추상메소드는 자식클래스에서 반드시 오버라이딩이 되어야 한다.
	public abstract void sound();
		
	
}
