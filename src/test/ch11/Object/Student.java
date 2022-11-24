package test.ch11.Object;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	
	@Override
	public int hashCode() {
		System.out.println("no : " + no + ", name : " + name.hashCode());
		int hashCode = no + name.hashCode();	// 번호와 이름이 같으면 동일한 해쉬코드가 생성된다.
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student target = (Student)obj;
			
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		
		return false;
	}
}
