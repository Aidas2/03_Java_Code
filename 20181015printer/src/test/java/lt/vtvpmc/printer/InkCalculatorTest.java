package lt.vtvpmc.printer;

import lt.vtvpmc.printer.shapes.Circle;
import lt.vtvpmc.printer.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InkCalculatorTest {

    @Test
    public void shouldCalculateInkUsageForSingleShape() {
        InkCalculator inkCalculator = new InkCalculator();
        
        inkCalculator.add(new TestShape());     //TestShape yra figura is pabaigoje esancio kodo
        
        assertEquals(0.1, inkCalculator.getRequiredInkInMl());
    }
    
    @Test
    public void shouldCalculateInkUsageForMultipleShapes() {
        InkCalculator inkCalculator = new InkCalculator();
        
        inkCalculator.add(new TestShape());
        inkCalculator.add(new TestShape());

        assertEquals(0.4, inkCalculator.getRequiredInkInMl());
    }

    //nebutinas, sukurtas tik tam kad neprisiristi + kad grazintu zinoma reiksme (siuo atveju 2)
    class TestShape implements Shape {
        public double getArea() {
            return 2;
        }
    }
}
