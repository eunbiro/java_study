package test.ch06.question;

public class Example {

	static int max(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			if (tmp < arr[i])
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));	// 크기가 0인 배열
	}

}
