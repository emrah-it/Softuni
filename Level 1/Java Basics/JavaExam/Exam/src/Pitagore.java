import java.util.Arrays;
import java.util.Scanner;

public class Pitagore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());

		int[] allInputNumbers = new int[n];

		boolean haveResult = false;

		for (int i = 0; i < n; i++) {
			allInputNumbers[i] = Integer.parseInt(input.nextLine());
		}

		for (int i = 0; i < allInputNumbers.length; i++) {
			for (int j = i ; j < allInputNumbers.length; j++) {

				int firstNumber = allInputNumbers[i] * allInputNumbers[i];
				int secondNumber = allInputNumbers[j] * allInputNumbers[j];

				for (int k = 0; k < allInputNumbers.length; k++) {
					// if(k !=i && k != j){
					int result = allInputNumbers[k] * allInputNumbers[k];
					if (firstNumber + secondNumber == result) {
						haveResult = true;
						printOnConsole(allInputNumbers[i], allInputNumbers[j],
								allInputNumbers[k]);

					}
					// }
				}

			}
		}

		if (!haveResult) {
			System.out.println("No");
		}
	}

	private static void printOnConsole(int i, int j, int k) {
		int[] arrayToSort = new int[] { i, j, k };

		Arrays.sort(arrayToSort);
		System.out.println(arrayToSort[0] + "*" + arrayToSort[0] + " + "
				+ arrayToSort[1] + "*" + arrayToSort[1] + " = "
				+ arrayToSort[2] + "*" + arrayToSort[2]);
	}

}
