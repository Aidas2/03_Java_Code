import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class Car extends Transportation {

    final static double VAT = 1.21;

    public Car(String make, String model, double price, Color color) {
        super(make, model, price, color);
    }

    @Override
    public double getFinalPrice() {
        return getPrice() * VAT;
    }
}
