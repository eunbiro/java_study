package test.ch06;

public class Car2 {

	// �ν��Ͻ� �ʵ�
	int speed;
//	static int test;
	
	// �ν��Ͻ� �޼ҵ�
	void run() {
		System.out.println(this.speed + "���� �޸��ϴ�.");
	}
	
	void run2() {
		this.run();
		System.out.println(this.speed + "���� �޸��ϴ�.");
	}
	
	// ���� ���
	static {
//		this.speed = 200;	// static �������� �ν��Ͻ� ������ �������� �Ұ�
//		this.run();			// static �������� �ν��Ͻ� �޼ҵ忡 �������� �Ұ�
	}
	
	// ����(static) �޼ҵ�
	static void simulate() {
//		this.speed = 200;	// static �޼ҵ忡���� �ν��Ͻ� ������ �������� �Ұ�
//		this.run();			// static �޼ҵ忡���� �ν��Ͻ� �޼ҵ忡 �������� �Ұ�
		
		Car2 myCar = new Car2();
		
		myCar.speed = 200;	// ��ü�� ���� �� ���������� ���ٰ���
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();
	}

}
