package algorithms;

import java.util.Scanner;

public class GcmLcm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println("The GCD of two numbers is: " + gcd(x, y));
		System.out.println("The LCM of two numbers is: " + lcm(x, y));
		input.close();
	}

	static int gcd(int x, int y) {
		int r = 0, a, b;
		a = (x > y) ? x : y;
		b = (x < y) ? x : y;
		r = b;
		while (a % b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}

	static int lcm(int x, int y) {
		int a;
		a = (x > y) ? x : y;
		while (true) {
			if (a % x == 0 && a % y == 0)
				return a;
			++a;
		}
	}

}