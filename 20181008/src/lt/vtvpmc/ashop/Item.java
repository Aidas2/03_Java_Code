package lt.vtvpmc.ashop;

/*1. Egzistuoja prekės turinčios bazinę (be mokesčių) kainą bei pavadinimą.
  2. Prekės gali apskaičiuoti savo kainą su PVM:
  2.1. Vaistams taikomas 5% PVM
  2.2. Spaudai taikomas 9% PVM
  2.3. Likusioms prekėms taikomas 21% PVM Pagalvokite kaip prekė bus naudojama, parašykite testą,
       tuomet pridėkite kodą reikalavimui įgyvendinti.*/

public abstract class Item {
    private String name;
    private double basePrice;

    //==================== E X C E P T I O N ===================================
    public Item(String name, double basePrice) throws NegativePriceException {
        this.name = name;
        //this.basePrice = basePrice; // nebelieka po exception ivedimo, t.y. nusikelia zemiau
        if (basePrice < 0) {
            throw new NegativePriceException("Pirmo varianto zinute: Price cannot be negative"); //variantas1
            //throw new NegativePriceException();                                               //variantas2
        } else {
            this.basePrice = basePrice;
        }
    }

    public String getName () {
        return this.name;
    }

    public double getBasePrice () {
        return this.basePrice;
    }

    //abstraktus metodas, kuris bus implementinamas kitose klasese (Medicine, Press, Wine, Product) su @Override
    public abstract double getTotalPrice();

}
