package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A {
	public D() {
		super();	// A class constructor call
	}
	
	public void method1() {
		super.field = "1";
		super.method();
		
		this.field = "1";
		this.method();
	}
	
	public void method2() {
		// protected : if you use protected, you can't create directly instance
		A a = new A();	// O
		a.field = "1";	// O
		a.method();		// O
	}
}
