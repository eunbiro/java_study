package pjt01;

public class WearEx {

	public static void main(String[] args) {
		Person p1 = new Person("김전사");
		p1.personWear(new Sword(), new Metal());
		
		Person p2 = new Person("김궁수");
		p2.personWear(new Bow(), new Leather());
		
		Person p3 = new Person("김거너");
		p3.personWear(new Gun(), new Chain());

	}

}
