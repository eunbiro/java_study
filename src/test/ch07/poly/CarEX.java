package test.ch07.poly;

public class CarEX {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new KumhoTire();	// = Tire tire = new KumhoTire();
		myCar.run();
	}

}
