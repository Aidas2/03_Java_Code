import java.util.Random;

public class RandomNumbers {
    public static int generate(long seed) {
        Random random = new Random(seed);
        return random.nextInt();
    }
}
