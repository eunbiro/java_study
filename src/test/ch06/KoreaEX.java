package test.ch06;

public class KoreaEX {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567", "감자바");
		k1.name = "노은비";
//		k1.nation = "미국";		// final은 변경불가
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		
	}

}
