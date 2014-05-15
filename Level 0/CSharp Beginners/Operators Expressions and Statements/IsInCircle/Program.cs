//Problem 7.	Point in a Circle
//Write an expression that checks if given point (x,  y)
//is inside a circle K({0, 0}, 2). 
namespace IsInCircle
{
    using System;

    class InCircle
    {
        static void Main()
        {
            double xCenter = 0;
            double yCenter = 0;
            double radius = 2;

            double x = double.Parse(Console.ReadLine());
            double y = double.Parse(Console.ReadLine());

            if ((Math.Pow((x - xCenter), 2) + Math.Pow((y - yCenter), 2)) <= Math.Pow(radius, 2))
            {
                Console.WriteLine("in");
                return;
            }
            Console.WriteLine("out");
        }
    }
}

//In general, x and y must satisfy (x - center_x)^2 + (y - center_y)^2 < radius^2.
//Please note that points that satisfy the above equation
//with < replaced by == are considered the points on the circle, 
//and the points that satisfy the above equation with < replaced by > are considered the outside the circle.