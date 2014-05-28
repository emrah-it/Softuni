import java.util.Scanner;

//Write a program that enters a positive integer number num and converts
// and prints it in hexadecimal form. You may use some built-in method
// from the standard Java libraries.
public class DecToHex {
    public static void main(String[] args) {
       System.out.println("Enter decimal Number");
        Scanner input = new Scanner(System.in);

        int hexNumber = input.nextInt();
        String decimal = Integer.toHexString(hexNumber);
        System.out.println("Hex value is " + decimal.toUpperCase());
    }
}
