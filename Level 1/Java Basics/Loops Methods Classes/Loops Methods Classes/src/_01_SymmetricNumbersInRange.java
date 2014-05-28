import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		System.out
				.println("Please enter two numbers separated with whitespace");

		Scanner input = new Scanner(System.in);

		String[] currentLine = input.nextLine().split(" ");
		int start = Integer.parseInt(currentLine[0]);
		int end = Integer.parseInt(currentLine[1]);

		List<String> allNumbers = new ArrayList<String>();

		for (int i = start; i <= end; i++) {
			if (checkIsPolidrom(Integer.toString(i))) {
				allNumbers.add(Integer.toString(i));
			}
		}

		// String output = StringUtils.join(allNumbers, ", ");
		// String[] s = new String[] {"a", "b", "c"};
		String joined = (String) String.join(",", allNumbers);

		System.out.println(joined);
	}

	private static boolean checkIsPolidrom(String current) {
		for (int i = 0, j = current.length() - 1; i < current.length(); i++, j--) {
			if (current.charAt(i) != current.charAt(j)) {
				return false;
			}
			if (i >= j) {
				return true;
			}
		}

		return true;
	}

}
