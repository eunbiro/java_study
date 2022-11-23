package test.ch09.noname;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		car.run2();
		car.run3(new Tire() {			// 이름없는 클래스 + 상속 + 자동형변환
										// 쿨래스를 만들고 상속받고 오버라이딩 후 자동형변환으로 넣어주는걸 생략한 것
			@Override
			public void roll() {
				System.out.println("roll ezen Tire");
			}
		});
	}

}
