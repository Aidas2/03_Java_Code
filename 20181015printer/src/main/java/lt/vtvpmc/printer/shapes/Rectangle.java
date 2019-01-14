package lt.vtvpmc.printer.shapes;

import lt.vtvpmc.printer.Shape;

// Circle igyvendina kontrakta pagal interfeisa Shape
public class Rectangle implements Shape {
    //kintamieji kuriu nera interfeise bet reikalingi igyvendinamai konkreciai figurai
    private double x;
    private double y;
    //konstruktorius kad sukurti Circle
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //overridinimas kad igyvendinti interfeiso abstraktu metoda (jame formules nera)
    @Override
    public double getArea() {
        return this.x * this.y;
    }
}
