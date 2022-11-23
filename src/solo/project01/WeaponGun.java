package solo.project01;

public class WeaponGun implements Attack {
	private String weaponType = "Gun";
	private int damage = 200;
	
	@Override
	public int toAttack() {
		System.out.println(weaponType + "을 발사하는 효과음");
		return damage;
	}

}
