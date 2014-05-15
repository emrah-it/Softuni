//Problem 3.	Circle Perimeter and Area
//Write a program that reads the radius r of a circle and prints 
//its perimeter and area formatted with 2 digits after the decimal point.

//EXAMPLE INPUT :
/*
2
4
 * */
using System;

namespace CirclePerimeter
{
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter radius");
            decimal radius = decimal.Parse(Console.ReadLine());
            decimal perimeter = 2 * (decimal)Math.PI * radius;
            decimal area = (decimal)Math.PI * radius * radius;
            Console.WriteLine("Perimeter: {0}\nArea: {1}", perimeter, area);
        }
    }
}
