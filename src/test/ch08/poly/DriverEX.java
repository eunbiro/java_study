package test.ch08.poly;

public class DriverEX {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(taxi);
		driver.driver(bus);
	}

}
