package ashop;

public class Wine extends Item {
    private double volume;
    
    public Wine(String name, double basePrice, double volume) {
        super(name, basePrice);
        this.volume = volume;
    }

    @Override
    public double getTotalPrice() {
        return (volume * 1.65 + this.getBasePrice()) * 1.21;
    }
}
