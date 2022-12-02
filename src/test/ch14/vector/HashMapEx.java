package test.ch14.vector;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
			// HashMap<Key, 객체(저장할 값)>
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("조욱진", 100);
		map.put("권수경", 100);
		map.put("김정환", 100);
		map.put("신초아", 100);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		String key = "신초아";
		int value = map.get(key);
		System.out.println("점수 : " + value);
	}
}
