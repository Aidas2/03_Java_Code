package algorithms;

import java.util.Arrays;

public class SortingSelection {
	public static void main(String a[]) {

		int[] arrayOne = { 10, 34, 2, 56, 7, 67, 88, 42 };
		int[] arrayTwo = doSelectionSort(arrayOne);
		System.out.println("Unsorted array: \n" + Arrays.toString(arrayOne));
		System.out.println("Sorted array: ");
		for (int i : arrayTwo) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] doSelectionSort(int[] arrayOne) {
		for (int i = 0; i < arrayOne.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arrayOne.length; j++)
				if (arrayOne[j] < arrayOne[index])
					index = j;
			int smallerNumber = arrayOne[index];
			arrayOne[index] = arrayOne[i];
			arrayOne[i] = smallerNumber;
		}
		return arrayOne;
	}
}
