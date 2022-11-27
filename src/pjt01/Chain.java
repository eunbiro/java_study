package pjt01;

public class Chain extends Equipment {

	public Chain() {
		super.setEquiName("Chain");
		super.setArmorDefense(100);
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
