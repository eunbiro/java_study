package test.ch06;

public class Korea {
	// 상수는 불변의 값(final), 공유해서 사용 가능(static)
	// ex) 원주율 : 3.14... 지구의 무게
	
	// final 필드(저장 된 값들을 변경할 수 없다. 최종값)
	// final 필드는 초기값을 무조건 줘야한다.(필드 선언시 주거나 혹은 생성자에서 줘야 한다.)
	final String nation = "대한민국";
	final String ssn;	// 주민번호
	
	// 인스턴스 필드
	String name;
	
	// 생성자
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
