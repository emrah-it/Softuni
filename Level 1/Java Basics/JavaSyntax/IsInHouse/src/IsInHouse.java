//Problem 9.	** Points inside the House
//Write a program to check whether a point is
// inside or outside the house below. The point
// is given as a pair of floating-point numbers,
// separated by a space. Your program should print
// "Inside" or "Outside".

import java.util.Scanner;

public class IsInHouse {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double[] xy = getXY(input.nextLine().split(" "));

        boolean isInside = CheckIsInside(xy);

        if(isInside){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }

    private static double[] getXY(String[] split) {
        double[] xy = new double[2];
        for (int i = 0; i < split.length; i++) {
            xy[i] = Double.parseDouble(split[i]);
        }
        return xy;
    }



    public static boolean CheckIsInside(double[] xy){
        double rectX = 12.5;
        double rectY = 8.5;
        double widthX = 10;
        double innerOuterHeightX= 5;

        double innerX = 17.5;
        double innerY = 8.5;
        double innerWidth = 2.5;

        if(xy[0] >= rectX &&
                xy[1] >= rectY &&
                xy[0] <= rectX + widthX &&
                xy[0] <= rectY + innerOuterHeightX)
        {
            if(xy[0] >= innerX &&
                    xy[1] >= innerY &&
                    xy[0] <= innerX + innerWidth &&
                    xy[0] <= innerY + innerOuterHeightX){
                return false; //false
            }
            else{
                return true; //Return true
            }
        }
        else{

            double[] xy1 = {12.5, 8.5};
            double[] xy2 = {17.5, 3.5};

            double[] xy3 = {22.5, 8.5};
            if(isInside(xy1[0], xy1[1], xy2[0], xy2[1], xy3[0], xy3[1], xy[0], xy[1])){
                return true;
            }
            else{
                return  false;
            }
        }

    }

    public static double area(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }

    /* A function to check whether point P(x, y) lies inside the triangle formed
       by A(x1, y1), B(x2, y2) and C(x3, y3) */
    public static boolean isInside(double x1, double y1, double x2, double y2, double x3, double y3, double x, double y)
    {
   /* Calculate area of triangle ABC */
        double A = area (x1, y1, x2, y2, x3, y3);

   /* Calculate area of triangle PBC */
        double A1 = area (x, y, x2, y2, x3, y3);

   /* Calculate area of triangle PAC */
        double A2 = area (x1, y1, x, y, x3, y3);

   /* Calculate area of triangle PAB */
        double A3 = area (x1, y1, x2, y2, x, y);

   /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }
}
