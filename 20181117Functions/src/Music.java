public class Music {
    private static Music ourInstance = new Music();

    public static Music getInstance() {
        return ourInstance;
    }

    private Music() {
    }
}
