package test.ch07;

/*
 클래스 앞에 final을 붙이면 그 클래스는 부모클래스로 사용할 수 없다.
 If you put final in front of a class, that class cannot be used as a parent class.
 */

// public final class Airplane
public class Airplane {
	// 메소드
	public void land() {
		System.out.println("landing");
	};
	
	/*
	 메소드에 final을 붙이면 그 메소드는 오버라이드 할 수 없다.
	 a method is declared final, the method cannot be overridde.
	 */
	// public final void fly()
	public void fly() {
		System.out.println("general flight");
	};
	public void takeOff() {
		System.out.println("take-off");
	};
}
