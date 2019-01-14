package lt.vtvpmc.acart;

import lt.vtvpmc.ashop.Item;
//import lt.vtvpmc.ashop.Medicine;

public class ShoppingCart {

    //====== INTERFACE (PATERN)=============
    private DiscountStrategy discountStrategy;

    //sukuriam prekiu masyva is klases Item (ja reikia importuoti)
    private Item[] items = new Item[10];
    private int itemCount = 0;

    //====== INTERFACE (PATERN)=============
    //pritaikom interfeisa ? ar darom konstruktoriu vezimeliui (atvejui su nuolaida) ?
    public ShoppingCart() {
        this.discountStrategy = new NoDiscountStrategy();
    }
    //pritaikom interfeisa ? ar darom konstruktoriu vezimeliui (atvejui be nuolaidos) ?
    public ShoppingCart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    //metodas prekes pridejimui
    public void add(Item item) {
        items[itemCount++] = item; //lauztiniuose [] yra items indikacija masyve,
                                    // indikacijos reiksme atitinka counterio reiksme
    }

    //metodas kad matytu koks yra kiekis
    public int getItemCount() {
        return this.itemCount;
    }

    //medotas skaiciuoti krepselio suma
    public double getTotalPrice() {
        double totalPrice = 0;

        for (int i = 0; i < itemCount; i++) { //iterruojama nuo  iki tiek kiek yra itemCount t.y. prekiu
            totalPrice += items[i].getTotalPrice();
        }

        //return totalPrice; //sitas perrasomas kai atsiranda nuolaidos suteikimas (interfeisas)
        //pazymetina, kad nei DiscountStartegy, nei NoDiscountstrategy savyje neturi nuolaidos apskaiciavimo formules,
        //tai tik abstraktus numatymai kad ji bus taikoma ?!
        return discountStrategy.applyDiscount(totalPrice); ///====== INTERFACE (PATERN)=============
    }
}
