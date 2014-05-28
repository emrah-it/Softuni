//Problem 2.	Triangle Area
//        Write a program that enters 3 points in the plane (as integer x and y
// coordinates), calculates and prints the area of the triangle composed by these
// 3 points. Round the result to a whole number. In case the three points do not
// form a triangle, print "0" as result.

import java.util.Scanner;

public class TringleArea {
    public static void main(String[] args) {
        System.out.println("Enter three ponits");
        Scanner input = new Scanner(System.in);

        double[] a = getXY(input.nextLine().split(" "));
        double[] b = getXY(input.nextLine().split(" "));
        double[] c = getXY(input.nextLine().split(" "));

        double area = a[0]*(b[1] - c[1]) +
                b[0]*(c[1] - a[1]) +
                c[0]*(a[1] - b[1]);

        System.out.println((int)Math.abs(area / 2.0));

    }

    private static double[] getXY(String[] split) {
        double[] xy = new double[2];
        for (int i = 0; i < split.length; i++) {
            xy[i] = Double.parseDouble(split[i]);
        }
        return xy;
    }
}
