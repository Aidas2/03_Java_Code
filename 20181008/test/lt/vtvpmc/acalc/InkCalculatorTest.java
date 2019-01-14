package lt.vtvpmc.acalc;

import lt.vtvpmc.shapes.Circle;
import lt.vtvpmc.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InkCalculatorTest {

    @Test
    public void shouldReportFinalQuantity() {

        InkCalculator inkCalculator = new InkCalculator();

        inkCalculator.add(new Rectangle("Rectangle1", 10, 30 ));
        inkCalculator.add(new Rectangle("Rectangle2", 20, 40));
        inkCalculator.add(new Circle("Circle1", 20));

        assertEquals(117.83, inkCalculator.getFinalQuantity(), 0.01);
    }
}