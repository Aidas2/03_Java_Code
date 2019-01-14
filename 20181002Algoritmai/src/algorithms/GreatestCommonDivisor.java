package algorithms;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println("The greatest common divisor is: " + checkGcdOne(12, 8));
		System.out.println("The greatest common divisor is: " + checkGcdTwo(12, 8));
	}

	public static long checkGcdOne(long a, long b) {
		while (a != 0 && b != 0) {
			if (a > b)
				a %= b;
			else
				b %= a;
		}
		return a + b;
	}
	public static long checkGcdTwo(long x, long y){
		   return (y == 0) ? x : checkGcdTwo(y, x % y); 
		}

}
