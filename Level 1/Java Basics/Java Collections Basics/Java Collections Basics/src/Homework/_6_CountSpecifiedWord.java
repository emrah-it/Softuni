//Problem 6.	Count Specified Word
//Write a program to find how many times a word appears in given text. The 
//text is given at the first input line. The target word is given at the 
//second input line. The output is an integer number. Please ignore the character 
//casing. Consider that any non-letter character is a word separator. 

package Homework;

import java.util.Scanner;

public class _6_CountSpecifiedWord {

	public static void main(String[] args) {
		System.out.println("Please enter text");
		Scanner input = new Scanner(System.in);
		String[] allWordStrings = input.nextLine().split(
				"[,|\\\\.|)|(|!|?|&|/|=|:|+|\'|\"|<|>|\\|;|@|#|$|%|^|*|\\s]");
		System.out.println("Enter word to count");
		String word = input.nextLine();
		int counter = 0;
		for (int i = 0; i < allWordStrings.length; i++) {
			if (allWordStrings[i].toLowerCase().equals(word.toLowerCase())) {
				counter++;
			}
		}

		System.out.println(counter);
	}

}
