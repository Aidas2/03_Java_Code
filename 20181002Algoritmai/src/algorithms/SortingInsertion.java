package algorithms;

import java.util.Arrays;

public class SortingInsertion {
	public static void main(String a[]) {
		int[] arrayOne = { 10, 34, 2, 56, 7, 67, 88, 42 };
		System.out.println("Unsorted array: \n" + Arrays.toString(arrayOne));
		System.out.println("Sorted array: ");
		int[] arrayTwo = doInsertionSort(arrayOne);
		for (int i : arrayTwo) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] doInsertionSort(int[] arrayOne) {
		int temp;
		for (int i = 1; i < arrayOne.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arrayOne[j] < arrayOne[j - 1]) {
					temp = arrayOne[j];
					arrayOne[j] = arrayOne[j - 1];
					arrayOne[j - 1] = temp;
				}
			}
		}
		return arrayOne;
	}
}
