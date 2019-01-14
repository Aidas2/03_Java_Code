package lt.vtvpmc.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {

    @Test
    public void figureShouldHaveNameAndSides() {
        Rectangle rectangle = new Rectangle("Staciakampis1", 30, 40);

        assertEquals("Staciakampis1", rectangle.getName());
        assertEquals(30, rectangle.getSideA());
        assertEquals(40, rectangle.getSideB());
    }

    @Test
    public void figureShouldReturnArea() {
        Rectangle rectangle = new Rectangle("Staciakampis2", 20, 50);

        assertEquals(1000, rectangle.getArea());
    }

    @Test
    public void figureShouldReturnPaintQuantity() {
        Rectangle rectangle = new Rectangle("Staciakampis3", 25, 35);

        assertEquals(43.75, rectangle.getPaintQuantity(), 0.01);
    }
}