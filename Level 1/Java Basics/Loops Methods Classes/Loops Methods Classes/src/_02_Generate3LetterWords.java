//Problem 2.	Generate 3-Letter Words
//Write a program to generate and print all 3-letter words consisting
//of given set of characters. For example if we have the characters 'a'
//and 'b', all possible words will be "aaa", "aab", "aba", "abb", "baa",
//"bab", "bba" and "bbb". The input characters are given as string at the
//first line of the input. Input characters are unique (there are no
//repeating characters).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_Generate3LetterWords {

	static private int max = 3;
	static private int n;
	static private int k = 3;
	static private int[] array = new int[max];
	static private List<String> allComb = new ArrayList<String>();
	static private String inputString;

	public static void main(String[] args) {
		System.out.println("Enter 1, 2 or 3 letter");
		Scanner input = new Scanner(System.in);

		inputString = input.nextLine();
		n = inputString.length();
		variate(0);

		String output = String.join(", ", allComb);

		System.out.println(output);
		// String
	}

	private static void variate(int i) {
		if (i >= k) {
			addInArray();
			return;
		}

		for (int j = 0; j < n; j++) {
			array[i] = j;
			variate(i + 1);
		}
	}

	private static void addInArray() {
		String newString = "";
		for (int i = 0; i < array.length; i++) {
			newString += inputString.charAt(array[i]);
		}

		allComb.add(newString);
	}
}
