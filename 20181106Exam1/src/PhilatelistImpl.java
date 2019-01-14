import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class PhilatelistImpl implements Philatelist {

    private final List<PostStamp> postStamps;

//    public PhilatelistImpl(List<PostStamp> postStamps) { //netinkamas nors ir sugeneruotas
//        this.postStamps = postStamps;
//    }

    public PhilatelistImpl() {
        this.postStamps = new ArrayList<>();
    }

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().equals("")) { //patikrinimas ar turi duomenis + ar ne empty
            throw new IllegalArgumentException("PostStamp doesnt not exist.. Nothing to addd");
        }

        if (!postStamps.contains(postStamp)) { // patikrinimas ar jau nera
            postStamps.add(postStamp);
        }
    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        // netikrinam nei null nei dubliavimosi nes metodas nepriima jokiu argumentu

        PostStamp mostExpensiveStamp = postStamps.get(0); //apriori pirmas pats brangiausias
        for (int i = 0; i < postStamps.size(); i++) { //lyginam per sarasa ar kuris nera brangeesnos
            if (mostExpensiveStamp.getMarketPrice() < postStamps.get(i).getMarketPrice()) {
                mostExpensiveStamp = postStamps.get(i); // jei itasis brangesnis tai jis ir tampa maksimaliu
            }
        }
        return mostExpensiveStamp;
    }

    @Override
    public double getAveragePostStampPrice() {
        double sum = 0;
        for (PostStamp postStamp : postStamps) { //iteruojam per sarasa ir kiekvieno zenklo kaina pridedam
            sum += postStamp.getMarketPrice();
        }
        double average = sum / postStamps.size(); // nustatom kainu vidurki
        return average;
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        int count = postStamps.size();
        return count;
    }
}
