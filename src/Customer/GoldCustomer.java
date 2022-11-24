package Customer;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += bonusRatio * price;
		return price * (int)(saleRatio * price);
	}
	
}
