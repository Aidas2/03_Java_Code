package lt.vtvpmc.printer;

import lt.vtvpmc.printer.shapes.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    
    @Test
    public void shouldCalculateAreaCorrectly() {
        Circle circle = new Circle(2.0);
        
        assertEquals(12.56, circle.getArea(), 0.1);
    }
    
}
