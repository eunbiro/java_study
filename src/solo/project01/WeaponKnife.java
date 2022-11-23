package solo.project01;

public class WeaponKnife implements Attack {
	private String weaponType = "knife";
	private int damage = 150;

	@Override
	public int toAttack() {
		System.out.println(weaponType + "을 휘두르는 효과음");
		return damage;
	}

}
