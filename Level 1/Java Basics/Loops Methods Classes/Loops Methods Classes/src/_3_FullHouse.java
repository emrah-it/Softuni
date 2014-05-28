//Problem 3.	Full House
//In most Poker games, the "full house" hand is defined as three cards of the same
//face + two cards of the same face, other than the first, regardless of the
//card's suits. The cards faces are "2", "3", "4", "5", "6", "7", "8", "9", "10",
//"J", "Q", "K" and "A". The card suits are "♣", "♦", "♥" and "♠". Write a
//program to generate and print all full houses and print their number.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.print.attribute.HashAttributeSet;

import org.junit.*;

public class _3_FullHouse {

	static private int max = 100;
	static private int n;
	static private int k;
	static private int[] array = new int[max];
	static private int counter = 0;
	static private boolean cardCombination = false;

	static private String[] allCards = { "2", "3", "4", "5", "6", "7", "8",
			"9", "10", "J", "Q", "K", "A" };
	static private String[] allColors = { "♣", "♦", "♥", "♠" };
	static private List<String> allCardCombination = new ArrayList<String>();

	// static private Set<String> allPosibleCombSet = new HashSet<String>();
	static private Set<String> endCardCombinations = new HashSet<String>();

	// static private Set<String> allColorCombinationToCheck = new
	// HashSet<String>();
	static private Set<String> colorCombinationStrings = new HashSet<String>();

	static private Set<String> result = new HashSet<String>();;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		n = allCards.length;
		k = 5;
		cardCombination = true;
		Variate(0);
			
		n = allColors.length;
		cardCombination = false;
		Variate(0);
		
		getFullHous(endCardCombinations, colorCombinationStrings);
		result.stream().sorted((p1,p2)-> p1.compareTo(p2));
		
		List<String> newResult = new ArrayList<String>();
		newResult.addAll(result);
		Collections.sort(newResult);
		writeToFile(new File("fullHouse.txt"), newResult);
		
		System.out.println(counter);

	}

	private static void getFullHous(Set<String> cards, Set<String> colors) {
		// TODO Auto-generated method stub
		Iterator<String> cardIterator = cards.iterator();
		while (cardIterator.hasNext()) {

			String[] splitedCardsStrings = cardIterator.next().split(" ");
			Iterator<String> colorIterator = colors.iterator();
			while (colorIterator.hasNext()) {
				String[] splitedColorsStrings = colorIterator.next().split(" ");
				String currentResultString = "";
				for (int i = 0; i < splitedCardsStrings.length; i++) {
					currentResultString += splitedCardsStrings[i]
							+ splitedColorsStrings[i] + " ";
				}
				System.out.println(currentResultString);
				result.add(currentResultString);
			}
		}
	}

	private static void writeToFile(File fileName, List<String> toPrint) {
		try {
			FileWriter writer = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			Iterator<String> curreIterator = toPrint.iterator();
			while (curreIterator.hasNext()) {
				bufferedWriter.write(curreIterator.next());
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void Variate(int i) {
		if (i >= k) {
			if (cardCombination) {
				checkIsItFullHouse();
			} else {
				checkColorCombination();
			}
			return;
		}
		for (int j = 0; j < n; j++) {
			array[i] = j;
			Variate(i + 1);
		}
	}

	private static void checkColorCombination() {
		Map<String, Integer> currentCards = new HashMap<String, Integer>();
		String[] arrayFromColors = new String[5];
		for (int i = 0; i < 5; i++) {
			arrayFromColors[i] = allColors[array[i]];
			if (currentCards.containsKey(allColors[array[i]])) {
				currentCards.put(allColors[array[i]],
						currentCards.get(allColors[array[i]]) + 1);
			} else {
				currentCards.put(allColors[array[i]], 1);
			}
		}

		Arrays.sort(arrayFromColors);
		colorCombinationStrings.add((String.join(" ", arrayFromColors)));
		// }

	}

	static void checkIsItFullHouse() {
		Map<String, Integer> currentCards = new HashMap<String, Integer>();
		String[] arrayFromColors = new String[5];
		for (int i = 0; i < 5; i++) {
			arrayFromColors[i] = allCards[array[i]];
			if (currentCards.containsKey(allCards[array[i]])) {
				currentCards.put(allCards[array[i]],
						currentCards.get(allCards[array[i]]) + 1);
			} else {
				currentCards.put(allCards[array[i]], 1);
			}
		}
		boolean treeCard = false;
		boolean twoCard = false;

		for (String key : currentCards.keySet()) {
			if (currentCards.get(key) == 3) {
				treeCard = true;
			} else if (currentCards.get(key) == 2) {
				twoCard = true;
			}
		}
		Arrays.sort(arrayFromColors);

		if (treeCard && twoCard) {
			endCardCombinations.add(String.join(" ", arrayFromColors));
		}

	}

}
