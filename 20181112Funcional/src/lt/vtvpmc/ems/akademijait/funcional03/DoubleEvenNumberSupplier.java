package lt.vtvpmc.ems.akademijait.funcional03;

import java.util.function.Supplier;

public class DoubleEvenNumberSupplier implements Supplier<Integer> {

    private int doubleEvenNumber;

    @Override
    public Integer get() {
        return ++doubleEvenNumber * 2;
    }
}
