package lt.vtvpmc.printer.shapes;

import lt.vtvpmc.printer.Shape;

// Circle igyvendina kontrakta pagal interfeisa Shape
public class Circle implements Shape {
    //kintamasis kurio nera interfeise bet reikalingas igyvendinamai konkreciai figurai
    private double r;
    //konstruktorius kad sukurti Circle
    public Circle(double r) {
        this.r = r;
    }
    //overridinimas kad igyvendinti interfeiso abstraktu metoda (jame formules nera)
    @Override
    public double getArea() {
        return Math.PI * this.r * this.r;
    }
    
}
