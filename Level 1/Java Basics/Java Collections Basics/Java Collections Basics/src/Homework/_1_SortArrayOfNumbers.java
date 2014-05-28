//Problem 1.	Sort Array of Numbers
//Write a program to enter a number n and n integer numbers and sort and 
//print them. Keep the numbers in array of integers: int[]. 


package Homework;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter n, and then in second line enter n numbers,\nsepareted with whitespaces");
		int n = Integer.parseInt(input.nextLine());
		List<String> allNumbers = new ArrayList<String>();
		allNumbers.addAll(Arrays.asList(input.nextLine().split(" ")));

		allNumbers
				.sort((p1, p2) -> Integer.parseInt(p1) - Integer.parseInt(p2));

		System.out.println(String.join(", ", allNumbers));

	}

	private static int[] parseNumbers(String[] inputLine) {
		int[] returnValue = new int[inputLine.length];

		for (int i = 0; i < returnValue.length; i++) {
			returnValue[i] = Integer.parseInt(inputLine[i]);
		}

		return returnValue;
	}

}
