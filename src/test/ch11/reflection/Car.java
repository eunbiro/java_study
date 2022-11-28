package test.ch11.reflection;

public class Car {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		Class clazz = Car.class;
//		Class clazz = Class.forName("test.ch11.reflection.Car");		// 클래스 객체를 얻는 2번째 방법
		Car car = new Car();
		Class clazz = car.getClass();									// 클래스 객체를 얻는 3번째 방법
		
		System.out.println("package name : " + clazz.getPackage().getName());
		System.out.println("class simple name : " + clazz.getSimpleName());
		System.out.println("class name : " + clazz.getName());
		
	}

}
