package test.ch08;

public interface RemoteControl {
	
	// 인터페이스에 선언된 필드는 모두 public static final 특성을 갖는다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// public 추상메소드
	// public이 없어도 컴파일 과정에서 (public abstract가) 자동으로 붙는다. > 추상메소드기 때문에.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default 메소드 : 인터페이스에서 실행 메소드를 구현하고 싶을 때 사용 
	default void setMute(boolean mute) {	// 음소거
		if (mute) {
			System.out.println("on mute...");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("...dismute!");
		}
	}
	
	// static(정적) 메소드
	// 코드를 구현 할 수 있다.
	// public이 없어도 컴파일 과정에서 public이 붙는다.
	static void changeBattery() {
		System.out.println("changeBattery");
	}
	
	
	
}
