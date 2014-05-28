//Problem 5.	Formatting Numbers
//        Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500),
// a floating-point b and a floating-point c and prints them in 4 virtual
// columns on the console. Each column should have a width of 10 characters.
// The number a should be printed in hexadecimal, left aligned; then the
// .number a should be printed in binary form, padded with zeroes, then
// the number b should be printed with 2 digits after the decimal point,
// right aligned; the number c should be printed with 3 digits after the
// decimal point, left aligned.

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a");
        int a = input.nextInt();
        String bynari = Integer.toBinaryString(a);
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c");
        double c = input.nextDouble();

        String intNUmber = String.format("%1$-10d", a);
        bynari = String.format("%10s", bynari).replace(' ', '0');
        String floatWithTwoPoints = String.format("%10.2f", b);
        String floatWithThreePoints = String.format("%-10.3f", c);

        System.out.println("|" + intNUmber+ "|"  + bynari + "|" +
        floatWithTwoPoints + "|" + floatWithThreePoints + "|");

    }
}
