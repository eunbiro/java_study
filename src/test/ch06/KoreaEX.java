package test.ch06;

public class KoreaEX {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567", "���ڹ�");
		k1.name = "������";
//		k1.nation = "�̱�";		// final�� ����Ұ�
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		
	}

}
