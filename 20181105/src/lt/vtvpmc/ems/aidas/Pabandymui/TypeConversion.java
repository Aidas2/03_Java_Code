package lt.vtvpmc.ems.aidas.Pabandymui;

public class TypeConversion {
  public static void main(String[] args) {
//    implicitCasting();
//    explicitCasting();
//    basicCastingOperation();
//    nonNumericPrimitiveCasting();
//    objectCasting();
  }

  public static void implicitCasting(){
    byte byteValue = 122;
    System.out.println(byteValue);
    short shortValue = byteValue;
    System.out.println(shortValue);
    int intValue = shortValue;
    System.out.println(intValue);
    long longValue = intValue;
    System.out.println(longValue);
    float floatValue = longValue;
    System.out.println(floatValue);
    double doubleValue = floatValue;
    System.out.println(doubleValue);
  }

  public static void explicitCasting(){
    double doubleValue = 122.0d;
    System.out.println(doubleValue);
    float floatValue = (float) doubleValue;
    System.out.println(floatValue);
    long longValue = (long) floatValue;
    System.out.println(longValue);
    int intValue = (int) longValue;
    System.out.println(intValue);
    short shortValue = (short) intValue;
    System.out.println(shortValue);
    byte byteValue = (byte) shortValue;
    System.out.println(byteValue);
  }

  public static void basicCastingOperation(){
    char charOne = 1;
    char chartwo = 2;
    short shortOne = 1;
    short shortTwo = 2;
    int intOne = 1;
    int intTwo = 2;
    float floatOne = 1.0f;
    float floatTwo = 2.0f;
//    char charResult = charOne + chartwo;
//    short shortResult = shortOne + shortTwo;
    int intResultOne = charOne + chartwo;
    System.out.println(intResultOne);
    int intResultTwo = shortOne + shortTwo;
    System.out.println(intResultTwo);
    int intResultThree = charOne + shortTwo;
    System.out.println(intResultThree);
    int intResultFour = intOne + intTwo;
    System.out.println(intResultFour);
    float floatResult = shortOne + floatTwo;
    System.out.println(floatResult);
  }

  public static void nonNumericPrimitiveCasting(){
//    int badInteger = (int) true;
    char charOne = (char) 66; // B
    System.out.println(charOne);
    byte byteOne = (byte) 'B'; // 66
    System.out.println(byteOne);
    short shortOne = (short) 'B'; // 66
    System.out.println(shortOne);
    int intOne = (int) 'B'; // 66
    System.out.println(intOne);
    char charTwo = (char) 8258; // ⁂
    System.out.println(charTwo);
    byte byteTwo = (byte) '⁂'; // 61 (truncated code-point into the ASCII range)
    System.out.println(byteTwo);
    short shortTwo = (short) '⁂'; // 8258
    System.out.println(shortTwo);
    int intTwo = (int) '⁂'; // 8258
    System.out.println(intTwo);
  }

  public static void objectCasting(){
    Float floatValue = new Float(122.0f);
    Number number = floatValue; //Implicit (Float implements Number)
    Float floatValueTwo = (Float) number; //Explicit
    Double doubleValue = (Double) number; //Throws exception (the object is not Double)
  }
}
