package test.ch08;

public class MultiInterfaceEX {

	public static void main(String[] args) {
		RemoteControl2 rc = new SmartTelevision();	// 자동형변환
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("www.naver.com");
	}

}
