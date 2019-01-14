import com.eisgroup.javaexam.factory.TransportationFactory;
import com.eisgroup.javaexam.factory.test.BaseTransportationFactoryTest;

public class TransportationFactoryTestImpl extends BaseTransportationFactoryTest {
    @Override
    protected TransportationFactory getTransportationFactory() {
        return new TransportationFactoryImpl();
    }
}
