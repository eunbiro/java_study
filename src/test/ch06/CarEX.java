package test.ch06;

public class CarEX {

	public static void main(String[] args) {
		// 1. ��ü ����
		Car myCar = new Car("k6", "����", 250);
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println("=================");
		
		Car car2 = new Car("�ڰ���");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println("=================");
		
		Car car3 = new Car("�ڰ���", "����");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println("=================");
		
		
//		myCar.speed = 60;
//		System.out.println("������ �� : " + myCar.speed);
	}

}
