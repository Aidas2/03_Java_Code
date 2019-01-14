package lt.vtvpmc.printer;

import lt.vtvpmc.printer.shapes.Circle;
import lt.vtvpmc.printer.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InkCalculatorITest {

    @Test
    public void shouldCalculateAreaForRectangleAndCircle() {
        InkCalculator inkCalculator = new InkCalculator();
        
        inkCalculator.add(new Rectangle(1.0, 1.0));
        inkCalculator.add(new Circle(1.0));
        
        assertEquals(4.141*0.05, inkCalculator.getRequiredInkInMl(), 0.1);
    }

}
