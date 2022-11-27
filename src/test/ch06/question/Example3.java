package test.ch06.question;

public class Example3 {
	
	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		
			// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = ballArr[0];
			ballArr[0] = ballArr[j];
			ballArr[j] = tmp;
			
		}
		
		ball3[0] = ballArr[0];
		ball3[1] = ballArr[1];
		ball3[2] = ballArr[2];
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
			
		}
		System.out.println();
	}
}
