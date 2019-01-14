import java.util.Scanner;

public class ReadFromCommandLine1 {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String str = scanner.nextLine();
        return str;
    }
}
