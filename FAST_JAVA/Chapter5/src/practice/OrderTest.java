package practice;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		
		order.orderNumber = 201907210001L; // Lǥ���ϴ°� ��������
		order.orderID = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.orderName = "ȫ���";
		order.orderProductNumer = "PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderNumber);
		System.out.println("�ֹ��� ���̵� : " + order.orderID);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.orderProductNumer);
		System.out.println("��� �ּ� : " + order.orderAddress);
				
		
		
	}

}
