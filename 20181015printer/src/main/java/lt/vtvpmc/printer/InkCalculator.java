package lt.vtvpmc.printer;

import java.util.ArrayList;
import java.util.List;

public class InkCalculator {

    private static final double INK_PER_SQUARE_CM = 0.05; //konstanta
    //sukuriam figuru masyva (list tipo)
    private List<Shape> shapes = new ArrayList<Shape>();

    //metodas kad prie listo prideti figura
    public void add(Shape shape) {
        shapes.add(shape);
    }

    //metodas kad skaiciuotu rasalo kieki
    //pazymetina kad konstanta yra cia, o ne kiekvienos figuros faile
    public double getRequiredInkInMl() {
        double totalInk = 0.0;          //cia pradinis rasalo kiekis
        for (Shape shape : shapes) {    //cia iteracija per masyva su foreach
            totalInk += shape.getArea(); //cia tik figuru ploto susumavimas (dar ne rasalo kiekis)
        }
        return totalInk * INK_PER_SQUARE_CM; //cia jau rasalo galutinis kiekis
    }
}
