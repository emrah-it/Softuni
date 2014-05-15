//Problem 9.	Trapezoids
//Write an expression that calculates trapezoid's 
//area by given sides a and b and height h
namespace TrapezoidsAre
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.Write("Enter a:");
            decimal a = decimal.Parse(Console.ReadLine());
            Console.Write("Enter b:");
            decimal b = decimal.Parse(Console.ReadLine());
            Console.Write("Enter h:");
            decimal h = decimal.Parse(Console.ReadLine());

            decimal result = ((a + b) / 2) * h;
            Console.WriteLine(result);
        }
    }
}
