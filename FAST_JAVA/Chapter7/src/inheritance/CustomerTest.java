package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
		//customerLee.setCustomerName("이순신");
		//customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		
		Customer customerKim = new VIPCustomer(10020, "김유신"); // 묵시적 대입이 가능 타입별로 다른걸 가리킨다.
		//customerKim.setCustomerName("김유신");
		//customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
	}

}
