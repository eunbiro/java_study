package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;		// ���� ����
		a.field2 = 1;		// �ٸ� ��Ű������ default�� ������ ������ ���� �Ұ�
		a.field3 = 1;		// private�� ������ ������ ���� �Ұ�
		a.method1();		// ���� ����
		a.method2();		// �ٸ� ��Ű������ default�� ������ �޼���� ���� �Ұ�
		a.method3();		// private�� ������ �޼���� ���� �Ұ�
	}
}
