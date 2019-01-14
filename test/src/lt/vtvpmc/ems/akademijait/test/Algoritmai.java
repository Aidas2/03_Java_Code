package lt.vtvpmc.ems.akademijait.test;

public class Algoritmai {
///// PAGAL SKAIDRES ///// PAGAL SKAIDRES ///// PAGAL SKAIDRES
//4.4. Java: if-the, if-then-else demo 109 psl.

/*class Algoritmai {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}*/

//4.5. Java: switch 109 psl.
/*public class Algoritmai {
    public static void main(String[] args) {
        int choice = 3;
        String chosenString;
        switch (choice) {
            case 1: chosenString= "You choose 1!";
                break;
            case 2: chosenString= "You choose 2!";
                break;
            case 3: chosenString= "You choose 3!";
                break;
            case 4: chosenString= "You choose 4!";
                break;
            default: chosenString= "Invalid choice";
                break;
        }
        System.out.println(chosenString);
    }
}*/

//4.6. Java: while 111 psl.
/*    class Algoritmai {
        public static void main(String[] args){
            int count = 1;
            while (count < 11) {
                System.out.println("Count is: " + count);
                count++;
            }
        }
    }*/

//4.6. Java: do while 112 psl.
/*class Algoritmai {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}*/

/*class Algoritmai {
    public static void main(String args[]) {
        int n = 5;
        do {
            System.out.println("Sample : " + n);
            n--;
        } while(n > 0);
    }
}*/

//4.9. Java: for 113 psl.
/*class Algoritmai {
    public static void main(String[] args){
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
    }
}*/

//4.10. Java: break, continue, return 117 psl.
/*class Algoritmai {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[]{12, 5, 10, 15, 31, 20, 25, 2, 40};
        int searchfor = 25;
        boolean foundIt = false;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                System.out.println(true);
                break;
            }
        }
    }
}*/

//4.10. Java: break, continue, return 117 psl.
/**class Algoritmai {
 public static void main(String[] args) {
 int[] arrayOfInts = new int[]{12, 5, 10, 15, 31, 20, 25, 2, 40};
 int searchfor = 25;
 boolean foundIt = false;
 for (int i = 0; i < arrayOfInts.length; i++) {
 for (int j = 0; j < arrayOfInts[i].length; j++) {
 if (arrayOfInts[i][j] == searchfor) {
 foundIt = true;
 break search;
 }
 }
 }
 }
 }



 for (int i = 0; i < max; i++) { //interested only in p's
 if (searchMe.charAt(i) !='p') {
 continue; //process p's
 numPs++;
 }
 }




 String searchMe = "Look for a substring in me";
 String substring = "sub";
 test:
 for (int i = 0; i < max; i++) { //interested only in p's
 int n = substring.length();
 int j = i;
 int k = 0;
 while (n-- ! = 0) {
 if (searchMe.charAt(j++) !=substring.charAt(k++)) {
 continue test;
 }
 }
 foundIt = true;
 break test;
 }


 public int calculateSum(int []arr) throws InvalidNumberException {
 int sum = 0;
 for (int value : arr ) {
 if (value <= 0 )
 throw new InvalidNumberException("I accept only positive numbers");
 sum += value;
 }
 return sum;
 }



 private static String getGreeting(String name) {
 if (name == null) {
 return "Hello anonymous!";
 } else {
 return "Hello " + name + "!";
 }
 }



 class Storage {
 public void recordValue(long value) {};
 public void recordValue(double value) {};
 public void recordValue(String value) {};
 private long convertValue(String value, int base) {};
 public long getValue() {};
 static public long getCounter() {};
 }*/

}
