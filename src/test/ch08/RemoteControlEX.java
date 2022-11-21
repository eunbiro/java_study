package test.ch08;

public class RemoteControlEX {

	public static void main(String[] args) {

		
//		RemoteControl rc = new Television();
//		RemoteControl rc1 = new Audio();
//		
//		rc.turnOn();	// 오버라이딩한 turnOn을 출력
//		rc1.turnOn();	// 오버라이딩한 turnOn을 출력
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("===========");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
//		
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(5);
//		rc.turnOff();
//		
//		// static의 특성를 가졌기 때문에 객체를 생성하지 않고 호출한다.
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
	}

}
