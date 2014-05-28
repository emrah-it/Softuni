//Problem 7.	Count Substring Occurrences
//Write a program to find how many times given string appears in 
//given text as substring. The text is given at the first 
//input line. The search string is given at the second 
//input line. The output is an integer number. 
//Please ignore the character casing. 

package Homework;

import java.util.Scanner;

public class _7_CountSubstringOccurrences {

	public static void main(String[] args) {
		System.out.println("Please enter text to search into");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();

		System.out.println("Enter substring to search");
		String substr = input.nextLine();

		int counter = 0;
		int firstIndex = 0;
		while (true) {
			if (text.toLowerCase().indexOf(substr.toLowerCase(), firstIndex) != -1) {
				counter++;
				firstIndex = text.toLowerCase().indexOf(substr.toLowerCase(),
						firstIndex) + 1;
			} else {
				break;
			}
		}
		System.out.println(counter);

	}

}
