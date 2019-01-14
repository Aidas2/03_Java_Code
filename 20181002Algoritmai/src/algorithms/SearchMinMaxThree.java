package algorithms;

import java.util.Arrays;

public class SearchMinMaxThree {

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
		int min, max;
		if (a.length == 1) {
			max = a[0];
			min = a[0];
			System.out.println("min array element: " + min + "\nmax array element: " + max);
			return;
		}
		if (a[0] > a[1]) {
			max = a[0];
			min = a[1];
		} else {
			max = a[1];
			min = a[0];
		}
		for (int i = 2; i <= a.length - 1; i++) {
			if (max < a[i]) {
				max = a[i];
			} else if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("min array element: " + min + "\nmax array element: " + max);
	}
}