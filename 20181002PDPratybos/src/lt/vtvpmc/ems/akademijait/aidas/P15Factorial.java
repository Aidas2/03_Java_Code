package lt.vtvpmc.ems.akademijait.aidas;

// 15. Programa ieškanti n skaičiaus faktorialo.
// faktorialas (Matematika) - natūrinių skaičių sandauga nuo 1 iki pasirinkto natūrinio skaičiaus (imtinai). Žymima šauktuko (!) ženklu.
// pvz., 5 ! = 1 ∗ 2 ∗ 3 ∗ 4 ∗ 5 = 120
public class P15Factorial {
    public static void main (String [] args){
        Factorial(5);
    }

    private static void Factorial(int n) {
        int factorialas = n;
        for (int i = n - 1; i >= 1; i--) {
            factorialas *= i;
        }
        System.out.println(factorialas);
        //return factorialas; // o kaip sia reiksme isvesti i ekrana ?
    }
}


/*
public class Factorial {
    public static long findFactorial(int i) {
        long fact = i;
        for (int j = i - 1; j > 1; j--) {
            fact *= j;
        }
        return fact;
    }
}



*/