package test.ch07;

public class phone {
	public String model;
	public String color;
	
	public phone() {
		System.out.println("부모 생성자 실행");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	};
	
	public void sendVoice(String message) {
		System.out.println("자기 목소리 : " + message);
	};
	
	public void receiveVoice(String message) {
		System.out.println("상대방 목소리 : " + message);
	};
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	};
}
