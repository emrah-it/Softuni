// Count of Equal Bit Pairs
//Write a program to count how many sequences of two equal
// bits ("00" or "11") can be found in the binary representation
// of given integer number n (with overlapping).

import java.util.Scanner;

public class CountEqialBits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number to count equal two bits");

        int n = input.nextInt();

        String bynaryNumber = Integer.toBinaryString(n);
        int counter = 0;

        for (int i = 1; i < bynaryNumber.length(); i++) {
            if(bynaryNumber.charAt(i) ==  bynaryNumber.charAt(i-1)){
                counter++;
            }
        }

        System.out.println(counter);

    }
}
