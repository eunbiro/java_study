package test.ch08.i01;

public class Bus implements Vechicle {

	@Override
	public void run() {
		System.out.println("running BUS");
	}
	
	public void checkFare() {
		System.out.println("check BUS");
	}
}
