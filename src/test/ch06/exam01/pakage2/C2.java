package test.ch06.exam01.pakage2;			
			
import test.ch06.exam01.pakage1.A;			
import test.ch06.exam01.pakage1.B;			
			
public class C2 {			
//	A a = new A();	// A클래스(default) 접근 불가	
	B b = new B();		
			
	A a1 = new A(true);		// public 실행 가능
//	A a2 = new A(1);		// default 실행 불가
//	A a3 = new A("문자열");	// private 실행 불가	
}			
