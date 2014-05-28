//Problem 6.	Random Hands of 5 Cards
//Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards. Examples:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _6_RandomHandsOf5Cards {

	static private String[] allCards = { "2", "3", "4", "5", "6", "7", "8",
			"9", "10", "J", "Q", "K", "A" };
	static private String[] allColors = { "♣", "♦", "♥", "♠" };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of combination of cards");
		int combination = input.nextInt();

		String cards = "";
		for (int i = 0; i < combination; i++) {
			cards += getCombinations() + "\n";
		}
		System.out.println(cards);

	}

	private static String getCombinations() {
		List<String[]> cards = new ArrayList<String[]>();

		for (int i = 0; i < 5; i++) {
			String[] temp = new String[2];
			temp[0] = allCards[getRandomNumber(0, allCards.length - 1)];
			temp[1] = allColors[getRandomNumber(0, allColors.length - 1)];
			if (isExist(cards, temp)) {
				i--;
				continue;
			} else {
				cards.add(temp);
			}
		}

		String returnValue = "";
		for (int i = 0; i < cards.size(); i++) {
			returnValue += cards.get(i)[0] + cards.get(i)[1] + " ";
		}
		return returnValue;
	}

	private static boolean isExist(List<String[]> cards, String[] temp) {
		for (int j = 0; j < cards.size(); j++) {
			if (cards.get(j)[0].equals(temp[0])
					&& cards.get(j)[1].equals(temp[1])) {
				return true;
			}
		}

		return false;
	}

	public static int getRandomNumber(int start, int end) {
		double returnValue = Math.random() * (start + end) + 1;
		returnValue -= start;
		return (int) returnValue;
	}
}
