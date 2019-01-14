package lt.vtvpmc.ems.akademijait.funcions;

public class Zmogus {
    public void calculateIncoms(Taxes taxes) {
        taxes.calculate(5);
    }

    public int getTaxes(int i){
        return (i+5)*10;
    }
}
