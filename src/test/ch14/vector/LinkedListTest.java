package test.ch14.vector;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));	// 0번 인덱스 값이 계속 수정됨
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );
		
		
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime) );
	}

}
