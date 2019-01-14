package lt.vtvpmc.printer;

import java.util.ArrayList;
import java.util.List;

public class InkCalculator {
    private static final double INK_PER_SQUARE_CM = 0.05;
    
    private List<Shape> shapes = new ArrayList<Shape>();
    
    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getRequiredInkInMl() {
        double totalInk = 0.0;
        for (Shape shape : shapes) {
            totalInk += shape.getArea();
        }
        return totalInk * INK_PER_SQUARE_CM;
    }
}
