package lt.vtvpmc.ems.akademijait.funcional03;
// Stream demo
import java.util.stream.Stream;

/**
 * Hello world !
 */

class Box {
    private float weigth;

    public Box(float weigth) {
        this.weigth = weigth;
    }

    public float getWeigth() {
        return weigth;
    }

    public String toString() {
        return  "Box (" + getWeigth() + ")";
    }
}


public class App {
    public static void main(String[] args) {
        Stream<Box> boxes = Stream.of (
                new Box(0.1f),
                new Box(0.6f),
                new Box(1.1f),
                new Box (0.2f)
        );





        double totalWeight = boxes
                .filter((box) -> box.getWeigth() >= 0.5f)
                .mapToDouble((box) -> box.getWeigth())
                .sum(); // Box (0.6) Box (1.1)

        System.out.println(totalWeight);

    }
}
