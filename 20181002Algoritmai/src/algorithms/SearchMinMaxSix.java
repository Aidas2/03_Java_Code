package algorithms;

import java.util.Arrays;
import java.util.Collections;

public class SearchMinMaxSix {

	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("Min number in array: " + min);
		System.out.println("Max number in array: " + max);
		mathMethod();
	}
	public static void mathMethod(){
		System.out.println("Max int number (10, 20): " + Math.max(10, 20));
		System.out.println("Min float number (1.5f, 8f): " + Math.min(1.5f, 8f));
	}
	
}
