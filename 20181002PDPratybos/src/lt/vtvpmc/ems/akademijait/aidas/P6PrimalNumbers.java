package lt.vtvpmc.ems.akademijait.aidas;

// 6. Programa generuojanti n pirminių skaičių.
public class P6PrimalNumbers {

        public static int[] uzpildykPirminiais(int n) {
            int count = 0;
            int primeNumbers [] = new int [50];
                for (int i = 0; count < n; i++) {
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                        System.out.print(i + " ");
                        count++;
                        primeNumbers[i] = i;
                    }
                }
            System.out.println();
            System.out.println("Sugeneruotu pirminiu skaiciu kiekis yra: " + count);
            //return count;
            return primeNumbers;
        }


        public static int suskaiciuokPirminius (int n) {
            int count = 0;
            for (int i = 0; count < n; i++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    System.out.print(i + " ");
                    count++;
                 }
            }
            System.out.println();
            System.out.println("Sugeneruotu pirminiu skaiciu kiekis yra: " + count);
            return count;

        }
}

