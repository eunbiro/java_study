package test.ch06;

public class Calculator2EX {

	public static void main(String[] args) {
//		Calculator2 calc2 = new Calculator2();	// ��ü ����, �ν��Ͻ��� ����
//		calc2.pi = 10;
//		calc2.plus(1, 2);
		Calculator2.plus(1, 2);	// static �����ڴ� �ν��Ͻ��� �������� �ʾƵ� ���� ����
		Calculator2.minus(1, 2);
		System.out.println(Calculator2.pi);
		
	}

}
