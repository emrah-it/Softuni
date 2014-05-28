//Problem 11.	Most Frequent Word
//Write a program to find the most frequent word in a text and 
//print it, as well as how many times it appears in format 
//"word -> count". Consider any non-letter character as a word 
//separator. Ignore the character casing. If several words have the 
//same maximal frequency, print all of them in alphabetical order. 

package Homework;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		System.out.println("Please enter text.");
		Scanner input = new Scanner(System.in);

		String[] allWordStrings = input.nextLine().split("[,|\\\\.|)|(|!|?|&|/|=|:|+|\'|\"|<|>|\\|;|@|#|$|%|^|*|\\s]");

		Map<String, Integer> allWordsCounted = countAllWords(allWordStrings);
		int maxReapeat = Integer.MIN_VALUE;
		String wordString;
		for (Map.Entry<String, Integer> entry : allWordsCounted.entrySet())
		{
			if(entry.getValue() > maxReapeat){
				maxReapeat = entry.getValue();
			}
		}
		
		for (Map.Entry<String, Integer> entry : allWordsCounted.entrySet())
		{
			if(entry.getValue() == maxReapeat){
				System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
			}
		}

	}

	private static Map<String, Integer> countAllWords(String[] allWordStrings) {
		Map<String, Integer> wordCounter = new HashMap<String, Integer>();

		for (int i = 0; i < allWordStrings.length; i++) {
			if (!allWordStrings[i].toLowerCase().equals("")) {
				if (wordCounter.containsKey(allWordStrings[i].toLowerCase())) {
					wordCounter.put(allWordStrings[i].toLowerCase(),
							wordCounter.get(allWordStrings[i]) + 1);
				} else {
					wordCounter.put(allWordStrings[i].toLowerCase(), 1);
				}
			}
		}

		return wordCounter;
	}

}
