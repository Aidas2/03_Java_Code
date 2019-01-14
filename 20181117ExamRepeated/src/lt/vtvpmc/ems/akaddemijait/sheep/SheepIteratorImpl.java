package lt.vtvpmc.ems.akaddemijait.sheep;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;
import lt.vtvpmc.sheep.SheepIterator;

public class SheepIteratorImpl implements SheepIterator {
    int sheepCount;
    int positionInSheepHerd;

    public SheepIteratorImpl(int sheepCount) {
        this.sheepCount = sheepCount;
        positionInSheepHerd = 1;
    }
    
    @Override
    public boolean hasNext() {
        if (sheepCount >= positionInSheepHerd) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Sheep next() {
        MySheep sheep = null;
        if (positionInSheepHerd % 2 == 1) {
            sheep = new MySheep(SheepColor.WHITE, "Dolly");
        } else {
            sheep = new MySheep(SheepColor.BLACK, "Jack");
        }
        positionInSheepHerd++;
        return sheep;
    }
}
