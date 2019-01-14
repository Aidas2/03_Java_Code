package algorithms;

import java.util.Arrays;

public class SearchMinMaxFive {
	static int min, max;

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 5, -9, 12, -3, 89, 18, 23, 4, -6 };
		long startTime = System.currentTimeMillis();
		System.out.println("Minimum Value = " + minValue(numbers));
		System.out.println("Maximum Value = " + maxValue(numbers));
		System.out.println("Minimum Value = " + getMin(numbers, 0, numbers[0]));
		System.out.println("Maximum Value = " + getMax(numbers, 0, numbers[0]));
		long finishTime = System.currentTimeMillis();
		System.out.println(finishTime - startTime + " mS");
	}

	public static int minValue(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[0];

	}

	public static int maxValue(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length - 1];
	}

	public static int getMax(int[] numbers, int a, int n) {
		return a >= numbers.length ? n : Math.max(n, getMax(numbers, a + 1, numbers[a] > n ? numbers[a] : n));
	}

	private static int getMin(int[] numbers, int a, int n) {
		return a == numbers.length ? n : Math.min(n, getMin(numbers, a + 1, numbers[a] < n ? numbers[a] : n));
	}
}
