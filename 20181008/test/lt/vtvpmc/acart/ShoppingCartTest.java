package lt.vtvpmc.acart;

import lt.vtvpmc.ashop.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ShoppingCartTest {

    @Test
    public void medicineCanBeAddedToCart() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.add(new Medicine("Propolis", 5.0));

        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    public void wineCanBeAddedToCart() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.add(new Wine("Gruzinskij", 5.0, 1.0));

        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    public void shouldReportFinalPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.add(new Medicine("Ibuprofen", 1.0));
        shoppingCart.add(new Press("Naminukas", 1.52));
        shoppingCart.add(new Wine("Voruta", 5, 1.0));
        //========== E X C E P T I O N ======================================
        try {
            shoppingCart.add(new Medicine("Aspirinas", -5.0));
            fail(); //nutraukia vykdyma ?
        } catch (NegativePriceException ex) {
            System.out.println(ex.getMessage());
        }

        assertEquals(10.75, shoppingCart.getTotalPrice(), 0.01);
    }
    //================ I N T E R F E I S A S ==================================
    @Test
    public void shouldApplyDiscount() {
        ShoppingCart shoppingCart = new ShoppingCart(new TestDiscountStrategy());
        shoppingCart.add(new TestProduct("testinisProduktas", 0.0));
        assertEquals(0.5, shoppingCart.getTotalPrice());
    }

    //cia zemiau nebutina, sukurta tik tam kad neprisiristi prie konkretaus produkto
    //sukuria testinio produkto konstruktoriu ir overridina abstrakcia klase Item kad grazintu ne jo, o savo kaina (siuo atveju 1)
    class TestProduct extends Item {
        public TestProduct(String name, double basePrice) {
            super(name, basePrice);
        }
        @Override
        public double getTotalPrice() {
            return 1;
        }
    }

    //ir implementina ir overridina interfeisa kad grazintu ne jo, o savo nuolaida (siuo atveju 50 proc.)
    //tai va kur yra ta nuolaidos skaiciavimo formule (ne interfeise, ne implemente, o cia, overridinime (+test faile)
    //blyyn, is tikro sitas implemetas ir overridinimas turi buti atskirame TestDiscountStrategy faile !

    class TestDiscountStrategy implements DiscountStrategy {
        @Override
        public double applyDiscount(double totalPrice) {
            return totalPrice * 0.5;
        }
    }

}
