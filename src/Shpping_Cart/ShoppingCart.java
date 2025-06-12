package Shpping_Cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static ShoppingCart uniqueInstance;

    ArrayList <Product> items= new ArrayList <>();

    private ShoppingCart() {}

    public static ShoppingCart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ShoppingCart();
        }

        return uniqueInstance;
    }

    public void addItem(Product product){
            items.add(product);
    }

    public void checkout(){
        System.out.println("Checkout: "+items);
        items.clear();
    }


}
