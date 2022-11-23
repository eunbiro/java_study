package solo.project01;

public class WeaponBow implements Attack {
	private String weaponType = "Bow";
	private int damage = 100;
	
	@Override
	public int toAttack() {
		System.out.println(weaponType + "을 쏘는 효과음");
		return damage;
	}

}
