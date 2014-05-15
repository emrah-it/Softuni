//Problem 8.	Numbers from 1 to n
//Write a program that reads an integer number n from 
//the console and prints all the numbers in the 
//interval [1..n], each on a single line. 
//Note that you may need to use a for-loop.

namespace NumbersFromOnetoN
{
    using System;

    class NumbersFromOnetoN
    {
        static void Main()
        {
            Console.Write("Sum for first n numbers\nEnter n:");
            int n = int.Parse(Console.ReadLine());

            int sum = 0;

            //for (int i = 1; i <= n; i++)
            //{
            //    sum += i;
            //}

            //this is quik
            sum = (n * (n + 1)) / 2;

            Console.WriteLine(sum);

        }
    }
}
