package test.ch09.noname;

public class Car {
	private Tire tire1 = new Tire();
	
		// 필드에서 익명 자식 객체 사용
	private Tire tire2 = new Tire() {	// 이름없는 클래스 + 상속 + 자동형변환
										// 쿨래스를 만들고 상속받고 오버라이딩 후 자동형변환으로 넣어주는걸 생략한 것
		@Override
		public void roll() {
			System.out.println("roll Hankook Tire");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
			// 로컬 변수에 익명 자식 객체 사용
		Tire tire = new Tire() {		// 이름없는 클래스 + 상속 + 자동형변환
										// 쿨래스를 만들고 상속받고 오버라이딩 후 자동형변환으로 넣어주는걸 생략한 것
			@Override
			public void roll() {
				System.out.println("roll Kumho Tire");
			}
		};
		
		tire.roll();
	}
	
		// 메소드에서 매개변수 이용
	public void run3(Tire tire) {		// 외부에서 new Tire 해주면 Tire tire = new Tire와 같다.
		tire.roll();
	}
}
