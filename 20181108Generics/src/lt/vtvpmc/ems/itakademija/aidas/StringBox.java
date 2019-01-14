package lt.vtvpmc.ems.itakademija.aidas;

public class StringBox {
    private final Integer left;
    private final String right;

    public StringBox(Integer left, String right) { //sugeneruotas konstruktorius
        this.left = left;
        this.right = right;
    }

    public Integer getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }
}
