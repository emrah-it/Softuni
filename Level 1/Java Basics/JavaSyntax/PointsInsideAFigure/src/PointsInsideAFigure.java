//Problem 3.	Points inside a Figure
//        Write a program to check whether a point is inside or outside
// of the figure below. The point is given as a pair of floating-point
// numbers, separated by a space. Your program should print "Inside" or
// "Outside".

import java.util.Scanner;

public class PointsInsideAFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = 12.5;
        double y = 6.0;

        double width = 10;
        double height = 7.5;

        double inseideX = 17.5;
        double insideY = 8.5;

        double insideWidth = 2.5;
        double insideHeight = 5;


        System.out.println("Enter x y");
        double[] xy = getXY(input.nextLine().split(" "));

        if(xy[0] >= x && xy[1] >= y &&
                xy[0] <= x + width &&
                xy[1] <= y + height){
            if(xy[0] >= inseideX && xy[1] >= insideY &&
                    xy[0] <= inseideX + insideWidth &&
                    xy[1] <= insideY + insideHeight){
                System.out.println("Outside");
            }
            else{

                System.out.println("Inside");
            }

        }
        else {
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
}
