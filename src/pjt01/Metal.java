package pjt01;

public class Metal extends Equipment {

	public Metal() {
		super.setEquiName("Metal");
		super.setArmorDefense(150);
	}
	
	@Override
	public void wearOn() {
		super.setEquiName("Metal");
		super.wearOn();
	}

	@Override
	public void defenseOn() {
		super.getArmorDefense();
		super.defenseOn();
	}
	
}
