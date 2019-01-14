package lt.vtvpmc.ems.akademijait.test;

/*public class HelloWorld {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello Words twice");
        }
    }
}*/

/*  arba
if (args.length == 0) {
	System.out.println("Hello Words twice");
}
else {
	System.out.println("Hello " + args[0]);
}*/

///// PAGAL SKAIDRES ///// PAGAL SKAIDRES ///// PAGAL SKAIDRES

//3.1. Paprasčiausios Java programos struktūra 39 psl.
/*class HelloWorld {
    public static void main(String[] args) {
// Prints "Hello, World" to the terminal window.
        System.out.println("3.1 Hello World!");
    }
}*/

//3.4. Java kintamųjų tipai 46 psl.
/*class HelloWorld {
    // Lokali konstanta
    private final String NAME = "DEMO APPLICATION";
    // Objekto kintamasis (instance variable)
    private String objectDescription;
    // Statinis klases kintamasis (class variable)
    public static int counter = 0;
    public static void main(String[] args) {
// Vietinis metodo kintamasis
        String defaultName = "Pasauleli";
// Vietinis ciklo kintamasis
        for (int i = 0; i < args.length; i++)
            System.out.println("Hello, " + args[i]);
        if (args.length == 0)
            System.out.println("Hello, " + defaultName);
    }
}*/

//3.7. Java blokai: blocks 49 psl.
/*class HelloWorld {
    public static void main(String[] args) {
        boolean condition = true;
        if (condition) { // begin block 1
            System.out.println("Condition is true.");
        } // end block one
        else { // begin block 2
            System.out.println("Condition is false.");
        } // end block 2
    }
}*/

// 3.15 Java operatoriai JavaOperatorsAritmetic 73 psl.
/*public class HelloWorld {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
    }
}*/

//3.15. Java operatoriai JavaOperatorsRelational 75 psl.
/*public class HelloWorld {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
    }
}*/

//3.15. Java operatoriai JavaOperatorsBitwise (nieko nesupratau) 77 psl.
//    public class HelloWorld {
//        public static void main(String[] args) {
//            int a = 60; /*60 = 0011 1100*/
//            int b = 13; /*13 = 0000 1101*/
//            int c = 0;
//            c = a & b; /*12 = 0000 1100*/
//            System.out.println("a & b = " + c );
//            c = a | b; /*61 = 0011 1101*/
//            System.out.println("a | b = " + c );
//            c = a ^ b; /*49 = 0011 0001*/
//            System.out.println("a ^ b = " + c );
//            c = ~a; /*-61 = 1100 0011*/
//            System.out.println("~a = " + c );
//            c = a << 2; /*240 = 1111 0000*/
//            System.out.println("a << 2 = " + c );
//            c = a >> 2; /*15 = 1111*/
//            System.out.println("a >> 2 = " + c );
//            c = a >>> 2; /*15 = 0000 1111*/
//            System.out.println("a >>> 2 = " + c );
//        }
//    }

//3.15. Java operatoriai JavaOperatorsLogical 79 psl.
/*public class HelloWorld {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
    }
}*/

//3.15. Java operatoriai JavaOperatorsAssignment 82 psl.
/*public class HelloWorld {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c );
    }
}*/

//3.15. Java operatoriai JavaOperatorsAssignment1 83 psl.
/*public class HelloWorld {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 0;
        c <<= 2;
        System.out.println("c <<= 2 = " + c );
        c >>= 2;
        System.out.println("c >>= 2 = " + c );
        c >>= 2;
        System.out.println("c >>= 2 = " + c );
        c &= a;
        System.out.println("c &= a = " + c );
        c ^= a;
        System.out.println("c ^= a = " + c );
        c |= a;
        System.out.println("c |= a = " + c );
    }
}*/

//3.19. Java klasė Math 96 psl.
/*class HelloWorld {
    public static void main(String[] args) {
        double pow = Math.pow(2,2);
        System.out.println("pow = " + pow);
        double sqrt = Math.sqrt(4);
        System.out.println("sqrt = " + sqrt);
        System.out.println(Math.random());
        System.out.println(Math.random()+3);
        System.out.println(Math.random()*5);
        System.out.println( (int)(Math.random()*5));
        System.out.println(Math.random()*5+3);
        System.out.println( (int)(Math.random()*5+3));
        System.out.println( (int)(Math.random()*11) - 5);
    }
}*/

//3.20. Java masyvai: arrays 101 psl.
public class HelloWorld {
    public static void main(String[] args) {
        int [] OneDimensionalArray1 = { 1, 2, 3 };
        int [] oneDimensionalArray2 = { 4, 5, 6, 7 };
        int [] oneDimensionalArray3 = { 8, 9, 10, 11, 12 };
        int [][] twoDimensionalArray = { OneDimensionalArray1,
                oneDimensionalArray2, oneDimensionalArray3 };
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

