public class Main
{
    public static void main(String[] args) {
        // Task 4
        String[] productNames = {"HP Victus", "Zeiron Omen", "Apple Macbook", "RaXius"};
        for (String n: productNames){
            System.out.println(n);
        }

        // Task 5
        Computer product = new Computer();
        product.setProductName("HP Victus");
        product.setProductPrice(1356.69);
        product.setDiscountPercentage(24);
        System.out.println("Discounted Price for " + product.getProductName() + ": $" + product.showDiscount());

        Computer product2 = new Computer();
        product2.setProductName("Zeiron Omen");
        product2.setProductPrice(389.54);
        product2.setDiscountPercentage(0);
        product2.setProductRating(4.4);
        System.out.println("Discounted Price for " + product2.getProductName() + ": $" + product2.showDiscount());

        Computer product3 = new Computer();
        product3.setProductName("Apple Macbook");
        product3.setProductPrice(1641.7);
        product3.setDiscountPercentage(0);
        product3.setProductRating(4.6);
        System.out.println("Discounted Price for " + product3.getProductName() + ": $" + product3.showDiscount());

        Computer product4 = new Computer();
        product4.setProductName("RaXius");
        product4.setProductPrice(922.29);
        product4.setDiscountPercentage(0);
        System.out.println("Discounted Price for " + product4.getProductName() + ": $" + product4.showDiscount());
    }
}
