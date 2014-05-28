//Problem 12.	Cards Frequencies
//We are given a sequence of N playing cards from a standard deck. The input 
//consists of several cards (face + suit), separated by a space. 
//Write a program to calculate and print at the console the frequency 
//of each card face in format "card_face -> frequency". The 
//frequency is calculated by the formula appearances / N and is 
//expressed in percentages with exactly 2 digits after the decimal 
//point. The card faces with their frequency should be printed in the 
//order of the card face's first appearance in the input. The same card 
//can appear multiple times in the input, but it's face should be listed only once in the output. 

package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {

	public static void main(String[] args) {
		System.out
				.println("Please enter all cards separeated with whitespaces");
		Scanner input = new Scanner(System.in);

		String clearCards = removeColors(input.nextLine());
		Map<String, Integer> countedCards = countAllCards(clearCards.split(" "));
		int totalCards = countTotalCards(countedCards);
		Map<String, Double> cardsPerPerscent = calculatePercents(countedCards,
				totalCards);

		for (Map.Entry<String, Double> entry : cardsPerPerscent.entrySet()) {

			System.out.println(entry.getKey() + " -> "
					+ String.format("%.2f", entry.getValue()) + "%");
		}

	}

	private static Map<String, Double> calculatePercents(
			Map<String, Integer> countedCards, int totalCards) {

		double oneCardPersent = 100.0 / (double) totalCards;
		Map<String, Double> cardsWithPersents = new HashMap<String, Double>();

		for (Map.Entry<String, Integer> entry : countedCards.entrySet()) {

			cardsWithPersents.put(entry.getKey(),
					oneCardPersent * entry.getValue());
		}

		return cardsWithPersents;
	}

	private static int countTotalCards(Map<String, Integer> countedCards) {
		int totalCards = 0;
		for (Map.Entry<String, Integer> entry : countedCards.entrySet()) {

			totalCards += entry.getValue();
		}
		return totalCards;
	}

	private static String removeColors(String input) {
		String[] allColorsString = new String[] { "♥", "♣", "♦", "♠" };
		for (int i = 0; i < allColorsString.length; i++) {
			input = input.replaceAll(allColorsString[i], "");
		}

		return input;
	}

	private static Map<String, Integer> countAllCards(String[] allCards) {
		Map<String, Integer> wordCounter = new HashMap<String, Integer>();

		for (int i = 0; i < allCards.length; i++) {
			if (!allCards[i].toLowerCase().equals("")) {
				if (wordCounter.containsKey(allCards[i].toLowerCase())) {

					wordCounter.put(allCards[i].toLowerCase(),
							wordCounter.get(allCards[i].toLowerCase()) + 1);
				} else {
					wordCounter.put(allCards[i].toLowerCase(), 1);
				}
			}
		}

		return wordCounter;
	}

}
