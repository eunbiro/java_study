package test.ch07;

public class Computer extends Calculator {

	// �������̵� : �θ�Ŭ������ �޼ҵ带 �� ����(��ȯŸ��, �޼ҵ� �̸�, �Ű������� ���ƾ� �Ѵ�.)
	@Override // ����Ŭ�� > source > override
	public double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}

}
