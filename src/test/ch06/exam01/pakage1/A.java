package test.ch06.exam01.pakage1;

// 클래스는 public, default 접근제한자를 가질 수 있다.
public class A {
	A a3 = new A("문자열");		// private 같은 class 안에서만 사용 가능
	
	
	public A(boolean b) {
		
	}
	
	A(int b) {
		
	}
	
	private A(String s) {
		
	}
	
}
