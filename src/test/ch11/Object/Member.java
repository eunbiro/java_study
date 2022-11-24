package test.ch11.Object;

public class Member { // extends Object {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
		
	}

		// 논리적 동등 만들기 : 객체의 주소와 상관없이 필드의 값으로 비교
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {		// obj가 Member를 가지고 있는가
			Member target = (Member)obj;	// 강제 형변환 : 자식 객체에 있는 필드를 가져오기 위해
			
			if (id.equals(target.id)) {		// 여기서의 equals는 String의 equals(순수하게 문자값 비교)
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = obj1;
		
		System.out.println(obj1.equals(obj2));	// 번지수 비교 : 결과 true
		System.out.println(obj1 == obj2);		// 번지수 비교 : 결과 true
		
		
		String a = "1";
		String b = "1";
		
		if (a == b) {}			// X -> 주소를 비교
		if (a.equals(b)) {}		// O -> 값을 비교
		
		// 논리적 동등 : 같은 객체든 다른 객체든 객체의 저장데이터가 동일하다.
	}
	*/
}
