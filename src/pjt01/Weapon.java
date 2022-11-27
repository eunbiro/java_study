package pjt01;

public class Weapon implements Wear,Attack {
	private String weaponName;
	private int offensePower;
	
	public Weapon() {
		this.weaponName = "나무몽둥이";
		this.offensePower = 50;
	}
	
	
	@Override
	public void wearOn() {
		System.out.println(weaponName + "을(를) 장착했습니다.");
	}

	@Override
	public void attackOn() {
		System.out.println(weaponName + "로 공격하였습니다.");
		System.out.println(offensePower + " 피해를 입혔습니다.");
	}


	public String getWeaponName() {
		return weaponName;
	}


	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}


	public int getOffensePower() {
		return offensePower;
	}


	public void setOffensePower(int offensePower) {
		this.offensePower = offensePower;
	}

}
