public class Order {
    private final String itemName;
    private final int itemPrice;
    private final int discountPrice;

    public Order(String itemName, int itemPrice, int discountPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int getDiscountPrice(){
        return discountPrice;
    }
}

