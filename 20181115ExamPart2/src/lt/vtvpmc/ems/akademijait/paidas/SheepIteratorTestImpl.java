package lt.vtvpmc.ems.akademijait.paidas;

import lt.vtvpmc.sheep.AbstractSheepIteratorTest;
import lt.vtvpmc.sheep.SheepIterator;

public class SheepIteratorTestImpl extends AbstractSheepIteratorTest {
    @Override
    public SheepIterator getSheepIterator(int i) {
        return new SheepIteratorImpl(i);
    }
}
