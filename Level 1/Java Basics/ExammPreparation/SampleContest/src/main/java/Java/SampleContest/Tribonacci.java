package Java.SampleContest;

import java.math.BigDecimal;
import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigDecimal first = new BigDecimal(input.nextLine());
		BigDecimal second = new BigDecimal(input.nextLine());
		BigDecimal third = new BigDecimal(input.nextLine());

		int nTh = input.nextInt();

		switch (nTh) {
		case 1:
			System.out.println(first);
			break;
		case 2:
			System.out.println(second);
			break;
		case 3:
			System.out.println(third);
			break;
		default: {
			for (int i = 4; i <= nTh; i++) {
				BigDecimal temp = first.add(third).add(second);
				first = second;
				second = third;
				third = temp;
				if(i == nTh){
					System.out.println(temp);
					break;
				}				
			}
		}
			break;
		}
	}
}
