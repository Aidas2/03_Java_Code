package lt.vtvpmc.ems.akademijait.funcions;

public class Main {
    public static void main(String[] args) {
        Zmogus zmogus = new Zmogus();
        zmogus.calculateIncoms(Zmogus::getTaxes(1));
    }
}
