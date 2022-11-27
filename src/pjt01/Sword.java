package pjt01;

public class Sword extends Weapon {
	
	public Sword() {
		super.setWeaponName("Sword");
		super.setOffensePower(100);
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
