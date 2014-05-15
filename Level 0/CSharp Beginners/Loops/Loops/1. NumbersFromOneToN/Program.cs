//Problem 1.	Numbers from 1 to N
//Write a program that enters from the console a positive integer n and prints
//all the numbers from 1 to n, on a single line, separated by a space. 


namespace _1.NumbersFromOneToN
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.Write("Enter N: ");
            int length = int.Parse(Console.ReadLine());
            for (int i = 1; i <= length; i++)
            {
                Console.WriteLine(i);
            }
        }
    }
}
