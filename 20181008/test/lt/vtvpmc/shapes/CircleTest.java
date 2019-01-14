package lt.vtvpmc.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void figureShouldHaveNameAndRadius() {
        Circle circle = new Circle("Circle1", 15);

        assertEquals("Circle1", circle.getName());
        assertEquals(15, circle.getRadius());
    }

    @Test
    public void figureShouldReturnArea() {
        Circle circle = new Circle("Circle2", 15);

        assertEquals(706.5, circle.getArea(), 0.5 );
    }

    @Test
    public void figureShouldReturnPaintQuantity() {
        Circle circle = new Circle("Circle3", 10);

        assertEquals(15.7, circle.getPaintQuantity(), 0.01);
    }
}