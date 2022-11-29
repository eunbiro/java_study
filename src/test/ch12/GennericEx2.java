package test.ch12;

public class GennericEx2 {

	public static void main(String[] args) {
			// 다양한 제품을 생산할 수 있다.
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("Smart Tv");
		
		Tv t = product1.getKind();
		String tModel = product1.getModel();
		
		System.out.println(t);
		System.out.println(tModel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("electric Car");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(car);
		System.out.println(carModel);;
		
	}

}
