import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;
import com.eisgroup.javaexam.factory.TransportationFactory;

public class TransportationFactoryImpl implements TransportationFactory {
    @Override
    public Transportation produceCar(String make, String model, double price, Color color) {
        return new Car(make, model, price, color);
    }

    @Override
    public Transportation produceBoat(String make, String model, double price, Color color, double length) {
        return new Boat(make, model, price, color, length);
    }
}
