import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GetAllCouples {
	public static void main(String... arg) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		List<Integer> allNumbers = getAllNumbers(inputLine);

		Map<String, Integer> allCouplesMap = calculateCoupels(allNumbers);

		double oneCouplePercent = getPercent(allCouplesMap);
		for (int i = 0; i < allNumbers.size() - 1; i++) {
			if (allCouplesMap.size() == 0) {
				break;
			} else {
				String currentCoupleString = allNumbers.get(i) + " "
						+ allNumbers.get(i + 1);
				if (allCouplesMap.containsKey(currentCoupleString)) {

					System.out.println(currentCoupleString
							+ " -> "
							+ String.format("%.2f",
									allCouplesMap.get(currentCoupleString)
											* oneCouplePercent) + "%");
					allCouplesMap.remove(currentCoupleString);
				}
			}
		}

	}

	private static double getPercent(Map<String, Integer> allCouplesMap) {
		double sum = 0;
		for (Entry<String, Integer> entry : allCouplesMap.entrySet()) {
			sum += entry.getValue();
		}
		return 100.0 / sum;
	}

	private static Map<String, Integer> calculateCoupels(
			List<Integer> allNumbers) {
		Map<String, Integer> couplesMap = new HashMap<String, Integer>();

		for (int i = 0; i < allNumbers.size() - 1; i++) {
			String currentCoupeString = allNumbers.get(i) + " "
					+ allNumbers.get(i + 1);
			if (couplesMap.containsKey(currentCoupeString)) {
				couplesMap.put(currentCoupeString,
						couplesMap.get(currentCoupeString) + 1);
			} else {
				couplesMap.put(currentCoupeString, 1);
			}
		}

		return couplesMap;
	}

	private static List<Integer> getAllNumbers(String inputLine) {
		List<Integer> allNumbersIntegers = new ArrayList<Integer>();
		String[] allInputNumbersAsString = inputLine.split(" ");

		for (int i = 0; i < allInputNumbersAsString.length; i++) {
			if (allInputNumbersAsString[i].equals("")) {
				continue;
			}
			allNumbersIntegers
					.add(Integer.parseInt(allInputNumbersAsString[i]));
		}

		return allNumbersIntegers;
	}

}
