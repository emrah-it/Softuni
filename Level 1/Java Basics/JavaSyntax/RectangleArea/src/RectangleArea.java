import java.util.Scanner;

//Write a program that enters the sides of a rectangle (two integers a and b)
// and calculates and prints the rectangle's area.
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side a");
        int a = input.nextInt();

        System.out.println("Enter side b");
        int b = input.nextInt();

        System.out.println(a * b);
    }
}

