package test.ch07;

public class Child extends Parent {

//	public String name;
//	
//	public Child() {
//		this("홍길동");
//		System.out.println("Child() call");
//	}
//	
//	public Child(String name) {
//		this.name = name;
//		System.out.println("Child(String name) call");
//	}
//	
//	public static void main(String[]args) {
//		Child child = new Child();
//	}
	
	public int studentNo;
	
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public int b;
	
	@Override
	public void method2() {
		super.method2();
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	

	
}
