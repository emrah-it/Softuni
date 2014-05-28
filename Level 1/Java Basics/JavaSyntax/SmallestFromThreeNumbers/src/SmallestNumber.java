//Problem 3.	The Smallest of 3 Numbers
//Write a program that finds the smallest of three numbers.


import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int current = input.nextInt();

            if (min > current) {
                min = current;
            }
        }

        System.out.println("Min Number is: " + min);
    }
}
