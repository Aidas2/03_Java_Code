package lt.vtvpmc.oopbank;

public class GoldCreditStrategy implements InterestStrategy {

    @Override
    public double applyInterest(double credit, double balance) {
        if(balance < -10) {
            return credit * 0.88;
        } else if(balance >= -10 && balance <= 0){
            return credit * 0.9;
        } else {
            return credit;
        }
    }
}
