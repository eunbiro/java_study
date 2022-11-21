package test.ch08;

public class Television implements RemoteControl {
	private int volume;
	
	// 인터페이스에 정의된 추상 메소드는 반드시 구현을 해줘야 한다.
	@Override
	public void turnOn() {
		System.out.println("Turn on TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off TV");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("Now TV Volume : " + this.volume);
	}
	
	private int memoryVolume;		// 볼륨을 기억하는 필드

	// default 메소드는 오버라이드시 반드시 public접근 제한자를 붙여야한다.
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("on mute...");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("...dismute!");
			setVolume(this.memoryVolume);
		}
	}
	
	
}
