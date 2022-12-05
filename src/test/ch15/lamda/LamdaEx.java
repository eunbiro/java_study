package test.ch15.lamda;

public class LamdaEx{

	public static void main(String[] args) {
//		action(new Calculable() { // 하위 클래스 + 오버라이드
		
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println(x + y);
//			}
//		});
		
//		action(new Calculable() { // 하위 클래스 + 오버라이드
		
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println(x - y);
//			}
//		});

		
//		action((x, y) -> {
//			System.out.println(x + y);
//		});
//
//		action((x, y) -> System.out.println(x - y));	// 결과가 하나일때는 블럭 생략가능
//
//		action((x, y) -> {
//			x = 20;
//			y = 9;
//			System.out.println("result");
//			System.out.println(x - y);
//		});
		
		action(x -> System.out.println(x));				// 매개변수가 하나일때는 괄호 생략가능
		
		
	}

	
	public static void action(Calculable calculable) {
		int x = 10;
//		int y = 4;
//		calculable.calculate(x, y);
		calculable.calculate(x);
	}

}
