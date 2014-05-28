import java.util.Scanner;

//Problem 6.	Sum Two Numbers
//        Write a program SumTwoNumbers.java that enters two integers from the console, calculates and prints their sum. Search in Internet to learn how to read numbers from the console.

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");
        double first = input.nextInt();

        System.out.println("Enter Second Number");
        double second = input.nextInt();

        System.out.println("Sum of numbers is: " + (first + second));
    }
}
