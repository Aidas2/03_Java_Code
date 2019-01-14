package lt.vtvpmc.printer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InkCalculatorTest {

    @Test
    public void shouldCalculateInkUsageForSingleShape() {
        InkCalculator inkCalculator = new InkCalculator();
        
        inkCalculator.add(new TestShape());
        
        assertEquals(0.1, inkCalculator.getRequiredInkInMl());
    }
    
    @Test
    public void shouldCalculateInkUsageForMultipleShapes() {
        InkCalculator inkCalculator = new InkCalculator();
        
        inkCalculator.add(new TestShape());
        inkCalculator.add(new TestShape());
        
        assertEquals(0.2, inkCalculator.getRequiredInkInMl());
    }
    
    class TestShape implements Shape {
        public double getArea() {
            return 2;
        }
    }
}
