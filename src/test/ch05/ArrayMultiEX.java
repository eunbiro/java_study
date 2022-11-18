package test.ch05;				
				
public class ArrayMultiEX {				
				
	public static void main(String[] args) {			
//		int[] scores = { 10, 90, 10 };		
				
		int[][] scores 		= {
				{ 80, 90, 96 },
				{ 76, 88 }
		};		
		int[][] mathScores 	= new int[2][3];	
				
		for (int i = 0; i < mathScores.length; i++) {		
			for (int j = 0; j < mathScores[i].length; j++) {	
				System.out.println("수학점수 : " + mathScores[i][j]);
//				mathScores[i][j] = 80;
			}	
		}		
		/*		
		int[][] mathScores = {		
				{ 80, 90, 96 },
				{ 76, 88 }
		};		
		*/		
		mathScores[0][0] = 80;		
		mathScores[0][1] = 81;		
		mathScores[0][2] = 82;		
		mathScores[1][0] = 83;		
		mathScores[1][1] = 84;		
		mathScores[1][2] = 85;		
				
		System.out.println("1차원 배열 길이(반의 수) : " + scores.length);		
		System.out.println("2차원 배열 길이(첫 번째 반의 수) : " + scores[0].length);		
		System.out.println("2차원 배열 길이(두 번째 반의 수) : " + scores[1].length);		
				
		System.out.println("첫 번째 반의 세 번째 학생 : " + scores[0][2]);		
		System.out.println("두 번째 반의 두 번째 학생 : " + scores[1][1]);		
				
		// 첫 번째 반의 평균 점수		
		int class1Sum = 0;		
		for (int i = 0; i < scores[0].length; i++) {		
			class1Sum += scores[0][i];	
		}		
		double class1Avg = (double)class1Sum / scores[0].length;		
		System.out.println("1반의 총 합은 " + class1Sum + "점이고 평균은 " + class1Avg);		
				
		// 두 번째 반의 평균 점수		
		int class2Sum = 0;		
		for (int j = 0; j < scores[1].length; j++) {		
			class2Sum += scores[1][j];	
		}		
		double class2Avg = (double)class2Sum / scores[1].length;		
		System.out.println("2반의 총 합은 " + class2Sum + "점이고 평균은 " + class2Avg);		
				
		// 전체 학생의 평균점수		
		int totalStudent = 0;		
		int totalSum = 0;		
				
		for (int i = 0; i < scores.length; i++) {		
			totalStudent += scores[i].length;	// 학생 수
			for (int j = 0; j < scores[i].length; j++) {	
				totalSum += scores[i][j];
			}	
		}		
		double totalAvg = (double) totalSum / totalStudent;		
				
		System.out.println("총 학생 수는 " + totalStudent + "명");		
		System.out.println("총 합은 " + totalSum + "점");		
		System.out.println("총 평균은 " + totalAvg + "점");		
				
	}			
				
}				
