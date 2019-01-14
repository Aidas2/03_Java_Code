package algorithms;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {

		String[] strNames = new String[] { "John", "alex", "Chris", "williams", "Mark", "Bob" };

		Arrays.sort(strNames);
		System.out.println("String array sorted (case sensitive)");
		for (int i = 0; i < strNames.length; i++) {
			System.out.println(strNames[i]);
		}
		Arrays.sort(strNames, String.CASE_INSENSITIVE_ORDER);
		System.out.println("String array sorted (case insensitive)");
		for (int i = 0; i < strNames.length; i++) {
			System.out.println(strNames[i]);
		}
	}
}