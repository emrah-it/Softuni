//1.Problem 1.	Odd or Even Integers
//Write an expression that checks if given integer 
//is odd or even. Examples:
namespace OddOrEven
{
    using System;

    class OddOrEven
    {
        static void Main()
        {
            Console.WriteLine("Enter number");
            int number = int.Parse(Console.ReadLine());
            Console.WriteLine(Math.Abs(number) % 2 != 0? true : false);
        }
    }
}
