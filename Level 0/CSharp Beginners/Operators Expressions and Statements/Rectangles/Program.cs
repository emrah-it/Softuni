//Problem 4.	Rectangles
//Write an expression that calculates rectangle’s 
//perimeter and area by given width and height. 

namespace Rectangles
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter width");
            decimal width = decimal.Parse(Console.ReadLine());

            Console.WriteLine("Enter heght");
            decimal heght = decimal.Parse(Console.ReadLine());

            Console.WriteLine("Perimeter: {0}", (width + heght) * 2);
            Console.WriteLine("Area: {0}", width * heght);
        }
    }
}
