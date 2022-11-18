package test.ch07.poly;

public class Student extends Person {
	
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);		// = Person(String name)
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("Studing");
	}
}
