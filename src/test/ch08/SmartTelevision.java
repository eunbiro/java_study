package test.ch08;

public class SmartTelevision implements RemoteControl2, Searchable {

	@Override
	public void search(String url) {
		System.out.println("Search > " + url);
	}

	@Override
	public void turnOn() {
		System.out.println("Turn on TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off TV");
	}
	
}
