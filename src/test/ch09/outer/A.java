package test.ch09.outer;

public class A {
		// A클래스의 인스턴스 필드, 메소드
	int field1;
	void method1() {}
	
		// A클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
		// 인스턴스 멤버 클래스 : 바깥 클래스의 모든 필드와 메소드에 접근 가능
	class B {
		void method() {
			field1 = 10;	// 인스턴스 필드 사용 가능
			method1();		// 인스턴스 메소드 사용 가능
			
			field2 = 10;	// 정적 필드 사용 가능
			method2();		// 정적 메소드 사용 가능
		}
	}
	
		// 정적 멤버 클래스 : 바깥 클래스의 정적 필드와 정적 메소드에만 접근 가능
	static class C {
		void method() {
			field1 = 10;	// 인스턴스 필드 사용 불가
			method1();		// 인스턴스 메소드 사용 불가
			
			field2 = 10;	// 정적 필드 사용 가능
			method2();		// 정적 메소드 사용 가능
		}
	}
}
