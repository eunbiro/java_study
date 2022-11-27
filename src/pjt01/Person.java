package pjt01;

public class Person {
	private String userName;
	
	
	public Person(String userName) {
		this.userName = userName;
	}
	
	Weapon weapon = new Weapon();
	Equipment equi = new Equipment();
	
	public void personWear(Weapon weapon, Equipment equipment) {
		System.out.print(userName + "님이 ");
		weapon.wearOn();
		System.out.print(userName + "님이 ");
		equipment.wearOn();
		System.out.print(userName + "님이 ");
		weapon.getOffensePower();
		weapon.attackOn();
		equipment.defenseOn();
		System.out.println(" ");
	}
	
}
