package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	// �ٸ� ��Ű���� �ִ� class�� �ݵ�� ��Ű�� import�� ������Ѵ�.
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();
	
	// ���� ��Ű���� �ִ� class�� import �����൵ ��
	Test test = new Test();
	
	// �̷��� ���� import�� ���� �����൵ ��
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
}
