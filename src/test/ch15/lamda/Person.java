package test.ch15.lamda;

public class Person {
	public void action (Calcuable2 calcuable2) {
		double result = calcuable2.calc(10, 4);
		System.out.println("결과 : " + result);
	}
}
