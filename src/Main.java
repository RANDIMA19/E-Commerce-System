import Discount_Strategies.PrecentageDiscount;
import Discount_Strategies.PricingService;
import Order_Status_Notification.Order;
import Order_Status_Notification.UserNotifier;
import Payment_Methods.PaymentFactory;
import Payment_Methods.PaymentMethod;
import Shpping_Cart.Product;
import Shpping_Cart.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Singleton: Shopping Cart
        ShoppingCart cart = ShoppingCart.getInstance();
        cart.addItem(new Product("Phone", 50999.99));
        cart.checkout();

        // Strategy: Apply Discount
        PricingService pricing = new PricingService();
        pricing.setDiscountStrategy(new PrecentageDiscount());
        double finalPrice = pricing.calculateFinalPrice(50999.99);

        // Factory: Choose Payment
        PaymentMethod payment = PaymentFactory.createPayment("CreditCard");
        payment.pay(finalPrice);

        // Observer: Order Status Updates
        Order order = new Order();
        order.addObserver(new UserNotifier());
        order.setStatus("Paid");
    }
}