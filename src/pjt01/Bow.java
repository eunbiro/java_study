package pjt01;

public class Bow extends Weapon {

	public Bow() {
		super.setWeaponName("Bow");
		super.setOffensePower(150);
		
	}
	
	@Override
	public void wearOn() {
		super.getWeaponName();
		super.wearOn();
	}

	@Override
	public void attackOn() {
		super.getOffensePower();
		super.attackOn();
	}
	
}
