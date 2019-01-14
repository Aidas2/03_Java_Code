package lt.vtvpmc.oopbank;

public class CheapCreditStrategy implements InterestStrategy {
    @Override
    public double applyInterest(double credit, double balance) {
        return 1;
    }
}
