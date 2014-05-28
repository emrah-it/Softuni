package Java.SampleContest;

import java.awt.AlphaComposite;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicCarNumbers {

	public static void main(String[] args) {
		int sum = new Scanner(System.in).nextInt() - 40;
		Map<String, Integer> alfphaMap = new HashMap<String, Integer>();

		alfphaMap.put("A", 10);
		alfphaMap.put("B", 20);
		alfphaMap.put("C", 30);
		alfphaMap.put("E", 50);
		alfphaMap.put("H", 80);
		alfphaMap.put("K", 110);
		alfphaMap.put("M", 130);
		alfphaMap.put("P", 160);
		alfphaMap.put("T", 200);
		alfphaMap.put("X", 240);
		int counter = 0;

		for (int i = 0; i <= 9; i++) {
			for (int j = i + 1; j <= 9; j++) {
				for (int l = 0; l <= 4; l++) {
					for (int k = l; k <= 4; k++) {
						for (Map.Entry<String, Integer> first : alfphaMap
								.entrySet()) {
							for (Map.Entry<String, Integer> second : alfphaMap
									.entrySet()) {
								if (((l * i) + (k * j) + first.getValue() + second.getValue()) == sum) {
									System.out.println("CA" + i + "" + j + ""
											+ first.getKey() + second.getKey());
									counter++;
								}
							}
						}

					}
				}
			}
		}
		System.out.println(counter);
	}
}
