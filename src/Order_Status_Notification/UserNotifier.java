package Order_Status_Notification;

public class UserNotifier implements OrderObserver{
    @Override
    public void Update(String status) {
        System.out.println("Notification: Order Status changed to "+status);
    }
}
