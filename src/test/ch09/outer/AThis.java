package test.ch09.outer;

public class AThis {
		/* AThis 클래스의 인스턴스 필드 */
	String field = "A-field";
	
		/* AThis 클래스의 인스턴스 메소드 */
	void method() {
		System.out.println("A-method");
	}
	
		/* 인스턴스 멤버 클래스 */
	class B {
			/* B 클래스의 인스턴스 필드 */
		String field = "B-field";
		
			/* B 클래스의 인스턴스 메소드 */
		void method() {
			System.out.println("B-method");
		}
		
			/* B 클래스의 인스턴스 메소드 */
		void print() {
				/* B객체의 필드와 메소드 */
			System.out.println(this.field);
			this.method();
			
				// AThis객체의 필드와 메소드 사용 > 바깥클래스이름.this.바깥객체(필드 || 메소드)
			System.out.println(AThis.this.field);
			AThis.this.method();
		}
	}
	
		/* AThis클래스 인스턴스 메소드 */
	void useB() {
		B b = new B();
		b.print();
	}
}
