//Problem 1.	Odd or Even Integers
//Write an expression that checks if given integer is 
//odd or even. Examples:
namespace Gravitation_on_the_Moon
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter your weight");
            decimal weight = decimal.Parse(Console.ReadLine());

            decimal moonWheight = weight * 0.17M;
            Console.WriteLine(moonWheight);
        }
    }
}
