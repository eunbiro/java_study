package test.ch06;

public class Korea {
	// ����� �Һ��� ��(final), �����ؼ� ��� ����(static)
	// ex) ������ : 3.14... ������ ����
	
	// final �ʵ�(���� �� ������ ������ �� ����. ������)
	// final �ʵ�� �ʱⰪ�� ������ ����Ѵ�.(�ʵ� ����� �ְų� Ȥ�� �����ڿ��� ��� �Ѵ�.)
	final String nation = "���ѹα�";
	final String ssn;	// �ֹι�ȣ
	
	// �ν��Ͻ� �ʵ�
	String name;
	
	// ������
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
