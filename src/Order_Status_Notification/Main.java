package Order_Status_Notification;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();

        order1.addObserver(new UserNotifier());
        order1.setStatus("Shipped");

        order2.addObserver(new UserNotifier());
        order2.setStatus("New Order");
    }
}
