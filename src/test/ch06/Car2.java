package test.ch06;

public class Car2 {

	// 인스턴스 필드
	int speed;
//	static int test;
	
	// 인스턴스 메소드
	void run() {
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	void run2() {
		this.run();
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	// 정적 블록
	static {
//		this.speed = 200;	// static 블럭에서는 인스턴스 변수에 직접접근 불가
//		this.run();			// static 블럭에서는 인스턴스 메소드에 직접접근 불가
	}
	
	// 정적(static) 메소드
	static void simulate() {
//		this.speed = 200;	// static 메소드에서는 인스턴스 변수에 직접접근 불가
//		this.run();			// static 메소드에서는 인스턴스 메소드에 직접접근 불가
		
		Car2 myCar = new Car2();
		
		myCar.speed = 200;	// 객체를 생성 후 간접적으로 접근가능
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();
	}

}
