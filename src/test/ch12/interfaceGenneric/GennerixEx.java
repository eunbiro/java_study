package test.ch12.interfaceGenneric;

public class GennerixEx {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home =  homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car  = carAgency.rent();
		car.run();
		
		
		
	}

}
