package Payment_Methods;

public class PaymentFactory {

    public static PaymentMethod createPayment(String type){
        switch (type){
            case "CreditCard":
                return new CreditCard();
            case "PayPal":
                return new PayPal();
            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
