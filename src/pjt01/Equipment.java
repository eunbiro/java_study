package pjt01;

public class Equipment implements Wear,Defense {
	private String equiName;
	private int armorDefense;
	
	
	public Equipment() {
		this.equiName = "초보자갑옷";
		this.armorDefense = 100;
	}
	
	
	@Override
	public void wearOn() {
		System.out.println(equiName + "을(를) 장착했습니다.");
		
	}

	@Override
	public void defenseOn() {
		System.out.println(getArmorDefense() + " 만큼 방어했습니다.");
		
	}


	public String getEquiName() {
		return equiName;
	}


	public void setEquiName(String equiName) {
		this.equiName = equiName;
	}


	public int getArmorDefense() {
		return armorDefense;
	}


	public void setArmorDefense(int armorDefense) {
		this.armorDefense = armorDefense;
	}

	
}
