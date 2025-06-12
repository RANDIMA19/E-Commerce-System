package Discount_Strategies;

public class PricingService {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
