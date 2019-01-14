package lt.vtvpmc.ems.akademijait.aidas;

public class Main {
    public static void main (String [] args){
// byte(1), short(2), int(4), long(8)
// boolean(1), char(2). float(4), double(8)
//        byte a = 100;
//        System.out.println("a = " + a);
//        printBinary(a, 8);
//        byte b = 28;
//        System.out.println("b = " + b);
//        printBinary(b, 8);
//        byte c = (byte)(a + b);
//          printBinary(c, 8);
//        System.out.println(c);

        // double db1 = 123456789.2;
        // System.out.print(db1);
        // System.out.print(Double.MAX_VALUE);

        int a = 10;
        //System.out.println("a =  " + a);
        printBinary(a,32);
        int b = 28;
        //System.out.println("b =  " + b);
        printBinary(b, 32);
        int c = a << b;
          printBinary(c, 32);
        System.out.println(c);
    }

    private static void printBinary(int value, int size) {
        for (int i = size - 1; i >=0; i--) {
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);

        }
        System.out.println();
    }

}
