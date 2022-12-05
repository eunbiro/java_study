package test.ch14.vector;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
			// 오름차순
		for (Integer s : scores) {
			System.out.print(s + " ");	// 자동으로 정렬이 된다.(오름차순)
		}
		
		System.out.println();
		
		System.out.println("가장 낮은 값 : " + scores.first());
		System.out.println("가장 높은 값 : " + scores.last());
		System.out.println("5보다 낮은 값 : " + scores.lower(5));
		System.out.println("5보다 높은 값 : " + scores.higher(5));
		
		System.out.println();
		
			// 내림차순
		NavigableSet<Integer> descend = scores.descendingSet();
		for (Integer s : descend) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
			// 범위 검색(5 <= )
			// tailSet(주어진 값, 주어진 값을 포함 하는지 안하는지(boolean)) : 주어진 값보다 높은 값을 가져온다.
		NavigableSet<Integer> rangeSet = scores.tailSet(5, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
			// 범위 검색(4 <= scores < 9)
		rangeSet = scores.subSet(4, true, 9, false);		// 4는 트루하는데 9는 펄스한다. == (4 <= scores < 9)
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		
		
	}
}
