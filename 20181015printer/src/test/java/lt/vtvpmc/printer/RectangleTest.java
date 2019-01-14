package lt.vtvpmc.printer;

import lt.vtvpmc.printer.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    
    @Test
    public void shouldCalculateAreaCorrectly() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        
        assertEquals(6.0, rectangle.getArea());
    }
    
}
