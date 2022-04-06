package inheritance;

public class VIPCustomer extends Customer{


	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
	
		// super(); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println(" VIPcustomer() 생성자 호출")
	}*/
	
	public VIPCustomer(int customerID, String customerName) { // 매개변수만 있는 경우에는 명시를 해줘야한다.
		super(customerID, customerName); 

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		// System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	@Override
	public int calcPrice(int price) { // 매개변수를 double로 하면 안된다
		bonusPoint += price * bonusRatio;
		return price - (int)(price*salesRatio);
		
	}

}
