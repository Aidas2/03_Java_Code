package lt.vtvpmc.ems.akademijait.aidas;

// 18. Jums suteiktas trijų skaitmenų sveikasis skaičius (t. y. sveikas skaičius nuo 100 iki 999). Raskite jo skaitmenų sumą.
public class P18ThreeDigits {
    public static void main(String [] args) {
        SumOfDigits(456);
    }

    public static int SumOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            System.out.print(number % 10 + " ");
            count += number%10;
            number = number / 10;
        }
        System.out.println();
        System.out.println("Sum is: " + count);
        return count;

    }

}
