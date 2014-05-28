package Homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class _9_CombineListsOfLetters {

	public static void main(String[] args) {
		System.out.println("Enter chars separeted with whitespasec");
		Scanner input = new Scanner(System.in);
		String[] firstArrayStrings = input.nextLine().split(" ");

		System.out.println("Enter second chars separeted with whitespasec");
		String[] secondArray = input.nextLine().split(" ");

		String[] returnValue = CombineTwoStrings(firstArrayStrings, secondArray);
		System.out.println(String.join(" ", returnValue));
	}

	private static String[] CombineTwoStrings(String[] firstArrayStrings,
			String[] secondArray) {
		List<String> arrayList = new ArrayList<String>(Arrays.asList(firstArrayStrings));
		for (int i = 0; i < secondArray.length; i++) {
			if(!arrayList.contains(secondArray[i])){
				arrayList.add(secondArray[i]);
			}
		}
		
		
		
		return arrayList.toArray(new String[arrayList.size()]);

	}

	private static void addToHashSet(Set<String> allChars,
			String[] array) {
		for (int i = 0; i < array.length; i++) {
			allChars.add(array[i]);
		}

	}

}
