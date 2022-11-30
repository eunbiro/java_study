package question;

public class ContainerEx {

	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("gildong", "chif");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + " " + job);
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("gildong", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + " " + age);
		
	}

}
