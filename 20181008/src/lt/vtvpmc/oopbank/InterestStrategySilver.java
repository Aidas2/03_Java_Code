package lt.vtvpmc.oopbank;

public class InterestStrategySilver implements InterestStrategy {

    @Override
    public double applyInterest(double amount, double balance) {
        if(balance < 0) {
            return ((amount - balance * 0.95) + balance);
        } else {
            return amount;
        }
    } //palukanos yra net 5% nuo balanso
}
