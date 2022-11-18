package test.ch07.package2;

import test.ch07.package1.A;

public class C {
	public void method() {
		A a = new A();	// X
		a.field = "1";	// X
		a.method();		// X
	}
}
