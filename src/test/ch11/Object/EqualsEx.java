package test.ch11.Object;

public class EqualsEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {		// 객체의 equals는 주소값 비교 > 주소값이 다르기 때문에 false
			System.out.println("same");	// Member class에서 오버라이드해서 바꿈
		} else {
			System.out.println("different");
		}
		
		if (obj1.equals(obj3)) {		// 주소값이 다르기 때문에 false
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		
	}

}
