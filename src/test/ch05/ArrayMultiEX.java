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
				System.out.println("�������� : " + mathScores[i][j]);
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
		
		System.out.println("1���� �迭 ����(���� ��) : " + scores.length);
		System.out.println("2���� �迭 ����(ù ��° ���� ��) : " + scores[0].length);
		System.out.println("2���� �迭 ����(�� ��° ���� ��) : " + scores[1].length);
		
		System.out.println("ù ��° ���� �� ��° �л� : " + scores[0][2]);
		System.out.println("�� ��° ���� �� ��° �л� : " + scores[1][1]);
		
		// ù ��° ���� ��� ����
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double)class1Sum / scores[0].length;
		System.out.println("1���� �� ���� " + class1Sum + "���̰� ����� " + class1Avg);
		
		// �� ��° ���� ��� ����
		int class2Sum = 0;
		for (int j = 0; j < scores[1].length; j++) {
			class2Sum += scores[1][j];
		}
		double class2Avg = (double)class2Sum / scores[1].length;
		System.out.println("2���� �� ���� " + class2Sum + "���̰� ����� " + class2Avg);
		
		// ��ü �л��� �������
		int totalStudent = 0;
		int totalSum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;	// �л� ��
			for (int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		
		System.out.println("�� �л� ���� " + totalStudent + "��");
		System.out.println("�� ���� " + totalSum + "��");
		System.out.println("�� ����� " + totalAvg + "��");
		
	}

}
