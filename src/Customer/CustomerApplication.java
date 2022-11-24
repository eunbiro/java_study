package Customer;

import java.util.ArrayList;

public class CustomerApplication {

	protected static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerJung = new GoldCustomer(10040, "정약용");
		Customer customerYul = new VIPCustomer(10050, "이율곡", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJung);
		customerList.add(customerYul);
		
		showAllCustomer();
		
		Customer customer = findCustomer(10050);
		
		if (customer == null) {
			System.out.println("회원정보가 없습니다.");
		} else {
			showPriceBonus(customer, 10000);
		}
	}
	
	public static void showAllCustomer() {
		System.out.println("============ 모든 고객 정보 출력 ===========");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	
	public static Customer findCustomer(int customerID) {
		Customer findID = null;
		
		for (Customer customer : customerList) {
			if (customer.getCustomerID() == customerID) {
				findID = customer;
				break;
			}
		}
		
		return findID;
		
	}
	
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("============ 모든 고객 정보 출력 ===========");
		System.out.println(customer.getCustomerName() + "님의 지불금액 : " + customer.calcPrice(price) + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트 : " + customer.bonusPoint);
	}

}
