package test.ch05;

public class test {

	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			
			if (tmp != j ) {
				tmp = j;
				ballArr[i] = j;
				System.out.println(j);
			}
		}
	}

}
