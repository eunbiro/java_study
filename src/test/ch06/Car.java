package test.ch06;

public class Car {
	// 1. �ʵ� : ��ü�� �����͸� ����!!!
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
//	boolean start;	// �õ�����
	
	// �ڹٿ����� �����ڸ� ������� ������ ������ �������� �����ڸ� �������ش�.
	
	Car() {}
	
	Car(String model) {
//		this.model = model;
		this(model, "����", 250);
	}
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	


 
}
