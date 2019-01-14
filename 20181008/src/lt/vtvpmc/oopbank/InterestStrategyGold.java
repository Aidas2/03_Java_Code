package lt.vtvpmc.oopbank;

public class InterestStrategyGold implements InterestStrategy {
    @Override
    public double applyInterest(double amount, double balance) {
        if(balance < 0) {
            return ((amount - balance * 0.98) + balance);
        } else {
            return amount;
        }
    } //palukanos yra tik 2% nuo balanso
}
