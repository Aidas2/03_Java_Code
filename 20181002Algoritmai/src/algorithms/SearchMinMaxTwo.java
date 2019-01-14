package algorithms;

import java.util.Arrays;

public class SearchMinMaxTwo {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Array: " + Arrays.toString(array));
		long startTime = System.currentTimeMillis();
		minmax(array);
		long finishTime = System.currentTimeMillis();
		System.out.println(finishTime - startTime + " mS");
	}

	public static void minmax(int[] a) {
		if (a == null || a.length < 1)
			return;
		int min = a[0];
		int max = a[0];
		for (int i = 1; i <= a.length - 1; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("min array element: " + min + "\nmax array element: " + max);
	}
}
