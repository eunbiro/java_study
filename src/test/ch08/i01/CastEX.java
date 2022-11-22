package test.ch08.i01;

public class CastEX {

	public static void main(String[] args) {
		/*
		Vechicle vechicle = new Bus();	// 자동 타입변환
		vechicle.run();
		
		Bus bus = (Bus)vechicle;			// 강제는 자동 형변환 하고 강제 형변환 해야함
		bus.run();
		bus.checkFare();
		*/
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		ride(bus);
		ride(taxi);
		
	}
	
	public static void ride(Vechicle vechicle) {
		
		if (vechicle instanceof Bus) {
			Bus bus = (Bus)vechicle;			// 강제는 자동 형변환 하고 강제 형변환 해야함
			bus.checkFare();
		}
	}

}
