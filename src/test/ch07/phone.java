package test.ch07;

public class phone {
	public String model;
	public String color;
	
	public phone() {
		System.out.println("�θ� ������ ����");
	}
	
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	};
	
	public void sendVoice(String message) {
		System.out.println("�ڱ� ��Ҹ� : " + message);
	};
	
	public void receiveVoice(String message) {
		System.out.println("���� ��Ҹ� : " + message);
	};
	
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	};
}
