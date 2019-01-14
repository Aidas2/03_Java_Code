package lt.vtvpmc.ems.akademijait.aidas;

// 8. Programa generuojanti atvirkštinį String.
public class P8ReverseString {
    public static void main (String [] args) {
        Reverse();
    }

    private static void Reverse() {
        String tekstas = "Akademija IT";
        for (int i = tekstas.length()-1; i >= 0; i--) {
                System.out.print(tekstas.charAt(i));
        }
    }
}
