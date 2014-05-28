//Problem 3.	Largest Sequence of Equal Strings
//Write a program that enters an array of strings and finds in it the 
//largest sequence of equal elements. If several sequences 
//have the same longest length, print the leftmost of them. 
//The input strings are given as a single line, separated by a space. 

package Homework;

import java.util.Scanner;

public class _3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		System.out.println("Enter sequence of words");
		Scanner input = new Scanner(System.in);

		String[] array = input.nextLine().split(" ");

		int sequense = 1;
		String solution = "";
		int maxPoint = 0;
		for (int i = 0; i < array.length; i++) {
			String currentNumber = array[i];
			int points = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (currentNumber.equals(array[j])) {
					points++;
				} else {
					break;
				}
			}
			if (points > maxPoint) {
				solution = array[i];
				maxPoint = points;
			}
		}
		for (int i = 0; i < maxPoint; i++) {
			
			System.out.print(solution );
			if(i != maxPoint -1){
				System.out.print(" ");
			}
		}
	}
}
