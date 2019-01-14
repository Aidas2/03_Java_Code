import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class Boat extends Transportation {
    double length;
    final static double VAT = 1.21;

    public double getLength() {
        return length;
    }

    public Boat(String make, String model, double price, Color color, double length) {
        super(make, model, price, color);
        this.length = length;
    }

    @Override
    public double getFinalPrice() {
        return getPrice() * VAT;
    }
}
