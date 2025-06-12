package Discount_Strategies;

public class Main {
    public static void main(String[] args) {
        PricingService pricingService = new PricingService();

        pricingService.setDiscountStrategy(new PrecentageDiscount());

        double finalPrice = pricingService.calculateFinalPrice(5000);
        System.out.println("After the dicount: "+finalPrice);
    }
}
