package test.ch12.interfaceGenneric;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();	// 객체 자체를 넘겨줌(빌려줌)
	}

}
