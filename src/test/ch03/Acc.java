package test.ch03;

public class Acc {

	public static void main(String[] args) {
		/*
		int apple =1 ;
		double pieceUnit = 0.1;
		int number = 7;
		
		// ��Ȯ�� ����� �׻� ������ �ؾ� �Ѵ�! double�̶� �Ʒ��� ���� ����� ����.
		double result = apple - number * pieceUnit; // apple(1) - 0.7(* ������ �켱 ���)
		System.out.println("��� 1������ ���� ��: " + result); // ���: 0.29999999999999993
		*/
		
		/*
		int apple =1 ;
		int totalPiece = apple * 10;
		int number = 7;
		
		// ��Ȯ�� ����� �׻� ������ �ؾ� �Ѵ�!
		int result = totalPiece - number;
		System.out.println("��� 1������ ���� ��: " + result/10.0); // �Ҽ��� ǥ���ϰ� �ʹٸ� ������ ��� �Ŀ� ��ó���� ���ֱ�. (��������ȯ�̳� �Ҽ�ó�� ����)
		*/
		
//		int x = 5;
//		int y = 0;
//		int result = 5 / 0; // 0���� ������ 'by zero'��� exception ����
//		System.out.println(result);
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		System.out.println(z + 2); // /���꿡���� Infinity��� ���! ���� �� ��. %���꿡���� NaN�̶�� ���! (���� �ƴ�)
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z);
		}
//		
	}

}
