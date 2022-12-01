package singletone;

public class Printer {
	
	private static Printer printer = null;
	
		// 외부에서 객체 생성을 못함
	private Printer() {}

		// 싱글톤
		// 프린터 객체가 null이면 printer객체 생성
	public static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		// 이미 printer 객체가 생성이 되어있으면 나중에는 이미 생성 된 printer가 리턴된다.
		return printer;
	}
}
