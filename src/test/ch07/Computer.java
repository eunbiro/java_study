package test.ch07;

public class Computer extends Calculator {

	// 오버라이드 : 부모클래스의 메소드를 재 정의(반환타입, 메소드 이름, 매개변수가 같아야 한다.)
	@Override // 오른클릭 > source > override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		return super.areaCircle(r);
	}

}
