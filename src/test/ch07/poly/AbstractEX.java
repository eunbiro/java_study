package test.ch07.poly;

public class AbstractEX {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(dog);
		animalSound(cat);
		

		Animal dog1 = new Dog();
		dog.sound();

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
