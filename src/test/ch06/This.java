package test.ch06;

public class This {
		// �ʵ�
		String model;
		int speed;
		
		// �Ű��������� �ʵ忡 �ִ� �����͸�� ������ �ʵ嵥���Ϳ��� this�� ���δ�. 
		This(String model) {
			this.model = model;
		}
		
		void setSpeed(int speed) {
			this.speed = speed;
		}
		
		void run() {
			this.setSpeed(100);									// ���� Ŭ���� ���� �޼ҵ� ȣ�� �� this ��������
			System.out.println(this.model + ", " + this.speed);	// this ��������
		}
}
