package test.ch07.poly;

public class InstanceofEX {

	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if (person instanceof Student) {	// person have Student instance? Check
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNo);
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("umbizzing");
		personInfo(p1);
		
		Person p2 = new Student("umbi", 201594030);
		personInfo(p2);
		
		
		
	}

}
