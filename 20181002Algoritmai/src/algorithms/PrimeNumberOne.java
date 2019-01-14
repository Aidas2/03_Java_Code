package algorithms;

public class PrimeNumberOne {
	public static void main(String[] args) {
		int number = 4;
		System.out.println("The number " + number + " is primary " + checkPrimeNumberOne(number));
		System.out.println("The number " + number + " is primary " + checkPrimeNumberTwo(number));
	}

	public static boolean checkPrimeNumberOne(long number) {
		for (long i = 2; i < number - 1; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static boolean checkPrimeNumberTwo(long number) {
		if (number % 2 == 0)
			return false;
		long max = (long) Math.floor(Math.sqrt(number));
		for (int j = 3; j <= max; j += 2) {
			if (number % j == 0)
				return false;
		}
		return true;
	}

}
