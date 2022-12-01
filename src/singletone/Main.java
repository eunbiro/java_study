package singletone;

public class Main {

	public static void main(String[] args) {
		User[] user = new User[10];
		
		for (int i = 0; i < user.length; i++) {
			user[i] = new User("user" + i);
			user[i].print();
		}
		
	}

}
