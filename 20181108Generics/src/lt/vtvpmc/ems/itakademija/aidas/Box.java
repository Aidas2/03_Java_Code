package lt.vtvpmc.ems.itakademija.aidas;

public class Box <T>{
    private final T left;
    private final T right;

    public Box(final T left, final T right) { //sugeneruotas konstruktorius
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}
