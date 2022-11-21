package test.ch07;

public class Parent {
//	public String nation;
//	
//	public Parent() {
//		this("대한민국");
//		System.out.println("Parent() call");
//	}
//	
//	public Parent(String nation) {
//		this.nation = nation;
//		System.out.println("Parent(String nation) call");
//	}
	
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
	
	
	public int a;
	
	// Method
	public void method1() {
		System.out.println("parent-method1()");
	}
	
	public void method2() {
		System.out.println("parent-method2()");
	}
}
