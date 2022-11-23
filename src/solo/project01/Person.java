package solo.project01;

public class Person {
	private String userName;
	private Attack weapon;
	private int damege = 50;
	private int defense = 100;
	private int health = 500;
	
	
	public Person(String userName, Attack weapon) {
		this.userName = userName;
		this.weapon = weapon;
	}
	
	public void changeWeapon(Attack weapon) {
		this.weapon = weapon;
	}
	
	public void counterattack() {
		health -= damege;
	}
	
	public void attack(Person person) {
		int totalDamage = damege + weapon.toAttack() - defense;
		
		if (Math.random() > .8) {
			System.out.println("MISS");
			
		} else {
			person.health -= totalDamage;
			System.out.println(person.userName + "에게 " + totalDamage + " 만큼의 피해를 입혔습니다. 보스의 체력이 " + person.health + "만큼 남았습니다.");
		
		}
	}
}
