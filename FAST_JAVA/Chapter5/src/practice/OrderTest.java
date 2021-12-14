package practice;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		
		order.orderNumber = 201907210001L; 
		order.orderID = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.orderName = "홍길순";
		order.orderProductNumer = "PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + order.orderNumber);
		System.out.println("주문아이디 : " + order.orderID);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.orderName);
		System.out.println("주문 상푼 번호 : " + order.orderProductNumer);
		System.out.println("배송주소 : " + order.orderAddress);
				
		
		
	}

}
