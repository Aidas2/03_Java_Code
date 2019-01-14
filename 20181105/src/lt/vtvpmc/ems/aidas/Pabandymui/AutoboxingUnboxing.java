package lt.vtvpmc.ems.aidas.Pabandymui;

public class AutoboxingUnboxing {
  public static void main(String[] args) {
    autoboxing();
    unboxing();
  }

  public static void autoboxing() {
    int a = 50;
    Integer a2 = new Integer(a);      // Boxing
    Integer a3 = 5;                   // Boxing
    System.out.println(a2 instanceof Integer);
    System.out.println(a3 instanceof Integer);
    System.out.println(a + a3);
    System.out.println(a2 + a3);
    System.out.println(a2 + " " + a3);
  }

  public static void unboxing() {
    Integer i = new Integer(50);
    System.out.println(i instanceof Integer);
    int a = i;
    System.out.println(a + 12);
  }
}
