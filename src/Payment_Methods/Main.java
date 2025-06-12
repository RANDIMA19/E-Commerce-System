package Payment_Methods;

public class Main {
    public static void main(String[] args) {
        PaymentMethod method1 = PaymentFactory.createPayment("PayPal");
        PaymentMethod method2 = PaymentFactory.createPayment("CreditCard");

        method1.pay(500);
        method2.pay(2000);
    }
}
