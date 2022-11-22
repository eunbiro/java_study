package test.ch08;

public interface Service {
	// default 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 중복 코드");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 중복 코드");
	}
	
	/* 버전때문에 작동안됨
	
	// private 메소드
	private void defaultCommon() {
		System.out.println("defaultCommon 중복 코드");
	}
	
	 */
	
	// static 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 중복 코드");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 중복 코드");
	}
	
	
}
