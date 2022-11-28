package test.ch11.System;

public class StringBuilderEx {

	public static void main(String[] args) {
		
//		String data = new StringBuilder()
//								.append("DEF")			// 문자열 끝에 추가
//								.insert(1, "abc")		// 문자열을 지정 위치에 넣어줌 (위치, 문자열) 
//								.delete(3,  4)			// 문자열의 지정 위치 일부를 삭제 (시작 위치, 끝 위치) (3에서 4이전까지 자름)
//								.toString();			// 완성된 문자열을 String 타입으로 리턴
//
//		System.out.println(data);
		
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			str.append(i);
		}
		System.out.println(str);
		
	}

}
