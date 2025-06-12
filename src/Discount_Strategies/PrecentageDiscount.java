package Discount_Strategies;

public class PrecentageDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.10;
    }
}
