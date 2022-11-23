package solo.project01;

public class Item {
	String weapon;
	int damage;
	
	public Item() {
		weapon = "검";
		damage = 100;
		System.out.println("장착무기 : " + weapon + "\n" + weapon + " 공격력 : " + damage);
	}
	
	public void weaponType() {
		weapon = "검";
		System.out.println(weapon + "을 장착합니다.");
	}
	
	public void weaponDamage() {
		damage = 100;
		System.out.println(damage + "를 입혔습니다.");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}

/*
EX

스캐너

드래곤메소드

사람객체




Item

// 필드
스타틱 방어력
스트링 웨폰
인트 데미지



// 메소드


무기종류

무기공격력




검	활	단검

*/