package test.ch06.exam01.pakage1;

public class B {
	public void method() {
		A a = new A();
				
		a.field1 = 1;		// 실행 가능
		a.field2 = 1;		// 실행 가능
		a.field3 = 1;		// private로 선언한 변수라 실행 불가
		a.method1();		// 실행 가능
		a.method2();		// 실행 가능
		a.method3();		// private로 선언한 메서드라 실행 불가
	}
	
}
