package test.ch06;

public class Calculator {
	// ���� ���� ���� �޼ҵ� ����
	void powerOn() {
		System.out.println("������ �մϴ�.");
//		return;
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// double������ ���ϰ��� �ִ� �޼ҵ�
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
}
