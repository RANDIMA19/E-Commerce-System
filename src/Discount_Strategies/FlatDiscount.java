package Discount_Strategies;

public class FlatDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price - 100;
    }
}
