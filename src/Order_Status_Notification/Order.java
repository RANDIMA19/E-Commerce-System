package Order_Status_Notification;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private List<OrderObserver> observers = new ArrayList<OrderObserver>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyStatus();
    }

    public void notifyStatus() {
        for (OrderObserver observer : observers) {
            observer.Update(status);
        }
    }
}
