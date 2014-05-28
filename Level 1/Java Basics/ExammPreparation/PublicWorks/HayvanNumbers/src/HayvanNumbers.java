import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HayvanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfDigits = input.nextInt();
        int sumOfSixNumbers = input.nextInt();
        List<Integer> combinations = GetCombinations();

        List<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < combinations.size(); i++) {
            for (int j = i; j < combinations.size(); j++) {
                int diff = combinations.get(j) - combinations.get(i);
                if (diff == sumOfSixNumbers) {

                    for (int k = j; k < combinations.size(); k++) {
                        int secondDiff = combinations.get(k) - combinations.get(j);
                        if (secondDiff == sumOfSixNumbers) {
                            int sum = SumOfDigits(combinations.get(i)) + SumOfDigits(combinations.get(j)) + SumOfDigits(combinations.get(k));
                            if (sum == sumOfDigits) {
                                output.add(Integer.parseInt(combinations.get(i) + "" + combinations.get(j) + "" + combinations.get(k)));
                            }
                        }
                    }
                }
            }
        }
        if (output.size() == 0) {
            System.out.println("No");
        } else {
            Collections.sort(output);
            for (int item : output) {
                System.out.println(item);
            }
        }

    }

    private static int SumOfDigits(int inputNumber) {
        String number = Integer.toString(inputNumber);
        int returnSum = 0;
        for (int i = 0; i < number.length(); i++) {
            returnSum += Integer.parseInt(Character.toString(number.charAt(i)));
        }
        return returnSum;
    }

    private static List<Integer> GetCombinations() {
        List<Integer> combinations = new ArrayList<Integer>();

        for (int i = 500; i <= 900; i += 100) {
            for (int j = 50; j <= 90; j += 10) {
                for (int k = 5; k <= 9; k++) {
                    combinations.add(i + j + k);
                }
            }
        }
        return combinations;
    }
}


