package test.ch11.Math;

public class RandomEx {
	public static void main(String[] args) {
		
		System.out.println(Math.random());
		
		int n = 9;			// n개의 정수
		int start = 1;		// 시작하는 숫자
		int num = (int)(Math.random() * n) + start;
		
		System.out.println(num);
	}
}
