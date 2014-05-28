//Problem 7.	Count of Bits One
//Write a program to calculate the count of bits 1 in the binary representation of
//given integer number n


        import java.util.Scanner;

public class CountBitsOfOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to count bits");

        int currentNumber = input.nextInt();

        String bits = Integer.toBinaryString(currentNumber).replaceAll("0", "");

        System.out.println(bits.length());
    }
}
