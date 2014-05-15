//Problem 1.	Sum of 3 Numbers
//Write a program that reads 3 real numbers from the console and prints their sum

namespace SumOfThreeNumbers
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter three numbers");
            int sum = 0;
            for (int i = 0; i < 3; i++)
            {
                sum += int.Parse(Console.ReadLine());
            }


            Console.WriteLine("Sum of numbers is " + sum);
        }
    }
}
