package test.ch12.interfaceGenneric;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car();	// 객체 자체를 넘겨줌(빌려줌)
	}

}
