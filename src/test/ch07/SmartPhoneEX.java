package test.ch07;

public class SmartPhoneEX {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println(myPhone.model + ", " + myPhone.color);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("네 누구세요?");
		
	}

}
