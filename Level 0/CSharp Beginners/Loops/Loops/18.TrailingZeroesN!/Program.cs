//Trailing Zeroes in N!
//Write a program that calculates with how many zeroes the factorial of a given number n has 
//at its end. Your program should work well for very big numbers, e.g. n=100000. 

namespace _18.TrailingZeroesN_
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("This calculates the trailing zeroes in N!.");
            Console.Write("Please write N = ");
            int n = int.Parse(Console.ReadLine());
            int result = 0;
            for (int i = 5; i <= n; i *= 5)
            {
                result = result + (n / i);
            }
            Console.WriteLine("Trailing zeroes of {0}! are {1}.", n, result);
        }
    }
}
