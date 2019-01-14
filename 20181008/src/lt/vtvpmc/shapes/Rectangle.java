package lt.vtvpmc.shapes;

import lt.vtvpmc.acalc.Shape;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle (String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA(){
        return this.sideA;
    }

    public double getSideB(){
        return this.sideB;
    }

    @Override
    public double getArea() {
        return this.getSideA() * this.getSideB();
    }



}
