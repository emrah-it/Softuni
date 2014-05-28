package Java.SampleContest;

import java.util.Arrays;
import java.util.Scanner;

public class SandGlass {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();

		int leftRightDots = 0;
		int middleStars = n;

		for (int i = 0; i < (n / 2); i++) {
			System.out.println(newString('.', leftRightDots)
					+ newString('*', middleStars)
					+ newString('.', leftRightDots++));
			middleStars -= 2;
		}
		leftRightDots = n / 2;
		middleStars = 1;
		for (int i = 0; i < (n / 2) + 1; i++) {
			System.out.println(newString('.', leftRightDots)
					+ newString('*', middleStars)
					+ newString('.', leftRightDots--));
			middleStars+=2;
		}

	}

	private static String newString(char ch, int repeat) {
		char[] newStrings = new char[repeat];

		Arrays.fill(newStrings, ch);

		return new String(newStrings);
	}

}
