package pjt01;

public class Leather extends Equipment {

	public Leather() {
		super.setEquiName("Leather");
		super.setArmorDefense(130);
	}
	
	@Override
	public void wearOn() {
		super.getEquiName();
		super.wearOn();
	}

	@Override
	public void defenseOn() {
		super.getArmorDefense();
		super.defenseOn();
	}
	
}
