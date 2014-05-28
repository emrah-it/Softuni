//Problem 2.	Sequences of Equal Strings
//Write a program that enters an array of strings and finds in it all sequences of 
//equal elements. The input strings are given as a single line, separated by a space. Examples:


package Homework;

import java.util.Scanner;

public class _2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		System.out.println("Enter sequence of words");
		Scanner input = new Scanner(System.in);
		
		
		String[] allWords = input.nextLine().split(" ");
		
		System.out.print(allWords[0]);
		for (int i = 1; i < allWords.length; i++) {
			if(!allWords[i -1].equals(allWords[i])){
				System.out.println();
				System.out.print(allWords[i]);
			}
			else{
				System.out.print(" " + allWords[i]);
			}
		}

	}

}
