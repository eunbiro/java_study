package test.ch09;

public class AStatic {
	// 사용가능 접근제한자 : public, default, private
	static class B {
		int field1 = 1;
		
		B() {
			System.out.println("b생성자 실행");
		}
		
		void method1() {
			System.out.println("b메소드 실행");
		}
	}
	// 인스턴스 필드
	B field = new B();
	
	// 정적필드 값으로 사용 가능
	static B field2 = new B();
	
	// 생성자
	AStatic() {
		B b = new B();
	}
	
	// 인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	// 정적 메소드로 사용 가능
	static void method2() {
		B b = new B();
	}
}
