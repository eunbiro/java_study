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
		 
		 String default : null(Ŭ������ �ʱⰪ�� null)
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
//		String season[]; ���� �� ����
		String season[] = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "����";
		System.out.println(season[1]);
		System.out.println();
		
		int scores[] = {83, 90, 87};
		
		// ����, ���
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = (double) sum/scores.length;
		System.out.println("������ ������ " + sum + "���̰� ����� " + avg + "�Դϴ�.");
		*/
	}

}
