package question;

public class test {
	
	public static void main(String[] args) {
		
		int money = 2680;
		int coin[] = {500, 100, 50, 10};
		int coinCount[] = new int[4];
		
		for (int i = 0; i < coin.length; i++) {
			coinCount[i] = money / coin[i];
			money %= coin[i];
			
			System.out.println(coin[i] + "원의 필요 갯수는 " + coinCount[i] + "개 입니다.");
		}
	}
}
