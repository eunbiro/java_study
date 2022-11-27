package pjt01;

public class Gun extends Weapon {

	public Gun() {
		super.setWeaponName("gun");
		super.setOffensePower(170);
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
