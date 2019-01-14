package lt.vtvpmc.ems.akaddemijait.sheep;

import lt.vtvpmc.sheep.AbstractSheepIteratorTest;
import lt.vtvpmc.sheep.SheepIterator;

public class AbstractSheePIteratorTestImpl extends AbstractSheepIteratorTest {
    @Override
    public SheepIterator getSheepIterator(int sheepCount) {
        return new SheepIteratorImpl(sheepCount);
    }
}
