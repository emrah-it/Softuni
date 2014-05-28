//Problem 4.	Longest Increasing Sequence
//Write a program to find all increasing sequences inside an 
//array of integers. The integers are given in a single 
//line, separated by a space. Print the sequences in the order 
//of their appearance in the input array, each at a single line. 
//Separate the sequence elements by a space. Find also the longest 
//increasing sequence and print it at the last line. If several 
//sequences have the same longest length, print the leftmost of them. 

package Homework;

import java.util.Scanner;

public class _4_LongestIncreasingSequence {

	public static void main(String[] args) {

		System.out.println("Enter sequence of numbers");
		Scanner input = new Scanner(System.in);

		String[] inputInArray = input.nextLine().split(" ");

		int[] array = getStringAsArray(inputInArray);
		int firstNumber = 0;
		int maxLength = 0;
		for (int i = 0, j; i < array.length; i++) {
			int current = array[i];
			int length = 1;
			int start = i;
			for (j = i + 1; j < array.length; j++) {
				if (current < array[j]) {
					length++;
					current = array[j];
				} else {
					break;
				}
			}
			if (maxLength < length) {
				firstNumber = i;
				maxLength = length;
			}
			i += (j - i) -1 ;
			for (int k = start; k <= i; k++) {
				System.out.print(array[k] + " ");
			}
			System.out.println();
		}

		System.out.print("Longest: ");
		for (int i = firstNumber; i < firstNumber + maxLength; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int[] getStringAsArray(String[] inputInArray) {
		int[] array = new int[inputInArray.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(inputInArray[i]);
		}
		return array;
	}

}
