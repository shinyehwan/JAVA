package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order(); // 인스턴스(customer)의 오더이다.

        Sell seller = customer;
        seller.sell();
        seller.order(); // 인스턴스(customer)의 오더이다.

        
    }
}
