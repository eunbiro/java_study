package test.ch06;

public class Calculator2 {
	
	// 1. �ʵ�
	static double pi = 3.14159;
	static String model = "calc1";
	static String number = "1";
	static String info;
	
	// static ��� : static �ʵ忡 ���� �ʱ�ȭ �۾��� �ʿ��� �� ���
	static {
		info = model + "_" + number;	// calc1_1
	}
	
	// 2. �޼ҵ�
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
}
