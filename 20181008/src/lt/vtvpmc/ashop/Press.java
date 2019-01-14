package lt.vtvpmc.ashop;

import lt.vtvpmc.ashop.Item;

public class Press extends Item {

    public Press(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double getTotalPrice() {
        return this.getBasePrice() * 1.09;
    }


}
