package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
		String board = "1, �ڹ� �н�, ���� Ÿ��, String ���� ��";
		
		String[] tokens = board.split(","); 

		for (int i = 1; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		/*
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("����");
		System.out.println(location);
		
//		String subString = subject.substring(location);
//		System.out.println(subString);
		
		if (location != -1) {
			System.out.println("�ش� ���ڿ��� �����ϴ�.");
		}
		
		boolean result = subject.contains("�ڹ�");
		
		if (result) {
			System.out.println("�ڹٿ� ���þ��� å�Դϴ�.");
		}else {
			System.out.println("�ڹٿ� ���þ��� å�Դϴ�.");
			
		}
		*/
		
		/*
		String ssn = "950624-1230123";
		String firstName = ssn.substring(0, 6);	// 0~6 (6�� 6�� ��������)
		System.out.println(firstName);
		
		String secondName = ssn.substring(7);	// 7~��
		System.out.println(secondName);
		*/
		/*
		String oldStr = "�ڹ� ���ڿ�";
		String newStr = oldStr.replace("�ڹ�", "JAVA");	// Ư�� ���ڸ� �ٲ�
		System.out.println(oldStr);
		System.out.println(newStr);
		*/
		/*
		String ssn = "9506241230123";	// �ֹι�ȣ
		char sex = ssn.charAt(6);
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		} else {
			System.out.println("�ֹι�ȣ �ڸ����� ���� �ʽ��ϴ�..");
		}
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		}
		*/
		
		
	}

}
