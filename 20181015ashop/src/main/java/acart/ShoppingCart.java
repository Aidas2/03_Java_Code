package acart;

import ashop.Item;

public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    private Item[] items = new Item[10];
    private int itemCount = 0;

    public ShoppingCart() {     //konstruktorius atvejui be nuolaidos
        this.discountStrategy = new NoDiscountStrategy();
    }
    
    public ShoppingCart(DiscountStrategy discountStrategy) { // konstruktorius atvejui su nuolaida
        this.discountStrategy = discountStrategy;
    }
    
    public void add(Item item) {
        items[itemCount++] = item;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        
        return discountStrategy.applyDiscount(totalPrice);
    }
}
