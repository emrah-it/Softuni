

namespace InCirecleOutOfRectangle
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    class InCircle
    {
        static void Main()
        {
            double xCenter = 1;
            double yCenter = 1;
            double radius = 1.5;
            Console.Write("Enter x: ");
            double x = double.Parse(Console.ReadLine());
            Console.Write("Enter y: ");
            double y = double.Parse(Console.ReadLine());
            double top = 1;
            double left = -1;
            double width = 6;
            double height = 2;
            double leftX = left;
            double rightX = left + (width - 1);
            double upY = top;
            double downY = top - height;

            bool isInide = IsInCircle(xCenter, yCenter, radius, x, y);
            if (isInide)
            {
                if (!(leftX <= x && x <= rightX && upY >= y && y >= downY))
                {
                    Console.WriteLine("in");
                    return;
                }
            }
            Console.WriteLine("out");
        }

        static bool IsInCircle(double circleCenterX, double cyrcleCenterY, double radius, double pointX, double pointY)
        {
            if (Math.Pow((pointX - circleCenterX), 2) + Math.Pow((pointY - cyrcleCenterY), 2) <= Math.Pow(radius, 2))
            {
                return true;
            }
            return false;
        }
    }
    
}