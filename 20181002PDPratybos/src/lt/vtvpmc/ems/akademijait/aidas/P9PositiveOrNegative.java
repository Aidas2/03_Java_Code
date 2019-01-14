package lt.vtvpmc.ems.akademijait.aidas;

public class P9PositiveOrNegative {
    public static void main (String [] args) {
        PositiveOr(-10);
    }

    private static void PositiveOr(int number) {
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0 ) {
            System.out.println("Number is negative");
        } else {
            System.out.println("You entered zero");
        }
    }
}
