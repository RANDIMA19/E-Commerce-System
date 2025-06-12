package Payment_Methods;

public class PayPal implements PaymentMethod{
    @Override
    public void pay(double amount) {

        System.out.println("You have paid Rs" + amount + ".");
    }
}
