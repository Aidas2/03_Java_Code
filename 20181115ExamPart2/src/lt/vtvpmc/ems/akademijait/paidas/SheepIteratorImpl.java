package lt.vtvpmc.ems.akademijait.paidas;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;
import lt.vtvpmc.sheep.SheepIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SheepIteratorImpl implements SheepIterator {
    private  final static Logger logger = LoggerFactory.getLogger(SheepIteratorImpl.class);
    private int iterator;
    private int position;

    public SheepIteratorImpl(int iterator) {
        this.iterator = iterator;
        logger.info("New SheepIteratorImpl");
    }

    @Override
    public boolean hasNext() {
        logger.info("Next position: true");
        return iterator > position;
    }

    @Override
    public Sheep next() {
        if (this.position %2 == 0) {
            position++;
            MyOwnSheep sheep = new MyOwnSheep(SheepColor.WHITE, "Dolly");
            logger.info("Sheep created. Sheep color: white. Sheep name: Dolly.");
            return sheep;
        } else {
            position++;
            MyOwnSheep sheep = new MyOwnSheep(SheepColor.BLACK, "Jack");
            logger.info("Sheep created. Sheep color: black. Sheep name: Jack.");
            //mismatch with adoc: "All BLACK sheep should have a name "John ..."
            return sheep;
        }
    }
}
