package test.ch06.question;

public class Example2 {

	static boolean isNumber(String str) {
		boolean result = false;
		
		if (str == null || str == " ") {
			result = false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			
			if (tmp >= '0' && tmp <= '9') {
				result = true;
			} else {
				result = false;
			}
		}
		
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}

}
