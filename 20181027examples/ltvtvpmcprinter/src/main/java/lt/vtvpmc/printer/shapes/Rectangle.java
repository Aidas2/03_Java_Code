package lt.vtvpmc.printer.shapes;

import lt.vtvpmc.printer.Shape;

public class Rectangle implements Shape {
    
    private double x;
    private double y;
    
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double getArea() {
        return this.x * this.y;
    }
}
