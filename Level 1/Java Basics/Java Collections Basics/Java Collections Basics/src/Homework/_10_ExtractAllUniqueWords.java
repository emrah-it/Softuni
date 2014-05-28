//Problem 10.	Extract All Unique Words
//At the first line at the console you are given a piece of text. 
//Extract all words from it and print them in alphabetical order. 
//Consider each non-letter character as word separator. Take the 
//repeating words only once. Ignore the character casing. Print 
//the result words in a single line, separated by spaces




package Homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		System.out.println("Enter text to get unique numbers");
		Scanner input = new Scanner(System.in);
		
		String inputString = input.nextLine();
		String[] allUniqueWordsList = getAllWords(inputString);
		System.out.println(String.join(" ", allUniqueWordsList));

	}

	private static String[] getAllWords(String inputString) {
		Set<String> allWords = new HashSet<String>();
		
		String[] allWordStrings = inputString.split("[,|\\\\.|)|(|!|?|&|/|=|:|+|\'|\"|<|>|\\|;|@|#|$|%|^|*|\\s]");
		int counter = 0;
		for (int i = 0; i < allWordStrings.length; i++) {
			if(!allWordStrings[i].equals("")){
				allWords.add(allWordStrings[i].toLowerCase());
			}
		}
		
		
		return allWords.toArray(new String[allWords.size()]);
	}
	

}
