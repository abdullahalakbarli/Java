public class Computer {
    private String productName;
    private double productPrice;
    private int discountPercentage;
    private double productRating;

    public Computer() {
        System.out.println("Process started");
        this.productName = "Unknown";
        this.productPrice = 0.0;
        this.discountPercentage = 0;
        this.productRating = 0.0;
    }

    // Task 1
    //    Getter
    public String getProductName(){
        return productName;
    }
    public double getProductPrice(){
        return productPrice;
    }
    public double getProductRating(){
        return productRating;
    }
    public int getDiscountPercentage(){
        return discountPercentage;
    }

    //    Setter
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }
    public void setDiscountPercentage (int discountPercentage){
        this.discountPercentage = discountPercentage;
    }
    public void setProductRating(double productRating){
        this.productRating = productRating;
    }

    // addtoWishlist (Task 2)
    public void addtoWishlist(){
        System.out.println(this.productName + " has been added to WishList");
    }

    //showDiscount (Task 3)
    public double showDiscount() {
        return productPrice - (productPrice * discountPercentage / 100);
    }
}
