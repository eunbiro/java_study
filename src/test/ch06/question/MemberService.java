package test.ch06.question;

public class MemberService {
	String id = "hong";
	String password = "12345";
	
	boolean login(String id, String password) {
		if (this.id == id && this.password == password) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
	}

	
	public static void main(String[]args) {
		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if(result) {
		     System.out.println("�α��� �Ǿ����ϴ�.");
		     memberService.logout("hong");
		} else {
		     System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}


