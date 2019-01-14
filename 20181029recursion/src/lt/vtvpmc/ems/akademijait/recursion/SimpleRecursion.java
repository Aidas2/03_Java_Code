package lt.vtvpmc.ems.akademijait.recursion;

public class SimpleRecursion {
    public static void main(String[] args) {
        System.out.println("Recursion start");
        simpleRecursionCounter(1);
    }

    public static void recursionEcho(int number) {
        System.out.println("First recursionEcho section " + number);
        simpleRecursionCounter(number);
        System.out.println("Second recursionEcho section " + number);

    }

    public static void simpleRecursionCounter (int number) {
        number ++;
        System.out.println("First recursion section " + number);
        if (number != 10) {
            //simpleRecursionCounter(number);
            recursionEcho(number);
        }
        System.out.println("Second recursion section " + number);
    }

}
