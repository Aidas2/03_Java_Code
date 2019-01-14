package algorithms;

import java.util.Arrays;

public class SearchMinMaxFour {

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
		for (int i = 2; i <= a.length - 2;) {
			if (a[i] > a[i + 1]) {
				min = Math.min(min, a[i + 1]);
				max = Math.max(max, a[i]);
			} else {
				min = Math.min(min, a[i]);
				max = Math.max(max, a[i + 1]);
			}
			i = i + 2;
		}
		if (a.length % 2 == 1) {
			min = Math.min(min, a[a.length - 1]);
			max = Math.max(max, a[a.length - 1]);
		}
		System.out.println("min array element: " + min + "\nmax array element: " + max);
	}
}