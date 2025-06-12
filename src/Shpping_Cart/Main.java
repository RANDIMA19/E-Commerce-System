package Shpping_Cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart1 = ShoppingCart.getInstance();
        ShoppingCart cart2 = ShoppingCart.getInstance();

        Product product1 = new Product("LapTop", 200000);
        Product product2 = new Product("Phone", 100000);

        cart1.addItem(product1);
        cart2.addItem(product2);
//
//        System.out.println("Items before checkout: " + cart1.getInstance().items);
        System.out.println("Same instance: "+(cart1 == cart2));
        cart1.checkout();
        System.out.println("Items after checkout: " + ShoppingCart.getInstance().items);


    }
}
