package test.ch07;

public class SupersonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("supersonic flight");
		} else {
			// super.method name() -> parent class method run
						super.fly(); // parent in fly() use method declaration, run (priority override)
		}
		super.fly();
	}
	
}
