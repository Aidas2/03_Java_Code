package lt.vtvpmc.printer.shapes;

import lt.vtvpmc.printer.Shape;

public class Circle implements Shape {
    
    private double r;
    
    public Circle(double r) {
        this.r = r;
    }
    
    @Override
    public double getArea() {
        return Math.PI * this.r * this.r;
    }
    
}
