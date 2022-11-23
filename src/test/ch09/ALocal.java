package test.ch09;

public class ALocal {
	void useB(int arg) {	// == final int age (자동으로 final이 붙는다)
		
		// 로컬변수
		int var = 1;		// == final int var (자동으로 final이 붙는다)
		
		class B {
			// 인스턴스 필드
			int field1 = 1;
			
			B () {
				System.out.println("B todtjdwk");
			}
			
			void method1 () {
				System.out.println("B method1");
			}
			
			void method2() {
				arg = 2;			// 중첩된 클래스 내에서는 로컬변수, 로컬매개변수를 변경할 수 없다.
				var = 2;
			}
		}
		// 메소드 안에서 객체 생성
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
}
