package test.ch05;

public class ArrayEX {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		/*
		 int, short, byte default : 0
		 long default : 0L
		 char default : '\u0000'
		 float default : 0.0f
		 double default : 0.0
		 boolean default : false
		 
		 String default : null(클래스는 초기값이 null)
		 */
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			arr1[i] = 10;
			System.out.println(arr1[i]);
		}
		
		
		double[] arr2 = new double[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		String[] arr3 = new String[3];		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		
		
		/*
//		String[] season = {"Spring", "Summer", "Fall", "Winter"};
//		String season[]; 선언만 한 상태
		String season[] = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();
		
		int scores[] = {83, 90, 87};
		
		// 총합, 평균
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = (double) sum/scores.length;
		System.out.println("점수의 총합은 " + sum + "점이고 평균은 " + avg + "입니다.");
		*/
	}

}
