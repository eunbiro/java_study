package test.ch07;

public class SmartPhone extends phone{
	
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super();	// �θ� ������ ȣ��
		System.out.println("�ڽ� ������ ����");
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���� ����");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� �����մϴ�.");
	}
}
