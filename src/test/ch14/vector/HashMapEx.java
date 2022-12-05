package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

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
		
			// 키로 값 얻기
		String key = "신초아";
		int value = map.get(key);
		System.out.println("점수 : " + value);
		System.out.println();
		
			// 반복해서 키와 값을 얻기 1
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();	// 반복된 키를 얻는다.
		
		while (keyIterator.hasNext()) {		// keyIterator.hasNext() : boolean값
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		
			// 반복해서 키와 값을 얻기 2
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();	// 반복된 키를 얻는다.
		
		while (entryIterator.hasNext()) {	// 다음 키가 있는지 찾는다.
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
			
		}
		
	}
}
