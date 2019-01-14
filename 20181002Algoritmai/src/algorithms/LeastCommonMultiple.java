package algorithms;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		System.out.println("The least common multiple is: " + checkLcmOne(12, 8));
	}
	public static long checkGcdTwo(long x, long y){
		   return (y == 0) ? x : checkGcdTwo(y, x % y); 
		}
	public static long checkLcmOne(long a, long b) {
		return a / checkGcdTwo(a, b) * b;
	}
}