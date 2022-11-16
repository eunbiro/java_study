package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;		// 실행 가능
		a.field2 = 1;		// 다른 패키지에서 default로 선언한 변수라 실행 불가
		a.field3 = 1;		// private로 선언한 변수라 실행 불가
		a.method1();		// 실행 가능
		a.method2();		// 다른 패키지에서 default로 선언한 메서드라 실행 불가
		a.method3();		// private로 선언한 메서드라 실행 불가
	}
}
