package test.ch07;

public class SmartPhoneEX {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("������", "����");
		
		System.out.println(myPhone.model + ", " + myPhone.color);
		
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�� ��������?");
		
	}

}
